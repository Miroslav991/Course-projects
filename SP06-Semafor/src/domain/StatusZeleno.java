package domain;
/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusZeleno implements Status {

    @Override
    public void changeColor(Semafor semafor) {
        if (semafor.isUkljucen() && semafor.getSignal() == Signal.CRVENOZUTO) {
            try {
                Thread.sleep(3000);
                semafor.setSignal(Signal.ZELENO);
                semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));
            } catch (InterruptedException ex) {
                System.out.println("Sleep interupted by off button!");
            }
        }
    }

}
