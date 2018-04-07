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

public class ziC {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] q=new int[n];
        for(int i=0;i<n;i++){
            q[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int sum=0;
        int temp=0;
        int max=0;
        for (int i=0;i<q.length;i++){
            if(i%target==0) {
                temp=1;
            }
            sum=0;
            for (int j=i;j<q.length;j++){
                  sum+=q[j];
                  if(sum%target==0)
                      temp=j-i+1;
            }
            if(temp>max){
                max=temp;
                temp=0;
            }
            else
                temp=0;
        }
        System.out.println(max);
    }
}
