
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muzam
 */
public class Staff_details extends javax.swing.JFrame {

    /**
     * Creates new form Staff_details
     */
    Connection conn = null;
    OraclePreparedStatement pst =null;
    OracleResultSet rs=null;
    public Staff_details() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        clas = new javax.swing.JComboBox<>();
        sec = new javax.swing.JComboBox<>();
        regstr = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        feed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("STAFF ID     :");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 229, 100, 44));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText(" NAME         :");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 159, -1, 44));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText(" CLASS         :");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 316, 100, 44));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("SECTION      :");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 100, 44));

        txtid.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 231, 156, 41));

        txtname.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 161, 156, 41));

        clas.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        clas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ISE", "ECE", "EEE" }));
        getContentPane().add(clas, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 318, 156, 41));

        sec.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        getContentPane().add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 395, 156, 39));

        regstr.setBackground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));
        regstr.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        regstr.setForeground(new java.awt.Color(0, 153, 0));
        regstr.setText("ADD");
        regstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regstrActionPerformed(evt);
            }
        });
        getContentPane().add(regstr, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 502, 140, 58));

        jTextField4.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jTextField4.setText("STAFF DETAILS");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 66, -1, 59));

        jTable1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "STAFF ID", "CLASS", "SECTION"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 0));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 159, 471, 250));

        feed.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        feed.setForeground(new java.awt.Color(0, 0, 204));
        feed.setText("SAVE");
        feed.setOpaque(false);
        feed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedActionPerformed(evt);
            }
        });
        getContentPane().add(feed, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 505, 116, 58));

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton1.setForeground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 105, 57));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 120, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void regstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regstrActionPerformed
        // TODO add your handling code here:
        
        //code to load data to the table and check the validation if any field is empty 
        if(txtname.getText().equals("") || txtid.getText().equals("") || clas.getSelectedItem().toString().equals("") || sec.getSelectedItem().toString().equals(""))
        {// if any of the field is empty then show its error
        JOptionPane.showMessageDialog(this, "Please enter all the fields");
        }
        else 
        {
         //if all fields are entered then insert into the table
         // we are creating an array and storing the data in tehe array later it wll be added in to the table   
         String data []= {txtname.getText(), txtid.getText(), clas.getSelectedItem().toString(), sec.getSelectedItem().toString() };
         DefaultTableModel tblmdl = (DefaultTableModel) jTable1.getModel();
         tblmdl.addRow(data);
         // data added to the table succesfully
         
         JOptionPane.showMessageDialog(this, "Added data succesfully!!");
         
         txtname.setText("");
         txtid.setText("");
       
        }
        
    }//GEN-LAST:event_regstrActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void feedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedActionPerformed
        // TODO add your handling code here this is for adding the data to backend:
        DefaultTableModel tblmdl = (DefaultTableModel) jTable1.getModel();
        // check if the rows are empty
        if(tblmdl.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this," Table is empty");
        }
        else // if not then insert the values of table to backend
        {
            String name,id,cles,sect;
            try
            {
                conn = JavaconnectDb.ConnecrDb() ;
                for(int i =0; i< tblmdl.getRowCount(); i++)
                {
                    name =tblmdl.getValueAt(i, 0).toString();
                    id =tblmdl.getValueAt(i, 1).toString();
                    cles =tblmdl.getValueAt(i, 2).toString();
                    sect =tblmdl.getValueAt(i, 3).toString();
                    
                    //now insert query 
                    String query = "insert into STAFF_DETAILS(SNAME, SID, CLASS, SECTION) VALUES(?,?,?,?)";
                    //PREPARED STATEMENT INSERTION
                    PreparedStatement pst = conn.prepareStatement(query);
                    pst.setString(1,name);
                    pst.setString(2,id);
                    pst.setString(3, cles);
                    pst.setString(4,sect);
                    pst.execute();
                }
                
                JOptionPane.showMessageDialog(this, "Data inserted succesfully");
                
                //
                tblmdl.setRowCount(0);
            }
            catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
        }    
        
        
        
        
    }//GEN-LAST:event_feedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here this is for adding the data to backend:
        DefaultTableModel tblmdl = (DefaultTableModel) jTable1.getModel();
        // check if the rows are empty
        if(tblmdl.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this," Table is empty");
        }
        else // if not then insert the values of table to backend
        {
            tblmdl.setRowCount(0);
            JOptionPane.showMessageDialog(null," Table cleared succesfully !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Staff_details().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> clas;
    private javax.swing.JButton feed;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton regstr;
    private javax.swing.JComboBox<String> sec;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
