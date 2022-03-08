import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=1;
		for(int x=1;x<=n;x++)
		{
			m=x*m;
			System.out.println(m);
		}
	
	}

}
