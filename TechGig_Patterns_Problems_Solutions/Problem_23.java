
import java.io.*;
import java.util.*;
class Problem_23{
    public static void main(String args[] ) throws Exception {

    			  int n=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print((char)(65+n-1-j));
            if(j!=n-i-1){
                System.out.print(" ");
            }
        }
        if(i!=n-1){
                System.out.println("");
            }
    }

   }
}