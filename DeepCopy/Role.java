public class Role implements Cloneable
{
	int level;
	String designation;
	int grossPay;
	
	Role(int level, String designation,int grossPay)
	{
		this.level = level;
		this.designation = designation;
		this.grossPay = grossPay;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}