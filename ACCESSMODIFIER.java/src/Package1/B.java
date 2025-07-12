package Package1;
import Package2.*;

public class B {
    public static void main(String[] args) {
        C c = new C();
        // System.out.println(c.name); bcz of default noooo use outside the package
        // System.out.println(c.name1); public
    }
}
