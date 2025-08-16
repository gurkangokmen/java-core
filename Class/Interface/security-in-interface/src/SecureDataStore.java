// Interface defining the public contract for a secure data store
public interface SecureDataStore {
    void storeData(String data);
    String retrieveData();
}