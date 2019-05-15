package com.k001.Basic;
import java.util.Scanner;
public class cau2 {
	private static Scanner in;
	public static void main(String[] args) {
		in= new Scanner(System.in);
		int chieuCao,dayBe,dayLon;
		System.out.println("Nhap vao Day lon :");
		dayLon= in.nextInt();
		System.out.println("Nhap vao Day be : ");
		dayBe= in.nextInt();
		System.out.println(" Nhap vao chieu cao : ");
		chieuCao=in.nextInt();
		float s;
		s=chieuCao*(dayBe+dayLon)/2;
		System.out.println(" Dien tich cua hinh thang la : " +s);
		
	}

}
