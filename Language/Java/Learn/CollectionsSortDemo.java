import java.util.*;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Z");
        al.add("A");
        al.add("K");
        al.add("N");
        // al.add(new Integer(10)); //CCE
        // al.add(null); // NullPointerException
        System.out.println(al);
        Collections.sort(al); // make sure it is COLLECTION(S) and not COLLECTION
        System.out.println(al);
    }
}