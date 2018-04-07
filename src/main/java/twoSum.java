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

import java.util.HashMap;

public class twoSum {//利用hashmap降低时间复杂度不用O(n)
    public static void main(String[] args) {
        int[] ee={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int target=8;
        HashMap<Integer,Integer> hashMap=new HashMap();
        for (int i=0;i<ee.length;i++){
            hashMap.put(ee[i],i);
        }
        int number=target;
        for (int j=0;j<ee.length;j++){
            number=number-ee[j];
            if(hashMap.containsKey(number)&& hashMap.get(number)!=j){//最后这个条件保证不是同一个数。防止ee[j]==target/2;
                System.out.println(ee[j]);
                System.out.println(number);
            }
            number=target;
        }
    }
}
