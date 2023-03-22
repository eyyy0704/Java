import java.io.IOException;
import java.io.*;

public class A1113315_0317_1 {
    public static void main (String[] argv) 
    throws IOException
    {
        BufferedReader br = new
            BufferedReader (new InputStreamReader(System.in));
        
        int n,m;

        System.out.println("請輸入n的值:");
        String str = br.readLine();
        n = Integer.parseInt(str);

        System.out.println("請輸入m的值:");
        str = br.readLine();
        m = Integer.parseInt(str);
        
        int [][] sum = new int [n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                sum [i][j] = (i+1) * (j+1);
            }
        }
        for(int [] a : sum){
            for(int b : a){
                System.out.println(b);
            }
            System.out.println("");
        }
    }
}