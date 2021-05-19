abstract class Bike
{
	abstract void run();
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Running safely...");
	}
	public static void main(String args[])
	{
		Bike b = new Honda();

		b.run();
	}
}