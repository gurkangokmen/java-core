public class Main {
    public static void main(String[] args) {
        //
        // modify class attributes
        //

        // create class object
        User user = new User();

        // access class attributes before
        System.out.println(user.email);

        // modify class attributes
        user.email = "yıldızusmonova@spring.com";

        // access class attributes after
        System.out.println(user.email);
    }
}