//calculate income tax paid by an employee as per the slabs mentioned

		/*
		 * INCOME SLABS              TAX
		 *< 2.5l                     0%
		 * 2.5l - 5l                 5%
		 * 5.0l - 10.0l              20%  + 5% for 2.5l
		 * above 10.0l               30%   + 5% for 2.5l + 20% for 5l 
		 * Gross income is the sum of all the wages before any taxes or deductions
		 * Net income = gross income - deduction 
		 */

import java.util.Scanner;
public class Tax_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your gross anual income:  ");
		float gross_income = sc.nextFloat();
		float tax =0.0f;
		float net_income=0.0f;
		float x = 250000f;
		float y = 500000f;
		//check conditions
		if(gross_income < 250000f)
		{
			System.out.println("You have Rs 0.0 deductions!!!!");
		}
		else if((gross_income >= 250000f) && (gross_income <= 500000f))
		{
			System.out.println("Your gross income is =   Rs "+gross_income);
			tax = (gross_income * 0.05f);
			System.out.println("Deduction =   Rs "+tax);
			net_income = gross_income - tax;
			System.out.println("Your Net income is =    Rs  "+net_income);
			
		}
		else if((gross_income > 500000f) && (gross_income <= 1000000f))
		{
			System.out.println("Your gross income is =   Rs "+gross_income);
			tax = (gross_income * 0.05f);
			tax = tax + ((gross_income - x) * 0.2f);
			System.out.println("Deduction =   Rs "+tax);
			net_income = gross_income - tax;
			System.out.println("Your Net income is =    Rs  "+net_income);
		}
		else if(gross_income > 1000000f)
		{
			System.out.println("Your gross income is =   Rs "+gross_income);
			tax = tax + (gross_income * 0.05f);
			tax = tax + ((gross_income - x) * 0.2f);
			tax = tax + (((gross_income - x)- y) * 0.3f);
			System.out.println("Deduction =   Rs "+tax);
			net_income = gross_income - tax;
			System.out.println("Your Net income is =    Rs  "+net_income);
		}
		sc.close();

	}

}
