//Author: Shashwat Tiwari
package com.st.dp.day1.session1.part1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = sc.nextLine().toLowerCase().trim();
		
		switch(processOption) {
			case "order":
				System.out.println("Please provide the phone model name!!");
				PhoneOrderClass poc = new PhoneOrderClass();
				
				String phoneModelName = sc.nextLine();
				
				poc.ProcessOrder(phoneModelName);
				
				break;
			case "phonerepair":
				System.out.println("Please provide the Phone model name you want to repair!!");
				String phoneRepairModelName = sc.nextLine();
				
				
				PhoneRepairClass prc = new PhoneRepairClass();
				
				prc.ProcessPhoneRepair(phoneRepairModelName);
				
				break;
				
			case "accessoryrepair":
				System.out.println("Please provide the Accessory name you want to repair!!");
				String accessoryRepairModelName = sc.nextLine();
				
				AccessoryRepairClass arc = new AccessoryRepairClass();
				arc.ProcessAccessoryRepair(accessoryRepairModelName);
				
				break;
				
			default:
				System.out.println("Enter a valid option !!!!!");
				break;
		}
		//Close the Scanner sc object
		sc.close();
	}
}
