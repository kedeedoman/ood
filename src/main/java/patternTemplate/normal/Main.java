package patternTemplate.normal;

/*
* Both Tea & Coffee classes have prepareRecipe() method,
* which has a bunch of duplicate code.
*
* This is the basic implementation of Both the classes,
*
* Check out the optimized version of this, in the optimized package.
*
* */

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
