package com.practice;

import java.util.regex.Pattern; 
public class String_Word_Reverse { 
  
     
    static String reverseWords(String str) 
    { 
  
        
        Pattern pattern = Pattern.compile("\\s"); 
  
        System.out.println(pattern);
       
        String[] temp = pattern.split(str); 
        String result = ""; 
  
        // Iterate over the temp array and store 
        // the string in reverse order. 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
  
   
    
    public static void main(String[] args) 
    { 
        String s1 = "Welcome to geeksforgeeks"; 
        System.out.println(reverseWords(s1)); 
  
        String s2 = "I love Java Programming"; 
        System.out.println(reverseWords(s2)); 
    } 
} 