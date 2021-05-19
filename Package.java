class Demo
{
	String hairColor;
	Demo(String var)
	{
		
		hairColor = var;
		bark();
	}
	static void bark(int a)
	{
		System.out.println("dog barking");
	}
	static void bark()
	{
		System.out.println("dog barking");
	}
	public static void main(String args[])
	{  
		Demo d1 = new Demo("black");
		
		System.out.println(d1.hairColor);
	} 
}  

