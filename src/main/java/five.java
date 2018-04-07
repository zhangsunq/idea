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
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String st=sc.nextLine();
        char[] cc=st.toCharArray();
         int r=0;
         char[] nn=new char[cc.length];
        char[] daxie=new char[cc.length];
        int u=0;
        char[] xiaoxie=new char[cc.length];
        int m=0;
        char[] shuzi=new char[cc.length];
        int k=0;
           for(int i=0;i<cc.length;i++){
               if(cc[i]>='A'&&cc[i]<='Z'){
                   daxie[u++]=cc[i];
               }
               else if(cc[i]>='a'&&cc[i]<='z'){
                   xiaoxie[m++]=cc[i];
               }
               else{
                   shuzi[k++]=cc[i];
               }
           }
           int sum=u+m;
           Arrays.sort(daxie);
           Arrays.sort(xiaoxie);
           Arrays.sort(shuzi);
           int dd=0;
           int xx=0;
           r=0;
           while(u>=0&&m>=0){
               if(daxie[dd]+32>xiaoxie[xx]){
                   nn[r]=xiaoxie[xx];
                   xx++;
                   r++;
                   m--;
               }
               if(daxie[dd]+32<xiaoxie[xx]){
                   nn[r]=daxie[dd];
                   dd++;
                   r++;
                   u--;
               }
               if (daxie[dd]+32==xiaoxie[xx]){
                   nn[r++]=daxie[dd];
                   nn[r]=xiaoxie[xx];
                   dd++;
                   xx++;
                   m--;
                   u--;
               }
           }
             if(m>=0){
                 nn[r]=xiaoxie[xx];
               xx++;
               m--;
               r++;
             }
             if(u>=0){
                 nn[r]=daxie[dd];
                 dd++;
                 u--;
                 r++;
             }
             int y=0;
             for (int i=0;i<nn.length-sum-2;i++){
                 nn[r]=shuzi[y];
                 r++;
                 y++;
             }
        for (int h=0;h<nn.length;h++){
            System.out.print(nn[h]);
        }
    }
}
