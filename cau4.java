package com.k001.Basic;
import java.util.Scanner;
public class cau4 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		float a,b,c;
		System.out.println("Nhap vao do dai 3 canh :");
		a=in.nextFloat();
		b=in.nextFloat();
		c=in.nextFloat();
		float p= (float)(a+b+c)/2;
		float s= (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Dien tich hinh tam giac la : "+s);
	}

}
