package com.netflix;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int amount,qty,i,bill=0;
		
		System.out.println(" Welcome to Hotel Saravana Bhavan....");
		do {
		System.out.println("1. Dosa");
		System.out.println("2. Pongal");
		System.out.println("3. Vada");
		System.out.println("4. Poori");
		System.out.println("5. Idli");
		System.out.println("What is your choice? choose anyone");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Dosa Qty?");
			qty=s.nextInt();
			amount=qty*20;
			bill=bill+amount;
			break;
		case 2:
			System.out.println("Pongal Qty?");
			qty=s.nextInt();
			amount=qty*30;
			bill=bill+amount;
			break;
		case 3:
			System.out.println("Vada Qty?");
			qty=s.nextInt();
			amount=qty*10;
			bill=bill+amount;
			break;
		case 4:
			System.out.println("Poori Qty?");
			qty=s.nextInt();
			amount=qty*15;
			bill=bill+amount;
			break;
		case 5:
			System.out.println("Idly Qty?");
			qty=s.nextInt();
			amount=qty*10;
			bill=bill+amount;
			break;	
		default:
			System.out.println("Invalid food so choice valid food");
			break;
					
		}
		System.out.println("you want continue... press1 or press 0");
		i=s.nextInt();
		}while(i==1);
		System.out.println("Total Bill is "+bill);
		
	}

}
