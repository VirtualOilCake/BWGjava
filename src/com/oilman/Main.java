package com.oilman;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String userInput = input.next();/*用户输入*/

        Utils utils=new Utils();

        String output=utils.getResponses(userInput);
        System.out.println(output);

    }
}
