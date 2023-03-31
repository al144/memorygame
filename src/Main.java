import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Frame frame = new Frame();
        frame.frame.addMouseListener(new Input());
        frame.getFrame();



    }
}