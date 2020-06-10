package patternTemplate.pattern;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    boolean customerWantsCondiments() {
        String ans = getUserInput();
        return ans.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        String ans = sc.nextLine();
        return (ans == null || ans.equals(""))? "no" : ans;
    }
}
