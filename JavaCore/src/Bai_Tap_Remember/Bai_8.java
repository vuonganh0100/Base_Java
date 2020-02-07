package Bai_Tap_Remember;

public class Bai_8 {
	public static boolean sothuannghich(int n) {
		StringBuilder xau= new StringBuilder();
		String chuoi=""+n;
		xau.append(chuoi);
		String daonguoc="" + xau.reverse();
		if(chuoi.equals(daonguoc)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int count=0;
		for(int i= 100000 ; i<= 999999;i++) {
			if(sothuannghich(i)) {
				System.out.println(i);
				count+=1;
			}
			
		}
		System.out.println("so luong so thuan nghich : " +count );
	}

}
