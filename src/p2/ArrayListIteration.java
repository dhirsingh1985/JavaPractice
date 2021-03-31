package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> series = new ArrayList<String>();
		series.add("dschsgdhjsd");
		series.add("ajsjdhjakdhkja");
		series.add("jkasfhkjsahdksha");
		series.add("asndndcns");
		series.add("skjfdhskhfi");
		series.add("skdjfhkshdio");
		series.add("owifewefiooi");
		
		series.forEach(shows ->{
			System.out.println(shows);
		});
		
		System.out.println("*************************");
		
		Iterator<String> it = series.iterator();
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		System.out.println("*************************");
		
		it = series.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);
		});
		
		System.out.println("*************************");
		
		for(String show : series) {
			System.out.println(show);
		}
		
		System.out.println("*************************");
		
		for(int i=0; i< series.size(); i++) {
			System.out.println(series.get(i));
		}
		System.out.println("*************************");
		
		ListIterator<String> l1= series.listIterator(series.size());
		while(l1.hasPrevious()) {
			String show = l1.previous();
			System.out.println(show);
		}
		
		
		
		
	}

}
