package hw.view;

import hw.model.Toy;
public class ToyView {

    public void printToy(Toy toy) {
        int id = toy.getToyId();
        String name = toy.getToyName();
        Double price = toy.getToyPrice();
        int weight = toy.getToyWeight();
        System.out.printf("|%5d|%20s|%10.2f|%2d |\n", id, name, price, weight);
    }
}
