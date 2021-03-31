package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Multiset.Entry;

public class collectionDemo {

	public static void main(String[] args) {
		
		Map<String,String> hm = Stream.of(new String[][] {
			{"test","Äpple"},
			{"test1","Banana"},
		 }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(hm);
		System.out.println(hm);
		System.out.println(hm);
		System.out.println(hm);
		System.out.println(hm);
	}

}
