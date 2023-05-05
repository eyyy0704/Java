import java.util.*;
public class A1113315_0421_2 {
    public static void main(String[] args) {
        System.out.println("請輸入日期(格式: YYYY/MM/DD 或是 MM/DD/YYYY)");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String [] date = str.split("/");
        String year = "1",month = "2",day = "3";
        if(date[0].length() == 4){
            year = date[0];
            month = date[1];
            day = date[2];
        }
        else if (date[0].length() == 2){
            day = date[0];
            month = date[1];
            year = date[2];
        }
        System.out.println("年:" + year + "\n月:" + month + "\n日:" + day);
    }
}