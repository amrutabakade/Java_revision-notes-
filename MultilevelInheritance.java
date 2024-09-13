class A{
    int a;
}
class B extends A{
    int b;
}
class C extends B{
    int c;
}
public class MultilevelInheritance {

    public static void main(String arg[])
    {
        A ai = new A();
        ai.a = 1;
        B bi = new B();
        bi.a = 2;
        bi.b = 2;
        C ci = new C();
        ci.a = 3;
        ci.b = 3;
        ci.c = 3;

        System.out.println(ai.a + bi.a + bi.b + ci.a + ci.b + ci.c);
    }
}

// A->B->C