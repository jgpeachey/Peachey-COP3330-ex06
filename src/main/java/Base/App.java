/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Base;

/*
Create a program that determines how many years you have left until
retirement and the year you can retire. It should prompt for your current
age and the age you want to retire and display the output as shown in the
example that follows.

Example Output:
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints:
*Again, be sure to convert the input to numerical data before doing any
math.
*Don’t hard-code the current year into your program. Get it from the
system time via your programming language.

Challenge:
*Handle situations where the program returns a negative number by stating
that the user can already retire.
 */

import java.util.Scanner;
import java.util.Date;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Date d = new Date();

        int diff = 0;
        int year = d.getYear()+1900;

        System.out.println("What is your current age?");
        int current = in.nextInt();
        System.out.println("At what age would you like to retire?");
        int retire = in.nextInt();

        diff = retire-current;

        System.out.println("You have "+diff+" years left until you can retire.");
        System.out.println("It's "+year+", so you can retire in "+(year+diff)+".");
    }
}
