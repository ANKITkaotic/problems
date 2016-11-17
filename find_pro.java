import java.util.Scanner;

public class find_pro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double a[] = new double[n];
		double ans =1;
	
		double value = Math.pow(10, 9)+7;
		
		for(int i =0;i<n;i++){
			
			a[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++){
			ans = (ans * a[j])%value;
		}
		System.out.println((int)ans);
		
	}

}
