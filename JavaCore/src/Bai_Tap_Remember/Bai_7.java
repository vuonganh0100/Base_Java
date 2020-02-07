package Bai_Tap_Remember;

import java.util.Scanner;
//fibonaci
public class Bai_7 {
	public static int nhap() {
		int n=0;
		boolean check= false;
		while(!check) {
			try {
				n= new Scanner(System.in).nextInt();
				check=true;
			} catch (Exception e) {
				System.out.println("Nhap so");			}
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println("Nhap n: ");
		int n= nhap();
		int[] f=new int[n+1];
		f[0]=1; f[1]=1;
		for(int i=2; i<=n;i++) {
			f[i]=f[i-1]+f[i-2];
		}
		System.out.println("-----------------------");
		System.out.println(n+f[n]);
	}
}
