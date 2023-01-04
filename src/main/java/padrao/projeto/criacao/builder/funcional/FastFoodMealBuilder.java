package padrao.projeto.builder.funcional;

public class FastFoodMealBuilder {

    private String side;
    private String drink;
    private String main ;
    private String dessert;
    private String gift;


    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder withMain(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder withSide(String side) {
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder withDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder withGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }

}
