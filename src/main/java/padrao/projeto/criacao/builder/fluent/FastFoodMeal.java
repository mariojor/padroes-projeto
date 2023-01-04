package padrao.projeto.builder.fluent;

import lombok.Data;

@Data
public class FastFoodMeal {
    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String toString() {
        return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
                + gift + "]";
    }
}
