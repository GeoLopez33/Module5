
public class FibNumbers {

	
	public static long fib(int n) {

		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
		return fib(n-1)+fib(n-2);
		
		}
		
	}
		

	public static long fibo(long n) {
		
		long next = 44; 	
		long first = 0;
		long second = 1;
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
			for (int i=2;i<=n;i++) {
				next = first  + second;
				first = second;
				second = next;
				
			}
		}
			
		return next;
			
			}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime=System.nanoTime();
		long endTime;
		//System.out.println("Start Time: " + startTime);
		
		
		startTime=System.nanoTime();
		System.out.println(fib(1));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 1: " + (endTime-startTime) + " Nanoseconds");
		System.out.println("\n");
		
		startTime=System.nanoTime();
		System.out.println(fib(7));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run of 7: " + (endTime-startTime) + " Nanoseconds");
		System.out.println("\n");
		
		startTime=System.nanoTime();
		System.out.println(fib(20));
		endTime=System.nanoTime();
		
		
		System.out.println("Time Taken For recursive run of 20: " + (endTime-startTime) + " Nanoseconds");
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(40));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run: of 40" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(43));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run: of 43" + (endTime-startTime) + " Nanoseconds");
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(45));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run: 45" + (endTime-startTime) + " Nanoseconds");
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fib(50));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For recursive run: 50" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(1));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run: 1" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(7));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run: 7" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(20));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run: 20" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(40));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run: 40" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(43));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run: 43" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(45));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run: 45" + (endTime-startTime) + " Nanoseconds");
		
		
		System.out.println("\n");
		startTime=System.nanoTime();
		System.out.println(fibo(50));
		endTime=System.nanoTime();
		
		System.out.println("Time Taken For iteration run: 50" + (endTime-startTime) + " Nanoseconds");
		
		
	}

	
	
	
	
}
