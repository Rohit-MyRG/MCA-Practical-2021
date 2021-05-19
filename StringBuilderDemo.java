class StringBuilderDemo
{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Java");
		System.out.println("\nStringBuilder append: "+sb);
		
		sb = new StringBuilder("Hello");
		sb.insert(1,"java");
		System.out.println("\nStringBuilder insert: "+sb);
		
		sb = new StringBuilder("Hello");
		sb.replace(1,3,"java");
		System.out.println("\nStringBuilder replace: "+sb);
		
		sb = new StringBuilder("Hello");
		sb.delete(1,3);
		System.out.println("\nStringBuilder delete: "+sb);
		
		sb = new StringBuilder("Hello");
		sb.reverse();
		System.out.println("\nStringBuilder reverse: "+sb);
	}
}