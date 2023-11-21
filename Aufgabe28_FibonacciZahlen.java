
public class Aufgabe28_FibonacciZahlen {
	public static void main(String [] args) {
		int f = 1;
		int i = 0;
		int x =0;
		System.out.println(rekursivFibonacci(f,i,x));
	}
	private static int rekursivFibonacci(int f, int i, int x) {
		while(x<8) {
			f = rekursivFibonacci(f+i,i = f,x);
			x++;
		}
		return f;
	}
	
}
