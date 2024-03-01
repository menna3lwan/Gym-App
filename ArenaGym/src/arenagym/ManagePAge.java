
package arenagym;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagePAge extends javax.swing.JFrame {
Connection con;
DefaultTableModel DTM;
ArrayList<Integer>Member_Ids=new ArrayList<>();

    public ManagePAge() {
        initComponents();
         try {
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Field");
        }
         DTM = new  DefaultTableModel();
         DTM.addColumn("Member Name");
         DTM.addColumn("Member Phone ");
         DTM.addColumn("Member Age ");
         DTM.addColumn("Member’s Coach");
          DTM.addColumn("Member Gender");
         DTM.addColumn("Members’ Time");
         fillComboBoxCoach();
         fillComboBoxTime();
         member_table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Mem_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Mem_phn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Mem_age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dlt_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        memb_tbl = new javax.swing.JTable();
        time_cbox = new javax.swing.JComboBox<>();
        Coach_cbox = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        update_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 207, 54));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 220, 53));
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

        jButton3.setBackground(new java.awt.Color(255, 219, 46));
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

        jButton4.setBackground(new java.awt.Color(255, 221, 35));
        jButton4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Materials\\IS FOLDER\\icons8-treadmill-th.png")); // NOI18N
        jButton4.setText("COACHES");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Materials\\IS FOLDER\\icons8-stepper-skin-type-2-100.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(116, 116, 116)
                .addComponent(jButton4)
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Member LIST");

        Mem_name.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Mem_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setText("Manage Members");

        Mem_phn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Mem_phn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("Phone Number");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setText("Age");

        Mem_age.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Mem_age.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("Coach");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setText("Gender");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel11.setText("Timing");

        dlt_btn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        dlt_btn.setText("DELET");
        dlt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlt_btnActionPerformed(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        add_btn.setText("ADD");
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setText("Member Name");

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

        time_cbox.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        time_cbox.setBorder(null);

        Coach_cbox.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        Coach_cbox.setBorder(null);
        Coach_cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Coach_cboxActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\menna maher\\Downloads\\icons8-exit-24.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        female.setText("Female");

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Male.setText("Male");
        Male.setToolTipText("");

        update_btn.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        update_btn.setText("UPDATE");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mem_name, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8))
                            .addComponent(Coach_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_btn))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dlt_btn)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9)
                                        .addComponent(Mem_phn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(137, 137, 137)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Mem_age, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel11)
                                        .addComponent(time_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel2)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(289, 289, 289)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(add_btn)
                                .addGap(392, 392, 392)))))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(304, 304, 304)
                    .addComponent(Male, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(422, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mem_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mem_phn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mem_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Coach_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(female)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_btn)
                            .addComponent(dlt_btn)
                            .addComponent(update_btn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(261, 261, 261)
                    .addComponent(Male)
                    .addContainerGap(353, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 0, 830, -1));

        setSize(new java.awt.Dimension(991, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   private void fillComboBoxCoach(){
    try {
        DTM.setRowCount(0);
        PreparedStatement Stmt=con.prepareStatement("select memberId,coach_name from members");
        ResultSet rs = Stmt.executeQuery();
        while(rs.next()){
            Member_Ids.add(rs.getInt(1));
            String coachName = rs.getString(2);
            if (!isInComboBox(Coach_cbox, coachName)) {
                Coach_cbox.addItem(coachName);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(ManagePAge.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private void fillComboBoxTime(){
    try {
        DTM.setRowCount(0);
        PreparedStatement Stmt=con.prepareStatement("select memberId,Timing from members");
        ResultSet rs = Stmt.executeQuery();
        while(rs.next()){
            Member_Ids.add(rs.getInt(1));
            String timing = rs.getString(2);
            if (!isInComboBox(time_cbox, timing)) {
                time_cbox.addItem(timing);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(ManagePAge.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private boolean isInComboBox(JComboBox comboBox, String value) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        Object item = comboBox.getItemAt(i);
        if (item instanceof String str) {
            if (str.equals(value)) {
                return true;
            }
        }
    }
    return false;
}

   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new FinancePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new LoginPAge().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new CoachPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void dlt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlt_btnActionPerformed
      int a = JOptionPane.showConfirmDialog(null,"Do You Want To delet ?","Select ",JOptionPane.YES_NO_OPTION);
        if(a==0){
        String sql = "DELETE FROM Members WHERE member_Name = ? AND PhoneNumber = ?";
        if(!Mem_name.getText().isEmpty() && !Mem_phn.getText().isEmpty()){
        String mem_name = Mem_name.getText();
         String Mem_phone = Mem_phn.getText();

    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setString(1, mem_name);
        stmt.setString(2, Mem_phone);

        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Row deleted successfully.");
            JOptionPane.showMessageDialog(this, "Member Deleted");

            DefaultTableModel model = (DefaultTableModel) memb_tbl.getModel();
            model.setRowCount(0);

            // Re-query the database and remove rows from the table
            ResultSet rs = stmt.executeQuery("SELECT * FROM members");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("member_Name"), rs.getString("PhoneNumber"), rs.getInt("Age"), rs.getString("coach_name"), rs.getString("Gender"), rs.getString("Timing")});
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }}
} else if (Mem_name.getText().isEmpty() || Mem_phn.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Missing Information");
}
    }//GEN-LAST:event_dlt_btnActionPerformed

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_add_btnMouseClicked

    private void member_table(){
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "root");
        DTM.setRowCount(0);
        PreparedStatement Stmt=con.prepareStatement("SELECT * FROM members");
        ResultSet rs =Stmt.executeQuery();
        while(rs.next()){
        DTM.addRow(new Object[]{rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
        }
        memb_tbl.setModel(DTM);
    } catch (SQLException ex) {
        Logger.getLogger(ManagePAge.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 /////////////////////////////////////////////////////////////////////////////
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
     String sql = "INSERT INTO Members (member_Name, PhoneNumber, Age, coach_name, Gender, Timing) VALUES (?, ?, ?, ?, ?, ?)";
        if(!Mem_name.getText().isEmpty()&&!Mem_phn.getText().isEmpty()){
        String mem_name=Mem_name.getText();
        String Mem_phone = Mem_phn.getText();
        int mem_age = Integer.parseInt(Mem_age.getText());
        String gender;
        if(Male.isSelected()){
        gender = "Male";
        }else {
        gender = "Female";
        }
        String Coaches =Coach_cbox.getSelectedItem().toString();
        String Time = time_cbox.getSelectedItem().toString();
         try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, mem_name);
            stmt.setString(2, Mem_phone);
            stmt.setInt(3, mem_age);
            stmt.setString(4, Coaches);
            stmt.setString(5, gender);
            stmt.setString(6, Time);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Row added successfully.");
                JOptionPane.showMessageDialog(this, "Member Saved");
                  DefaultTableModel model = (DefaultTableModel) memb_tbl.getModel();
    model.setRowCount(0);

    // Re-query the database and add rows back to the table
    ResultSet rs = stmt.executeQuery("SELECT * FROM members");
    while (rs.next()) {
        model.addRow(new Object[]{rs.getString("member_Name"), rs.getString("PhoneNumber"), rs.getInt("Age"), rs.getString("coach_name"), rs.getString("Gender"), rs.getString("Timing")});
    }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
           /* try {
                PreparedStatement Stmt=con.prepareStatement("insert into members (member_Name,PhoneNumber,Age,coach_name,Gender,Timing )values (?,?,?,?,?,?)");
               Stmt.setString(1, mem_name);
                Stmt.setString(2, Mem_phone);
                 Stmt.setInt(3, mem_age);
                  Stmt.setString(4, Coaches);
                   Stmt.setString(5, gender);
                    Stmt.setString(6, Time);
            Stmt.executeQuery();
            JOptionPane.showMessageDialog(this, "Member Saved");
            } catch (SQLException ex) {
                Logger.getLogger(ManagePAge.class.getName()).log(Level.SEVERE, null, ex);
            }*/
       
    }//GEN-LAST:event_add_btnActionPerformed
        else if (Mem_name.getText().isEmpty()||Mem_phn.getText().isEmpty()||Mem_age.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information ");
        }
    
    }
    
    private void Coach_cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Coach_cboxActionPerformed
    }//GEN-LAST:event_Coach_cboxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do You Want To Exit ?","Select ",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
 String sql = "UPDATE members SET member_Name=?, PhoneNumber=?, Age=?, coach_name=?, Gender=?, Timing=? WHERE memberId=?";
 if(!Mem_name.getText().isEmpty()&&!Mem_phn.getText().isEmpty()){
        String mem_name=Mem_name.getText();
        String Mem_phone = Mem_phn.getText();
        int mem_age = Integer.parseInt(Mem_age.getText());
        String gender;
        if(Male.isSelected()){
        gender = "Male";
        }else {
        gender = "Female";
        }
        String Coaches =Coach_cbox.getSelectedItem().toString();
        String Time = time_cbox.getSelectedItem().toString();
         try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, mem_name);
            stmt.setString(2, Mem_phone);
            stmt.setInt(3, mem_age);
            stmt.setString(4, Coaches);
            stmt.setString(5, gender);
            stmt.setString(6, Time);
            stmt.setInt(7,Member_Ids.get(memb_tbl.getSelectedRow()));

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Row added successfully.");
    JOptionPane.showMessageDialog(this, "Updated successfully");
//executeQuery , executeUpdate
    // Clear the table
    DefaultTableModel model = (DefaultTableModel) memb_tbl.getModel();
    model.setRowCount(0);

    // Re-query the database and add rows back to the table
    ResultSet rs = stmt.executeQuery("SELECT * FROM members");
    while (rs.next()) {
        model.addRow(new Object[]{rs.getString("member_Name"), rs.getString("PhoneNumber"), rs.getInt("Age"), rs.getString("coach_name"), rs.getString("Gender"), rs.getString("Timing")});
    }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
           /* try {
                PreparedStatement Stmt=con.prepareStatement("insert into members (member_Name,PhoneNumber,Age,coach_name,Gender,Timing )values (?,?,?,?,?,?)");
               Stmt.setString(1, mem_name);
                Stmt.setString(2, Mem_phone);
                 Stmt.setInt(3, mem_age);
                  Stmt.setString(4, Coaches);
                   Stmt.setString(5, gender);
                    Stmt.setString(6, Time);
            Stmt.executeQuery();
            JOptionPane.showMessageDialog(this, "Member Saved");
            } catch (SQLException ex) {
                Logger.getLogger(ManagePAge.class.getName()).log(Level.SEVERE, null, ex);
            }*/
       
    }                                       
        else if (Mem_name.getText().isEmpty()||Mem_phn.getText().isEmpty()||Mem_age.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information ");
        }
    
        
        
    }//GEN-LAST:event_update_btnActionPerformed

    private void memb_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memb_tblMouseClicked
        // TODO add your handling code here:

 Object memName = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 0);
    Object memPhn = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 1);
    Object memAge = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 2);
    Object gender = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 4);
    Object coach = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 3);
    Object time = memb_tbl.getValueAt(memb_tbl.getSelectedRow(), 5);

    if (memName != null) {
        Mem_name.setText((String) memName);
    }
    if (memPhn != null) {
        Mem_phn.setText((String) memPhn);
    }
    if (memAge != null) {
        Mem_age.setText(memAge.toString());
    }
    if (gender != null) {
        if (gender.toString().equals("Female")) {
            female.setSelected(true);
        } else {
            Male.setSelected(true);
        }
    }
    if (coach != null) {
        Coach_cbox.setSelectedItem(coach);
    }
    if (time != null) {
        time_cbox.setSelectedItem(time);
    }
      
    }//GEN-LAST:event_memb_tblMouseClicked

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
            java.util.logging.Logger.getLogger(ManagePAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManagePAge().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Coach_cbox;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField Mem_age;
    private javax.swing.JTextField Mem_name;
    private javax.swing.JTextField Mem_phn;
    private javax.swing.JButton add_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dlt_btn;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable memb_tbl;
    private javax.swing.JComboBox<String> time_cbox;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
