package com.company;

import java.util.Scanner;


public class Main
{
    //palindrome is described as text that can be read the same backward and forward

    //recursive function for determining if input is a palindrome
    public static Boolean palindrome(String input, Integer start, Integer end)
    {
        if (input.length() <= 1 || end == 0)
            return true;
        if (input.charAt(start) == input.charAt(end))
            return palindrome(input, start + 1, end - 1);
        return false;
    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = reader.nextLine();

        long startTime = System.nanoTime();
        Boolean temp = palindrome(word, 0, word.length() - 1);
        long endTime = System.nanoTime();

        System.out.println(temp);
        System.out.println("Algorithm took " + ((endTime - startTime) / Math.pow(10, 5)) + " seconds");
    }
}
