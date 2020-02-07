package Bai_Tap_Remember;

import java.util.Scanner;

public class VD_De_Quy {
	public static int dequy(int n) {
		if(n <= 1 ) return 1;
		else return n*dequy(n-1);
	}
    public static int demso(int n) {
    	if(n!=0) {
    		System.out.printf("%d \n", n%10);
    		return demso(n/10);
    	}
    	return 0;
    }
	public static void main(String[] args) {
		System.out.println("Tính  giai thừa :");
		int n= new Scanner(System.in).nextInt();
		System.out.println("--------------");
		System.out.println(dequy(n));
		System.out.println("------------------");
		System.out.println("Dếm số n: " );
		demso(n);
	}
}
