import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{   
		ArrayList<String> list=new ArrayList<String>(); 

		list.add("Rohit");    
		list.add("Shubham");      
		list.add("Daivat"); 
		list.add("Arbaz");
		list.add(1,"Ramtirthe");
		list.add(3,"Chaitanya");
		System.out.println("\n1) Add Object and Display ArrayList: "+list);
		
		list.remove("Arbaz");
		list.remove(1);
		System.out.println("\n2) Remove:"+list);
	
		list.set(0,"Ramtirthe");
		System.out.println("\n3) (replace) Set:"+list);
		
		System.out.println("\n4) Display Array index: "+list.indexOf("Daivat"));
		
		System.out.println("\n5) Display Array Object: "+list.get(3));
		
		System.out.println("\n6) Display Array size: "+list.size());
		
		System.out.println("\n7) (Search data) Contains: "+list.contains("Daivat"));
		
		Collections.sort(list);
		System.out.println("\n8) Sort the ArrayList:"+list);
		
		System.out.println("\n9) Display ArrayList using Iterator: ");
		Iterator itr=list.iterator();//getting the Iterator  
		while(itr.hasNext())
		{
			System.out.println("   "+itr.next());//printing the element and move to next  
		}  
		
		list.clear();
		System.out.println("\n10) Clear ArrayList and display: "+list);
	}  
}