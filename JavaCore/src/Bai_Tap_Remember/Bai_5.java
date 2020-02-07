package Bai_Tap_Remember;

import java.util.Scanner;

public class Bai_5 {
	public static int nhap() {
		int n=0;
		boolean check=false;
		while(!check) {
			try {
				n= new Scanner(System.in).nextInt();
				check=true;
			} catch (Exception e) {
				System.out.println("Nhap so");
			}
		}
		return n;
	}
    public static boolean checkSNT(int n) {
    	boolean result =true;
    	for(int i=2; i<n; i++) {
    		if(n%i==0) {
    		   result = false;
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		System.out.printf("Nhap n : ");
		int n= nhap();	
		for(int i= 3; i<=n; i++) {
			if(checkSNT(i)==true) {
				System.out.println(i);
			}
		}
		System.out.println("------------------");
		int i=3;
		int dem=0;
		while(dem!=n) {			
			if(checkSNT(i)== true) {
				System.out.println(i);	
				dem+=1;
			}
			i++;
			
		}
	}
}
