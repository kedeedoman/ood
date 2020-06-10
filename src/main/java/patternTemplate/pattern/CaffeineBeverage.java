package patternTemplate.pattern;

/*
* Steps to prepare a CaffeineBeverage is same and
* should be in exact same order. It is just that different
* caffeineBeverage might have different brewing process or
* might add different condiments for flavors.
*
* Hence, the prepareRecipe() method has the fixed template, where
* the implementation of a few steps is decided by the subclasses.
*
* The algorithm(prepareRecipe) lives in one place and
* code changes only need to be made there.
*
* The CaffeineBeverage class concentrates knowledge about the
* algorithm and relies on subclasses to provide complete implementations.
* (Just like how Arrays.sort() works)
*
* One more thing to see here is, subclasses never class the superclass,
* only superclass class the subclass methods if required.
*
* Hooks -
* We can also have concrete methods that do nothing by default;
* we call these “hooks.” Subclasses are free to override these but don’t have to.
*
* customerWantsCondiments() is a hook because the subclass can override this method,
* but does not have to.
* */

public abstract class CaffeineBeverage {

    /*
    * To prevent subclasses from changing the algorithm
    * in the template method, declare the template method
    * as final.
    * */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
