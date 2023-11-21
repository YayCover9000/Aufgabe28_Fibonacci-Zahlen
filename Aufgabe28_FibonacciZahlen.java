
public class Aufgabe28_FibonacciZahlen {
	public static void main(String[] args) {
        int n = 10; // ANzahl an durchgängen -1
        int result = rekursivFibonacci(n);
        System.out.println(result);
    }

    private static int rekursivFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return rekursivFibonacci(n - 1) + rekursivFibonacci(n - 2);
        }
    }
	
}
