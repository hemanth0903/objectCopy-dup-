public class ShallowCopy
{
    public void unitTest() throws CloneNotSupportedException
    {
        Role r1 = new Role(11,"Software Analyst",600000);
		Employee e1 = new Employee(001,"Hemanth",r1);
		Employee e2 = (Employee)e1.clone();	
		
		System.out.println(e1.role.level); // 11

		
		e2.role.level = 10;
		
		System.out.println(e1.role.level); // e1's level gets updated to 10 since they share same reference.
		System.out.println(e2.role.level); // 10
    }
}