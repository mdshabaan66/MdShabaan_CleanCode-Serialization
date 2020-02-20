package com.shabaan.cleancode;
import java.util.*;
class Simple_And_Compound_Interest {
		double compound_Interest,rate_Of_Interest,number_Of_Years,principle,Amount;
		public void simple(){
			double  simple_Interest;
			System.out.printf("Enter Principle:");
			System.out.printf("\n");
			Scanner sc=new Scanner(System.in);
			principle=sc.nextDouble();
			System.out.print("Enter rate of Interest:");
			rate_Of_Interest=sc.nextDouble();
			System.out.print("Enter Time in Year:");
			number_Of_Years=sc.nextDouble();
			simple_Interest=(principle*rate_Of_Interest*number_Of_Years)/100;
			System.out.printf("Simple Interest="+ simple_Interest);
			System.out.printf("\n");
		}
		public void compound() {
			double compound_Interest,amount;
			System.out.printf("Enter Principle:");
			System.out.printf("\n");
			Scanner sc=new Scanner(System.in);
			principle=sc.nextDouble();
			System.out.print("Enter rate of Interest:");
			rate_Of_Interest=sc.nextDouble();
			System.out.print("Enter Time in Year:");
			number_Of_Years=sc.nextDouble();
			amount=principle*(Math.pow((1+(rate_Of_Interest/100)),number_Of_Years));
			compound_Interest=amount-principle;
			System.out.printf("Compound Interest="+compound_Interest);
			System.out.printf("\n");
			
		}
}
