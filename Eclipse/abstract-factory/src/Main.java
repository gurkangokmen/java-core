
public class Main {
	public static void createFurniture(FurnitureFactory factory) {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        System.out.println("Creating furniture set:");
        System.out.println(chair.info());
        System.out.println(sofa.info());
        System.out.println(coffeeTable.info());
    }

    public static void main(String[] args) {
        FurnitureFactory artDecoFactory = new ArtDecoFactory();
        FurnitureFactory modernFactory = new ModernFactory();
        FurnitureFactory victorianFactory = new VictorianFactory();

        System.out.println("Creating Art Deco furniture set:");
        createFurniture(artDecoFactory);

        System.out.println("\nCreating Modern furniture set:");
        createFurniture(modernFactory);

        System.out.println("\nCreating Victorian furniture set:");
        createFurniture(victorianFactory);
    }
}
