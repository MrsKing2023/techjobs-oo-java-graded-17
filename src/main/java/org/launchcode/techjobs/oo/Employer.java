package org.launchcode.techjobs.oo;

import java.util.Objects;
/*public class Employer {
    public Employer(String value) {
        super(value);
    }

}*/
public class Employer {

    private int id;
    private static int nextId = 1;
    private String value;

    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        this();
        this.value = value;
    }
    // Custom toString, equals, and hashCode methods:
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
