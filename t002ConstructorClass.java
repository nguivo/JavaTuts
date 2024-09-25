public class t002ConstructorClass {
    int age;
    String name;

    public t002ConstructorClass()
    {
        age = 35;
        name = "Ngu";
    }


    public static void main(String[] args)
    {
        t002ConstructorClass conss = new t002ConstructorClass();
        System.out.println("Hi, " + conss.name + " here. I am "+ conss.age);
    }

}
