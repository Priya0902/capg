
public class assignment3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment3 t1=new assignment3();
		assignment3 t2=new assignment3();
		assignment3 t3=new assignment3();
		t1.setPriority(1);  
		t2.setPriority(5);  
		t3.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		
	}

}
