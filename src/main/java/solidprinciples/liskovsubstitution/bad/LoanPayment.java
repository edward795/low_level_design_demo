package solidprinciples.liskovsubstitution.bad;

public interface LoanPayment {

    public void doPayment(int amt);
    public void forceCloseLoan();

    public void doRepayment(int amt);
}
