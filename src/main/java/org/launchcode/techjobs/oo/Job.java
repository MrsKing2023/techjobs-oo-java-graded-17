package org.launchcode.techjobs.oo;

import javax.naming.Name;
import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
public Job() {
    id = nextId;
    nextId++;
}
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString() {
            if (name.isEmpty()) {
                name = "Data not available";
            }
            if (employer.getValue().isEmpty() || employer.getValue() == null) {
                employer.setValue("Data not available");
            }
            if (location.getValue().isEmpty() || location.getValue() == null) {
                location.setValue("Data not available");
            }
            if (positionType.getValue().isEmpty() || positionType.getValue() == null) {
                positionType.setValue("Data not available");
            }
            if (coreCompetency.getValue().isEmpty() || coreCompetency.getValue() == null) {
                coreCompetency.setValue("Data not available");
            }

        String display = System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + name + System.lineSeparator() +
                "Employer: " + getEmployer() + System.lineSeparator() +
                "Location: " + getLocation() + System.lineSeparator() +
                "Position Type: " + getPositionType() + System.lineSeparator() +
                "Core Competency: " + getCoreCompetency() +
                System.lineSeparator();
        return display;

    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
