package solidprinciples.singlereponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static Map<Integer,Account> accountMap=new HashMap<>();

    public void addAccount(Account account){
        accountMap.put(account.getAccountNo(),account);
    }

    public void updateAccount(Account account){
        accountMap.put(account.getAccountNo(),account);
    }

    public Account getAccount(int accountNo){
        return accountMap.get(accountNo);
    }


    /**
     * This methos violates the single responsibility principle as
     * deposit is not an account operation like addAccount or update account.
     * This should be a transaction operation & ideally moved to another class maybe
     * Account Transaction.
     * @param amount
     * @param accountNumber
     */
    public void deposit(int amount,int accountNumber){
        //move this method to a different class
    }
}
