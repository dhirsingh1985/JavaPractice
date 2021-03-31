package PracticeRough;

import java.util.HashMap;
import java.util.Set;

public class Demo2 {

		public static void main(String[] args) {
			
			String str="Java is Java and not is JAva";
			
			String[] array=str.split(" ");
			
			HashMap<String, Integer> HM=new HashMap<String, Integer>();
			
			for(String s: array)
			{
				if(HM.get(s)!=null)
				{
					HM.put(s, HM.get(s)+1);
				}
				else
				{
					HM.put(s, 1);
				}
			}
			
			
			Set<String> count=HM.keySet();
			
			for(String s:count)
			{
				if(HM.get(s)>1)
				{
					System.out.println(s+" "+HM.get(s));
				}
			}
			
			
		}
		
}
