class Humans
{
    int age;
    String name;
    //int population; 
    //common for all objects, hence use static keyword to share same
    static int population;

    Humans(int age, String name)
    {
        population++;
        this.age = age;
        this.name = name;
       // this.population = population;
    };
}
public class Human {
    public static void main(String args[])
    {
        Humans h1 = new Humans(12,"Amruta");
        Humans h2 = new Humans(15,"poo");
        System.out.println("name : "+h1.name+ "age : "+ h1.age + "population : "+Humans.population);
        System.out.println("name : "+h2.name+ "age : "+ h2.age + "population : "+Humans.population);
    }
}

//--------------------OP------------------
// name : Amrutaage : 12 population : 2
// name : pooage : 15 population : 2
//-----------------------------------------

//-----------------EXPLAIN-----------------
// 1. ---A static variable is a variable that belongs 
//to the class and not to any specific instance of the class.
// 2. ---A static variable is initialized only once, when
// the class is loaded, and it is shared by all instances of the class.
// 3. ---Accessed via Class Name: Static variables can be accessed using the class 
// name without creating an instance of the class.