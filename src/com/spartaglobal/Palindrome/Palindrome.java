package com.spartaglobal.Palindrome;

public class Palindrome {
    private String userInput;
    String reverse = " ";


    public void check(String userInput){
       this.userInput = userInput;


        for (int i = userInput.length()-1; i>=0; i--){
            reverse += userInput.charAt(i);
        }

        if(reverse.equalsIgnoreCase(userInput)){
            System.out.println("It's a palindrome");
        } else{
            System.out.println("It's not a palindrome");
        }

    }
}
