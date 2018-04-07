/*
 
                                                         _ooOoo_
                                                        o8888888o
                                                         88" . "88
                                                         (| -_- |)
                                                         O\ = /O
                                                      ____/`---'\____
                                                    .   ' \\| |// `.
                                                     / \\||| : |||// \
                                                    / _||||| -:- |||||- \
                                                    | | \\\ - /// | |
                                                  | \_| ''\---/'' | |
                                                   \ .-\__ `-` ___/-. /
                                                ___`. .' /--.--\ `. . __
                                              ."" '< `.___\_<|>_/___.' >'"".
                                             | | : `- \`.;`\ _ /`;.`/ - ` : | |
                                              \ \ `-. \_ __\ /__ _/ .-` / /
                                     ======`-.____`-.___\_____/___.-`____.-'======
                                                          `=---='

*/

import java.util.Scanner;

public class JDFormatJinzhi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int max=1;
        int k=n-2;
        for (int i=2;i<=n-1;i++){
         sum=ff(n,i,sum);
        }
        int temp=sum;
        while((temp%k!=0)){
            int tt1=temp;
            temp=k;
            k=tt1%k;
            if(k==1)
                break;
        }
        System.out.println((sum/k)+"/"+((n-2)/k));
    }
    public static int ff(int n,int m,int sum){
        while(n!=0){
            sum+=n%m;
            n=n/m;
        }
        return sum;
    }
}
