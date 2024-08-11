public class VarArgsDemo {
    public static void m1(int[]... x){
        for (int[] x1 : x) {
            System.out.println(x1[0]);
        }
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {100, 200, 300};
        m1(a,b);
    }
}

