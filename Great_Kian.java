import java.util.Scanner;

public class Great_Kian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long sum1=0;
		long sum2=0;
		long sum3=0;
		long num[] = new long[n];
		
		for(int i=0;i<n;i++){
			num[i] = sc.nextInt();
		}
		
	for(int j=0;j<n;j++){
		if(j%3==0){
			sum1 = sum1+num[j];
		}
		else if(j%3==1){
			sum2 = sum2+num[j];
		}
		else if(j%3==2){
			sum3 = sum3+num[j];
		}
	}
	
	System.out.println(sum1+" " +sum2+" "+sum3);
		
			
			
		
	}

}
