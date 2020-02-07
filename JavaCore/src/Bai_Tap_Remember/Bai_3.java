package Bai_Tap_Remember;

import java.util.Scanner;

public class Bai_3 {

	public static int nhap() {
		int n= 0;
		boolean check =false;
		while(!check) {
			try {
				n=new Scanner(System.in).nextInt();
				check= true;
			} catch (Exception e) {
				System.out.println("Hay nhap so");
			}
		}
		return n;
	}
	
	public static int tinhtong(Long i) {
		int sum=0;
		long n=0;
		while(i!=0) {
			n=i%10;
			sum+=n;
			i/=10;
			}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Nhap n : ");
		long a= nhap();
		System.out.println("tong :"+ tinhtong(a));
	}
}
