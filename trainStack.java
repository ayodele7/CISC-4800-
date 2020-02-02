import java.lang.Object;
import java.util.Stack;
import java.util.*;
public class trainStack
{
	public static void main(String[]args)
	{
			
		Stack<Integer> trains = new Stack<>();
		Stack<Integer> auxtrains = new Stack<>();

		for(int i = 1; i <=5; i++)
		{
			trains.push(i);
		}

		for (int i = trains.size(); i > 3; i--)
		{

		       auxtrains.push(trains.pop());
		}
		
		int x = trains.pop();

		while (!auxtrains.empty()) {
		  trains.push(auxtrains.pop());
		}

		trains.push(x);

		while(!trains.empty())
		for(int i = 0; i <= 4; i++ )
			System.out.println(trains.pop()); 
		
			
	}
	


/**
* for (int k = 0; k < arr.length; k++) {
int minidx = k;
for (int i = k+1; i < arr.length; i++) {
if (arr[i] < arr[minidx]) minidx = i;
}
int temp = arr[k];
arr[k] = arr[minidx];
arr[minidx] = temp;
} 
* */



/**	public static boolean isPalindrom(int input[])
{
	Boolean Val = false; 
	Stack<Integer> stx = new Stack<>();
	Stack<Integer> stl = new Stack<>();
	
	for(int i = 0; i < input.length; i++)
	{
		stx.push(input[i]);
	}
	
 for(int i = input.length - 1; i >= 0; i--)
	{
		stl.push(stx.pop());
	}  
	
	while(!stl.empty())
		stl.push(stx.pop());
	
	//while(!stl.empty())
	//	System.out.println(stl.pop());
	
	
	while(!stx.empty() && !stl.empty())
	{
	 if(stx.pop() == stl.pop())
		 Val = true;
	 else 
		 Val = false;
	}
	return Val;  
	
	
	String reversed = "";
	
	while(!st.empty())
	{
		reversed += Integer.toString(st.pop());
	}
	
	for(int i = 0; i < reversed.length(); i++)
	 {
	   if(stl.pop() == (reversed.charAt(i))) 
		   Val = true;
	   else 
		   Val = false;
	 }  */
}    
