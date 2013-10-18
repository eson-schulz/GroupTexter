package grouptexter;

import com.techventus.server.voice.Voice;
import java.io.IOException;

/**
 *
 * @author Eson
 */
public class Person {
    private String firstName;
    private String lastName;
    private String number;
    private boolean hasBeenTexted;

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
            GoogleVoice.voice.sendSMS(number, message);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
   
    public Person(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.hasBeenTexted = false;
    }
    
    public Person(){
        
    }
}
