package service;

import model.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardServiceImpl implements  CardService{

    List<Card> cardList=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    @Override
    public void addCard() {
        System.out.println("Enter CardNumber: ");
    String CardNumber=scanner.next();
        System.out.println("Enter Expiry Date: ");
        String expiryDate=scanner.next();
        System.out.println("Enter balance: ");
        double balance=scanner.nextDouble();
        Card card=new Card(CardNumber, expiryDate, balance);
        cardList.add(card);
    }

    @Override
    public void listCard() {
        for (Card card : cardList) {
            System.out.println(cardList);
        }

    }
}
