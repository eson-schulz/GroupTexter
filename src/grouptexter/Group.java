package grouptexter;

import java.util.ArrayList;

/**
 * 
 * @author Eson
 */
public class Group {
    private String name;
    
    // A list of people. In this case the person is firstName + " " + lastName
    private ArrayList<String> people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<String> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<String> people) {
        this.people = people;
    }
    
    public void addPerson(String person){
        people.add(person);
    }

    public Group(String name, ArrayList<String> people) {
        this.name = name;
        this.people = people;
    }
    public Group() {
        this.people = new ArrayList<>();
    }
}
