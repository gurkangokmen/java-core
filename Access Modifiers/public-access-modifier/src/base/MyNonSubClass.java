package base;

// same package non-subclass
public class MyNonSubClass {
    public MyNonSubClass() {
        System.out.println("MyClass constructor");

        System.out.println(publicField);        // Not Accessible (not inherited) or make static and access with class name

        publicMethod();							// Not Accessible (not inherited) or make static and access with class name

        MySuperClass mySuperClass = new MySuperClass();

        System.out.println(mySuperClass.publicField);        // Accessible (created object)

        mySuperClass.publicMethod();							// Accessible (created object)
    }


}
