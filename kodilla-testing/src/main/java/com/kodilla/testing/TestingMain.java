package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test Ok!\n");
        } else {
            System.out.println("Error\n");
        }

        System.out.println("Test - pierwszy tests jednostkowy:");

        Calculator calculator = new Calculator();
        int result1 = calculator.addAToB(5, 6);
        int result2 = calculator.substractAFromB(6, 5);

        if (result1 == 11 && result2 == 1) {
            System.out.println("test OK!");
        } else {
            System.out.println("Error");
        }
    }
}
