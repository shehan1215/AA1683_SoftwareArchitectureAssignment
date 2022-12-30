package com.sltc.soa.client;
import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("*** i.e ***");
        System.out.println(" Please Give the Uppercase letters"+
                            " for the currency you have to enter\n" +
                            " e.g. LKR, AED, SGD,... \n" +
                            " Thank You!\n ___________________________________________\n");

        CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
        CurrencyConversionWs currencyConversionWs = currencyConversionWsService.getCurrencyConversionWsPort();

        /** User input for what currency */
        System.out.println("Give The Currency To Convert");
        String cr = input.nextLine();
        double ans = currencyConversionWs.convert(0, "USD", cr);

        System.out.println("Give the Second Currency");
        String cr2 = input.nextLine();
        double ans2 = currencyConversionWs.convert(0, cr2, cr);

        /** User Input for the Amount*/
        System.out.println("Enter the Amount You Want Convert: ");
        double amnt = input.nextDouble();
        double ans1 = currencyConversionWs.convert(amnt, cr2, cr);

        /** Final Answer Print */
        double lastAns = ans+ans1+ans2;
        System.out.println("_____________________________________");
        System.out.println(amnt+" "+cr2+" is "+lastAns+": "+cr);
        System.out.println("======================================");
    }
}