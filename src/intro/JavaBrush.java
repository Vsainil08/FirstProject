package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrush {

	public static void main(String[] args) {
		
		String A[]= {"V","S","T","TS"};
		List<String> NameArrayList =Arrays.asList(A);
		System.out.println(NameArrayList.contains("V"));
		
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vishal");
		a.add("Saini");
		a.add("Thought");
		a.add("Sphere");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("****");
		
		for(String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println(a.contains("Saini"));
		
		
		


	}

}
