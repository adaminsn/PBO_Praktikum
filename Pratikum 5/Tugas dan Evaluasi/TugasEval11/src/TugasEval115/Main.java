package TugasEval115;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ganti Warna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        String[] colors = {"Red", "Green", "Blue"};
                JComboBox<String> colorComboBox = new
                        JComboBox<>(colors);

        frame.add(colorComboBox, BorderLayout.NORTH);

        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String)
                        colorComboBox.getSelectedItem();


                switch (selectedColor) {
                case "Red":
                    frame.getContentPane().setBackground(Color.RED);
                    break;
                case "Green":
                    frame.getContentPane().setBackground(Color.GREEN);
                    break;
                case "Blue":
                    frame.getContentPane().setBackground(Color.BLUE);
            }
        }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}