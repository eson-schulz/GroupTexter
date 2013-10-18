package grouptexter;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Eson
 */
public class XMLManager {
    //Path to the xml file
    public static String path;
    
    //Reads all of the people from the xml file
    public static ArrayList<Person> readPeople(){
       ArrayList<Person> newPeople = new ArrayList<>();
       
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
    
    //Takes in the list of people, and returns a list of groups read from the xml file
    public static ArrayList<Group> readGroups(ArrayList<Person> people){
        ArrayList<Group> newGroups = new ArrayList<>();
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
       
       try{     
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(path);
            
            //Formats the XML file, to avoid problems i.g. multiple line tags
            doc.getDocumentElement().normalize();
            
            NodeList nList = doc.getElementsByTagName("group");
            
            for (int i=0; i < nList.getLength(); i++){
                Node nNode = nList.item(i);
                Node n;
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Group g = new Group();
                    Element eElement = (Element) nNode;
                    
                    n = eElement.getElementsByTagName("name").item(0);
                    g.setName(n.getTextContent());
                    
                    NodeList nGroups = eElement.getElementsByTagName("member");
                    for(int k=0; nGroups.item(k) != null; k++){
                        
                        g.addPerson(convertPerson(people, nGroups.item(k).getTextContent()));
                    }
                    
                    newGroups.add(g);
                }
            }
            
       }catch(Exception e){
           System.out.println("ERROR: Can't read xml file");
           return newGroups;
       }
       return newGroups;
    }
    
    //Converts a person from "Bob Smith" to the class which has the fname Bob, lname Smith
    private static Person convertPerson(ArrayList<Person> people, String name){
        String[] sepName = name.split(" ");
        String fName = sepName[0];
        String lName = sepName[1];
        
        for(Person p : people){
            if(p.getFirstName().equals(fName) && p.getLastName().equals(lName)){
                return p;
            }
        }
        throw new Error("Not valid Person " + fName + " " + lName);
    }
    
}
