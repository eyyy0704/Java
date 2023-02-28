import java.util.*;

public class A1113315_0224_1 {
	public static void main (String [] argv) {
		int a;
		boolean b;
		System.out.println("請輸入一整數：");
		Scanner sc = new Scanner (System.in);
		a = sc.nextInt();
		b = (a % 2 == 1);
		System.out.println( b ? "奇數" : "偶數");  
	}
}