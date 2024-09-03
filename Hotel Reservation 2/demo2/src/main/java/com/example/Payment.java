package com.example;

public class Payment {
    private double amount;
    private String method; // e.g., "Credit Card", "Cash"

    public Payment(double amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    // Getters and setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public boolean processPayment() {
        // Logic to process payment
        // For simplicity, assume payment is always successful
        System.out.println("Payment of $" + amount + " processed using " + method);
        return true;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", method='" + method + '\'' +
                '}';
    }
}
