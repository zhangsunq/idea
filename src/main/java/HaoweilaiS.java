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

public class HaoweilaiS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        char[] arr=ss.toCharArray();
        int end=0;
        int  max=0;
        int temp=0;
      for (int i=0;i<arr.length;i++){
          if(arr[i]>='0'&&arr[i]<='9'){
              temp++;
              if(temp>max){
                  end=i;
                  max=temp;
              }

          }
          else
              temp=0;

      }
        for (int j=(end-max+1);j<=end;j++){
            System.out.print(arr[j]);
        }
    }
}
