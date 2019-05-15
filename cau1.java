package com.k001.Basic;
import java.util.Scanner;
public class cau1 {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ho,ten;
		input = new Scanner(System.in);
		System.out.println("Nhap vao ho : ");
		ho=input.nextLine();
		System.out.println("Nhap vao ten :");
		ten= input.nextLine();
		System.out.println("hello "+ho+ten );
	}

}
