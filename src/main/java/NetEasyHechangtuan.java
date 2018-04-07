import java.util.Scanner;
public class NetEasyHechangtuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] stuEn=new int[num];
        for (int i=0;i<num;i++){
            stuEn[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ys=sc.nextInt();
        long[][] dpmax=new long[num+1][k+1];
        long[][] dpmix=new long[num+1][k+1];
        long res=0;
        for (int i=1;i<=num;i++){
               dpmax[i][1]=stuEn[i-1];
               dpmix[i][1]=stuEn[i-1];
            for(int j=2;j<=k;j++){

                    for (int o = j - 1;o>=0&&j - o <= ys; o--) {
                        dpmax[i][j] = Math.max(dpmax[i][j], Math.max(dpmax[o][j-1] * stuEn[j], dpmix[o][j] * stuEn[j]));
                        dpmix[i][j] = Math.min(dpmix[i][j], Math.min(dpmax[o][j-1] * stuEn[j], dpmix[o][j] * stuEn[j]));
                }
            }
            res=Math.max(res,dpmax[i][k]);
        }
        System.out.println(res);
    }
    public static void fff(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] stuEn=new int[num];
        for (int i=0;i<num;i++){
            stuEn[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ys=sc.nextInt();
        long[][] dpmax=new long[num+1][k+1];
        long[][] dpmix=new long[num+1][k+1];
        long res=0;
        for(int i=1;i<=num;i++){
            for (int j=1;j<=k;j++){
                if(j==1){
                    dpmax[i][j]=stuEn[j-1];
                    dpmix[i][j]=stuEn[j-1];
                }
                for(int o=i-1;o>0&&i-o>=ys;o--){
                    dpmax[i][j]=Math.max(dpmax[i][j],Math.max(dpmax[o][j-1]*stuEn[i-1],dpmix[o][j-1]*stuEn[i-1]));
                    dpmix[i][j]=Math.min(dpmix[i][j],Math.min(dpmax[o][j-1]*stuEn[i-1],dpmix[o][j-1]*stuEn[i-1]));
                }
            }
            res=Math.max(res,dpmax[i][k]);
        }
        System.out.println(res);
    }
}