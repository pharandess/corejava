public class Fibonacci {

	public static void main(String[] args) {
		
		long pre_val = 0;
		long	curr_val = 1;
		long	fib;
		
		System.out.print(pre_val+",");
		System.out.print(curr_val+",");
		int i=0;
		while (i<10){
			fib = pre_val + curr_val;
			System.out.print(fib+",");
			
			pre_val = curr_val;
			curr_val = fib;		
			i ++;
		}
	}
}