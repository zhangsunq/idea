
public class Test {
    public static void main(String[] args) {
        int[] array={22,-3,11,0,10,19};
        System.out.println(maxSub(array));
    }
    public static int maxSub(int[] array){
        if(array==null||array.length==0)
            return 0;
        int max =Integer.MIN_VALUE;
        int cur =0;
        for (int j=0;j<array.length;j++){
            cur+=array[j];
            max=Math.max(max,cur);
            cur=cur>0? cur:0;
        }
        return cur;
    }
}





