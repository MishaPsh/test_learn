package myxap;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private LocalDate dob;

    public Employee(int id, String name, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.dob = localDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }
}
