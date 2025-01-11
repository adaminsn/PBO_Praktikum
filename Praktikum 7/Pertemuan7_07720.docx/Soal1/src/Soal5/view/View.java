package Soal5.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField txtNamaAlat, txtJenis, txtHarga, txtDurasiSewa;
    private JButton btnTambah, btnHitung, btnBatal;
    private JTextArea textArea;

    public View() {
        setTitle("Penyewaan Alat Camping");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2, 10, 10));

        inputPanel.add(new JLabel("Nama Alat:"));
        txtNamaAlat = new JTextField();
        inputPanel.add(txtNamaAlat);

        inputPanel.add(new JLabel("Jenis Alat:"));
        txtJenis = new JTextField();
        inputPanel.add(txtJenis);

        inputPanel.add(new JLabel("Harga Per Hari:"));
        txtHarga = new JTextField();
        inputPanel.add(txtHarga);

        inputPanel.add(new JLabel("Durasi Sewa (Hari):"));
        txtDurasiSewa = new JTextField();
        inputPanel.add(txtDurasiSewa);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        btnTambah = new JButton("Tambah Alat");
        btnHitung = new JButton("Hitung Harga");
        btnBatal = new JButton("Batal");
        buttonPanel.add(btnTambah);
        buttonPanel.add(btnHitung);
        buttonPanel.add(btnBatal);

        textArea = new JTextArea(15, 40);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    public String getNamaAlat() {
        return txtNamaAlat.getText();
    }

    public String getJenis() {
        return txtJenis.getText();
    }

    public double getHargaPerHari() {
        try {
            return Double.parseDouble(txtHarga.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public int getDurasiSewa() {
        try {
            return Integer.parseInt(txtDurasiSewa.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Durasi sewa harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public JButton getBtnTambah() {
        return btnTambah;
    }

    public JButton getBtnHitung() {
        return btnHitung;
    }

    public JButton getBtnBatal() {
        return btnBatal;
    }

    public void tampilkanPesan(String pesan) {
        textArea.append(pesan + "\n");
    }

    public void tambahListener(ActionListener listener) {
        btnTambah.addActionListener(listener);
        btnHitung.addActionListener(listener);
        btnBatal.addActionListener(listener);
    }
}
