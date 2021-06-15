import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Explicacion {
    public JPanel pnlMain2;
    private JLabel lblBienvenido;
    private JComboBox cmbox;
    private JButton btnEntrar;
    private JLabel lblMensaje;
    private JDialog dlgShowInfo;

    private String opcion;

    public Explicacion() {
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setSize(800, 800);
                frame.setLayout(new BorderLayout());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                opcion = (String) cmbox.getSelectedItem();
                switch (opcion) {
                    case "Ordenamiento":
                        frame.setContentPane(new Ordenamiento().pnlMain3);

                        break;
                    case "Búsqueda":
                        frame.setContentPane(new Busqueda().pnlMain4);
                        break;

                }
            }
        });
    }
}
