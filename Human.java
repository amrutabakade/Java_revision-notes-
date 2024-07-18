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
    protected void get()
    {
        System.out.println("name : "+ name+ "age : "+ age + "population : "+Humans.population);
    }
}
public class Human {
    public static void main(String args[])
    {
        Humans h1 = new Humans(12,"Amruta");
        h1.get();
        Humans h2 = new Humans(15,"poo");
        h2.get();
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