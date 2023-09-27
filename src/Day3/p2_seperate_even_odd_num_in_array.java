package Day3;

public class p2_seperate_even_odd_num_in_array {

	public static void main(String[] args) {
		
		int a[]= {10,11,14,15,18,19};
		
		int i;
		
		System.out.println("Even numbers are : ");
		for(i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
				}
			}
		}
		
		System.out.println("Odd numbers are : ");
		for(i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				if(a[i]%2==1)
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
