package Package1;
import Package2.*;
public class A {
    public static void main(String[] args) {
        C c = new C();
        //System.out.println(c.name3);
       // System.out.println(c.name); bcz of default noooo use outside the package
        // System.out.println(c.name1); public
       // System.out.println(c.name2);
    }
}
