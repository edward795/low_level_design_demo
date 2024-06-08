package dependencyinversion.good;

public class Calculator {
    public int calculate(int a, int b, CalculatorOperation operation){
        return operation.calculate(a,b);
    }
}
