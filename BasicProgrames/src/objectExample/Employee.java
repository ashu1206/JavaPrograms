package objectExample;

public class Employee 
{
	int id;
	String name;
	float salary;
	
	void insert(int i,String n,float s)
	{
		id = i;
		name = n;
		salary = s;
	}
	void displayInfo()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}

 class EmpInfo
{
	public static void main(String[]args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.insert(10, "Ramesh", 100000);
		e2.insert(14, "Saket", 1214500);		
		
		e1.displayInfo();
		e2.displayInfo();
	}
}
