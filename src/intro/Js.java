package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Js {
	@Test
	
	public void normal()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vishal");
		names.add("Akash");
		names.add("Anuj");
		names.add("Ajay");
		names.add("Sudha");
		
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual =names.get(i);
			if(actual.startsWith("A"))
			{
				//count++;
			}
		}
		//System.out.println(count);
	}
	
	
	@Test
	public void streamFilter() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vishal");
		names.add("Akash");
		names.add("Anuj");
		names.add("Ajay");
		names.add("Sudha");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		//System.out.println(c);
		
		Long d =Stream.of("Vishal","Akash","Anuj","Ajay","Sudha").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		//System.out.println(d);
		
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}
	
	@Test
	public void streamMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vivek");
		names.add("Akashra");
		names.add("Annu");
		names.add("Anjaneya");
		names.add("Sudhashri");
//		Stream.of("Vishal","Akash","Anuj","Ajay","Sudha").filter(s->s.endsWith("a")).filter(s->s.length()>4).map(s->s.toUpperCase())
//		.forEach(s->System.out.println(s));
		
		List<String> names1 =Arrays.asList("Vishal","Akash","Anuj","Ajay","Sudha");
		//names1.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
		
		Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
		
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("ajay"));
		//System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@Test
	public void streamCollect()
	{
		List<String> ls=Stream.of("Vishal","Akash","Anuj","Ajay","Sudha").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
	}

}
