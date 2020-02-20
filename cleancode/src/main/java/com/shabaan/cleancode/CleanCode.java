package com.shabaan.cleancode;
import java.util.*;
public class CleanCode {

	public static void main(String[] args) {
		int choice;
		System.out.println("*********Interest*********");
		Simple_And_Compound_Interest s=new Simple_And_Compound_Interest();
		System.out.println("Enter the Choice");
		System.out.println("1.Simple Interest");
		System.out.println("2.Compound Interest");
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				s.simple();
				break;
			}
			case 2:
			{
				s.compound();
				break;
			}
			default:
			{
				System.out.println("Wrong Input");
				break;
			}
		}
		Cost_Of_House C=new Cost_Of_House();
		C.construction_Of_House();
	}

}
