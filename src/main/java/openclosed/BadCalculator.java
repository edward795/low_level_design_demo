package openclosed;

public class BadCalculator {
    //This is a bad programming principle as we need to modify or add more cases or code for changing or adding more operations
    public int calculateNumber(int num1,int num2,String type){
        int result=0;
        switch (type){
            case "sum":
                result= num1+num2;
            case "substract":
                result= num1-num2;
        }
        return result;
    }
}
