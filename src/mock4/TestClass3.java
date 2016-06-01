package mock4;

import java.util.*;

public class TestClass3 {
	public static void main(String[] args) throws Exception {
		List list = new ArrayList();
		list.add("val1"); // 1
		list.add(2, "val2"); // 2
		list.add(1, "val3"); // 3
		System.out.println(list);
	}
}
