package dependencyinversion.bad;

public class Calculator {
    /**
     * Parent module or main module of calculator which help to calculate
     * as per user's choice.
     * As per DIP rule it states :
     * High-level modules should not depend on low-level modules. Both should depend on abstractions.
     * --- So above rule is broken our calculator class is directly dependent on low level class.
     * Abstractions should not depend on details. Details should depend on abstractions
     * --- Also is dependent on actual class.
     */
    public int calculate(int a,int b,String operation){
        int result=0;
        switch(operation){
            case "add":
                AddOperation op1=new AddOperation();
                op1.add(a,b);
            case "substract":
                SubstractOperation op2=new SubstractOperation();
                op2.substract(a,b);
        }
        return result;
    }
}
