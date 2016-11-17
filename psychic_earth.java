import java.util.Scanner;

public class psychic_earth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int l = n.length();
		char a[] = n.toCharArray();
		int flag = 0;
		int count = 0;
		for(int i=0;i<l-1;i++){
		if(a[i]==a[i+1]){
			count++;
			if(count==5)
				flag = 1;
			
		}
		else
			count=0;
		
		}
		if(flag==1){
			System.out.println("Sorry, sorry!");
		}
		else
			System.out.println("Good luck!");
		
	}

}
