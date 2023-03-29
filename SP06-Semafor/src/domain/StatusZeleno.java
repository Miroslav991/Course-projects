package domain;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusZeleno implements Status {

    @Override
    public void changeColor(Semafor semafor) {
        if (semafor.isUkljucen() && semafor.getSignal() == Signal.CRVENOZUTO) {
            semafor.setSignal(Signal.ZELENO);
            semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));
        }
    }

}
