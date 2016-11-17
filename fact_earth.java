import java.util.Scanner;

public class fact_earth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rem=0;
		
		int count=0;
		int a = 5;
		for(int i=5;i<=n;i=i*a){
		rem = n/i;
		
		count = count+rem;
		
		}
		System.out.println(count);
		
	}

}
