package chapter6;

import java.util.ArrayList;
import java.util.Iterator;

public class NameList2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("桜井");
		names.add("田原");
		names.add("中川");
		names.add("鈴木");
		String search = args[0];
		boolean result = false;
		
		Iterator<String> name = names.iterator();
		while(name.hasNext()) {
			if(search.equals(name.next())) {
				result = true;
			}
		}
		if(result) {
			System.out.println(search + "さんは含まれています");
		} else {
			System.out.println(search + "さんは含まれていません");
		}
	}

}
