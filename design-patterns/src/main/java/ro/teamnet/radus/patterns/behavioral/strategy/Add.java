package ro.teamnet.radus.patterns.behavioral.strategy;


public class Add implements Strategy{
    public int execute(int a, int b) {
        System.out.println("Called Add's execute()");
        return a + b;
    }
}
