
# HashSet

- HashSet is data structures in the Java **Collections** API.
  ![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20240305170740/Collections-in-Java-768.webp)
- HashSet stores **unique elements** and permits **nulls**.

```
import java.util.HashSet;

public class AddNullValuesToHashSet {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add(null);

        System.out.println(cars);
    }
}
```
```
Output:
[null, Volvo, Ford, BMW]
```
- HashSet is backed by a HashMap
```
HashSet.java

public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
```

```
HashMap.java

public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
```

- HashSet is not thread-safe
```
HashSet implementation is not synchronized. If multiple threads access a hash set concurrently, and at least one of the threads modifies the set, it must be synchronized externally
```

```
Note: Reading doesn't modify a set, therefore it is thread safe
```


## Behind the scenes


- 1-) Hashing: When you add an element to a **HashSet**, the **hashCode()** method of the object is called to determine the hash code of that element. Hash code is basically an integer value generated for an object, which is used to quickly identify it in the hash table.

- 2-) Bucketing: The hash code determines the bucket in which the element will be stored. A bucket is simply a slot in the hash table. If there's already an element in the same bucket (i.e., if there's a hash code collision), then the **equals()** method of the existing element and the new element is called to check if they are equal. If **equals()** returns **true**, the new element is considered a duplicate and not added to the **HashSet**.

- 3-) Maintaining uniqueness: Each element is stored in a bucket based on its hash code, and **HashSet** ensures that no two elements in the same bucket are considered equal according to the **equals()** method. This is how duplicates are avoided.

- 4-) Performance: The use of hashing provides very efficient insertion, deletion, and lookup operations **(O(1) on average)** compared to other data structures like lists or trees.
