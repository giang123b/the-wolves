package com.k001.Basic;
import java.util.Scanner;
public class cau8 {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in=new Scanner(System.in);
		int time;
		System.out.println("Nhap vao time :");
		time=in.nextInt()	;
		int gio,phut,giay;
		gio=time/3600;
		time=time%3600;
		phut=time/60;
		time=time%60;
		giay=time;
		System.out.printf("%d giay = %dgio %dphut %dgiay ",time,gio,phut,giay);
	}

}
