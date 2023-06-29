package ver_002;

public class Person {
    public String Name;
    public String surName;

    public Person(String Name, String surName) {
        this.Name = Name;
        this.surName = surName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getsurName() {
        return surName;
    }

    public void setsurName(String surName) {
        this.surName = surName;
    }

}