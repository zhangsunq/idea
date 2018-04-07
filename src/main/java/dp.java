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

public class dp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] qipan=new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                qipan[i][j]=sc.nextInt();
            }
        }
        System.out.println(getMost(qipan));
    }
    public static int getMost(int[][] board) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(i==0&&j==0){
                }
                else if (i==0){
                    board[i][j]+=board[i][j-1];
                }
                else if(j==0){
                    board[i][j]+=board[i-1][j];
                }
                else {
                    board[i][j]+=Math.max(board[i-1][j],board[i][j-1]);
                }
            }
        }
        return board[board.length-1][board[0].length-1];
     }
}
