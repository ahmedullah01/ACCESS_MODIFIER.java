package Package1;

import Package2.*;

public class D extends C {
    public static void main(String[] args) {
        D d = new D();

        System.out.println(d.name2);//protected run only in subclasses
    }
}
