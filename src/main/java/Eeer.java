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

public class Eeer {
    public static void main (String[] args) {
        fd();
        System.out.println("hehe");
        try {


            fff();
        }
        catch (Exception ee){
            System.out.println("nihao china");
        }
    }
    public static void fd(){
        try {
            throw new Exception();
        }
      //  System.out.println("你好 我是警察");
        catch (Exception e){
            System.out.println("haha");
        }
        System.out.println("you are a guapi");
    }
    public static  void fff() throws Exception{
        if(true) {
            throw new Exception();
        }
        System.out.println("sss");//这句话是执行不了的
    }
}
