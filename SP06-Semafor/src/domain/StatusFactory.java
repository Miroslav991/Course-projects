package domain;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusFactory {

    public static Status vratiStatus(Signal signal) {
        Status status = null;
        if (null == signal) {
            status = new StatusCrveno();
        } else switch (signal) {
            case CRVENO -> status = new StatusCrvenoZuto();
            case CRVENOZUTO -> status = new StatusZeleno();
            case ZELENO -> status = new StatusZuto();
            case ZUTO -> status = new StatusCrveno();
            default -> System.out.println("Signal je null");
        }
        return status;
    }
}
