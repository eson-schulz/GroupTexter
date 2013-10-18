/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptexter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Eson
 */
public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        loadXML();
        updateTables();
        addMouseListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        peopleTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        groupsTable = new javax.swing.JTable();
        textPersonButton = new javax.swing.JButton();
        textGroupButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("People");

        jLabel2.setText("Groups");

        peopleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(peopleTable);

        groupsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Members"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(groupsTable);
        groupsTable.getColumnModel().getColumn(1).setPreferredWidth(210);

        textPersonButton.setText("Text Person");
        textPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPersonButtonActionPerformed(evt);
            }
        });

        textGroupButton.setText("Text Group");
        textGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGroupButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        jMenu1.setText("File");
        jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textGroupButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPersonButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPersonButton)
                            .addComponent(textGroupButton)
                            .addComponent(errorLabel))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPersonButtonActionPerformed
        int selectedRow = peopleTable.getSelectedRow();
        if(selectedRow == -1 || selectedRow > people.size() -1){
            errorLabel.setText("Select A User");
        }
        else{
            new SingleTexter(people.get(selectedRow));
        }
    }//GEN-LAST:event_textPersonButtonActionPerformed

    private void textGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGroupButtonActionPerformed
        int selectedRow = groupsTable.getSelectedRow();
        if(selectedRow == -1 || selectedRow > groups.size() -1){
            errorLabel.setText("Select A Group");
        }
        else{
            new SingleTexter(groups.get(selectedRow));
        }
    }//GEN-LAST:event_textGroupButtonActionPerformed

    //Loads the list of people and groups from the XML
    private void loadXML(){
        XMLManager.path = "people.xml";
        
        if(new File(XMLManager.path).isFile()){
            System.out.println("Found XML, reading.");
            people = XMLManager.readPeople();
            groups = XMLManager.readGroups(people);
        }
        else{
            System.out.println("Couldn't find XML, creating.");
            createXML();
            people = new ArrayList<>();
            groups = new ArrayList<>();
        }
    }
    
    //If there is not already a XML created, create a new one only with base Element people
    private void createXML(){
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("people");
            doc.appendChild(rootElement);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(XMLManager.path));

            transformer.transform(source, result);
            
        } catch (Exception e) {
            System.out.println("ERROR: Can't create xml file");
        }
    }
    
    //Inserts the information into the tables
    private void updateTables(){
 
        if(! people.isEmpty()){
             for(int i=0; i < people.size(); i++){
                 Person p = people.get(i);
                 peopleTable.setValueAt(p.getFirstName(), i, 0);
                 peopleTable.setValueAt(p.getLastName(), i, 1);
                 peopleTable.setValueAt(p.getNumber(), i, 2);
             }
        }
        if(! groups.isEmpty()){
            for(int i=0; i < groups.size(); i++){
                 Group g = groups.get(i);
                 groupsTable.setValueAt(g.getName(), i, 0);
                 
                 String names = "";
                 for(Person person : g.getPeople()){
                     names += person.getFirstName() + " " + person.getLastName();
                     names += ", ";
                 }
                 
                 groupsTable.setValueAt(names.substring(0, names.length() - 2), i, 1);
             }
        }
    }
    
    //A mouse listener to open up a menu of members who are in the specified group
    private void addMouseListeners(){
        groupsTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    examineSelectedItem();
                }
            }
        });
    }
    
    private void examineSelectedItem(){
        int selectedRow = groupsTable.getSelectedRow();
        
        if(selectedRow != -1 && selectedRow < groups.size()){
            new GroupInfo(groups.get(selectedRow));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    private ArrayList<Person> people;
    private ArrayList<Group> groups;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTable groupsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable peopleTable;
    private javax.swing.JButton textGroupButton;
    private javax.swing.JButton textPersonButton;
    // End of variables declaration//GEN-END:variables
}
