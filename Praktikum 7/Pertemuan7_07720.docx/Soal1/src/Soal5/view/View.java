package Soal5.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField txtNamaPenyewa, txtNamaAlat, txtJenis, txtHarga, txtJumlah, txtDurasi;
    private JButton btnTambah, btnHitung, btnBatal;
    private JTextArea textArea;

    public View() {
        setTitle("Penyewaan Alat Camping");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2, 10, 10));

        inputPanel.add(new JLabel("Nama Penyewa:"));
        txtNamaPenyewa = new JTextField();
        inputPanel.add(txtNamaPenyewa);

        inputPanel.add(new JLabel("Nama Alat:"));
        txtNamaAlat = new JTextField();
        inputPanel.add(txtNamaAlat);

        inputPanel.add(new JLabel("Jenis Alat:"));
        txtJenis = new JTextField();
        inputPanel.add(txtJenis);

        inputPanel.add(new JLabel("Harga Per Hari:"));
        txtHarga = new JTextField();
        inputPanel.add(txtHarga);

        inputPanel.add(new JLabel("Jumlah Alat:"));
        txtJumlah = new JTextField();
        inputPanel.add(txtJumlah);

        inputPanel.add(new JLabel("Durasi Sewa (Hari):"));
        txtDurasi = new JTextField();
        inputPanel.add(txtDurasi);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        btnTambah = new JButton("Tambah Alat");
        btnHitung = new JButton("Hitung Total");
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

    public String getNamaPenyewa() {
        return txtNamaPenyewa.getText();
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
            tampilkanPesan("Harga harus berupa angka.");
            return 0;
        }
    }

    public int getJumlah() {
        try {
            return Integer.parseInt(txtJumlah.getText());
        } catch (NumberFormatException e) {
            tampilkanPesan("Jumlah harus berupa angka.");
            return 0;
        }
    }

    public int getDurasi() {
        try {
            return Integer.parseInt(txtDurasi.getText());
        } catch (NumberFormatException e) {
            tampilkanPesan("Durasi harus berupa angka.");
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

    public void tambahListener(ActionListener actionListener) {
        btnTambah.addActionListener(actionListener);
        btnHitung.addActionListener(actionListener);
        btnBatal.addActionListener(actionListener);
    }
}
