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

public class NetEaseHuiwen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<j){
            if(arr[i]<arr[j]){
                arr[i+1]=arr[i]+arr[i+1];
                i++;
                count++;
            }
            else if(arr[i]>arr[j]){
                arr[j-1]=arr[j-1]+arr[j];
                j--;
                count++;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
