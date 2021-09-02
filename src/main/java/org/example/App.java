import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String fahren = "F";
        String cel = "C";
        String user;
        double user_temp, converted_temp;

        System.out.println( "Press C to convert from Fahrenheit to Celsius \n Press " +
                "F to convert from Celsius to Fahrenheit");
        user = input.next().toUpperCase(Locale.ROOT);

        if (user.equals(cel)) {
            System.out.println("Please enter the temperature in Fahrenheit");
            user_temp = input.nextDouble();
            converted_temp = (user_temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + converted_temp);
        }
        else {
            System.out.println("Please enter the temperature in Celsius");
            user_temp = input.nextDouble();
            converted_temp = (user_temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + converted_temp);
        }

    }
}
