package com.st.abstractfactorypattern.day1;

import java.util.*;
public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the brand name: ");
		String brandName = sc.nextLine();
		
		Factory fct = FactoryGetter.getFactory(brandName);
		
		if(fct != null) {
			fct.makeTire();
			fct.makeHeadLight();
		}else {
			System.out.println("You have entered wrong choice!!");
		}
	}

}
