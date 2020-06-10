package patternTemplate.pattern;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();

        CaffeineBeverage hookedCoffee = new CoffeeWithHook();
        hookedCoffee.prepareRecipe();
    }
}
