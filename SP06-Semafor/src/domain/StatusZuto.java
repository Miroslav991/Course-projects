package domain;
/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusZuto implements Status {

    @Override
    public void changeColor(Semafor semafor) {
        if (semafor.isUkljucen() && semafor.getSignal() == Signal.ZELENO) {
            try {
                Thread.sleep(5000);
                semafor.setSignal(Signal.ZUTO);
                semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));
            } catch (InterruptedException ex) {
                System.out.println("Sleep interupted by off button!");
            }
        }
    }

}
