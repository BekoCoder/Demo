package service;

import model.User;

public interface UserService {
        void addUser();
        void UserMenu();
        void listUser();
    User register(String username, String password);

}
