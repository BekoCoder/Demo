package service;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements  UserService {
    private List<User> userList=new ArrayList<>();
     private  Scanner scanner=new Scanner(System.in);

    @Override
    public void addUser() {
        System.out.println("Enter name: ");
        String name=scanner.next();
        System.out.println("Enter username: ");
        String username=scanner.next();
        System.out.println("Enter password: ");
        String password=scanner.next();
        User user=new User(name, username, password);
        userList.add(user);
    }

    @Override
    public void UserMenu() {

    }

    @Override
    public void listUser() {
        for (User user : userList) {
            System.out.println(userList);
        }
    }

    @Override
    public User register(String username, String password) {

        for (User user : userList) {
            if(user!=null){
                if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                    return user;
                }
            }
        }
        return null;
    }
}
