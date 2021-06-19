package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String storedPass;

        HashMap<String,String> userCred = new HashMap<>();
        userCred.put("111","111");
        userCred.put("222","222");

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the user name? ");
        String enteredUserName = scan.nextLine();

        System.out.print("Please enter the password? ");
        String enteredPassword = scan.nextLine();

        if(userCred.containsKey(enteredUserName)){
            storedPass = userCred.get(enteredUserName);
            if (storedPass.equals(enteredPassword)){
                System.out.println("Success!");
            }else {
                System.out.println("Invalid credentials!");
            }
        }else {
            System.out.println("Invalid credentials!");
        }

    }
}
