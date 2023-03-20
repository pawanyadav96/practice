package multi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
	public static void main(String[]args)
	{
		List<String> li=new ArrayList<String> ();
		
		li.add("3");
		li.add("7");li.add("1");li.add("8");li.add("2");li.add("0");
		
		Collections.sort(li);
		System.out.println(li);
	}

}
