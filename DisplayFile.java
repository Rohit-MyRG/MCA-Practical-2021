import java.io.FileInputStream;
import java.io.BufferedInputStream;
class DisplayFile
{
	public static void main(String args[])
	{
		try{
			
			FileInputStream fin = new FileInputStream("aa.txt");
			BufferedInputStream bis = new BufferedInputStream(fin);
			int i;
			System.out.println();
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
			}
			bis.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}