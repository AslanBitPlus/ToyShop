package hw.model;

public class Toy {
    private Integer toyId;
    private String toyName;
    private Double toyPrice;
    private Integer toyWeight;

    public Toy(Integer toyId, String toyName, Double toyPrice, Integer toyWeight) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyPrice = toyPrice;
        this.toyWeight = toyWeight;
    }

    public Toy() {
    }

    @Override
    public String toString() {
        return "Игрушка ------- " + '\n' +
                "Id -----------:" + toyId + '\n' +
                "Наименование -:" + toyName + '\n' +
                "Цена ---------:" + toyPrice + "р.\n" +
                "Вес ----------:" + toyWeight;
    }

    public Integer getToyId() {
        return toyId;
    }

    public void setToyId(Integer toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Double getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(Double toyPrice) {
        this.toyPrice = toyPrice;
    }

    public Integer getToyWeight() {
        return toyWeight;
    }

    public void setToyWeight(Integer toyWeight) {
        this.toyWeight = toyWeight;
    }

    public String toStr(Toy toy) {
        return toy.getToyId() +
                " - '" + toy.getToyName() + '\'' +
                " - " + toy.getToyPrice() + "р." +
                " - " + toy.getToyWeight();
    }
}
