import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class Frame {

        JFrame frame = new JFrame();


        Input input = new Input();

        /*int a = input.mousePressed();*/




        public void getFrame() {

                JLabel label = new JLabel();
                label.setText(String.valueOf(a));

                frame.setSize(400, 400);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.add(label);
        }



}
