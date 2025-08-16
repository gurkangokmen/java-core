package String;

/**
 * <h1>Why Is String String.Immutable in Java?</h1>
 * <br></br>
 * The key benefits of keeping this class as immutable are caching, security, synchronization, and performance.
 * <br></br>
 *
 * <h2>Security</h2>
 * <br></br>
 * The String is widely used in Java applications to store sensitive pieces of information like usernames, passwords, connection URLs, network connections, etc.
 *
 * If Strings were mutable, then by the time we execute the update, we can’t be sure that the String we received, even after performing security checks, would be safe.
 * <br></br> <br></br>
 * <h2>Synchronization</h2>
 * <br></br>
 * Being immutable automatically makes the String thread safe since they won’t be changed when accessed from multiple threads.
 *
 * Hence <b>immutable objects, in general, can be shared across multiple threads running simultaneously. They’re also thread-safe</b> because if a thread changes the value, then instead of modifying the same, a new String would be created in the String pool. Hence, Strings are safe for multi-threading.
 *
 * <br></br> <br></br>
 *
 * NOTES:
 * <br></br>
 * <b>String class is marked final</b> so that nobody can override the behavior of its methods.
 *
 * <br></br>
 * <a href="https://www.youtube.com/watch?v=79PG5TnsV8Q">Why String Is Immutable In Java | String Immutable Concept In Java | String Concept In Java | Youtube</a>
 *
 * <br></br>
 * <a href="https://www.geeksforgeeks.org/string-constant-pool-in-java/">String Constant Pool in Java | geeksforgeeks/</a>
 */

public class Immutable {
    public static void main(String[] args) {
        String s = new String("Hello");
        s.concat("World");
        System.out.println(s); // Output: Hello


//        String s = new String("Hello");
//        s = s.concat("World");
//        System.out.println(s); // Output: HelloWorld

    }
}
