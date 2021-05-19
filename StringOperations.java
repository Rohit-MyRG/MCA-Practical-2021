class StringOperations
{
	public static void main(String args[])
	{
		String str1 = "Java", str2 = "Programmimg ";
		
		System.out.println("\n str1=\""+str1+"\"   str2=\""+str2+"\"\n");
		
		System.out.println(" 1) str1 charAt(2): "+str1.charAt(2));
		
		System.out.println(" 2) str1 & str2 concatenation: "+str1.concat(str2));
		
		System.out.println(" 3) str1 & str2 is Equals? : "+str1.equals(str2));
		
		System.out.println(" 4) str2 length: "+str2.length());
		
		System.out.println(" 5) str2 replace * : "+str2.replace('m','*'));
		
		System.out.println(" 6) str2 Is empty : "+str2.isEmpty());
		
		System.out.println(" 7) str2 index of: "+str2.indexOf('m'));
		
		System.out.println(" 8) str2 toLowerCase: "+str2.toLowerCase());
		
		System.out.println(" 9) str2 toUpperCase: "+str2.toUpperCase());
		
		System.out.println(" 10) str2 length after trim: "+str2.trim().length());
		
		String str3 = "Hello java programer";
		
		System.out.println("\n str3=\""+str3+"\"\n\n 11) str3 split: ");
		
		String arr[] = str3.split("\\s");
		for(String w:arr){
		System.out.println(" "+w);
		}
		
	}
}