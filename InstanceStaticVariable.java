
public class Main
{
    int x=10;
    static int y = 20;
    void meth1(){
        System.out.println("meth1() called");
        System.out.println("Instance variable:"+x);
        System.out.println("static variable:"+y);
    }
    
    static void meth2(){
        System.out.println("meth2() called");
        System.out.println("Instance variable:"+new Main().x);
        System.out.println("static variable:"+y);
    }
	public static void main(String[] args) {
		Main a = new Main();
		a.meth1();
		meth2();
	}
}
