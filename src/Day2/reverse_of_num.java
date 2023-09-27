package Day2;

import java.util.Scanner;

public class reverse_of_num {

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
			sum=(sum*10)+r;
		}
		
		System.out.println("reverse of a number is  ="+sum);

	}

}
