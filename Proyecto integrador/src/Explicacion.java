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
                opcion = (String) cmbox.getSelectedItem();
                switch (opcion) {
                    case "Ordenamiento":
                        Window window = SwingUtilities.windowForComponent(btnEntrar);
                        dlgShowInfo = new JDialog(window);
                        dlgShowInfo.setModal(true);
                        dlgShowInfo.add(new JLabel("Los métodos de búsqueda son:"));
                        dlgShowInfo.pack();
                        dlgShowInfo.setVisible(true);

                        break;
                    case "Busqueda":



                        break;

                }
            }
        });
    }
}
