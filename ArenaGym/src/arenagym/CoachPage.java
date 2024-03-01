
package arenagym;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CoachPage extends javax.swing.JFrame {
Connection con ;
DefaultTableModel DTM;
   
    public CoachPage() {
       initComponents();
         try {
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Field");
        }
         DTM = new  DefaultTableModel();
         DTM.addColumn("Coach Name");
         DTM.addColumn("Coach Phone ");
         DTM.addColumn("Coach Age ");
         DTM.addColumn("Coach Gender");
         member_table();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        coch_name = new javax.swing.JTextField();
        coach_age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        coach_phn = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        dlt_btn = new javax.swing.JButton();
        edt_btn = new javax.swing.JButton();
        female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memb_tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setText("Age");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setText("Coach Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\menna maher\\Downloads\\icons8-exit-24.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 20, 20));

        coch_name.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        coch_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(coch_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 220, -1));

        coach_age.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        coach_age.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        coach_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coach_ageActionPerformed(evt);
            }
        });
        getContentPane().add(coach_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 90, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel4.setText(" Manage Coachs");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        coach_phn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        coach_phn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(coach_phn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 210, -1));

        jPanel4.setBackground(new java.awt.Color(255, 212, 35));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(255, 217, 58));
        jButton3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Materials\\IS FOLDER\\icons8-log-out-32.png")); // NOI18N
        jButton3.setText("LOG OUT ");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 220, 10));
        jButton1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Materials\\IS FOLDER\\icons8-bench-press-32.png")); // NOI18N
        jButton1.setText("MEMBERS");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 228, 51));
        jButton2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Materials\\IS FOLDER\\icons8-financing-32.png")); // NOI18N
        jButton2.setText("FINANCE");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\menna maher\\Downloads\\icons8-coach-100.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(87, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(jButton1)
                .addGap(104, 104, 104)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        add_btn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        add_btn.setText("ADD");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        dlt_btn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        dlt_btn.setText("DELET");
        dlt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlt_btnActionPerformed(evt);
            }
        });

        edt_btn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        edt_btn.setText("UPDATE");
        edt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_btnActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        female.setText("Female");

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Male.setText("Male");
        Male.setToolTipText("");

        memb_tbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        memb_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        memb_tbl.setRowHeight(25);
        memb_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memb_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(memb_tbl);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Coaches LIST");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setText("Gender");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(add_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dlt_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(edt_btn)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Male)
                    .addComponent(female))
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(female)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Male)
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlt_btn)
                    .addComponent(edt_btn)
                    .addComponent(add_btn))
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 790, 640));

        setSize(new java.awt.Dimension(1031, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void coach_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coach_ageActionPerformed

    }//GEN-LAST:event_coach_ageActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new LoginPAge().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new ManagePAge().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new FinancePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do You Want To Exit ?","Select ",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO Coaches (Coach_Name, Phone_Number, Age, Gender) VALUES (?, ?, ?, ?)";
        if(!coch_name.getText().isEmpty()&&!coach_phn.getText().isEmpty()){
            String mem_name=coch_name.getText();
            String Mem_phone = coach_phn.getText();
            String mem_age = coach_age.getText();
            String gender;
            if(Male.isSelected()){
            gender="Male";}else{
            gender="Female";}
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, mem_name);
            stmt.setString(2, Mem_phone);
            stmt.setString(3, mem_age);
          
            stmt.setString(4, gender);
         
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Row added successfully.");
                JOptionPane.showMessageDialog(this, "Member Saved");
                DTM.addRow(new Object[]{mem_name, Mem_phone, mem_age, gender});
                memb_tbl.setModel(DTM);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } else if (coch_name.getText().isEmpty() || coach_phn.getText().isEmpty() || coach_age.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Missing Information");
    }
    }//GEN-LAST:event_add_btnActionPerformed

    private void dlt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlt_btnActionPerformed

         int a = JOptionPane.showConfirmDialog(null,"Do You Want To delete ?","Select ",JOptionPane.YES_NO_OPTION);
    if(a==0){
        String sql = "DELETE FROM Coaches WHERE Coach_Name = ? AND Phone_Number = ?";
        if(!coch_name.getText().isEmpty() && !coach_phn.getText().isEmpty()){
            String mem_name = coch_name.getText();
            String Mem_phone = coach_phn.getText();

            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, mem_name);
                stmt.setString(2, Mem_phone);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Row deleted successfully.");
                    JOptionPane.showMessageDialog(this, "Member Deleted");
                    DefaultTableModel model = (DefaultTableModel) memb_tbl.getModel();
                    model.setRowCount(0);
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Coaches");
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString("Coach_Name"), rs.getString("Phone_Number"), rs.getInt("Age"),  rs.getString("Gender")});
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (coch_name.getText().isEmpty() || coach_phn.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
    }
}


private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {                                        
    String sql = "DELETE FROM Coaches WHERE Coach_Name = ? AND Phone_Number = ?";
    if(!coch_name.getText().isEmpty() && !coach_phn.getText().isEmpty()){
        String mem_name = coch_name.getText();
        String Mem_phone = coach_phn.getText();

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(2, mem_name);
            stmt.setString(3, Mem_phone);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Row deleted successfully.");
                JOptionPane.showMessageDialog(this, "Coach Deleted");
                DTM.removeRow(memb_tbl.getSelectedRow());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } else if (coch_name.getText().isEmpty() || coach_phn.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Missing Information");
    }
    }//GEN-LAST:event_dlt_btnActionPerformed

    private void memb_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memb_tblMouseClicked
        // TODO add your handling code here:
          Object cochName = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 0);
    Object coachPhn = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 1);
    Object coachAge = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 2);
    Object gender = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 3);

    if (cochName != null) {
        coch_name.setText((String) cochName);
    }
    if (coachPhn != null) {
        coach_phn.setText((String) coachPhn);
    }
    if (coachAge != null) {
        coach_age.setText(coachAge.toString());
    }
    if (gender != null) {
        if (gender.toString().equals("Female")) {
            female.setSelected(true);
        } else {
            Male.setSelected(true);
        }
    }

    }//GEN-LAST:event_memb_tblMouseClicked

    private void edt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_btnActionPerformed
        // TODO add your handling code here:
         String sql = "UPDATE Coaches SET Coach_Name = ?, Phone_Number = ?, Age = ?, Gender = ? ";
    if(!coch_name.getText().isEmpty() && !coach_phn.getText().isEmpty()){
        String mem_name = coch_name.getText();
        String Mem_phone = coach_phn.getText();
        String mem_age = coach_age.getText();
        String gender;
        if(Male.isSelected()){
            gender = "Male";
        } else {
            gender = "Female";
        }
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, mem_name);
            stmt.setString(2, Mem_phone);
            stmt.setString(3, mem_age);
            stmt.setString(4, gender);
       

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Row updated successfully.");
                JOptionPane.showMessageDialog(this, "Member Updated");

                // Update the row in the table
                int selectedRow = memb_tbl.getSelectedRow();
                DTM.setValueAt(mem_name, selectedRow, 0);
                DTM.setValueAt(Mem_phone, selectedRow, 1);
                DTM.setValueAt(mem_age, selectedRow, 2);
                DTM.setValueAt(gender, selectedRow, 3);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } else if (coch_name.getText().isEmpty() || coach_phn.getText().isEmpty() || coach_age.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Missing Information");
    }
    }//GEN-LAST:event_edt_btnActionPerformed
    
     private void member_table(){
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "root");
        DTM.setRowCount(0);
        PreparedStatement Stmt=con.prepareStatement("select coach_Name,Phone_Number,Age,Gender from coaches");
        ResultSet rs =Stmt.executeQuery();
        while(rs.next()){
        DTM.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4)});
        }
        memb_tbl.setModel(DTM);
    } catch (SQLException ex) {
        Logger.getLogger(ManagePAge.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(CoachPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoachPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoachPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoachPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoachPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton add_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField coach_age;
    private javax.swing.JTextField coach_phn;
    private javax.swing.JTextField coch_name;
    private javax.swing.JButton dlt_btn;
    private javax.swing.JButton edt_btn;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable memb_tbl;
    // End of variables declaration//GEN-END:variables
}