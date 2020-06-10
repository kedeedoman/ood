package patternTemplate.optimized;

/*
* Optimized the previous code to have a superclass called CaffeineBeverage,
* which included the common methods and an abstract method which the subclasses
* have to override.
* */

public abstract class CaffeineBeverage {
    abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }
}
