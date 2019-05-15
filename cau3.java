package com.k001.Basic;
import java.util.Scanner;
public class cau3 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		float r;
		System.out.println("Nhap vao ban kinh hinh tron : ");
		r=in.nextFloat();
		float pi=(float)3.14;
		float s;
		s=pi*r*r;
		System.out.println("Dien tich cua hinh tron la : "+s);
		
	}

}
