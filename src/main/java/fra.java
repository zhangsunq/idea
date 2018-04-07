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

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class fra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char[] cc=s1.toCharArray();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (int i=0;i<cc.length;i++){
            if(cc[i]>='0'&&cc[i]<='9'){
                System.out.println(cc[i]);
                sb1.append(cc[i]);
            }
            else
                sb2.append(cc[i]);
            System.out.println(cc[i]);
        }
        char[] array1=sb1.toString().toCharArray();
        char[] array2=sb2.toString().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]);
        }
//        for (int j=0;j<array1.length;j++){
//            System.out.print(array1[j]);
//        }
    }
}
