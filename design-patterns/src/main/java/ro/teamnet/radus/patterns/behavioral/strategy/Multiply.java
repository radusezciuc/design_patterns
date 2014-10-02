package ro.teamnet.radus.patterns.behavioral.strategy;

public class Multiply {
    public int execute(int a, int b) {
        System.out.println("Called Multiply's execute()");
        return a * b;
    }
}
