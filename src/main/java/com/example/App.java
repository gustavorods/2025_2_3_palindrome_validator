package com.example;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
        // get the user's response
        String userText = JOptionPane.showInputDialog("Type the word");
        boolean resultado = palindrome_validator(userText);
        
        if(resultado == true) {
            JOptionPane.showMessageDialog(null, "The word is a palindrome");
        } else {
            JOptionPane.showMessageDialog(null, "The word isn't a palindrome");
        }
    }

    public static boolean palindrome_validator(String text) {
        // Remove all spaces 
        text = text.replace(" ", "");
        
        // Transform the text to lowercase
        text = text.toLowerCase();

        // I'm using the StringBuilder lib to reverse the text
        String reverse_text = new StringBuilder(text).reverse().toString();

        // comparing if the both texts are equals
        return text.equals(reverse_text);
    }

}
