package com.practice;

import java.util.Arrays;

class Duplicate_String_removal  
{ 
    static String removeDuplicate(char str[], int n) 
    { 
        
        int index = 0; 
        int j;

        for (int i = 0; i < n; i++) 
        { 
 
            for ( j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
  
            if (j == i)  
            { 
                str[index] = str[i]; 
                index++;
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        char str[] = "geeksforgeeks".toCharArray(); 
        int n = str.length; 
        System.out.println(removeDuplicate(str, n)); 
    } 
}