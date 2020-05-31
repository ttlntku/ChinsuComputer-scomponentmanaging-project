/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chinsu.gui1;

import chinsu.gui_controller.CategoryObject;
import chinsu.gui_controller.ScreenController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    static int userId = 0;
    public static String userName = "";
    
    public MainFrame(int userid, String username, int per) {
        initComponents();
        userName = username;
        userId = userid;
        setTitle("CÔNG TY CỔ PHẦN QUỐC TẾ MÁY TÍNH CHINSU");
        txtUserName.setText(username);
        if(per == 0) {
            
            txtPer.setText("ADMIN");
        } else if(per == 1) {
            jlbUser.setVisible(false);
            jpnUser.setVisible(false);
            txtPer.setText("NHÂN VIÊN KHO");
        } else {
            jlbUser.setVisible(false);
            jlbType.setVisible(false);
            jlbDistributor.setVisible(false);
            jlbEquipment.setVisible(false);
            jlbStatistic.setVisible(false);
            txtPer.setText("NHÂN VIÊN");
        }
        
        ScreenController controller = new ScreenController(jpnView);
        controller.setView(jpnHomePage, jlbHomePage);
        
        List<CategoryObject> listItem = new ArrayList<>();
        listItem.add(new CategoryObject("HomePage", jpnHomePage, jlbHomePage));
        listItem.add(new CategoryObject("User", jpnUser, jlbUser));
        listItem.add(new CategoryObject("Equipment", jpnEquipment , jlbEquipment));
        listItem.add(new CategoryObject("Type", jpnType, jlbType));
        listItem.add(new CategoryObject("Distributor", jpnDistributor, jlbDistributor));
        listItem.add(new CategoryObject("Statistic", jpnStatistic , jlbStatistic));
        listItem.add(new CategoryObject("Export", jpnExport , jlbExport));
        listItem.add(new CategoryObject("ClientChat", jpnClientChat, jlbClientChat));
        listItem.add(new CategoryObject("ID3", jpnID3, jlbID3));
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JLabel();
        txtPer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpnUser = new javax.swing.JPanel();
        jlbUser = new javax.swing.JLabel();
        jpnEquipment = new javax.swing.JPanel();
        jlbEquipment = new javax.swing.JLabel();
        jpnType = new javax.swing.JPanel();
        jlbType = new javax.swing.JLabel();
        jpnDistributor = new javax.swing.JPanel();
        jlbDistributor = new javax.swing.JLabel();
        jpnStatistic = new javax.swing.JPanel();
        jlbStatistic = new javax.swing.JLabel();
        jpnHomePage = new javax.swing.JPanel();
        jlbHomePage = new javax.swing.JLabel();
        jpnExport = new javax.swing.JPanel();
        jlbExport = new javax.swing.JLabel();
        jpnClientChat = new javax.swing.JPanel();
        jlbClientChat = new javax.swing.JLabel();
        jpnID3 = new javax.swing.JPanel();
        jlbID3 = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(52, 59, 66));

        jPanel5.setBackground(new java.awt.Color(30, 40, 51));

        jPanel6.setBackground(new java.awt.Color(30, 40, 51));

        txtUserName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));

        txtPer.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtPer.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPer, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jButton1.setBackground(new java.awt.Color(30, 40, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows 10\\Desktop\\btl_java\\src\\chinsu\\img\\baseline_power_settings_new_white_18dp.png")); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpnUser.setBackground(new java.awt.Color(30, 40, 51));

        jlbUser.setBackground(new java.awt.Color(255, 255, 255));
        jlbUser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbUser.setForeground(new java.awt.Color(81, 95, 108));
        jlbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_person_white_18dp.png"))); // NOI18N
        jlbUser.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jpnUserLayout = new javax.swing.GroupLayout(jpnUser);
        jpnUser.setLayout(jpnUserLayout);
        jpnUserLayout.setHorizontalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnUserLayout.setVerticalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbUser, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jpnEquipment.setBackground(new java.awt.Color(30, 40, 51));

        jlbEquipment.setBackground(new java.awt.Color(255, 255, 255));
        jlbEquipment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbEquipment.setForeground(new java.awt.Color(81, 95, 108));
        jlbEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_amp_stories_white_18dp.png"))); // NOI18N
        jlbEquipment.setText("QUẢN LÝ HÀNG");

        javax.swing.GroupLayout jpnEquipmentLayout = new javax.swing.GroupLayout(jpnEquipment);
        jpnEquipment.setLayout(jpnEquipmentLayout);
        jpnEquipmentLayout.setHorizontalGroup(
            jpnEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbEquipment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnEquipmentLayout.setVerticalGroup(
            jpnEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnType.setBackground(new java.awt.Color(30, 40, 51));

        jlbType.setBackground(new java.awt.Color(255, 255, 255));
        jlbType.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbType.setForeground(new java.awt.Color(81, 95, 108));
        jlbType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_dns_white_18dp.png"))); // NOI18N
        jlbType.setText("QUẢN LÝ LOẠI HÀNG");

        javax.swing.GroupLayout jpnTypeLayout = new javax.swing.GroupLayout(jpnType);
        jpnType.setLayout(jpnTypeLayout);
        jpnTypeLayout.setHorizontalGroup(
            jpnTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnTypeLayout.setVerticalGroup(
            jpnTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTypeLayout.createSequentialGroup()
                .addComponent(jlbType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnDistributor.setBackground(new java.awt.Color(30, 40, 51));
        jpnDistributor.setForeground(new java.awt.Color(255, 255, 255));

        jlbDistributor.setBackground(new java.awt.Color(255, 255, 255));
        jlbDistributor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbDistributor.setForeground(new java.awt.Color(81, 95, 108));
        jlbDistributor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_store_white_18dp.png"))); // NOI18N
        jlbDistributor.setText("QUẢN LÝ NHÀ CUNG CẤP");

        javax.swing.GroupLayout jpnDistributorLayout = new javax.swing.GroupLayout(jpnDistributor);
        jpnDistributor.setLayout(jpnDistributorLayout);
        jpnDistributorLayout.setHorizontalGroup(
            jpnDistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbDistributor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnDistributorLayout.setVerticalGroup(
            jpnDistributorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbDistributor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnStatistic.setBackground(new java.awt.Color(30, 40, 51));

        jlbStatistic.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbStatistic.setForeground(new java.awt.Color(81, 95, 108));
        jlbStatistic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_bar_chart_white_18dp.png"))); // NOI18N
        jlbStatistic.setText("BÁO CÁO, THỐNG KÊ");

        javax.swing.GroupLayout jpnStatisticLayout = new javax.swing.GroupLayout(jpnStatistic);
        jpnStatistic.setLayout(jpnStatisticLayout);
        jpnStatisticLayout.setHorizontalGroup(
            jpnStatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnStatisticLayout.setVerticalGroup(
            jpnStatisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnHomePage.setBackground(new java.awt.Color(30, 40, 51));

        jlbHomePage.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbHomePage.setForeground(new java.awt.Color(81, 95, 108));
        jlbHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_home_work_white_18dp.png"))); // NOI18N
        jlbHomePage.setText("TRANG CHỦ");

        javax.swing.GroupLayout jpnHomePageLayout = new javax.swing.GroupLayout(jpnHomePage);
        jpnHomePage.setLayout(jpnHomePageLayout);
        jpnHomePageLayout.setHorizontalGroup(
            jpnHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHomePageLayout.setVerticalGroup(
            jpnHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jpnExport.setBackground(new java.awt.Color(30, 40, 51));
        jpnExport.setForeground(new java.awt.Color(255, 255, 255));

        jlbExport.setBackground(new java.awt.Color(255, 255, 255));
        jlbExport.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbExport.setForeground(new java.awt.Color(81, 95, 108));
        jlbExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_add_shopping_cart_white_18dp.png"))); // NOI18N
        jlbExport.setText("XUẤT HÓA ĐƠN");

        javax.swing.GroupLayout jpnExportLayout = new javax.swing.GroupLayout(jpnExport);
        jpnExport.setLayout(jpnExportLayout);
        jpnExportLayout.setHorizontalGroup(
            jpnExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnExportLayout.setVerticalGroup(
            jpnExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jpnClientChat.setBackground(new java.awt.Color(30, 40, 51));

        jlbClientChat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbClientChat.setForeground(new java.awt.Color(81, 95, 108));
        jlbClientChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_perm_phone_msg_white_18dp.png"))); // NOI18N
        jlbClientChat.setText("CLIENT CHAT");

        javax.swing.GroupLayout jpnClientChatLayout = new javax.swing.GroupLayout(jpnClientChat);
        jpnClientChat.setLayout(jpnClientChatLayout);
        jpnClientChatLayout.setHorizontalGroup(
            jpnClientChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpnClientChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jlbClientChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
        );
        jpnClientChatLayout.setVerticalGroup(
            jpnClientChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(jpnClientChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jlbClientChat, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
        );

        jpnID3.setBackground(new java.awt.Color(30, 40, 51));
        jpnID3.setForeground(new java.awt.Color(255, 255, 255));

        jlbID3.setBackground(new java.awt.Color(255, 255, 255));
        jlbID3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlbID3.setForeground(new java.awt.Color(81, 95, 108));
        jlbID3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chinsu/img/baseline_memory_white_18dp.png"))); // NOI18N
        jlbID3.setText("LỰA CHỌN CẤU HÌNH");

        javax.swing.GroupLayout jpnID3Layout = new javax.swing.GroupLayout(jpnID3);
        jpnID3.setLayout(jpnID3Layout);
        jpnID3Layout.setHorizontalGroup(
            jpnID3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbID3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnID3Layout.setVerticalGroup(
            jpnID3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbID3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnDistributor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnClientChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnClientChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jpnExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlbClientChat;
    private javax.swing.JLabel jlbDistributor;
    private javax.swing.JLabel jlbEquipment;
    private javax.swing.JLabel jlbExport;
    private javax.swing.JLabel jlbHomePage;
    private javax.swing.JLabel jlbID3;
    private javax.swing.JLabel jlbStatistic;
    private javax.swing.JLabel jlbType;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JPanel jpnClientChat;
    private javax.swing.JPanel jpnDistributor;
    private javax.swing.JPanel jpnEquipment;
    private javax.swing.JPanel jpnExport;
    private javax.swing.JPanel jpnHomePage;
    private javax.swing.JPanel jpnID3;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnStatistic;
    private javax.swing.JPanel jpnType;
    private javax.swing.JPanel jpnUser;
    private javax.swing.JPanel jpnView;
    private javax.swing.JLabel txtPer;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
