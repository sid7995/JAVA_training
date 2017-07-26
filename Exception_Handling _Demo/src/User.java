/**
 * Created by malviyas on 7/26/2017.
 */
public class User {
    private int id;
    private String name;
    private int age;
    private int rating;

    public User(int id, String name, int age, int rating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRating() {
        return rating;
    }
}
