package collectors;

import java.util.ArrayList;

public class StudentArray {

	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"Modi",23);
		Student s2 = new Student(202,"Rahul",33);
		Student s3 = new Student(303,"Sunil",43);
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student stu:al)
		{
			System.out.println(stu.rollno+" "+stu.name+" "+stu.age);
			
			
		}

	}

}
