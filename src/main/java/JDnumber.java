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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class JDnumber {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=1;i<=10000;i++){
            set.add(i);
        }
        Scanner sc=new Scanner(System.in);
       for (int i=1;i<=9997;i++) {
           int k = sc.nextInt();
           if (set.contains(k))
               set.remove(k);
       }
       Iterator<Integer> it =set.iterator();
        int[] bb=new int[set.size()];
        int u=0;
       while(it.hasNext()){
           bb[u]=it.next();
           u++;
       }
        Arrays.sort(bb);
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<bb.length;i++){
           sb.append(bb[i]);
       }
       long key=Long.parseLong(sb.toString());
        System.out.println(key%7);
    }
}
