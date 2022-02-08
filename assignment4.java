
public class assignment4 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment4 t1=new assignment4();
		assignment4 t2=new assignment4();
		t1.setName("scooty");
		t2.setName("Shaggy");
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Name of t2:"+t2.getName());
	}

}
