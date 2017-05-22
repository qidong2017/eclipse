package com.string;

import java.util.ArrayList;
import java.util.List;
//อฦหอ
public class TestString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaaccddkkdjfjj";
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<str.length();i++) {
			int firstIndexOf = str.indexOf(str.charAt(i));
			int lastIndexOf = str.lastIndexOf(str.charAt(i));
			if(firstIndexOf == lastIndexOf) {
				list.add(i);
			}
		}
		System.out.println(str.charAt((int) list.get(0)));
	}
}
