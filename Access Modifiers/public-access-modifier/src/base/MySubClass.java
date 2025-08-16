package base;
// same package subclass

public class MySubClass extends MySuperClass{
    public MySubClass() {
        System.out.println("MySubClass constructor");

        System.out.println(publicField);        // Accessible (inherited)

        publicMethod();							// Accessible (inherited)
    }




}
