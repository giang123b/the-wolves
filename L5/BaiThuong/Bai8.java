package L5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.printf("Nhap ki tu do: ");
        char s = new Scanner(System.in).nextLine().charAt(0);
        if(Character.isLetter(s)) System.out.println("La 1 chu cai");
        else if(Character.isDigit(s)) System.out.println("La 1 so");
        else System.out.println("La ki tu khac");
    }
}
