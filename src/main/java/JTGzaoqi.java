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
class Root{
    static {
        System.out.println("root的静态初始化块");
    }
    {
        System.out.println("root的非静态初始化块");
    }
    public Root(){
        System.out.println("Root的构造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("mid的静态初始化块");
    }
    {
        System.out.println("mid的非静态初始化块");
    }
    public Mid(){
        System.out.println("mid的无惨构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("mid的带参数构造器 参数是msg");
    }
}
class Leaf extends Mid{
    static {
        System.out.println("leaf的静态初始化块");
    }
    {
        System.out.println("leaf的非静态初始化块");
    }
    public Leaf(){
        super("Leaf调用的参数");
        System.out.println("leaf的构造器");
    }
}
public class JTGzaoqi {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
