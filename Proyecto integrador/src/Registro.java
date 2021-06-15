import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Registro {
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCorreo;
    private JTextField txtSemestre;
    private JTextField txtCarneU;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblEmail;
    private JLabel lblSemestre;
    private JLabel lblCarne;
    private JPasswordField txtContraseña;
    private JLabel lblContraseña;
    private JButton btnTerminar;
    public JPanel pnlRegistro;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    public Registro() {
        txtCorreo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
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
                if (!password.equals("") && !password.matches(PASSWORD_PATTERN)) {
                    JOptionPane.showMessageDialog(null, "La contraseña ingresada no es válida. Verificar que la contraseña: \n1. Contenga mayúsculas y minúsculas \n2. Contenga números \n3. Contenga caracteres especiales");
                    txtContraseña.setText("");
                }
            }
        });


        btnTerminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (PrintWriter writer = new PrintWriter(new File("Registro.csv"))) {
                    StringBuilder builder = new StringBuilder();
                    builder.append("Nombre");
                    builder.append(',');
                    builder.append("Apellido");
                    builder.append(',');
                    builder.append("Email");
                    builder.append(',');
                    builder.append("Semestre");
                    builder.append(',');
                    builder.append("Carné Universitario");
                    builder.append(',');
                    builder.append('\n');
                    builder.append(txtNombre.getText());
                    builder.append(',');
                    builder.append(txtApellido.getText());
                    builder.append(',');
                    builder.append(txtCorreo.getText());
                    builder.append(',');
                    builder.append(txtSemestre.getText());
                    builder.append(',');
                    builder.append(txtCarneU.getText());
                    builder.append('\n');
                    writer.write(builder.toString());
                    JOptionPane.showMessageDialog(null, "Registro completado!");
                } catch (
                        FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Archivo no encontrado");
                }
                JFrame frame = new JFrame("Ordenamiento y búsqueda");
                frame.setSize(800, 800);
                frame.setLayout(new BorderLayout());
                frame.setContentPane(new Myform().pnlMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }
}
