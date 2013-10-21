/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptexter;

import java.util.ArrayList;

/**
 *
 * @author Eson
 */
public class Texter extends javax.swing.JFrame {

    /**
     * Creates new form Texter
     */
    public Texter(ArrayList<Group> g, ArrayList<Person> p) {
        groups = g;
        people = p;
        initComponents();
        groupSelection = new MultiListBox(groups);
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        toButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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

        toButton.setText("To");
        toButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(toButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton)
                    .addComponent(toButton)
                    .addComponent(errorLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toButtonActionPerformed
        groupSelection.setVisible(true);
    }//GEN-LAST:event_toButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        ArrayList<String> selectedGroupsNames = groupSelection.getSecondNotificationList();
        
        //Convert all the groups from strings to Groups
        ArrayList<Group> selectedGroups = new ArrayList<>();
        for(String s : selectedGroupsNames){
            for(Group g : groups){
                if(g.getName().equals(s)){
                    selectedGroups.add(g);
                    break;
                }
            }
        }
        
        if(selectedGroups.isEmpty()){
            errorLabel.setText("Select Groups");
        }
        else if(jTextArea1.getText().equals("")){
            errorLabel.setText("Enter Text");
        }
        else{
            boolean sentText;
            ArrayList<Person> sentList = new ArrayList<Person>();
            String message = jTextArea1.getText();
            for(Group g : selectedGroups){
                System.out.println("Sending text to: " + g.getName());
                for(Person p : g.getPeople()){
                    if(! sentList.contains(p)){
                        sentText = p.text(message);
                        if(! sentText){
                          errorLabel.setText("Error");
                          return;
                        }
                        sentList.add(p);
                    }
                    else{
                        System.out.println("Not sending to: " + p.getFullName());
                    }
                }
            }
            this.dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private ArrayList<Group> groups;
    private ArrayList<Person> people;
    private MultiListBox groupSelection;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton okButton;
    private javax.swing.JButton toButton;
    // End of variables declaration//GEN-END:variables
}
