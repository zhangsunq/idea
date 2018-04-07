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

public class yiba {
    public static void main(String[] args) {
        int[] a=new int[5];
        String[] books=new String[3];
        books[0]="java";
        books[1]="java1";
        books[2]="java2";
//        for (String book:books) {
//            System.out.print(book);
//        }
        Scanner sc =new Scanner(System.in);
        int p=sc.nextInt();
        for(int u=1;u<=p;u++){
            for (int y=p-u;y>0;y--){
                System.out.print(" ");
            }
            for (int e=(2*u-1);e>=1;e--)
                System.out.print("*");
            System.out.println(" ");
        }
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){

                System.out.print(i+"X"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
        }
}
