import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[]args) {

        JFrame frame = new JFrame("Ordenamiento y búsqueda");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new Myform().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }
}
