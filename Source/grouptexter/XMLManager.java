package grouptexter;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.applet.Main;

/**
 *
 * @author Eson
 */
public class XMLManager {
    //Path to the xml file
    public static String path;
    
    //Reads all of the people from the xml file
    public static ArrayList<Person> readPeople(){
       ArrayList<Person> newPeople = new ArrayList<Person>();
       
       DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
       
       try{     
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(path);
            
            //Formats the XML file, to avoid problems i.g. multiple line tags
            doc.getDocumentElement().normalize();
            
            NodeList nList = doc.getElementsByTagName("person");
            
            for (int i=0; i < nList.getLength(); i++){
                Node nNode = nList.item(i);
                Node n;
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    
                    Person newPerson = new Person();
                    Element eElement = (Element) nNode;
                    
                    n = eElement.getElementsByTagName("fname").item(0);
                    newPerson.setFirstName(n.getTextContent());
                    
                    n = eElement.getElementsByTagName("lname").item(0);
                    newPerson.setLastName(n.getTextContent());
                    
                    n = eElement.getElementsByTagName("number").item(0);
                    newPerson.setNumber(n.getTextContent());
                    
                    newPeople.add(newPerson);
                }
            }
       }catch(Exception e){
           System.out.println("ERROR: Can't read xml file");
           return newPeople;
       }
       return newPeople;
    }
    
    //Reads all of the groups from the xml file
    public static ArrayList<Group> readGroups(){
        ArrayList<Group> readGroup = new ArrayList<Group>();
        
    }
}
