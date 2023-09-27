package Day2;

import java.util.Scanner;

public class Armstrong_numbers {

	public static void main(String[] args) {

		int n;
		int r;
		int sum=0;
		int t;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		
		if(sum==t)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong ");
		}

	}

}
