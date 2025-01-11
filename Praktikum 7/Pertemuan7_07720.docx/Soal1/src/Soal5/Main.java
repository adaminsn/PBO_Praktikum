package Soal5;

import Soal5.controller.Controller;
import Soal5.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        new Controller(view);
    }
}
