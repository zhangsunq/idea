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

public class Dgui {
    public static int p=10;
    public static int n=8;
    public static void main(String[] args) {
        //System.out.println(sum());
        //System.out.println(fb(8));
        System.out.println(calcDistance(100,90,80,70));
    }
    public static int sum(){
        p=p+2;
        n--;
        if(n>0){
            sum();
        }
        return p;
    }
    public static int fb(int n){
        if(n==0)
            return 10;
        else
            return fb(n-1)+2;
    }
    public static int countWays(int n) {
        // write code here
           if(n==1)
        return 1;
        else if(n==2)
            return 2;
        else
            return (countWays(n-1)+countWays(n-2));
    }
    public static int calcDistance(int A, int B, int C, int D) {
        // write code here
        double count=A+B+C+D;
        double a=A;
        double b=B;
        double c=C;
        double d=D;
        while(a>0){
            count+=a;
            a=a/2.0;
        }
        while(b>0){
            count+=b;
            b=b/2.0;
        }
        while(c>0){
            count+=c;
            c=c/2.0;
        }
        while(d>0){
            count+=d;
            d=d/2.0;
        }
        return (int)count;
    }

}
