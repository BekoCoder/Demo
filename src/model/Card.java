package model;

import java.util.UUID;

public class Card {
    private UUID id;
    private String CardNumber;
     private  String expiryDate;
    private double balance;
    private UUID userId;

    public Card() {
    this.id=UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public Card(String cardNumber, String expiryDate, double balance) {
        CardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.balance = balance;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "CardNumber='" + CardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", balance=" + balance +
                '}';
    }
}
