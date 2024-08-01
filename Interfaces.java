
/**
 * InnerInterfaces
 */
interface A {
    void printing();
}

class B implements A{
    public void printing()
    {
        System.out.println("Good Morning");
    }
}

interface C extends A{
    int c = 10;
    int Valc();
}

class D implements C{
    @Override
    public void printing() {
        // TODO Auto-generated method stub
        System.out.println("value of c is");
    }
    @Override
    public int Valc() {
        // TODO Auto-generated method stub
        return c;
    }
}

public class Interfaces {
    public static void main(String str[]) throws Exception
    {
        B b = new B();
        b.printing();
        D d = new D();
        d.printing();
        System.out.println(d.Valc());
    }
}
