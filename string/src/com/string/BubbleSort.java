package com.string;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {5,4,9,8,7,6,0,1,3,2};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=a.length-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
