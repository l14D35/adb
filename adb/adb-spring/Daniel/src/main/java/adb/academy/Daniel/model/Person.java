package adb.academy.Daniel.model;

public class Person {

    private String firstName;
    private String secondName;
    private int birthday;
    private int footSize;



    public Person(String firstName, String secondName, int birthday, int footSize) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.footSize = footSize;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

}
