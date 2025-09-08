package com.example;
public class App 
{
    public static void main( String[] args )
    {
        boolean resultado = palindrome_validator("A man a plan a canal Panama");
        System.out.println(resultado);
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
