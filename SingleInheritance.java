class Animal{
    int legs;
    String types;
}
class Dogs extends Animal{
    String breed;
}
public class SingleInheritance {
    public static void main(String args[])
    {
        Dogs d = new Dogs();
        d.legs = 4;
        d.types = "domestic";
        d.breed = "labrador";
        System.out.println(d.legs + " "+ d.types + " " + d.breed);
    }
}

// A->B