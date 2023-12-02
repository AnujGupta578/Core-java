package practice;

/**
 * java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
 *
 * To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
 */

/**
 * Input Format
 *
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
 */

/**
 * Output Format
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly 15 characters.
 * The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */

/** Input
 * java 100
 * cpp 65
 * python 50
 */

/**
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 */

import java.util.Scanner;

/**
 * Explanation
 *
 * Each String is left-justified with trailing whitespace through the first  characters.
 * The leading digit of the integer is the 16th character, and each integer that was less than  digits now has leading zeroes.
 */

public class OutputFormat {

  public static void main(String[] args) {
    String str = "java 100 \n cpp 65 \n python 50";

    Scanner sc = new Scanner(str);
    System.out.println("================================");
    for(int i=0;i<3;i++)
    {
      String s1= sc.next();
      int x= sc.nextInt();
      String padded = String.format("%-15s", s1);
      String number = String.valueOf(x);
      if(x >= 0 && x < 999) {
        if ( 0 <= x && x < 10) {
          number = "00" + number;
        } else if (10 <= x && 99 >= x) {
          number = "0" + number;

        }
      }
      System.out.println(padded + number);
    }
    System.out.println("================================");
  }

}
