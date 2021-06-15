import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Stack;

public class Juego {
    public JPanel pnlMain5;
    private JLabel lblNumeros;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtNumero3;
    private JTextField txtNumero4;
    private JTextField txtNumero5;
    private JButton btnValidar;
    private JLabel lblnum1;
    private JPanel panel;
    private JLabel lblnum3;
    private JLabel lblnum5;
    private JLabel lblnum2;
    private JLabel lblnum4;

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    public Juego() {
        //Genera los numeros random
        Random r = new Random();
        int numeros = r.nextInt(20) + 11;
        int numeros2 = r.nextInt(10) + 1;
        int numeros3 = r.nextInt(40) + 31;
        int numeros4 = r.nextInt(30) + 21;
        int numeros5 = r.nextInt(50) + 41;

        lblnum1.setText(String.valueOf(numeros));
        lblnum2.setText(String.valueOf(numeros2));
        lblnum3.setText(String.valueOf(numeros3));
        lblnum4.setText(String.valueOf(numeros4));
        lblnum5.setText(String.valueOf(numeros5));

        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.parseInt(txtNumero1.getText());
                num2 = Integer.parseInt(txtNumero2.getText());
                num3 = Integer.parseInt(txtNumero3.getText());
                num4 = Integer.parseInt(txtNumero4.getText());
                num5 = Integer.parseInt(txtNumero5.getText());
                //Validación
                if (num1 < num2 && num2 < num3 && num3 < num4 && num4 < num5) {
                    JOptionPane.showMessageDialog(null, "Felicidades!!!");
                    JOptionPane.showMessageDialog(null, "Felicidades lograste ordenar los números");
                } else {
                    JOptionPane.showMessageDialog(null, "Revisa el ordenamiento");
                }
            }
        });
    }
}
