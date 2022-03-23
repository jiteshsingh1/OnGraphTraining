
public class Oscar {
    Integer id;
    Integer year;
    String name;
    Integer age;
    String movie;

    Oscar(
            Integer id, Integer year, String name, Integer age, String movie) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.age = age;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}
