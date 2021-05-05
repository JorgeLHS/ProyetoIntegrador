import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myform {

    private JLabel lblNombre;
    private JTextField txtNombre;
    public JPanel pnlMain;
    private JLabel lblSemestre;
    private JTextField txtSemestre;
    private JButton btnShowInfo;
    private JDialog dlgShowInfo;

    public Myform() {

        btnShowInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window window = SwingUtilities.windowForComponent(btnShowInfo);
                dlgShowInfo = new JDialog(window);
                dlgShowInfo.setModal(true);
                dlgShowInfo.add(new JLabel("Nombre: " + txtNombre.getText() + ", Semestre: " + txtSemestre.getText()));
                dlgShowInfo.pack();
                dlgShowInfo.setVisible(true);
            }
        });
    }

}
