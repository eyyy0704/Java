import java.util.*;

public class A1113315_0421_1 {
    public static void main (String [] args){
        System.out.println("請輸入電子郵件信箱: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        sc.close();
        if(date.matches("\\w+[@]{1}\\w+[.]{1}[c]{1}[o]{1}[m]{1}")){
            System.out.println("輸入正確");
        }
        else{
            System.out.println("輸入格式錯誤");
        }
    }
}