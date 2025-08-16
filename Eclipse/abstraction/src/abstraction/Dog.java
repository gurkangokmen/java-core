package abstraction;

//Subclass (inherit from Animal)
class Dog extends Animal {
	

	@Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
	
	public String getName() {
        return Animal.name;
    }

    public void setName() {
        //Cannot assign a value to final variable 'name'

        // Animal.name = "Animal name is changed.";
    }
}
