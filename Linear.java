import java.util.Scanner;

public class Linear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fab = sc.nextLine();
		
		int len = fab.length();
		char aa[] = new char[len];
		
		
		int b[] = new int [len];
		char arr[] = fab.toCharArray();
		for(int i=0;i<len;i++){
			System.out.println(arr[i]);
			 b[i] = (int)arr[i];
			 if(b[i]>64&&b[i]<=90){
					b[i] = b[i]+32;
				}
				else{
					b[i] = b[i]-32;
				}
		}
		
		for(int k = 0;k<len;k++){
			aa[k] = (char)b[k];
			System.out.print(aa[k]);
		}
		
	}
}
