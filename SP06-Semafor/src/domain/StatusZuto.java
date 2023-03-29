package domain;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusZuto implements Status {

    @Override
    public void changeColor(Semafor semafor) {
        if (semafor.isUkljucen() && semafor.getSignal() == Signal.ZELENO) {
            semafor.setSignal(Signal.ZUTO);
            semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));

        }
    }

}
