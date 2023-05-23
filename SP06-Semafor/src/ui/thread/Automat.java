package ui.thread;

import domain.Semafor;

/**
 *
 * @author Miroslav Kolosnjaji
 */
public class Automat extends Thread {

    private final Semafor semafor;

    public Automat(Semafor semafor) {
        this.semafor = semafor;
    }

    @Override
    public void run() {
        while (!isInterrupted() && semafor.isUkljucen()) {
            
            semafor.changeColor();
            System.out.println(semafor.toString());
        }
    }

}
