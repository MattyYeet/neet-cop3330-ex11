package aaahhhh;

import java.util.Formatter;
import java.util.Scanner;

public class example11 {
    public static void main(String[] args){
        double c_to, rate;
        int c_from;
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        c_from = input.nextInt();
        System.out.print("What is the exchange rate? ");
        rate = input.nextDouble();
        c_to = rate * c_from;
        Formatter fmt = new Formatter();
        fmt.format("%.2f", c_to);
        System.out.print(c_from+" euros at an exchange rate of "+rate+" is "+fmt+" U.S. dollars.");

    }
}
