package Mini_Project_MultiThreading_aa;

public class Counter extends Thread{
	Synchronized_counter sc;
	private String s;
	public Counter(Synchronized_counter sc,String s) {
		this.sc = sc;
		this.s= s;
	}	

	public void run() {
		sc.counter(this.s);
	}	
}	
