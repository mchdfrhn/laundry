/*
 * Created by JFormDesigner on Thu Jan 09 14:31:56 WIB 2025
 */

package Pesanan;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Administrator
 */
public class detailPesanan extends JFrame {
    public detailPesanan() {
        initComponents();
        id.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
        label1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        id = new JLabel();
        pelanggan = new JLabel();
        tanggal = new JLabel();
        status = new JLabel();
        layanan = new JLabel();
        berat = new JLabel();
        total = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Detail Pesanan");
        label1.setFont(new Font("Segoe UI", Font.BOLD, 16));

        //---- label3 ----
        label3.setText("Pelanggan");

        //---- label4 ----
        label4.setText("Tanggal Pesanan");

        //---- label5 ----
        label5.setText("Status");

        //---- label6 ----
        label6.setText("Layanan");

        //---- label7 ----
        label7.setText("Berat");

        //---- label8 ----
        label8.setText("Total Harga");

        //---- label11 ----
        label11.setText(":");

        //---- label12 ----
        label12.setText(":");

        //---- label14 ----
        label14.setText(":");

        //---- label15 ----
        label15.setText(":");

        //---- label16 ----
        label16.setText(":");

        //---- label17 ----
        label17.setText(":");

        //---- id ----
        id.setText("id");

        //---- pelanggan ----
        pelanggan.setText("pelanggan");

        //---- tanggal ----
        tanggal.setText("tanggal_pesanan");

        //---- status ----
        status.setText("status");

        //---- layanan ----
        layanan.setText("layanan");

        //---- berat ----
        berat.setText("berat");

        //---- total ----
        total.setText("total_harga");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(id, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addComponent(label1))
                    .addContainerGap(11, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(label3)
                        .addComponent(label5)
                        .addComponent(label6)
                        .addComponent(label7)
                        .addComponent(label8))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(total, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(layanan, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(status, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pelanggan, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label16, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(berat, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tanggal, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addGap(4, 4, 4)
                    .addComponent(id)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(label12)
                        .addComponent(pelanggan))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(label11))
                        .addComponent(tanggal))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(label14))
                        .addComponent(status))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(label15))
                        .addComponent(layanan))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(label16))
                        .addComponent(berat))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(label17))
                        .addComponent(total))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
    private JLabel label1;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label11;
    private JLabel label12;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel id;
    private JLabel pelanggan;
    private JLabel tanggal;
    private JLabel status;
    private JLabel layanan;
    private JLabel berat;
    private JLabel total;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
