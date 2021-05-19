import java.util.StringTokenizer;
class StringTokenizerDemo
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("I am Rohit Ramtirthe");
		
		System.out.println(" Before split token's count: "+st.countTokens());
		
		while(st.hasMoreTokens())  //same as hasMoreElements() method.
		{
			System.out.println(st.nextToken(" ")); //same as nextElement().
		}
		
		System.out.println(" After split token's count: "+st.countTokens());
	}
}