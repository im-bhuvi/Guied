package org.java;

public class Array {
	
	public static void main(String[]args) {
		int[]a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int[]b= {1,2,3,4,5};
		//particular value
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println("normal loop");
		for(int i=0;i<a.length; i++) {
			System.out.println(i);
			}
		System.out.println("enchanced loop");
		for(int x:a) {
			System.out.println(x);
		}
		
		System.out.println("twoDimesion");
		
		int t[][]= {{100,200,300},{400,500,600}};
		//particular value
		System.out.println(t[0][2]);
		System.out.println("enchanced loop");
		for(int c: t[0]) {
			System.out.println(c);
			//git backend
		}
		
		
		
		
		
		
		
		
		
		
	}

}
