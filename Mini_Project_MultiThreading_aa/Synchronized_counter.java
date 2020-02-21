package Mini_Project_MultiThreading_aa;
//import java.util.Random;

public class Synchronized_counter {
	private int n;
	private int order = 1;
	public Synchronized_counter(int n) {
		this.n= n;
	}
	
// FOR EXERCISE 1.1	REMOVE THE COMMENTS TO EXECUTE
/*	 public void counter(String s) {
		 for(int i=0;i<this.n;i++) {
			try {
				Thread.sleep((long)(Math.random()*5000));
			}
			catch(InterruptedException e) {
				System.out.println("it's over.");
			}
			System.out.println(i+": "+s);
		}
		System.out.println(s+": end in order "+this.order);
		this.order+=1;
	}*/
	

// FOR EXERCISE 1.2 REMOVE THE COMMENTS TO EXECUTE
	/*	 public synchronized void counter(String s) {
	 for(int i=0;i<this.n;i++) {
		try {
			Thread.sleep((long)(Math.random()*5000));
		}
		catch(InterruptedException e) {
			System.out.println("it's over.");
		}
		System.out.println(i+": "+s);
	}
	System.out.println(s+": end in order "+this.order);
	this.order+=1;
}*/
}
