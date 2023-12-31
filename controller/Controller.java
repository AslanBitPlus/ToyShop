package hw.controller;

import hw.service.*;
import hw.model.Toy;
import hw.view.ToyView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.exit;


public class Controller {

    public Controller() {
    }

    ArrayList<Toy> arrShop = new ArrayList<>();

    ArrayList<Toy> arrLoto = new ArrayList<>();
    public void menu() {
        String[] commands = {"1 - Новая игрушка",
            "2 - Печать игрушек",
            "3 - Добавить игрушку в список розыгрываемых игрушек",
            "4 - Печать списка розыгрываемых игрушек",
            "5 - Розыгрыш",
            "6 - Выход из программы",};

        Scanner scanner = new Scanner(System.in);
        int cmd = 1;
        while (cmd != 6) {
            printMenu(commands);
            try {
                cmd = scanner.nextInt();
                switch (cmd) {
                    case 1:
                        command1();
                        break;
                    case 2:
                        command2();
                        break;
                    case 3:
                        command3();
                        break;
                    case 4:
                        command4();
                        break;
                    case 5:
                        command5();
                        break;
                    case 6:
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Выберите команду (1 - " + commands.length + " )");
                scanner.next();
            }
        }
    }


    // Команды меню
    public void command1() {
        System.out.println("Выбрана команда 1 (Ввод новой игрушки) :");
        Toy toy = new Toy(1, "Мишка", 12.02, 4);
        Toy toy1 = new Toy(2, "Кукла большая", 10.00, 2);
        Toy toy2 = new Toy(3, "Кукла маленькая", 4.50, 3);
        Toy toy3 = new Toy(4, "Лиса", 6.30, 3);
        Toy toy4 = new Toy(5, "Тигренок", 7.00, 2);
        Toy toy5 = new Toy(6, "Собачка", 3.70, 1);
        Collections.addAll(arrShop, toy, toy1, toy2, toy3, toy4, toy5);
    }
    public void command2() {
        System.out.println("Выбрана команда 2 (Печать списка игрушек в магазине) :");
        System.out.println("-------------------------------------------");
        System.out.println("=== Список игрушек магазина! ===");
        System.out.println("-------------------------------------------");
        ToyView toyView = new ToyView();
        for (Toy t : arrShop) {
            toyView.printToy(t);
        }
        System.out.println("-------------------------------------------");
    }
    public void command3() {
        System.out.println("Выбрана команда 4 (Добавть игрушку в список розыгрываемых игрушек) :");
        Collections.addAll(arrLoto, arrShop.get(1), arrShop.get(3), arrShop.get(5));
    }
    public void command4() {
        System.out.println("Выбрана команда 3 (Печать списка розыгрываемых игрушек) :");
        System.out.println("-------------------------------------------");
        System.out.println("=== Список игрушек для розыгрыша! ===");
        System.out.println("-------------------------------------------");
        ToyView toyView = new ToyView();
        for (Toy t : arrLoto) {
            toyView.printToy(t);
        }
        System.out.println("-------------------------------------------");
    }
    public void command5() {
        System.out.println("Выбрана команда 5 (Розыгрыш игрушки) :");
        int min = 0;
        int max = 100;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        int numToy = rndToy(randomNum); //
        //
        System.out.println("RANDOM -> " + randomNum);
        System.out.println("Розыграна Игрушка - " + arrLoto.get(numToy).getToyId() +
                " -> " + arrLoto.get(numToy).getToyName());
    }
    private static void command6() {
        System.out.println("Выбрана команда 6 (Выход из программы) :");
    }

    public static void printMenu(String[] commands){
        for (String command : commands){
            System.out.println(command);
        }
        System.out.print("Выберите команду : ");
    }
    public static int rndToy(int rnd) {
        int result = 0;
        if (rnd < 20) { // 20% выпадения -> игрушка arrList[0]
            return  0;
        }
        if (rnd < 50) { // 30% выпадения -> игрушка arrList[1]
            return 1;
        }
        return 2; // 50% выпадения -> игрушка arrList[2]
    }

}