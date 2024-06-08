package dependencyinversion.good;

public class SubstractOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
