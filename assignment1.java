class one implements Runnable{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
			Thread.sleep(5000);
			for(int i=6;i<=10;i++) {
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	 
}
}
public class assignment1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one a1=new one();
		Thread thread = new Thread(a1);
		thread.start();
	}
}