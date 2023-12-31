package hw.service;

import hw.model.Toy;

public class CreateToy implements ToyService{

    public CreateToy() {
    }

    @Override
    public Toy create(Toy toy) {
        return new Toy();
    }
}
