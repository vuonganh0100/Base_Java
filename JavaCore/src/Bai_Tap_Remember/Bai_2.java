package Bai_Tap_Remember;

import java.util.Scanner;

// chuyển đổi một só tự nhiên hệ cơ số 10 thành một số bất kì.
public class Bai_2 {
	public static void doicoso(int a,int base) {
	        if(a >= base) doicoso(a/base, base);
	        System.out.println(a/base + " $$ " + base);
	        if(a%base >9) System.out.printf("%c",a%base+55);
	        else 
	        	System.out.println(a%base);
	}
	public static int nhap() {
		int a=0;
		boolean check=false;
		while(!check) {
			try {
				a=new Scanner(System.in).nextInt();
				check=true;
			} catch (Exception e) {
				System.out.println("Hay nhap so");
			}
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println("Nhap n: ");
		int a= nhap();
		System.out.println("He so can chuyen doi");
		int b= nhap();
		System.out.println("Sau khi chuyen doi sang co so "+ b);
		doicoso(a, b);
	}
}
