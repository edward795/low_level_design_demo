package solidprinciples.liskovsubstitution.good;

public class HomeLoan implements SecureLoan{
    @Override
    public void doPayment(int amt) {

    }
    @Override
    public void forceCloseLoan() {

    }
}
