package solidprinciples.liskovsubstitution.bad;

public class HomeLoan implements LoanPayment
{
    @Override
    public void doPayment(int amt) {

    }

    @Override
    public void forceCloseLoan() {

    }

    @Override
    public void doRepayment(int amt) {

    }
}
