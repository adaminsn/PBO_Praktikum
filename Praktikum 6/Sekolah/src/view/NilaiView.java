package view;
import java.util.*;


public class NilaiView {
    public void NilaiDisplay(ArrayList<String> nilaiList) {
        System.out.println("\n===== DAFTAR NILAI ======");
        for (String nilai : nilaiList) {
            System.out.println(nilai);
        }
    }
}
