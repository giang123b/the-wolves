package com.k001.Basic;
import java.util.Scanner;
public class cau5 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		float x,y;
		System.out.println("Nhap vao x, y :");
		x= in.nextFloat();
		y=in.nextFloat();
		float a,b;
		a=x+y;
		b=x-y;
		float f=(x+y)/(x-y);
		System.out.printf("%f",f);
	}

}
