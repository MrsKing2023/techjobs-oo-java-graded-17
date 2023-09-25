package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
//created abstract class because this is not a working class, it is just setting up the definitions and other objects will inherit from this class
    //what are the 4 fields:
    public int id;
    public static int nextId = 1;
    public String value;
    public JobField(int id) {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        //this();
        this.value = value;
    }
    public String toString() {
    return value;
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    //public abstract String combined();
//abstract method can only be created in an abstract class and can only be declared not defined

}
