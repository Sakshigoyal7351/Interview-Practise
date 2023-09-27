package Day2;

public class Average_of_array_elements {

	public static void main(String[] args) {

		int a[]= {90,80,70,90,80};
		int i;
		int sum=0, avg=0;
		
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements: "+sum);
		
		avg=sum/5;
		
		System.out.println("average of elements are :"+avg);
		
	}

}
