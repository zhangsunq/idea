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
import java.util.Vector;

public class DeathGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Vector<Integer> vv=new Vector<Integer>();
        for (int i=0;i<n;i++){
            vv.add(i+1);//此处用list也是一样的list也是有序的。
        }
        for (;;){
            if (vv.size()==1)
                break;
            for (int j=1;j<m;j++){
                vv.add(vv.remove(0));
            }
            vv.remove(0);
        }
        System.out.println(vv.get(0));
    }
}
