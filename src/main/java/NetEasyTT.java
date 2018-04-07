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

public class NetEasyTT {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        String[] ee=new String[n];
        for (int u=0;u<n;u++){
            int m=sc.nextInt();
            int count=0;
            int[] arr=new int[m];
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>=4&&arr[i]%4==0)
                    count++;
            }
            if(count>=arr.length/2)
                ee[u]="Yes";
            else
                ee[u]="No";
        }
        for (int k=0;k<ee.length;k++){
            System.out.println(ee[k]);
        }
    }
}
