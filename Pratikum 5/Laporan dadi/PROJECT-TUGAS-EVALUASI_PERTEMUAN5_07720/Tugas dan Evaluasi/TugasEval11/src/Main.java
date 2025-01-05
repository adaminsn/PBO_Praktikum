import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Sederhana");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Teks akan muncul di mana hayo..");

        JTextField textField = new JTextField(20);

        JButton button = new JButton("Tampilkan Teks");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                label.setText(inputText);
            }
        });

        panel.add(textField);
        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
