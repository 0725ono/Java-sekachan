package chapter6;

import java.util.ArrayList;
// ArrayListのいいところはサイズが動的に変わること

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java入門講座");
		list.add("第6章の後半に差し掛かっています");
		list.add("色々作って、コードを書いていかないと！");
		
		
		for(int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
	}

}
