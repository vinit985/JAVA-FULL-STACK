package com.java.String;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =  new StringBuilder("abc");
		System.out.println(sb.getClass().getName());
		System.out.println(sb.toString().getClass().getName());
		sb.append("suubfduiw");
		System.out.println(sb);
		sb.setCharAt(1,'d');
		System.out.println(sb);

	}

}
