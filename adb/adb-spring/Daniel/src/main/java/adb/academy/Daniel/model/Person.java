package adb.academy.Daniel.model;

public class Person {
    private static Long id = 1L;
    private Long idPerson = 0L;
    private String firstName;
    private String secondName;
    private int birthday;
    private int footSize;

    public Person(String firstName, String secondName, int birthday, int footSize) {
        this.idPerson = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.footSize = footSize;
        id++;
    }

    public static Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getFootSize() {
        return footSize;
    }

    public Long getIdPerson() {
        return idPerson;
    }
}
