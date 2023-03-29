package domain;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusCrvenoZuto implements Status {

    @Override
    public void changeColor(Semafor semafor) {
        if (semafor.isUkljucen() && semafor.getSignal() == Signal.CRVENO) {
            semafor.setSignal(Signal.CRVENOZUTO);
            semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));

        }
    }

}
