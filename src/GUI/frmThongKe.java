/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import OBJ.HoaDon;
import OBJ.KhachHang;
import OBJ.NhanVien;
import OBJ.SanPham;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Administrator
 */
public class frmThongKe extends javax.swing.JPanel {

    ArrayList<HoaDon> listHD = new ArrayList<>();
    private DefaultTableModel defaultTableModel;
    HoaDon hd = new HoaDon();
    double tongTien;
    NumberFormat formatter = new DecimalFormat("###,###");
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat sdf1 = new SimpleDateFormat("MM");

    /**
     * Creates new form frmThongKe
     */
    public frmThongKe() {
        initComponents();
        loadFile();
        getData(listHD);
        txt_hoaDon.setText(frm_signIn.maDN);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongke = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbl_tongTien = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_thongKe1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lbl_tongTien1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txt_timkiem1 = new javax.swing.JTextField();
        btn_thongKe = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbl_tongTien2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txt_hoaDon = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/store-icon.png"))); // NOI18N
        jLabel1.setText("SI??U TH??? MINI");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users-Exit-icon.png"))); // NOI18N
        jButton5.setText("Tho??t");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 50, 110, 29));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("|");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1940, 50));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Th???ng k??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_thongke.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_thongke);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 950, 400));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "T??m ki???m", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Doanh thu:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, 30));

        lbl_tongTien.setText("......................");
        jPanel6.add(lbl_tongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("VND.");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 40, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search-icon.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 50, 30));
        jPanel6.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 950, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Th???ng k?? theo ng??y", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_thongKe1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_thongKe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ok-icon.png"))); // NOI18N
        btn_thongKe1.setText("Th???ng k?? ");
        btn_thongKe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thongKe1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_thongKe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 130, 30));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 40));

        lbl_tongTien1.setText(".....................");
        jPanel3.add(lbl_tongTien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("VND.");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setText("Doanh thu:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 450, 150));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reload-icon.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel4.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 120, 30));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Th???ng k?? theo th??ng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txt_timkiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 30));

        btn_thongKe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_thongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ok-icon.png"))); // NOI18N
        btn_thongKe.setText("Th???ng k??");
        btn_thongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thongKeActionPerformed(evt);
            }
        });
        jPanel5.add(btn_thongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 140, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Nh???p th??ng mu???n th???ng k??");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));

        lbl_tongTien2.setText("......................");
        jPanel5.add(lbl_tongTien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 100, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("VND.");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 40, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel15.setText("Doanh thu:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 110, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 450, 170));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_hoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hoaDonActionPerformed(evt);
            }
        });
        jPanel7.add(txt_hoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Office-Customer-Male-Light-icon.png"))); // NOI18N
        jLabel14.setText("Nh???p m?? nh??n vi??n:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 450, 70));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1660, 580));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp3152222.jpg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1920, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String timKiem = txt_timkiem.getText();
        if (timKiem.equals("")) {
            getData(listHD);
            tongTien = 0;
            for (int i = 0; i < listHD.size(); i++) {
                tongTien += listHD.get(i).getThanhTien();
            }
            lbl_tongTien.setText(formatter.format(tongTien));
        } else /*if(maNV.equals(""))*/ {
            ArrayList<HoaDon> listTimKiem1 = new ArrayList<>();
            for (int i = 0; i < listHD.size(); i++) {
                if (listHD.get(i).getMaHD().contains(timKiem) || listHD.get(i).getMaKH().contains(timKiem) || listHD.get(i).getMaNV().contains(timKiem) || listHD.get(i).getMaSP().contains(timKiem)
                    ||listHD.get(i).getNgayBan().equals(timKiem) )
                {
                    listTimKiem1.add(listHD.get(i));
                }
            }
            getData(listTimKiem1);

            tongTien = 0;
            for (int i = 0; i < listTimKiem1.size(); i++) {
                tongTien += listTimKiem1.get(i).getThanhTien();
            }
            lbl_tongTien.setText(formatter.format(tongTien));
        }

        txt_hoaDon.setText("");
        txt_timkiem1.setText("");
        lbl_tongTien1.setText("......................");
        lbl_tongTien2.setText("......................");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_thongKe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thongKe1ActionPerformed
        // TODO add your handling code here:
        Date date = jDateChooser1.getDate();
        String date_str = sdf.format(date);
        String maNV = txt_hoaDon.getText();
        ArrayList<HoaDon> listHD_tinKiem = new ArrayList<>();
        for (int i = 0; i < listHD.size(); i++) {
            if (listHD.get(i).getNgayBan().equals(date_str) && listHD.get(i).getMaNV().contains(maNV)) {
                listHD_tinKiem.add(listHD.get(i));
            }
        }
        getData(listHD_tinKiem);
        tongTien = 0;
        for (int i = 0; i < listHD_tinKiem.size(); i++) {
            tongTien += listHD_tinKiem.get(i).getThanhTien();
        }
        lbl_tongTien1.setText(formatter.format(tongTien));
        //txt_hoaDon.setText("");
        txt_timkiem.setText("");
        txt_timkiem1.setText("");
        lbl_tongTien.setText("......................");
        lbl_tongTien2.setText("......................");
    }//GEN-LAST:event_btn_thongKe1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        getData(listHD);
        txt_hoaDon.setText("");
        txt_timkiem.setText("");
        txt_timkiem1.setText("");
        lbl_tongTien.setText("......................");
        lbl_tongTien1.setText("......................");
        lbl_tongTien2.setText("......................");

    }//GEN-LAST:event_cancelActionPerformed

    private void btn_thongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thongKeActionPerformed
        // TODO add your handling code here:dung
        String timKiem = txt_timkiem1.getText();
        String maNV = txt_hoaDon.getText();
        ArrayList<HoaDon> listHD_tinKiem = new ArrayList<>();
        for (int i = 0; i < listHD.size(); i++) {
            if (listHD.get(i).getMaHD().contains(timKiem) && listHD.get(i).getMaNV().contains(maNV)) {
                listHD_tinKiem.add(listHD.get(i));
            }
        }
        getData(listHD_tinKiem);
        tongTien = 0;
        for (int i = 0; i < listHD_tinKiem.size(); i++) {
            tongTien += listHD_tinKiem.get(i).getThanhTien();
        }
        lbl_tongTien2.setText(formatter.format(tongTien));
        //txt_hoaDon.setText("");
        txt_timkiem.setText("");
        //txt_timkiem1.setText("");
        lbl_tongTien.setText("......................");
        lbl_tongTien1.setText("......................");
    }//GEN-LAST:event_btn_thongKeActionPerformed

    private void txt_hoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hoaDonActionPerformed
    public void loadFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("hoadon.txt");
            Reader fr = new InputStreamReader(fileInputStream, "utf-8");
            BufferedReader br = new BufferedReader(fr);
            listHD = new ArrayList<>(); //l??u ??
            String s = null;

            try {
                while ((s = br.readLine()) != null) {
                    //C???t chu???i:
                    String arr[] = s.split("\t");
                    //Kh???i t???o
                    HoaDon hd = new HoaDon();
                    hd.setMaHD(arr[0]);
                    hd.setMaNV(arr[1]);
                    hd.setMaKH(arr[2]);
                    hd.setTenKH(arr[3]);
                    hd.setMaSP(arr[4]);
                    hd.setSoLuong(Integer.parseInt(arr[5]));
                    hd.setTenSp(arr[6]);
                    hd.setDonGia(Double.parseDouble(arr[7]));
                    hd.setThanhTien(Double.parseDouble(arr[8]));
                    hd.setNgayBan(arr[9]);
                    listHD.add(hd);
                }
            } catch (IOException ex) {
                Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getData(ArrayList<HoaDon> listHD) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("M?? HD");
        defaultTableModel.addColumn("M?? NV");
        defaultTableModel.addColumn("M?? KH");
        defaultTableModel.addColumn("T??n KH");
        defaultTableModel.addColumn("M?? SP");
        defaultTableModel.addColumn("T??n SP");
        defaultTableModel.addColumn("S??? l?????ng");
        defaultTableModel.addColumn("????n gi??");
        defaultTableModel.addColumn("Th??nh ti???n");
        defaultTableModel.addColumn("Ng??y b??n");

        for (HoaDon obj : listHD) {

            Vector vector = new Vector();
            vector.add(obj.getMaHD());
            vector.add(obj.getMaNV());
            vector.add(obj.getMaKH());
            vector.add(obj.getTenKH());
            vector.add(obj.getMaSP());
            vector.add(obj.getTenSp());
            vector.add(formatter.format(obj.getSoLuong()));
            vector.add(formatter.format(obj.getDonGia()));
            vector.add(formatter.format(obj.getThanhTien()));
            vector.add(obj.getNgayBan());

            defaultTableModel.addRow(vector);
        }
        tbl_thongke.setModel(defaultTableModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thongKe;
    private javax.swing.JButton btn_thongKe1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_tongTien;
    private javax.swing.JLabel lbl_tongTien1;
    private javax.swing.JLabel lbl_tongTien2;
    private javax.swing.JTable tbl_thongke;
    private javax.swing.JTextField txt_hoaDon;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txt_timkiem1;
    // End of variables declaration//GEN-END:variables
}
