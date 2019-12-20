package mainpack;

public class Ourthreadmain {

	public static void main(String[] args) throws InterruptedException {
		 TODO Auto-generated method stub
		Ourthread t1 = new Ourthread("t1");
		t1.start();
		Ourthread t2 = new Ourthread("t2");
		t2.start();
	}

}
