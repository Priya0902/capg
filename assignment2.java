class ones implements Runnable{
	public void run() {
		try {
			for(int i=1;i<=20;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class two implements Runnable{
	public void run() {
		try {
			for(int i=1;i<=20;i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ones o1=new ones();
		Thread t1= new Thread(o1);
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		two o2=new two();
		Thread t2=new Thread(o2);
		t2.start();
	}

}
