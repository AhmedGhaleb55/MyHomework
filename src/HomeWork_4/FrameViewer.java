package HomeWork_4;

import javax.swing.*;
import java.awt.*;

public class FrameViewer {
    //    Modify the program as follows:
//        • Double the frame size.
//        • Change the greeting to “Hello, your name!”.
//        • Change the background color to pale green (see Exercise E2.10).


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JLabel label = new JLabel("Hello, shehab alsultan!");
        label.setOpaque(true);
        label.setBackground(Color.pink);


        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setVisible(true);


    }
}
