package application;

import model.Menu;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Menu menu = new Menu();

        menu.start();

    }
}
