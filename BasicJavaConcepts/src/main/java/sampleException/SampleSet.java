package sampleException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class SampleSet {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("wheels");
		hs.add("steering");
		hs.add("dash");
		hs.add("dash");
		hs.add("wind");
		hs.add("wind2");
		hs.add("wind4");
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator(); 

		while(itr.hasNext()) {
			String str1 = itr.next();
			System.out.println(str1);
			
		}
		if(hs.contains("wind")) {
			System.out.println("found wind");
		}
		//TREESET
		Set<String> ts = new TreeSet<String>();
		ts.add("addition");
		ts.add("multiply");
		ts.add("divide");
		ts.add("subtract");
		ts.add("modulus");
		ts.add("root");
		ts.add("multiply");
		System.out.println(ts);
		
		Iterator<String> itr2 = ts.iterator();
		while(itr.hasNext()) {
			
			System.out.println("print= "+itr2.next());
		}
		
	}

}
