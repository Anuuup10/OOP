package Tutorial;

class Studen {
    private String name;

    // setter
    public void setName(String n) {
        name = n;
    }

    // getter
    public String getName() {
        return name;
    }
}

public class Student {
    public static void main(String[] args) {
        Studen s = new Studen();

        s.setName("Anup");
        System.out.println(s.getName());
    }
}