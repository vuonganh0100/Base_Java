package Bai_Tap_Remember;

import java.util.Scanner;

public class Bai_6 {
	public static int nhap() {
		int n=0;
		boolean check= false;
		while(!check) {
			try {
				n= new Scanner(System.in).nextInt();
				check= true;
			} catch (Exception e) {
				System.out.println("Hay nhap so ");
			}
		}
		return n;
	}
    public static boolean checkSNT(long n) {
    	boolean k= true;
    	for(int i=2; i<n;i++) {
    		if(n%i==0) {
    			k=false;
    		}
    	}
    	return k;
    }
    public static void main(String[] args) {
		System.out.printf("Nhap n: ");
		int nhap =nhap();
		int dem=0;
		int i=3;
		while(dem !=nhap) {
			if(checkSNT(i)== true) {
				System.out.println(i);
				dem+=1;
			}
			i++;
		}
	}
}
