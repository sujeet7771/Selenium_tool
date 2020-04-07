package practice;

import java.util.Scanner;
import java.util.TreeSet;

public class details {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	
		
		TreeSet th=new TreeSet<student>(student.sortByidAs);
		th.add(new student(2, "sujeet", 72));
	    th.add(new student(5, "archita", 92));
	    th.add(new student(6, "charu", 69));
	    th.add(new student(8, "ankita", 82));
	    System.out.println(th);
		
  
 
	}

}
