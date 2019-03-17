package com.springapp.mvc.datasource;

import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDatabaseImitation {
    private static List<User> listOfUsers = new ArrayList<>();

    static {
        listOfUsers.add(new User("Cristina Stefaniuc", "endava", Gender.FEMALE));
        listOfUsers.add(new User("Xenia Damanciuc", "endava",Gender.FEMALE));
        listOfUsers.add(new User("Mihaela Jura", "endava",Gender.FEMALE));
    }

    public static List<User> getListOfUsers() {
        return listOfUsers;
    }

    public static void setListOfUsers(List<User> listOfUsers) {
        UsersDatabaseImitation.listOfUsers = listOfUsers;
    }

    public static void addUser(User user) {
        listOfUsers.add(user);
    }
}
