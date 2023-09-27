package Day2;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		int n;
		int r;
		int sum=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		
		System.out.println("sum of digit ="+sum);

	}

}
