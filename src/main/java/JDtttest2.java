
import java.util.Scanner;

public class JDtttest2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
              int n=sc.nextInt();
              int count=0;
              int sum=6;
              int k=n;
              while(k>1){
                  if(k%2==0){
                      count++;
                      k=k/2;
                  }
              }
              for (int i=3;i<=n;i++){
                     sum++;
                     if (Math.sqrt(i)>(int)Math.sqrt(i)){
                          sum=sum+count;
                     }
                     else
                         sum=sum+count+2;
                     }
            System.out.println(sum);
                  }

              }

