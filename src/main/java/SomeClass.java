import java.util.HashMap;

public class SomeClass {
    public static void main(String[] args) {

        Persons person = new Persons("Mik", 1);
        HashMap<Integer, Persons> map = new HashMap<>();
        map.put(1, person);

    }
}


class Persons {
    private String name;
    private int id;

    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}