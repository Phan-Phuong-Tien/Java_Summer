package Buoi2;

import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int d,m;
        System.out.println("Nhap ngay: ");
        d= sc.nextInt();
        System.out.println("Nhap thang: ");
        m= sc.nextInt();
        if (d >= 20 && d <= 31 && m == 1 || d >= 1 && d <= 18 && m == 2)
            System.out.println("Cung bao binh");
        if (d >= 19 && d <= 28 && m == 2 || d >= 1 && d <= 20 && m == 3)
            System.out.println("Cung song ngu");
        if (d >= 21 && d <= 31 && m == 3 || d >= 1 && d <= 20 && m == 4)
            System.out.println("Cung bach duong");
        if (d >= 21 && d <= 30 && m == 4 || d >= 1 && d <= 20 && m == 5)
            System.out.println("Cung kim nguu");
        if (d >= 21 && d <= 31 && m == 5 || d >= 1 && d <= 21 && m == 6)
            System.out.println("Cung song tu");
        if (d >= 22 && d <= 30 && m == 6 || d >= 1 && d <= 22 && m == 7)
            System.out.println("Cung su giai");
        if (d >= 23 && d <= 31 && m == 7 || d >= 1 && d <= 22 && m == 8)
            System.out.println("Cung su tu");
        if (d >= 23 && d <= 31 && m == 8 || d >= 1 && d <= 22 && m == 9)
            System.out.println("Cung xu nu");
        if (d >= 23 && d <= 30 && m == 9 || d >= 1 && d <= 23 && m == 10)
            System.out.println("Cung thien binh");
        if (d >= 24 && d <= 31 && m == 10 || d >= 1 && d <= 22 && m == 11)
            System.out.println("Cung bo cap");
        if (d >= 23 && d <= 30 && m == 11 || d >= 1 && d <= 21 && m == 12)
            System.out.println("Cung nhan ma");
        if (d >= 22 && d <= 31 && m == 12 || d >= 1 && d <= 19 && m == 1)
            System.out.println("Cung ma ket");
	}
}
