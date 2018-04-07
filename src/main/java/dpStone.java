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

public class dpStone {//dp问题主要先求出转换方程 01背包的状态转换方程 f[i,j] = Max{ f[i-1,j-Wi]+Pi( j >= Wi ),  f[i-1,j] }。
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int bag=sc.nextInt();
        int num=sc.nextInt();
        int[] weight=new int[num];
        int[] value=new int[num];
        for(int i=0;i<num;i++){
            weight[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            value[i]=sc.nextInt();
        }
        System.out.println(solve(bag,weight,value));
    }
    public static int solve( int bag,int[] weight,int[] value){
        int qq=weight.length;
        int[][] vv=new int[bag+1][qq+1];
        //我先遍历背包容量。在遍历石头。背包从0开始遍历（其实可以从最小的开始就好这里最小的是1）
        for (int i=0;i<=bag;i++){
            //石头就是从第一个开始遍历。数组的第0个下标就是第一个石头。
            for (int j=0;j<=weight.length;j++){
                    if(i==0||j==0){
                        vv[i][j]=0;
                    }
                    else {
                    if(i<weight[j-1]){
                        vv[i][j]=vv[i][j-1];
                    }
                    else {
                        vv[i][j]=Math.max(vv[i][j-1],(vv[i-weight[j-1]][j-1]+value[j-1]));//分两种情况，包含第j块石头和不包含第j块石头。
                    }
                }
            }
        }
        return vv[bag][qq];
    }
}
