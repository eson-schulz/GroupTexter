package grouptexter;

import com.techventus.server.voice.Voice;
import java.io.IOException;

//I use an unofficial google-voice api to send the sms
// https://code.google.com/p/google-voice-java/
//Whoever made this is wonderful
public class GoogleVoice {
    public static Voice voice;
    
    public static boolean createVoice(){
        try {
            voice = new Voice("username", "password");
            return true;
        } catch (IOException ex) {
            System.out.println("ERROR: Google Voice");
            return false;
        }
    }
}
