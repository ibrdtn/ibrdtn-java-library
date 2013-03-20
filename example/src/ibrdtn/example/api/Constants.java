package ibrdtn.example.api;

import ibrdtn.api.object.GroupEndpoint;

/**
 * Constant configuration parameters.
 *
 * @author Julian Timpner <timpner@ibr.cs.tu-bs.de>
 */
public class Constants {

    public static final String HOST = "localhost"; //"134.169.34.69"
    public static final int PORT = 4550;
    public static final int LIFETIME = 3600;
    public static final GroupEndpoint BROADCAST_GROUP_EID = new GroupEndpoint("dtn://broadcast");
}
