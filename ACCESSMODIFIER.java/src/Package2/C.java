package Package2;
import Package1.*;
public class C {
    //default
    String name = "ahmedullah";
    public String  name1 = "ali";
    protected  String name2 = " bhaii";
private String name3 = "hehehehehehe";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.name3);
    }
}

 class hehe{
    //default
      public static void main(String[] args) {
            C c = new C();

            //   System.out.println(c.name);//default
     // System.out.println(c.name1); public
       }

}
