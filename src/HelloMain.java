/**
 * class Explain
 * @author quf93
 *
 */

public class HelloMain {
	/**
	 * Method Explain
	 * @param args
	 */
	public static void main(String[] args) {
		String str;
		str = changeNumberToString(5);
		System.out.println(str);
		System.out.println();
		
		int a = 2 + 3;
		int b = 2 - 3;
		int c = 2 * 3;
		int d = 2 / 3;
		int e = 5 % 3;
		int f = 10 % 3;
		double dou = 5.0 % 4.2;
		p(a);
		p(b);
		p(c);
		p(d);
		p(e);
		p(f);
		System.out.println(dou);
	}
	
	/**
	 * 
	 * @param i
	 */
	public void area(int i) {
		// Integer
		byte a = 10;
		byte b = 10;
		int c = a + b;
		
		// float
		float d = 3.13f;
		float e = 4.1928f;
		
		// 실수는 직접연산 X
		float sum  = Float.sum(d, e);	
	}
	
	public static void p(int num) {
		System.out.println(num);
	}
	
	public static String changeNumberToString (int num) {
		return Integer.toString(num);
	}
	public int changeStringToInteger (String str) {
		return Integer.parseInt(str);
	}
}
