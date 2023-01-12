import model.User;
import service.CardService;
import service.CardServiceImpl;
import service.UserService;
import service.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt=new Scanner(System.in);
        Scanner scannerStr=new Scanner(System.in);
        UserService userService=new UserServiceImpl();
        CardService cardService=new CardServiceImpl();

            int stepCode=100;
            while (stepCode!=0){
                System.out.println("1.Login, 2. Register, 3.list User");
                stepCode=scannerInt.nextInt();
                switch (stepCode){
                    case 1->userService.addUser();
                    case 2-> {
                        System.out.println("Enter username: ");
                        String username=scannerStr.nextLine();
                        System.out.println("Enter password: ");
                        String password=scannerStr.nextLine();
                        userService.register(username, password);


                        User user=userService.register(username,password);
                        if(user==null){
                            System.out.println("Ro'yhatdan o'ting!!!!!");
                        }
                        else {
                            System.out.println("Tizimga muvafaqiyatli kirdingiz!!!!");
                            System.out.println("1.Add Card, 2.Card List, 3.Send Money, 4.Debit History, 5.Credit History, 0.Exit");
                           int  stepCode1=scannerInt.nextInt();
                           while (stepCode1!=0){
                               switch (stepCode1) {
                                   case 1 -> {
                                       cardService.addCard();
                                   }
                                   case 2 -> {
                                       cardService.listCard();
                                   }
                                   case 3->{

                                   }

                               }
                           }
                        }

                    }
                    case 3->userService.listUser();
                }
            }

    }
}