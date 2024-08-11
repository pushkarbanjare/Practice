public class OverLoadingDemo {
    public static class Test{
        public void m1(Object o){
            System.out.println("object version");
        }
        public void m1(String s){
            System.out.println("string version");
        }
        public void m1(StringBuffer sb){
            System.out.println("stringbuffer version");
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1(new Object());
        t.m1("string");
        t.m1(new StringBuffer("hello"));
        // t.m1(null);     //compiler gives preference to child class more than parent class
    }
}