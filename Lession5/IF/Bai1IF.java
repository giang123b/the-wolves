package L5;

import java.util.Scanner;

public class Bai1IF {
    public static void main(String[] args) {
        System.out.printf("Nhap 2 so: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Nhap phep tinh");
        char s = new Scanner(System.in).nextLine().charAt(0);
        switch (s){
            case '+':{
                System.out.println("kq: " + (a+b));
                break;
            }
            case '-':{
                System.out.println("kq: " + (a-b));
                break;
            }
            case '*':{
                System.out.println("kq: " + (a*b));
                break;
            }
            case '/':{
                System.out.println("kq: " + (a/b));
                break;
            }
        }
    }
}
