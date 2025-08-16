public class Main {
    public static void main(String[] args) {

        // create object
        User user = new User(1,"yıldız_usmonova","Yıldız","Usmonova","yıldızusmonova@java.com");

        // print object (need toString method override) - both of them are same
        System.out.println(user);
        System.out.println(user.toString());
    }
}