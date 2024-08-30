package org.example;

public class PayPalPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount<= 1500){
            System.out.println("Paid using Paypal : $"+amount);
        }else{
            next.handlePayment(amount);
        }
    }
}
