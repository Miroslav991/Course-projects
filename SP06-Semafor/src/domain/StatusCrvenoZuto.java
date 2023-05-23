package domain;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class StatusCrvenoZuto implements Status {

    @Override
    public void changeColor(Semafor semafor) {
        if (semafor.isUkljucen() && semafor.getSignal() == Signal.CRVENO) {
            try {
                Thread.sleep(7000);
                semafor.setSignal(Signal.CRVENOZUTO);
                semafor.setStatus(StatusFactory.vratiStatus(semafor.getSignal()));
            } catch (InterruptedException ex) {
                System.out.println("Sleep interupted by off button!");
            }
        }
    }

}
