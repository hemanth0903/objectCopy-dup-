public class Employee implements Cloneable
{
	int id;
	String name;
	Role role;
	
	Employee(int id, String name, Role role)
	{
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		Employee e1 = (Employee)super.clone();
		e1.role= (Role)role.clone();
		return e1;
	}
	
}