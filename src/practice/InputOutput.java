package practice;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the user name: ");

        String userName = myObj.nextLine();

        System.out.println("User Name: " + userName);
    }
}
