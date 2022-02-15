package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{

    int id = 10;
    String name = "xyz";
    String Address = "hyd";
    int sal = 10000;

}

public class ArrayList3 {

	//Employee object arrayList
    static ArrayList<Object> emp = new ArrayList<>();

    //search the emp using empid
    public String search(int num){
        
        for(Object e:emp)
            if (e.id == num)
                return e.name;
        
        return "not found";

    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create object for employee class
        Employee em = new Employee();

        //new employee em1
        Employee em1 = new Employee();

        em1.Address = "chennai";
        em1.id = 20;

        //Add em to arrayList
        emp.add(em);
        emp.add(em1);

        //To search for an employee based on id
        ArrayList3 arr = new ArrayList3();
        arr.search(20);
	}

}
