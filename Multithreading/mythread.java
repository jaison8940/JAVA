package mainpack;

public class Ourthread extends Thread{
		String tname;
	    public Ourthread(String s)
	    {
	    	this.tname = s;
	    	System.out.println(tname);
	    }
		public void run()
		{
			int c=0;
			while(true)
			{
				System.out.println(tname+" "+c++);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	

}
