/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eschulz.pages;

import com.eschulz.data.Group;
import com.eschulz.data.Person;
import com.eschulz.data.XMLManager;
import java.util.ArrayList;

/**
 *
 * @author Eson
 */
public class GroupCreator extends javax.swing.JFrame {

    /**
     * Creates new form GroupCreator
     */
    public GroupCreator(ArrayList<Person> p, ArrayList<Group> groups) {
        isEditing = false;
        this.people = p;
        this.groups = groups;
        
        initComponents();
        
        //Initialize the members box
        multiListBox = new MultiListBox(p, true);
        this.setVisible(true);
        this.setTitle("New Group");
    }
    
    //Constructor for editing a already created group
    public GroupCreator(ArrayList<Person> p, ArrayList<Group> groups, Group group){
        isEditing = true;
        this.people = p;
        this.groups = groups;
        this.group = group;
        
        initComponents();
        
        nameTextField.setText(group.getName());
        
        //Initialize the members box
        multiListBox = new MultiListBox(p, group.getPeople());
        this.setVisible(true);
        this.setTitle("Edit Group");
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
        nameTextField = new javax.swing.JTextField();
        membersButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Group Editor");
        setResizable(false);

        jLabel1.setText("Name");

        membersButton.setText("Members");
        membersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(errorLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nameTextField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(membersButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(okButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton)))
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(errorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(membersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        multiListBox.dispose();
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void membersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersButtonActionPerformed
        multiListBox.setBounds(this.getX() + 50, this.getY() + 50, multiListBox.getWidth(), multiListBox.getHeight());
        multiListBox.setVisible(true);
    }//GEN-LAST:event_membersButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String name = nameTextField.getText();
        
        if(name.isEmpty()){
            errorLabel.setText("Need a Name");
        }
        else if(multiListBox.getSecondNotificationList().isEmpty()){
            errorLabel.setText("Need Members");
        }
        else{
            if(! isEditing){
                for(Group g : groups){
                    //Check to make sure the Group name is not already in use
                    if(g.getName().trim().equals(name.trim())){
                        errorLabel.setText("Name Already Used");
                        return;
                    }
                }
            }
            
            
            Group newGroup = new Group();
            newGroup.setName(nameTextField.getText());
            ArrayList<String> names = multiListBox.getSecondNotificationList();
            
            //Convert all the People from strings to Persons
            ArrayList<Person> selectedPeople = new ArrayList<>();
            
            for(Person p : people){
                System.out.println("Person: " + p.getFullName());
            }
            
            for(String n : names){
                System.out.println("Names: " + n);
            }
            
            for(String n : names){
               for(Person p : people){
                   if(p.getFullName().equals(n)){
                      selectedPeople.add(p);
                      break;
                   }
                }
            }   
            
            newGroup.setPeople(selectedPeople);
            
            if(isEditing){
                //Change the person in the xml file
                boolean worked = XMLManager.editGroup(newGroup, group);
                if(worked){
                    this.dispose();
                }
                else{
                    errorLabel.setText("Can't Write XML");
                }
            }
            else{
                boolean worked = XMLManager.writeGroup(newGroup);
                if(worked){
                    this.dispose();
                }
                else{
                    errorLabel.setText("Can't Write XML");
                }
            }
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private ArrayList<Person> people;
    private ArrayList<Group> groups;
    
    private MultiListBox multiListBox;
    
    private boolean isEditing;
    
    private Group group;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton membersButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
