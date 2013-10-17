package grouptexter;

import java.util.ArrayList;

/**
 * 
 * @author Eson
 */
public class Group {
    private ArrayList<Person> people;

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public Group(ArrayList<Person> people) {
        this.people = people;
    }
}
