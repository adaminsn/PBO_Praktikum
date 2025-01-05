package soalNo5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame dengan Background");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(null);

        String[] imageOptions = {"Image 1", "Image 2", "Image 3"};
        JComboBox<String> comboBox = new JComboBox<>(imageOptions);
        comboBox.setBounds(10, 10, 150, 30);
        backgroundPanel.add(comboBox);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedImage = (String) comboBox.getSelectedItem();
                String imagePath = "";

                switch (selectedImage) {
                    case "Image 1":
                        imagePath = "D:/ngoding adam/Java/Pratikum 5/pertemuan5_07720/Pertemuan5_07720/src/soalNo4/image/image1.jpeg";
                        break;
                    case "Image 2":
                        imagePath = "D:/ngoding adam/Java/Pratikum 5/pertemuan5_07720/Pertemuan5_07720/src/soalNo4/image/image2.jpeg";
                        break;
                    case "Image 3":
                        imagePath = "D:/ngoding adam/Java/Pratikum 5/pertemuan5_07720/Pertemuan5_07720/src/soalNo4/image/image3.jpeg";
                        break;
                }

                backgroundPanel.setBackgroundImage(imagePath);
                backgroundPanel.repaint();
            }
        });

        frame.setContentPane(backgroundPanel);
        frame.setVisible(true);
    }
}

class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public void setBackgroundImage(String imagePath) {
        this.backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
