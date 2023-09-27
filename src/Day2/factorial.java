package Day2;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i,n,f=1;
		
		System.out.println("enter the number whose factorial you wnanna print");
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("factorial ="+f);
	}

}
