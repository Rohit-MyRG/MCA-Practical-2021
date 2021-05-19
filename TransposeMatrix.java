import java.util.Scanner;
class TransposeMatrix
{
	static Scanner s;
	static int a[][];
	
	static void acceptMatrix(int r,int c)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
	}
	static void displayTranspose(int r,int c)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(" "+a[j][i]);
			}
			System.out.println();
		}
	}
	static void displayMatrix(int r,int c)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) throws Exception
	{
		s = new Scanner(System.in);
		
		System.out.println("Transpose Matrix: \nEnter the row limit r=");
		int r = s.nextInt();
		System.out.println("Enter the column limit c=");
		int c = s.nextInt();
		
		a = new int[r][c];
		
		System.out.println("Enter the Data "+(r*c)+" times:");
		acceptMatrix(r,c);

		System.out.println("Display Matrix:");
		displayMatrix(r,c);
		
		System.out.println("Transpose Matrix:");
		displayTranspose(r,c);
	}
}