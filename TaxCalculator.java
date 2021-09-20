//Enter salary
// add HRA-@15 of basic
//add da-60% of basic
//tax: below 500k :0%
//50,001-10,00,000-20%
//above-30%

import java.util.Scanner;

public class TaxCalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary: ");
		int salary=sc.nextInt();
		float HRA=(float)(salary*0.15);
		float DA=(float)(salary*0.6);
		if (salary<50000)
		{
			System.out.println("For Salary :"+salary); 
			System.out.println("HRA would be @ " +15+"% amount "+HRA+"Rs.");
			System.out.println("DA would be @ " +60+"% amount "+DA+"Rs.");
			System.out.println("Tax would be @ "+0+"% amount "+0+"Rs.");
		}
		else if (salary>50001 && salary<1000000)
		{
			float tax=(float)(salary*0.2);
			System.out.println("For Salary :"+salary); 
			System.out.println("HRA would be @ " +15+"% amount "+HRA+"Rs.");
			System.out.println("DA would be @ " +60+"% amount "+DA+"Rs.");
			System.out.println("Tax would be @ "+20+"% amount "+tax+"Rs.");
		}
		else{
			float tax=(float)(salary*0.3);
			System.out.println("For Salary :"+salary); 
			System.out.println("HRA would be @ " +15+"% amount "+HRA+"Rs.");
			System.out.println("DA would be @ " +60+"% amount "+DA+"Rs.");
			System.out.println("Tax would be @ "+30+"% amount "+tax+"Rs.");
		}
	}
}