import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Myform{


    private JLabel lblCorreo;
    private JTextField txtCorreo;
    public JPanel pnlMain;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnShowInfo;
    private JLabel lblContraseña;
    private JTextField textContraseña;
    private JPasswordField txtContraseña;
    private JDialog dlgShowInfo;


    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    //private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";


    public Myform() {

        txtCorreo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost (FocusEvent e) {
                if (!txtCorreo.getText().equals("") && !txtCorreo.getText().matches(EMAIL_PATTERN)) {
                    JOptionPane.showMessageDialog(null, "El email ingresado no es válido");
                    txtCorreo.setText("");
                }
            }
        });
        txtContraseña.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String password = String.valueOf(txtContraseña.getPassword());
               /* if (!password.equals("") && !password.matches(PASSWORD_PATTERN)) {
                    JOptionPane.showMessageDialog(null, "La contraseña ingresada no es válida. Verificar que la contraseña: \n1. Contenga mayúsculas y minúsculas \n2. Contenga números \n3. Contenga caracteres especiales");
                    txtContraseña.setText("");
                }*/
            }
        });
        btnShowInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (PrintWriter writer = new PrintWriter(new File("Registro.csv"))) {
                    StringBuilder builder = new StringBuilder();
                    builder.append("Nombre");
                    builder.append(',');
                    builder.append("Email");
                    builder.append(',');
                    builder.append('\n');
                    builder.append(txtNombre.getText());
                    builder.append(',');
                    builder.append(txtCorreo.getText());
                    builder.append('\n');
                    writer.write(builder.toString());
                    JOptionPane.showMessageDialog(null, "Registro completado exitosamente!");

                    /*Window window = SwingUtilities.windowForComponent(btnShowInfo);
                    dlgShowInfo = new JDialog(window);
                    dlgShowInfo.setModal(true);
                    dlgShowInfo.add(new JLabel("Nombre del estudiante: " + txtNombre.getText() + " Correo: " +
                            txtCorreo.getText()));
                    dlgShowInfo.pack();
                    dlgShowInfo.setVisible(true);
                    JFrame secondForm = new JFrame();*/

                    JFrame frame = new JFrame(txtNombre.getText());
                    frame.setSize(800, 800);
                    frame.setLayout(new BorderLayout());
                    frame.setContentPane(new Explicacion().pnlMain2);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);

                } catch (
                        FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe");
                }
            }
        });

    }
}
