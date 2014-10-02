package ro.teamnet.radus.patterns.behavioral.strategy;

public class Subtract {
    public int execute(int a, int b) {
        System.out.println("Called Subtract's execute()");
        return a - b;
    }
}
