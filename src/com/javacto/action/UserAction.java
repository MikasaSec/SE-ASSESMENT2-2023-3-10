package com.javacto.action;

import com.javacto.dao.Dao;
import com.javacto.dao.DaoImpl;
import com.javacto.service.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserAction {
    public static Dao init = new DaoImpl();
    //load existing data
    public static ArrayList<String> userData = init.readFile("src/com/javacto/users.txt");
    public static ArrayList<String> courseData = init.readFile("src/com/javacto/courses.txt");

    public static void main(String[] args) {

        //welcome
        System.out.println("Welcome to Part Time Teacher Management System!");
        String ID;
        String password;

        //user login and password verification
        login:
        while (true) {
            Scanner input = new Scanner(System.in);
            //input ID
            System.out.println("Please type in your user ID");
            ID = input.next();
            //input password
            System.out.println("Please type in your password");
            password = input.next();
            if (init.validate(ID, password)) {
                break login;
            }
        }

        //obtain user role with given ID and create specific user role using Polymorphism method
        User user = init.getUserRole(ID);
        if (user != null) {
            //
            init.run(user);
        }
    }
}
