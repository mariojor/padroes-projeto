package padrao.projeto.builder.fluent;

public class Rodar {

    public static void main(String[] args) {

        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
                .withMain("CheeseBurger")
                .withDrink("Code")
                .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal burguer = new FastFoodMealBuilder("Fries")
                .withMain("CheeseBurger")
                .withDrink("Code")
                .withDessert("IceCream")
                .withSide("Onion Rings")
                .withGift("Toy")
                .thatsAll();
        System.out.println(burguer);

    }
}
