public class InterfacesDemo {
    public interface Interef {
        // always static, bcz no object can be created for interface
        // is final as anyone can access it but no one can modify it
        int x = 0; 
        // every method here is always public and abstract whether we declare or not
        void m1();  // service 1 

        void m2();  // service 2
    }

    abstract class ServiceProvider implements Interef {
        // need to write 'abstract' if only one method is being overridden here
        public void m1() {  // need to add 'public'
            System.out.println("m1");
        }
        // public void m2(){
        // System.out.println("m2");
        // }
    }

    class SubServiceProvider extends ServiceProvider {
        // remaining methods will be overridden here
        public void m2() {  // need to add 'public'
            System.out.println("m2");
        }
    }

    public static void main(String[] args) {

    }
}