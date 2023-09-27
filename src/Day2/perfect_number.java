package Day2;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		int n,i=1,t;
		int sum=0;
		
		System.out.println("enter any number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		t=n;
		
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		
		if(sum==t)
		{
			System.out.println("The number is perfect");
		}
		else
		{
			System.out.println("num is not perfect");
		}

	}

}
