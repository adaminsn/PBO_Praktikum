package TugasEval3;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        String image = "D:/ngoding adam/Java/Pratikum 5/pertemuan5_07720/Pertemuan5_07720/src/soalNo4/image/image1.jpeg";


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                ImageIcon imageIcon = new ImageIcon(image);
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, 500, 500, this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
