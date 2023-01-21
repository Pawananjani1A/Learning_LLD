package main.java.models.payment;

public abstract class CashlessPayment extends Payment{
    int transactionId;

    public CashlessPayment(PaymentCategory paymentCategory) {
        super(paymentCategory);
    }
}
