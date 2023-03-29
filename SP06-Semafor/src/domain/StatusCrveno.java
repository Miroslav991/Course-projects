package domain;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusCrveno implements Status {

    
    @Override
    public void changeColor(Semafor semafor) {

        if (semafor.isUkljucen()) {
            if (semafor.getSignal() == null || semafor.getSignal() == Signal.ZUTO) {
                semafor.setSignal(Signal.CRVENO);
                semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));

            }

        }
    }

}
