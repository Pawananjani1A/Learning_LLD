package main.java.models.payment;


import main.java.models.person.Person;
public abstract class Payment {
        Person person;
        double price;
        PaymentCategory paymentCategory;

        public Payment(PaymentCategory paymentCategory){
            this.paymentCategory = paymentCategory;
        }

}
