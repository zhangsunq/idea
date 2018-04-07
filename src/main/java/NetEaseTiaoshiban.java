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
import java.util.List;
import java.util.Scanner;

public class NetEaseTiaoshiban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m+m/2];
        arr[n - 1] = 1;
        for (int i = n - 1; i < m; i++) {
            if (arr[i] == 0)
                continue;
            else {
                List<Integer> list = find(i+1);
                for (int j = 0; j < list.size(); j++) {
                    int k = list.get(j);
                    if (arr[i + k] == 0)
                        arr[i + k] = 1 + arr[i];
                    else
                        arr[i + k] = Math.min(arr[i + k], (arr[i] + 1));
                }
            }

        }
        if (arr[m - 1] == 0)
            System.out.println(-1);
        else
            System.out.println(arr[m - 1] - 1);
    }

    public static List find(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if(i==Math.sqrt(n)){
                    list.add(i);
                }
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}
