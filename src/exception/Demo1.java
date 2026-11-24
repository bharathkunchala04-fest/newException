package exception;

public class Demo1 {

	public static void main(String[] args) {
		int a = 10;
		try{
			int ans = a/0;
			System.out.println(ans);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Java program executed sucessfully");
		
//		int ans = 10/0;
	}

}
