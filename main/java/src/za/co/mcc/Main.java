package za.co.mcc;

import java.util.Scanner;
import MyCustomExceptions.InvalidEntryException;

/////////////////////////////////////////////////////////////////////
//    1.    $(CAD) - Canadian dollar
//    2.    $(USD) - United States Dollar
//    3.    Fr.(CHF) - Swiss Franc
//    4.    €(EUR) - European Euro
//    5.    $(KYD) - Cayman Islands Dollar
//    6.    £(GBP) - Great British Pound
//    7.    د.ا(JOD) - Jordanian Dinar
//    8.    ر.ع.(OMR) - Omani Rial
//    9.    .د.ب(BHD) - Bahraini Dinar
//    10.    د.ك(KWD) - Kuwaiti Dinar
////////////////////////////////////////////////////////////////////

public class Main {
        //Called Classes
        static Scanner scan = new Scanner(System.in);


        public static void main(String [] args) {
                System.out.println("Welcome to the Mini Currency Converter.");
        while(true) {
                System.out.println("Which currency would you like to convert from?");
                MCCMenu.currencyToConvertSelection();
                System.out.print("Enter number here: ");
                int currencyConvertedFrom = scan.nextInt();
                System.out.println();
                String currency = Currencies.numberToString(currencyConvertedFrom);//numbertostring method not working
                switch(currency){
                        //CAD to other
                        case "CAD":
                                System.out.println("What currency would you like to convert to?");
                                MCCMenu.currencyToConvertSelection();
                                System.out.print("Enter number here: ");
                                int currencyConvertedTo = scan.nextInt();
                                String currencyConverted = Currencies.numberToString(currencyConvertedTo);
                                switch (currencyConverted){
                                        case "CAD":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount = scan.nextDouble();
                                                System.out.println(amount);
                                                break;
                                        case "USD":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_1 = scan.nextDouble();
                                                System.out.println(amount_1 * 0.80);
                                                break;
                                        case "CHF":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_2 = scan.nextDouble();
                                                System.out.println(amount_2 * 0.67);
                                                break;
                                        case "EUR":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_3 = scan.nextDouble();
                                                System.out.println(amount_3 * 0.74);
                                                break;
                                        case "KYD":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_4 = scan.nextDouble();
                                                System.out.println(amount_4 * 0.67);
                                                break;
                                        case "GBP":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_5 = scan.nextDouble();
                                                System.out.println(amount_5 * 0.61);
                                                break;
                                        case "JOD":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_6 = scan.nextDouble();
                                                System.out.println(amount_6 * 0.57);
                                                break;
                                        case "OMR":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_7 = scan.nextDouble();
                                                System.out.println(amount_7 * 0.31);
                                                break;
                                        case "BHD":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_8 = scan.nextDouble();
                                                System.out.println(amount_8 * 0.30);
                                                break;
                                        case "KWD":
                                                System.out.print("Please enter amount to convert: ");
                                                double amount_9 = scan.nextDouble();
                                                System.out.println(amount_9 * 0.24);
                                                break;

                                }
                        break;
                        case "USD":
                                /////
                                break;
                }

                //End of loop//
                System.out.println("Would you like to convert another currency? Y/N?");
                //clear scanner
                String yesOrNo_1 = scan.nextLine();
                if(yesOrNo_1.equalsIgnoreCase("Y") || yesOrNo_1.equalsIgnoreCase("N")){
                        if(yesOrNo_1.equalsIgnoreCase("N")){
                                System.out.println("Thank you, Goodbye");
                                System.exit(0);
                        }
                }
        }
    }
}
