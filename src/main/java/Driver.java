import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count: Jumlahnya adalah "+counter.getCount());
		
		counter.increment();
		
		System.out.println("Count: Jumlah setelah di tambahkan" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count: Jumlah setelah di kurang" + counter.getCount());
		
	}

}
