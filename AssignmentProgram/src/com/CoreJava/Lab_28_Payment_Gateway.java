//Implement an interface for a real-world example,such as a payment gateway.
package com.CoreJava;
interface PaymentGateway 
{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway 
{
    @Override
    public void processPayment(double amount) 
    {
        System.out.println("Processing Credit Card payment of " + amount + "rs..");
    }
}

class PhonePayment implements PaymentGateway 
{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Phonepay payment of " + amount + "rs..");
    }
}

public class Lab_28_Payment_Gateway 
{
	public static void main(String[] args) 
	{
		 PaymentGateway ccp = new CreditCardPayment();
	     PaymentGateway gp = new PhonePayment();
	     
	     ccp.processPayment(150.00);
	     gp.processPayment(200.00);
	}

}
