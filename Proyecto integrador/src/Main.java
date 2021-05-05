import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[]args){

        JFrame frame = new JFrame("Juego ordenamiento");
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new Myform().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
}
