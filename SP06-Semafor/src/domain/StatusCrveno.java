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
                try {
                    if (semafor.getSignal() != null) {
                        Thread.sleep(3000);
                    }
                    semafor.setSignal(Signal.CRVENO);
                    semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));
                } catch (InterruptedException ex) {
                    System.out.println("Sleep interupted by off button!");
                }
            }

        }
    }

}
