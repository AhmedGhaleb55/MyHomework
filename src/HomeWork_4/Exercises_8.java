package HomeWork_4;
import javax.swing.*;

public class Exercises_8 {
    public static void main(String[] args) {
        JFrame x=new JFrame("My_Name" );

        x.setSize(500,500);
        MyDraw d=new MyDraw();
        x.add(d);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);

    }
}
