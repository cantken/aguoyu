package homework8;

import java.util.*;

public class homework8_2 {
	public static void main(String[] args) {
		train tr[] = new train[7];
		tr[0] = new train(202, "普悠瑪", "樹林", "花蓮", 400);
		tr[1] = new train(1254, "區間", "屏東", "基隆", 700);
		tr[2] = new train(118, "自強", "高雄", "台北", 500);
		tr[3] = new train(1288, "區間", "新竹", "基隆", 400);
		tr[4] = new train(122, "自強", "台中", "花蓮", 600);
		tr[5] = new train(1222, "區間", "樹林", "七堵", 300);
		tr[6] = new train(1254, "區間", "屏東", "基隆", 700);
		System.out.println("Set:");
		Set<train> set = new HashSet<train>();
		for(int i =0 ;i<tr.length;i++) 
			set.add(tr[i]);
		//迭代器
		Iterator<train> iset = set.iterator();
		System.out.println("迭代器:");
		while (iset.hasNext()) 
			System.out.println(iset.next().gettrain());
		//foreach
		System.out.println("\nforeach:");
		for(train t:set)
			System.out.println(t.gettrain());
		System.out.println("===================================\nList:");
		List<train> list = new ArrayList<train>();
		for(int i =0 ;i<tr.length;i++) 
			list.add(tr[i]);
		Collections.sort(list);
		//迭代器
		Iterator<train> ilist = list.iterator();
		System.out.println("迭代器:");
		while (ilist.hasNext()) 
			System.out.println(ilist.next().gettrain());
		//for迴圈
		System.out.println("\nfor迴圈:");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).gettrain());
		}
		//foreach
		System.out.println("\nforeach:");
		for(train t:list)
			System.out.println(t.gettrain());
		System.out.println("===================================\nTreeSet:");
		Set<train> treeset = new TreeSet<train>();
		for(int i =0 ;i<tr.length;i++)
			treeset.add(tr[i]);
		//迭代器
		Iterator<train> itreeset = treeset.iterator();
		System.out.println("迭代器:");
		while (itreeset.hasNext()) 
			System.out.println(itreeset.next().gettrain());
		//foreach
		System.out.println("\nforeach:");
		for(train t:treeset)
			System.out.println(t.gettrain());
		

	}
}
