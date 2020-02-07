package Bai_Tap_Remember;

import java.util.Scanner;

// tim uoc chung lon nhat va boi chung nho nhat cua hai so a ,b
public class Bai_1 {

	public static int uocchungln(int a, int b) {
		if(a==0 || b== 0) {
			return a+b;
		}
		while(a!=b) {
			
			if(a>=b) {
				a=a-b;
			}else {
				b=b-a;
			     }
		   }
		return a;
	}
	public static int nhap() {
		int a=0;
		boolean check= false;
		while(!check) {
			try {
				
				a= new Scanner(System.in).nextInt();
				check=true;
			} catch (Exception e) {
				System.out.println("Hay nhap số");
				
			}
	}
		return a;
	}
	public static void main(String[] args) {
		
		System.out.println("Nhap a:");
		int a=nhap();
		System.out.println("Nhap b:");
		int b=nhap();
	  
		System.out.println("uoc chung lon nhất : " + uocchungln(a, b));
		System.out.println("Boi chung nho nhat : " +(a*b)/uocchungln(a, b));
	}
}
