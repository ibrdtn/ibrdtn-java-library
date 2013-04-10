package ibrdtn.example.api;

import ibrdtn.api.Event;
import ibrdtn.api.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Receives events from the daemon, such as new neighbors.
 *
 * @author Julian Timpner <timpner@ibr.cs.tu-bs.de>
 */
public class EventNotifier implements EventListener {

    private static final Logger logger = Logger.getLogger(EventNotifier.class.getName());

    @Override
    public void eventRaised(Event evt) {
        logger.log(Level.SEVERE, "{0}:{1}", new Object[]{evt.getName(), evt.getAction()});
    }
}