import java.util.Scanner;

public class pallin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String nm = sc.nextLine();
		int l = nm.length();
		int flag = 0;
		int a =l;
		
		
		char mm[] = nm.toCharArray();
		int i=0;
		while( i<a-1){
			if(mm[i] == mm[a-1]){
				a--;
				i++;
				flag=1;}
			else if(mm[i]!=mm[a-1]){
					flag=0;
					break;}
				
				
			}
			
			
		if(flag ==1){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
			
		
	}
		
	}


