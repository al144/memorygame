import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class Frame {

        JFrame frame = new JFrame();
        public static String mPos = new String();

        public static Frame _instance;

        public Frame(){
                mPos = "0,0";
                _instance = this;
        }


        public static Frame returnFrame(){
                return _instance;
        }




        public void getFrame() {

                JLabel label = new JLabel();
                frame.getContentPane().removeAll();
                label.setText(String.valueOf(mPos));

                frame.setSize(400, 400);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.add(label);
                frame.invalidate();
                frame.validate();
                frame.repaint();
        }



}
