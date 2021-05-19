import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
class FileReverse
{
	public static void main(String args[])
	{
		try{
			File f = new File("aa.txt");
			FileInputStream fin = new FileInputStream(f);
			FileOutputStream fout = new FileOutputStream("bb.txt");
			int i = 0;
			int arr[] = new int[((int)f.length())];
			int k=0;
			while((i= fin.read())!=-1)
			{
				arr[k] = i;
				k++;
			}
			for(k=(int)(f.length()-1); k>=0; k--)
			{
				fout.write(arr[k]);
			}
			fin.close();
			fout.close();
			System.out.println("Success...");
		}catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}