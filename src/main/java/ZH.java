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

public class ZH {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        int sum=0;
        for (int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int max=0;
        for (int i=0;i<arr.length;i=i+2){
             max+=arr[i];
             if(i+1<arr.length)
                 max+=arr[i+1];
             i++;
        }
        int temp=0;
        for (int j=0;j<arr.length;j=j+2){
            if (j==0){
                temp+=arr[j];
                continue;
            }
            else {
                temp+=arr[j];
                if(j+1<arr.length){
                    temp+=arr[j+1];
                    j++;
                }
            }
        }
        int k=Math.max(temp,max);
        if(k>sum/2){
            System.out.println(true);
        }
        else
            System.out.println(false);

    }
}
