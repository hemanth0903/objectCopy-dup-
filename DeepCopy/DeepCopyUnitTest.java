public class DeepCopyUnitTest
{
    public void unitTest() throws CloneNotSupportedException
    {
        Role r1 = new Role(11,"Software Analyst",600000);
		Employee e1 = new Employee(001,"Hemanth",r1);
		Employee e2 = (Employee)e1.clone();	
		
		System.out.println(e1.role.designation); // Software Analyst

		
		e2.role.designation = "Senior Software Analyst";
		
		System.out.println(e1.role.designation); // Updates in e2 doesn't affect e1. So it prints Software Analyst
		System.out.println(e2.role.designation); // Senior Software Analyst
    }
}