package patternTemplate.optimized;

public class Coffee extends CaffeineBeverage {

    @Override
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    void addSugarAndMilk() {
        System.out.println("Adding Sugar & Milk");
    }

    void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }
}
