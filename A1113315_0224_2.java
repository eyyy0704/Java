import java.util.*;

public class A1113315_0224_2 {
	public static void main (String [] argv){
		int f,c;
		System.out.println("請輸入溫度(華氏):");
		Scanner sc = new Scanner (System.in);
		f = sc.nextInt();
		c = (f - 32) * 5 / 9;
		System.out.println("現在的溫度為攝氏 " + c +" 度");
	}
}