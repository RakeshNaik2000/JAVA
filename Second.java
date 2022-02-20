import java.util.Scanner;
public class Second{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to be reversed:");
		int n=sc.nextInt();
		int s=0;
		while(n!=0){
			int rem = n%10;
			s=s*10+rem;
			n=n/10;
		}
		System.out.println("reverse of a number is:"+s);
	}
}