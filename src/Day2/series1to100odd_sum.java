package Day2;

public class series1to100odd_sum {

	public static void main(String[] args) {
		int i;
		int sum=0;
		
		for(i=1;i<=100;i++)
		{
			if(i%2==1)
			{
			System.out.println(i);
			sum=sum+i;
			}
		}
		
		System.out.println("sum="+sum);

	}

}
