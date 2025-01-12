package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField {

    public Employer() {
        super();
    }

    public Employer(String value) {
        super(value);
    }


    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        return value;
//    }
//
//
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer that = (Employer) o;
        return id == that.id;
    }
}
