package solidprinciples.liskovsubstitution.good;

public interface SecureLoan extends LoanPayment {
    public  void forceCloseLoan();
}
