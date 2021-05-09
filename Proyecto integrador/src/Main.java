import javax.swing.*;
import java.awt.*;

public class Main {
   /* public static int[] MétodoBurbuja(int[] vector)
    {
        int TerminoA;
        int[] VectorOrdenado;
        for(int i = 1; i < vector.length; i++)
        {
            for(int j = 0; j < vector.length-i; j++)
            {
                if(vector[j] > vector[j+1])
                {
                    TerminoA = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = TerminoA;
                }
            }
        }
        VectorOrdenado = vector;
        return VectorOrdenado;
    }*/

    public static void main(String[]args) {

        JFrame frame = new JFrame("Ordenamiento y búsqueda");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new Myform().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

       /* System.out.println("Digite el vector");
        int vector[] = {1,4,5,3,12,23,7,6};

        int VectorOrdenado[] = MétodoBurbuja(vector);

        for(int i = 0; i < VectorOrdenado.length;i++)
            System.out.println(VectorOrdenado[i]);
    }*/
    }
}
