package liskovsubstitution.good;

public interface SecureLoan extends LoanPayment {
    public  void forceCloseLoan();
}
