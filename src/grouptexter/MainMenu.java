/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptexter;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Eson
 */
public class MainMenu extends javax.swing.JFrame{

    public MainMenu() {
        initComponents();
        loadXML();
        updateTables();
        addListeners();
        
        //Creates a new google voice
        GoogleVoice.createVoice();
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
        jMenu3 = new javax.swing.JMenu();
        textMenuItem = new javax.swing.JMenuItem();
        newGroupMenuItem = new javax.swing.JMenuItem();
        newPersonMenuItem = new javax.swing.JMenuItem();
        updateMenuItem = new javax.swing.JMenuItem();
        closeMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        deleteGroupMenuItem = new javax.swing.JMenuItem();
        deletePersonMenuItem = new javax.swing.JMenuItem();
        groupMenuItem = new javax.swing.JMenuItem();
        personMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Sender");
        setBounds(new java.awt.Rectangle(100, 50, 0, 0));
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

        jMenu3.setText("New");

        textMenuItem.setText("Text");
        textMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(textMenuItem);

        newGroupMenuItem.setText("Group");
        newGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGroupMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(newGroupMenuItem);

        newPersonMenuItem.setText("Person");
        newPersonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(newPersonMenuItem);

        jMenu1.add(jMenu3);

        updateMenuItem.setText("Update");
        updateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(updateMenuItem);

        closeMenuItem.setText("Close");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(closeMenuItem);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu4.setText("Delete");

        deleteGroupMenuItem.setText("Group");
        deleteGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(deleteGroupMenuItem);

        deletePersonMenuItem.setText("Person");
        deletePersonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(deletePersonMenuItem);

        jMenu2.add(jMenu4);

        groupMenuItem.setText("Group");
        groupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(groupMenuItem);

        personMenuItem.setText("Person");
        personMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(personMenuItem);

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
                    .addGroup(layout.createSequentialGroup()
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
            errorLabel.setText("");
            SingleTexter texter = new SingleTexter(people.get(selectedRow));
            texter.setBounds(this.getX() + 50, this.getY() + 50, texter.getWidth(), texter.getHeight());
        }
    }//GEN-LAST:event_textPersonButtonActionPerformed

    private void textGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGroupButtonActionPerformed
        int selectedRow = groupsTable.getSelectedRow();
        if(selectedRow == -1 || selectedRow > groups.size() -1){
            errorLabel.setText("Select A Group");
        }
        else{
            errorLabel.setText("");
            SingleTexter texter = new SingleTexter(groups.get(selectedRow));
            texter.setBounds(this.getX() + 50, this.getY() + 50, texter.getWidth(), texter.getHeight());
        }
    }//GEN-LAST:event_textGroupButtonActionPerformed

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeMenuItemActionPerformed

    private void textMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMenuItemActionPerformed
        Texter texter = new Texter(groups, people);
        texter.setBounds(this.getX() + 50, this.getY() + 50, texter.getWidth(), texter.getHeight());
    }//GEN-LAST:event_textMenuItemActionPerformed

    private void newGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGroupMenuItemActionPerformed
        GroupCreator creator = new GroupCreator(people, groups);
        creator.setBounds(this.getX() + 50, this.getY() + 50, creator.getWidth(), creator.getHeight());
    }//GEN-LAST:event_newGroupMenuItemActionPerformed

    private void updateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuItemActionPerformed
        loadXML();
        updateTables();
    }//GEN-LAST:event_updateMenuItemActionPerformed

    private void newPersonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonMenuItemActionPerformed
        PersonCreator creator = new PersonCreator(people);
        creator.setBounds(this.getX() + 50, this.getY() + 50, creator.getWidth(), creator.getHeight());
    }//GEN-LAST:event_newPersonMenuItemActionPerformed

    private void personMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personMenuItemActionPerformed
        if(peopleTable.getSelectedRow() < people.size() && peopleTable.getSelectedRow() != -1){
            errorLabel.setText("");
            PersonCreator creator = new PersonCreator(people, people.get(peopleTable.getSelectedRow()));
            creator.setBounds(this.getX() + 50, this.getY() + 50, creator.getWidth(), creator.getHeight());
        }
        else{
            errorLabel.setText("Select A Person");
        }
    }//GEN-LAST:event_personMenuItemActionPerformed

    private void groupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupMenuItemActionPerformed
        if(groupsTable.getSelectedRow() < groups.size() && groupsTable.getSelectedRow() != -1){
            errorLabel.setText("");
            GroupCreator creator = new GroupCreator(people, groups, groups.get(groupsTable.getSelectedRow()));
            creator.setBounds(this.getX() + 50, this.getY() + 50, creator.getWidth(), creator.getHeight());
        }
        else{
            errorLabel.setText("Select A Group");
        }
    }//GEN-LAST:event_groupMenuItemActionPerformed

    private void deleteGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGroupMenuItemActionPerformed
        int selectedRow = groupsTable.getSelectedRow();
        if(selectedRow == -1 || selectedRow > groups.size() -1){
            errorLabel.setText("Select A Group");
        }
        else{
            errorLabel.setText("");
            DeleteNotification deletor = new DeleteNotification(groups.get(selectedRow));
            deletor.setBounds(this.getX() + 50, this.getY() + 50, deletor.getWidth(), deletor.getHeight());
        }
    }//GEN-LAST:event_deleteGroupMenuItemActionPerformed

    private void deletePersonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonMenuItemActionPerformed
        int selectedRow = peopleTable.getSelectedRow();
        if(selectedRow == -1 || selectedRow > people.size() -1){
            errorLabel.setText("Select A Group");
        }
        else{
            errorLabel.setText("");
            DeleteNotification deletor = new DeleteNotification(people.get(selectedRow));
            deletor.setBounds(this.getX() + 50, this.getY() + 50, deletor.getWidth(), deletor.getHeight());
        }
    }//GEN-LAST:event_deletePersonMenuItemActionPerformed

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
            XMLManager.createXML();
            people = new ArrayList<>();
            groups = new ArrayList<>();
        }
    }
    
    //Inserts the information into the tables
    private void updateTables(){
        DefaultTableModel dm = (DefaultTableModel)peopleTable.getModel();
        dm.setRowCount(people.size());
        
        DefaultTableModel dm2 = (DefaultTableModel)groupsTable.getModel();
        dm2.setRowCount(groups.size());
        
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
    private void addListeners(){
        groupsTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    examineSelectedItem();
                }
            }
        });
        
        //Add a window listener to update when this comes back into focus
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                loadXML();
                updateTables();
                System.out.println("Focus!");
    }
});
    }
    
    private void examineSelectedItem(){
        int selectedRow = groupsTable.getSelectedRow();
        
        if(selectedRow != -1 && selectedRow < groups.size()){
            GroupInfo info = new GroupInfo(groups.get(selectedRow));
            info.setBounds(this.getX() + 50, this.getY() + 50, info.getWidth(), info.getHeight());
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
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JMenuItem deleteGroupMenuItem;
    private javax.swing.JMenuItem deletePersonMenuItem;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JMenuItem groupMenuItem;
    private javax.swing.JTable groupsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem newGroupMenuItem;
    private javax.swing.JMenuItem newPersonMenuItem;
    private javax.swing.JTable peopleTable;
    private javax.swing.JMenuItem personMenuItem;
    private javax.swing.JButton textGroupButton;
    private javax.swing.JMenuItem textMenuItem;
    private javax.swing.JButton textPersonButton;
    private javax.swing.JMenuItem updateMenuItem;
    // End of variables declaration//GEN-END:variables
}
