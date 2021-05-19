package com.mypack;
import com.pack.PackageA;
class PackageB
{
	public static void main(String args[])
	{  
		PackageA p1 = new PackageA();
		
		System.out.println(p1.addInt(10,20));
	} 
}