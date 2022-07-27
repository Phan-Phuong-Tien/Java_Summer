package Buoi2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n,sum=0;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			if(n%i==0) sum+=i;
		System.out.println("Tong cac uoc cua "+ n+" la "+ sum);
	}
}
