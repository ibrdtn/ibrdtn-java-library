package ibr.timpner.dtn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Julian Timpner <timpner@ibr.cs.tu-bs.de>
 */
public class CustodyRegExTest {

    public enum ReasonCode {

        NO_ADDITIONAL_INFORMATION(0),
        REDUNDANT_RECEPTION(3),
        DEPLETED_STORAGE(4),
        DESTINATION_ENDPOINT_UNINTELLIGIBLE(5),
        NO_KNOWN_ROUTE(6),
        NO_TIMELY_CONTACT(7),
        BLOCK_UNINTELLIGIBLE(8);
        private int offset;

        ReasonCode(int offset) {
            this.offset = offset;
        }

        public int getOffset() {
            return offset;
        }
    }

    public enum Status {

        ACCEPTED,
        REJECTED
    }

    public static void main(String[] args) {
        String start = "(NOTIFY\\sCUSTODY)";
        String url = "(\\bdtn://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|])";
        String fragments = "(\\.\\d+:\\d+)?";

        // 604 NOTIFY CUSTODY <timestamp>.<seq_nr>[.<frag_offset>:<frag_len>] <src_eid> <ACCEPTED|REJECTED(<reason_code>)> <timestamp>.<tmp_nanos>
        final Pattern pattern = Pattern.compile(
                start + // NOTIFY CUSTODY
                "\\s(\\d+)\\.(\\d+)" + // <timestamp>.<seq_nr>
                fragments + //[.<frag_offset>:<frag_len>]
                "\\s"
                + url + // <src_eid>
                "\\s(\\w+)\\b" + // ACCEPTED|REJECTED
                "(\\((\\d+)\\))?" + // <reason_code>
                "\\s"
                + "(\\d+)\\.(\\d+)"); // <timestamp>.<tmp_nanos>
        final Matcher matcher = pattern.
                matcher("NOTIFY CUSTODY 419414182.1 dtn://timpner-lx/client-1 REJECTED(1) 1366098982.643247000");
        matcher.find();
        System.out.println("Status: " + matcher.group(1));
        System.out.println("Timestamp: " + matcher.group(2));
        System.out.println("Seq: " + matcher.group(3));
        String frag = matcher.group(4);
        System.out.println("Frag: " + frag);
        if (frag != null) {
            String[] split = frag.split("\\.|:");
            System.out.println("Offset: " + split[1]);
            System.out.println("Length: " + split[2]);
        }

        System.out.println("src: " + matcher.group(5));
        System.out.println("Type: " + matcher.group(6));
        String reason = matcher.group(8);
        System.out.println("Reason: " + reason);
        if (reason != null) {
            int reasonCode = Integer.parseInt(reason);
            System.out.println("Reason code: " + ReasonCode.values()[reasonCode]);
        }
        System.out.println("Timestamp: " + matcher.group(9));
        System.out.println("Nanos: " + matcher.group(10));
    }
}
