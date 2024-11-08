package org.example;

public class StrategyApplication {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10,5));

        context=new Context(new OperationSubstract());
        System.out.println("10 - 5 = "+context.executeStrategy(10,5));

        context=new Context(new OperationMultipy());
        System.out.println("10 * 5 = "+context.executeStrategy(10,5));
    }
}
