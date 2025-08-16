public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        System.out.println(pig.getAnimalCellularStructure());

        Animal animal = new Pig();
        System.out.println(animal.getAnimalCellularStructure());
    }
}