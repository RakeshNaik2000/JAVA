
public class Main
{
//     static{
//         a=10;
//         System.out.println(" Hi I am upper Static block>>>");
//     }
    
// 	static{
// 	    System.out.println(" Hi I am middle Static block>>>");
// 	}
// 	final static int a;
// 	static{
// 	    System.out.println("Hi I am static block>>>");
// 	}
// public static void  main1(){
// 	   // a=17;
// 	    System.out.println("main1\'s a = "+a);
// 	}
    int a;
    static int b;
    Main(){
       a++;
       b++;
       //Main.b = 0;
       System.out.println("Instance variable:"+a);
       System.out.println("Static variable:"+b);
    }
	public static void main(String[] args) {
	   // a=1;
// 	    int a=0;
// 	    Main ob = new Main();
// 		System.out.println("ob.a = "+ob.a);
// 		main1();
        Main s1 = new Main();
        System.out.println("-----------------------------------------");
        Main s2 = new Main();
        System.out.println("-----------------------------------------");
        Main s3 = new Main();
	}
}
