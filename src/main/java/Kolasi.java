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

import java.util.ArrayList;
import java.util.Scanner;

public class Kolasi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] array=new int[m];
        for (int i=0;i<m;i++){
            array[i]=sc.nextInt();
        }
        ArrayList<Integer> list =new ArrayList<Integer>();
        int count=2;
        int index=1;
        for(int i=0;i<array[0];i++){
            list.add(array[0]);
        }
        for(int i=list.size();i<=n;i++){
            if(list.size()>=n)
                break;
           for (int k=list.get(count);k>0;k--){
               list.add(array[index]);
           }
           if(index==3)
               index=0;
        }
    }
}
