class runtime{
    public void overrideFunc()
    {
        System.out.println("this is base class");
    }
}

class Derive extends runtime{
    int name = 30;
    public void overrideFunc()
    {
        System.out.println("this is Derived class");
    }
}

public class polymor1 {
    public static void main(String s[]) throws Exception
    {
        runtime r = new runtime(); // base
        runtime d = new Derive();//dervi
        r.overrideFunc();
        d.overrideFunc();

        //upcasting   -- used to access overridden function
        runtime r2 = new Derive();
        // System.out.println(r2.name); // cannot retrive data which is not overridden

        // Downcasting
        Derive r1 = (Derive) r2; // can retrive data which is not overridden
        System.out.println(r1.name);
        r2.overrideFunc();
    }
}
