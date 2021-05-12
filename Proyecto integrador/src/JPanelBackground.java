

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

    public class JPanelBackground extends JPanel {

        private Image background;

        public void paintComponent(Graphics g) {


            background = new ImageIcon(getClass().getResource("/imagenes/uno.jpg")).getImage();

            g.drawImage(background,0, 0, getWidth(), getHeight(),this);

            setOpaque(false);

            super.paintComponent(g);
        }

        public void setBackground(String imagePath) {
            this.setOpaque(false);
            this.background = new ImageIcon(imagePath).getImage();
            repaint();
        }

    }

