/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author 59160929
 */
public class allRastaurant extends javax.swing.JFrame {

    PreparedStatement ps = null;
    Connection connection = null;
    ResultSet rs = null;
    ArrayList<Restaurant> or = new ArrayList<>();
    allRestaurantService aRS = new allRestaurantService();

    /**
     * Creates new form IndexList
     */
    public allRastaurant() {

        initComponents();
        DefaultTableModel model = (DefaultTableModel) showRestaurantTable.getModel();
        ArrayList<Restaurant> getRestaurant = new ArrayList<Restaurant>();
        getRestaurant = aRS.getData();

        String rw[] = new String[3];

        for (int i = 0; i < getRestaurant.size(); i++) {
            rw[0] = getRestaurant.get(i).getNameRestaurant();
            rw[1] = "" + getRestaurant.get(i).getRating();
            rw[2] = getRestaurant.get(i).getProvince();

            model.addRow(rw);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        comboprovince = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        showRestaurantTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        see_review = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ImJung  Review");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("จังหวัด");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("jLabel1");

        search.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        search.setText("ค้นหา");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        comboprovince.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        comboprovince.setMaximumRowCount(10);
        comboprovince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ร้านทั้งหมด", "กรุงเทพมหานคร", "สมุทรปราการ", "นนทบุรี", "ปทุมธานี", "พระนครศรีอยุธยา", "อ่างทอง", "ลพบุรี", "สิงห์บุรี", "ชัยนาท", "สระบุรี", "ชลบุรี", "ระยอง", "จันทบุรี", "ตราด", "ฉะเชิงเทรา", "ปราจีนบุรี", "นครนายก", "สระแก้ว", "นครราชสีมา", "บุรีรัมย์", "สุรินทร์", "ศรีสะเกษ", "อุบลราชธานี", "ยโสธร", "ชัยภูมิ", "อำนาจเจริญ", "หนองบัวลำภู", "ขอนแก่น", "อุดรธานี", "เลย", "หนองคาย", "มหาสารคาม", "ร้อยเอ็ด", "กาฬสินธุ์", "สกลนคร", "นครพนม", "มุกดาหาร", "เชียงใหม่", "ลำพูน", "ลำปาง", "อุตรดิตถ์", "แพร่", "น่าน", "พะเยา", "เชียงราย", "แม่ฮ่องสอน", "นครสวรรค์", "อุทัยธานี", "กำแพงเพชร", "ตาก", "สุโขทัย", "พิษณุโลก", "พิจิตร", "เพชรบูรณ์", "ราชบุรี", "กาญจนบุรี", "สุพรรณบุรี", "นครปฐม", "สมุทรสาคร", "สมุทรสงคราม", "เพชรบุรี", "ประจวบคีรีขันธ์", "นครศรีธรรมราช", "กระบี่", "พังงา", "ภูเก็ต", "สุราษฎร์ธานี", "ระนอง", "ชุมพร", "สงขลา", "สตูล", "ตรัง", "พัทลุง", "ปัตตานี", "ยะลา", "นราธิวาส", "บึงกาฬ" }));
        comboprovince.setActionCommand("comboprovince");
        comboprovince.setAutoscrolls(true);
        comboprovince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboprovinceActionPerformed(evt);
            }
        });

        showRestaurantTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showRestaurantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rating", "Province"
            }
        ));
        showRestaurantTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                showRestaurantTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        showRestaurantTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showRestaurantTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showRestaurantTable);

        see_review.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        see_review.setText("ดูรีวิว");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(see_review)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboprovince, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(jLabel2)
                    .addComponent(comboprovince, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(see_review)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboprovinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboprovinceActionPerformed


    }//GEN-LAST:event_comboprovinceActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        /*
        try {
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement stmt = connection.createStatement();

            Object province = comboprovince.getSelectedItem();

            System.out.println(comboprovince.getSelectedItem());

            String countfromdatabase = "Select NameRestaurant,rating,Province From Restaurant where Province='" + province + "'";
            rs = stmt.executeQuery(countfromdatabase);
            showRestaurantTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.out.println(ex);
        }*/

        //----------------------
        DefaultTableModel model = (DefaultTableModel) showRestaurantTable.getModel();
        ArrayList<Restaurant> getRestaurant = new ArrayList<Restaurant>();
        getRestaurant = aRS.getData();

        String getByProvince[] = new String[3];
        String rw[] = new String[3];
        boolean t = true;
        for (int i = 0; i < getRestaurant.size(); i++) {
            if (comboprovince.getSelectedItem().equals("ร้านทั้งหมด")) {
                
                rw[0] = getRestaurant.get(i).getNameRestaurant();
                rw[1] = "" + getRestaurant.get(i).getRating();
                rw[2] = getRestaurant.get(i).getProvince();

                model.addRow(rw);

            } else if (comboprovince.getSelectedItem().equals(getRestaurant.get(i).getProvince())) {

                if (t == true) {
                    DefaultTableModel dm = (DefaultTableModel) showRestaurantTable.getModel();
                    while (dm.getRowCount() > 0) {
                        dm.removeRow(0);
                    }
                    t = false;
                    i=0;
                } else {
                    
                    getByProvince[0] = getRestaurant.get(i).getNameRestaurant();
                    getByProvince[1] = "" + getRestaurant.get(i).getRating();
                    getByProvince[2] = getRestaurant.get(i).getProvince();
                    model.addRow(getByProvince);

                }
            } else {
                continue;
            }

        }


    }//GEN-LAST:event_searchActionPerformed

    private void showRestaurantTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showRestaurantTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_showRestaurantTableMouseClicked

    private void showRestaurantTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_showRestaurantTableAncestorAdded

    }//GEN-LAST:event_showRestaurantTableAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allRastaurant().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboprovince;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JButton see_review;
    private javax.swing.JTable showRestaurantTable;
    // End of variables declaration//GEN-END:variables
}
