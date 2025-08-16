public class Main {
    public static void main(String[] args) {
        // Create an instance of the secure data store using the interface reference
        SecureDataStore secureStore = new ConcreteDataStore();

        // Store data using the secure data store
        secureStore.storeData("Secret information");

        // Retrieve data from the secure data store
        String retrievedData = secureStore.retrieveData();
        System.out.println("Retrieved data: " + retrievedData);

        //Try Access private variable :D

        // ConcreteDataStore secureStore = new ConcreteDataStore(); ==> 'data' has private access in 'ConcreteDataStore'
        //SecureDataStore secureStore = new ConcreteDataStore(); ==> Cannot resolve symbol 'data'
        System.out.println(secureStore.data);
    }
}