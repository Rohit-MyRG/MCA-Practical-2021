interface Bank
{
	abstract float interestRate();
}
class ICICI implements Bank
{
	public float interestRate()
	{
		return(8.85f);
	}
}
class SBI implements Bank
{
	public float interestRate()
	{
		return(9.25f);
	}
}
class InterfaceExample
{
	public static void main(String args[])
	{
		Bank b1 = new ICICI();
		Bank b2 = new SBI();
		
		System.out.println("ICICI bank ROI:"+b1.interestRate());
		System.out.println("SBI bank ROI:"+b2.interestRate());
	}
}