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

import java.util.ArrayList;

public class MaxHuiwen {//最大回文插入#这样讲奇数偶数情况全变成一样的了
    public static void main(String[] args) {
        System.out.println(maxl("abbabb"));
    }
    public static int maxl(String ss){//这里只考虑了奇数的情况，没考虑到偶数的情况。。。。
        ArrayList<Character> list =new ArrayList<Character>();
        ArrayList<Character> list2 =new ArrayList<Character>();
        char[] cr=ss.toCharArray();
        int max=1;
        int count=1;
      for (int i=1;i<cr.length-1;i++){
          list2.add(cr[i]);
          for (int j=i-1,k=i+1;j>=0;j--,k++){
              if(cr[j]==cr[k]) {
                  count = count + 2;
                  list2.add(cr[j]);
                  list2.add(cr[k]);
              }
              else
                  break;
              if(j==0||k==cr.length-1)
                  break;
          }
          if(count>max){
              max=count;
              list.addAll(list2);
              count=1;
              list2.clear();
          }
          else
              count=1;
              list2.clear();
//          if(max>=(cr.length-i+1))
//              break;

      }
      for(int i=0;i<list.size();i++){
          System.out.print(list.get(i));
      }
      return max;
    }
//    public static  boolean (TreeNode root,TreeNode t1,ArrayList<TreeNode> list){
//        if(root==t1)
//            return true;
//        if (root==null)findpath
//            return false;
//        Boolean flag=false;
//        list.add(root);
//        flag=findpath(root.left,t1,list);
//        if(!flag)
//            list.remove(list.size()-1);
//        if(!flag){
//            flag=findpath(root.right,t1,list);
//        }
//
//        return flag;
//    }
}
