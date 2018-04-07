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

public class JDtest {//括号匹配。。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int sum=1;
        int k=0;
        int count=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]=='('&&ch[i+1]!=')'){
                k++;
                for(int j=i+1;j<ch.length;j++){
                    if(ch[j]==')') {
                        count++;
                        continue;
                    }
                  else
                      continue;
                 }
                sum = sum * (count-k+1);
                 count=0;
            }

        }
        System.out.println(sum);
    }
}
