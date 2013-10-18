package grouptexter;

/**
 *
 * @author Eson
 */
public class Person {
    private String firstName;
    private String lastName;
    private String number;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    //Sends a text to the person with the string as the message
    public void text(String message) {
        
    }

    public Person(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }
    public Person(){
        
    }
}
