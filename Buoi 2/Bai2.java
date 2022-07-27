package Buoi2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhap canh a: ");
		a= sc.nextInt();
		System.out.println("Nhap canh b: ");
		b= sc.nextInt();
		System.out.println("Nhap canh c: ");
		c=sc.nextInt();
		if( a<b+c && b<a+c && c<a+b ){
	        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
	            System.out.println("Day la tam giac vuong");
	        else if(a==b && b==c)
	            System.out.println("Day la tam giac deu");
	        else if(a==b || a==c || b==c)
	            System.out.println("Day la tam giac can");
	        else
	            System.out.println("Day la tam giac thuong");
	    }
	    else
	        System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");
	}
}
