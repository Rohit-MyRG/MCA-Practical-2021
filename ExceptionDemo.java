class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

class ExceptionDemo
{
	static void validate(int age)throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("Not Valid");
		else
			System.out.println("\n Welcome to vote");
	}
	public static void main(String args[])
	{
		try{
			validate(15);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("All is done...");
	}
}