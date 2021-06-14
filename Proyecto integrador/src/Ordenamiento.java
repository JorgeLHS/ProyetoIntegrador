import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Ordenamiento {
    public JPanel pnlMain3;
    private JTextArea txtA_insercion;
    private JTextArea txtA_Burbuja;
    private JTextArea txtA_Seleccion;
    private JButton btnVerEjemplo;
    private JTextArea fldOrdenamientoConcepto;


    public Ordenamiento() {

        btnVerEjemplo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Juego");
                frame.setSize(800, 800);
                frame.setLayout(new BorderLayout());
                frame.setContentPane(new Juego().pnlMain5);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }
}

