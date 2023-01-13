package com.mani.treesetdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();

		set.add("Pune");
		set.add("Mumbai");
		set.add("Nagpur");
		set.add("Delhi");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr);

		}

	}

}
