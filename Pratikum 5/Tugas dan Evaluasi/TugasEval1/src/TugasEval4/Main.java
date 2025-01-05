package TugasEval4;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        int width = 400;
        int height = 300;

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(50, 50, 300, 150);


        JFrame frame = new JFrame("Persegi Panjang ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(width, height);

        JPanel panel = new JPanel() {
                public void paintComponent(Graphics g) {
                    g.drawImage(bufferedImage, 0, 0, this);
                }
            };
        frame.add(panel);
        frame.setVisible(true);
        };
    }

