package com.eschulz.data;

import com.eschulz.data.Person;
import java.util.ArrayList;

/**
 * 
 * @author Eson
 */
public class Group {
    private String name;
    
    // A list of people
    private ArrayList<Person> people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    
    public void addPerson(Person person){
        people.add(person);
    }

    public Group(String name, ArrayList<Person> people) {
        this.name = name;
        this.people = people;
    }
    public Group() {
        this.people = new ArrayList<>();
    }
}
