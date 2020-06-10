package patternTemplate.optimized;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        Tea myTea = new Tea();
        myTea.prepareRecipe();
    }
}
