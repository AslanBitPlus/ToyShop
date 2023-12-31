package hw;

import hw.controller.Controller;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("================================");
        System.out.println("| Программа розыгрыша игрушек! |");
        System.out.println("================================");
        //
        Controller controller = new Controller();
        controller.menu();
    }

}
