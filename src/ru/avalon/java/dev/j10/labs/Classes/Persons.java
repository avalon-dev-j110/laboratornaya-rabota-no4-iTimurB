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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object t) {
        Persons persons = (Persons) t;
        int res;
        res = name.compareTo(persons.getName());
        if (res == 0) {
            res = birthDate.compareTo(persons.getBirthDate());
        }
        return res;

    }

}
