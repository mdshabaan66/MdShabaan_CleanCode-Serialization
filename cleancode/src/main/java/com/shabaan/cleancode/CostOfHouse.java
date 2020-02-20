package com.shabaan.cleancode;
import java.util.*;
class Cost_Of_House {
		public void construction_Of_House() {
			int choice;
			double area,total_Amount;
			System.out.printf("********Value of House**********\n");
			Scanner ss=new Scanner(System.in);
			System.out.println("Enter the Area of House in Square Meter\n");
			area=ss.nextDouble();
			System.out.println("Enter the Choice\n");
			System.out.println("1.Standered Materials\n");
			System.out.println("2.Above Standered Materials\n");
			System.out.println("3.High Standered Materials\n");
			System.out.println("4.High Standered Materials And Fully Automated\n");
			choice =ss.nextInt();
			switch(choice)
			{
				case 1:
				{
					total_Amount=1200*area;
					System.out.println("Total Cost ="+ total_Amount);
					break;
				}
				case 2:
				{
					total_Amount=1500*area;
					System.out.println("Total Cost ="+ total_Amount);
					break;
				}
				case 3:
				{
					total_Amount=1800*area;
					System.out.println("Total Cost ="+ total_Amount);
					break;
				}
				case 4:
				{
					total_Amount=2500*area;
					System.out.println("Total Cost ="+ total_Amount);
					break;
				}
				default:
					System.out.println("Wrong choice");
					break;
				}
			}

}
