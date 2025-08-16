public class User {
    // class attributes (fields)
    public int id ;
    public String username ;
    public String name ;
    public String surname;
    public String email ;

    //
    // constructor
    //

    // constructor name must match the class name
    // it cannot have a return type
    // it cannot have the static keyword
    // All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

    public User(int id, String username, String name, String surname, String email) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



