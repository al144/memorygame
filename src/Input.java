import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.SimpleTimeZone;

public class Input implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent e) {
        Point p = e.getLocationOnScreen();
        double x = p.getX();
        double y = p.getY();
        String str = String.valueOf(x+" , "+y);
        System.out.println(str);
        Frame.mPos = str;
        Frame.returnFrame().getFrame();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
