package ru.avalon.java.dev.j10.labs.Classes;

import java.time.LocalDate;
import ru.avalon.java.dev.j10.labs.Person;

public class Persons implements Person {

    private String name;
    private LocalDate birthDate;

    public Persons(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        Persons persons = (Persons) o;
        if (this.name.compareTo(persons.name) == 0) {
            return birthDate.compareTo(persons.birthDate);
        }
        else {
            return this.name.compareTo(persons.name);
        }
    }

    @Override
    public String toString() {
        return name + " : " + birthDate;
    }
}
