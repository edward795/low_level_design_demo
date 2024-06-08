package liskovsubstitution.bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amt) {

    }

    @Override
    public void forceCloseLoan() {
        throw new UnsupportedOperationException("Loan force closing is not allowed!");
    }

    @Override
    public void doRepayment(int amt) {
        throw new UnsupportedOperationException("Repayment is not allowed!");
    }
}
