package domain;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusFactory {

    public static Status vratiStatus(Signal signal) {
        Status status = null;
        if (signal == Signal.CRVENO) {
            status = new StatusCrvenoZuto();
        } else if (signal == Signal.CRVENOZUTO) {
            status = new StatusZeleno();
        } else if (signal == Signal.ZELENO) {
            status = new StatusZuto();
        } else if (signal == null || signal == Signal.ZUTO) {
            status = new StatusCrveno();
        } else {
            System.out.println("Signal je null");
        }
        return status;
    }
}
