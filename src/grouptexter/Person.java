package grouptexter;

/**
 *
 * @author Eson
 */
public class Person {
    private String firstName;
    private String lastName;
    //EX: 333-333-4444
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
    
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    //Sends a text to the person with the string as the message
    public boolean text(String message){
        try {
            GoogleVoice.voice.sendSMS(number.replace("-", ""), message);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
   
    public Person(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }
    
    public Person(){}
}
