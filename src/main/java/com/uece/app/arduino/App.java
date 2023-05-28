package com.uece.app.arduino;

public class App {
    public static void main(String[] args) {
        Iluminador luz = new Led();
        luz.ligar();
        luz.exibir();
    }
}
