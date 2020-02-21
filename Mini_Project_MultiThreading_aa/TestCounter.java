package Mini_Project_MultiThreading_aa;
import java.util.Scanner;

public class TestCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give the counter:");
		int n = scan.nextInt();
		Synchronized_counter a = new Synchronized_counter(n);
		Thread test1 = new Counter(a,"Afrasiyab");
		Thread test2 = new Counter(a,"Khalili");
		Thread test3 = new Counter(a,"Orxan");
		Thread test4 = new Counter(a,"Hashimli");
		test1.start();
		test2.start();
		test3.start();
		test4.start();
		try {
			test1.join();
			test2.join();
			test3.join();
			test4.join();
		}
		catch(Exception e) {}
		scan.close();
	}

}
