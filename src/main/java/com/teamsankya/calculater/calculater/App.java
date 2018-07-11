package com.teamsankya.calculater.calculater;

import java.util.Scanner;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger LOGGER=Logger.getLogger("App.class");
    public static void main( String[] args )
    {
    	LOGGER.info("program starts..");
    	 Addition add=new Addition();
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter a no");
    	 int a=sc.nextInt();
    	 System.out.println("enter a second no");
    	 sc.nextLine();
    	 int b=sc.nextInt();
    	 
    	 int sum=add.addition(a, b);
    	 
    	 System.out.println(sum);
    	 
     /*  Addition add=new Addition();
       add.addition(10, 4);
       
       Multiplection mul=new Multiplection();
       mul.multiplecation(20, 10);
       
       Substrction sub=new  Substrction();
       sub.substraction(30, 5);
       
       Divition div=new Divition();
       div.divition(10, 5);*/
       
    		   
       
    }
}
