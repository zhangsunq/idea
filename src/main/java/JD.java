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

import java.util.*;

public class JD {// this is from zhangsunqiang!!!
    public static void main(String[] args) {//wo jiu shi lai wan wan de  bie dang zhen !!!
        Scanner sc =new Scanner(System.in);//fgfghfg
        int n=sc.nextInt();//zijizai bendi xiugai l yixie
        int m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        HashSet<Integer> set=new HashSet<Integer>();
        ArrayList<Integer> list =new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            if(!set.contains(arr1[i])){
                list.add(arr1[i]);//just tyr yi tyr!!!!
                set.add(arr1[i]);
            }
        }
 
        for (int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
            if(!set.contains(arr2[j])){
                list.add(arr2[j]);
                set.add(arr2[j]);
            }
        }
     我就是试一试看你们到底怎么样！！！！
        int[] qq=new int[set.size()];
        for (int i=0;i<qq.length;i++){
            qq[i]=list.get(i);
        }
        Arrays.sort(qq);
        for (int i=0;i<qq.length;i++){
            if(i!=qq.length-1)
                System.out.print(qq[i]+" ");
            else
                System.out.print(qq[i]);
        }
    }
}
