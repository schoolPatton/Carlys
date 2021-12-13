package com.company;

import java.util.*;
import java.text.DecimalFormat;


public class CarlysEventPrice {
    //Patton Oehler
    // 12/8/2021
    //Purpose - to give the price of an event

    double RATE_PER_PERSON = 35;



    private int Get_Input()
    {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Number of guests attending: ");
        try {
            return sc.nextInt();
        }
        catch(Exception e)
        {
            return Get_Input();
        }

    }

    private double Calcs(int guests)
    {
        return RATE_PER_PERSON * guests;
    }

    private void Output(double price, int guests)
    {

        String pattern="###,##0.00";
        DecimalFormat df=new DecimalFormat(pattern);


        System.out.printf("With %d people attending", guests);
        System.out.print(" at a price of $" + df.format(RATE_PER_PERSON) + " per person\n");
        System.out.print("The total will be $" + df.format(price) + "\n");
        if(guests >= 50)
        {
            System.out.println("This is considered a large event");
        }
        else
        {
            System.out.println("This is not considered a large event");
        }

    }

    public static void main(String[] args) {
        CarlysEventPrice a  = new CarlysEventPrice();
        int guests = a.Get_Input();
        double cost = a.Calcs(guests);
        a.Output(cost, guests);

    }
}
