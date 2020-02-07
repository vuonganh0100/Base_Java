
public class UCLN {
	
public static int timuoc(int a,int b) {
	if(a==0 || b== 0) {
		return a+b;
	}
	while(a != b) { // a=6 b= 9  // a=6 b=3 
		if(a > b) {  
			a=a-b;// a=3
		}else {
			b=b-a;  //b=9-3=3
		}
	}
	return a;
}
 public static void main(String[] args) {
	
	System.out.println("Uoc chung lan nhat");
	UCLN ds= new UCLN();
	int b= 0;
	System.out.println(timuoc(6,9));
	System.out.println("Bội chung nhỏ nhất");
	System.out.println((6*9)/timuoc(6,9));
}  
}