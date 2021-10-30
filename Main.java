///////////////////////////////////////////////
//  longestStreak
//
// Eugenia Kovtun and Nicholas LeBlanc  
//
// Purpose: The method longestStreak is intended to determine the //longest substring of consecutive identical
///characters in the parameter str and print the result.
//
// Precondition(s):
//
///////////////////////////////////////////////

import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    //  Adaptation for getting the String from the console
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the string:  ");
    String str = scan.nextLine();

    System.out.println("\n\n\n");  // do not remove!

    //  insert your code below
    String currChar;  //tracks current character

    String currStreakChar = str.substring(0,1); //tracks current streak character
    int currStreakLength = 0; //tracks current streak length

    String longestStreakChar = str.substring(0,1);  //tracks longest streak character
    int longestStreakLength = 0;  //tracks longest streak length

    for(int i = 0; i < str.length(); i++){  //loops the algorithm until end of str
      currChar = str.substring(i, i + 1);

      if(currChar.equals(currStreakChar)){  //increases streak length                                                            //if current and  previous characters match
        currStreakLength++;
      }
      else{ //resets the current streak if it is broken

        if(currStreakLength > longestStreakLength){ //checks if longest streak was broken

          longestStreakLength = currStreakLength;
          longestStreakChar = currStreakChar;
        }

        currStreakLength = 1;
        currStreakChar = currChar;
      }
    }
      System.out.println(longestStreakChar + "" + longestStreakLength);
  } 
}

