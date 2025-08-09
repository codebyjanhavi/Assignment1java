class Employee{
	int Emp_id;
	String name;
	int salary;
	public Employee(int id, String n, int s)
        {
		Emp_id=id;
		name= n;
		salary=s;
		System.out.println("Employee id: " +Emp_id+ " Employee name: "+name+ " Salary: "+salary);
       }
	public Employee(Employee a)
      {
	Emp_id= a.Emp_id;
	name= a.name;
	salary= a.salary;
	System.out.println("Employee id: " +Emp_id+ " Employee name: " +name+ " Salary: " +salary);

      }
	public static void main(String args[])
	{
		Employee e= new Employee(141,"janhavi",100000);
		Employee e1= new Employee(e);
	}
}