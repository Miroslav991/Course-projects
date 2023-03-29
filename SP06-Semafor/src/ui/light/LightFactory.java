package ui.light;

import domain.Semafor;
import domain.Signal;
import static domain.Signal.CRVENO;
import static domain.Signal.CRVENOZUTO;
import static domain.Signal.ZELENO;
import static domain.Signal.ZUTO;
import domain.StatusCrveno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Miroslav Kološnjaji
 */
public class LightFactory {

    private static final LightFactory INSTANCE = new LightFactory();
    private final List<ImageIcon> images;

    private LightFactory() {
        this.images = new ArrayList<>();
        loadImages();
    }

    public static LightFactory getInstance() {
        return INSTANCE;
    }

    public void light(JLabel label) {
        if (Semafor.getInstance().isUkljucen()) {
            switch (Semafor.getInstance().getSignal()) {
                case CRVENO:
                    label.setIcon(images.get(1));
                    break;
                case CRVENOZUTO:
                    label.setIcon(images.get(2));
                    break;
                case ZELENO:
                    label.setIcon(images.get(4));
                    break;
                case ZUTO:
                    label.setIcon(images.get(3));
                    break;

            }
        } else {
            label.setIcon(images.get(0));
        }

    }
    
    public void test(){
        if(Semafor.getInstance().getStatus() instanceof StatusCrveno){
            
        }
    }

    private void loadImages() {

        String[] image = {"images/Semafor-UGASEN.png",
            "images/Semafor-CRVENO.png",
            "images/Semafor-CRVENOZUTO.png",
            "images/Semafor-ZUTO.png",
            "images/Semafor-ZELENO.png"};

        for (String i : image) {
            images.add(new ImageIcon(i));
        }

    }

}
