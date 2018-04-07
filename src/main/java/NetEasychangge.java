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

public class NetEasychangge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int temp = 0;
        int max = 0;
        int k = 1;
        for (int u = 1; u < arr.length; u++) {
            temp = arr[u] - arr[u - 1];
            if (temp > max) {
                max = temp;
                k = u;
            }
        }
        int sum = 0;
        if(k<arr.length-1) {
            if (arr[k] - arr[k - 1] > arr[k + 1] - arr[k]) {
                for (int r = 1; r < arr.length; r++) {
                    if (r == k)
                        continue;
                    sum += (arr[r] - arr[r - 1]);
                    if (arr[r] == arr[r - 1])
                        sum++;
                }

            } else {
                for (int r = 1; r < arr.length; r++) {
                    if (r == (k + 1))
                        continue;
                    sum += (arr[r] - arr[r - 1]);
                    if (arr[r] == arr[r - 1])
                        sum++;
                }
            }
        }
        else {
            for (int r = 1; r < arr.length-1; r++) {
                if (r == k)
                    continue;
                sum += (arr[r] - arr[r - 1]);
                if (arr[r] == arr[r - 1])
                    sum++;
            }
            sum=sum+arr[arr.length-1]-arr[arr.length-2];
        }
        System.out.println(sum);
    }
}