/*
 * Created by JFormDesigner on Tue Dec 24 13:07:52 WIB 2024
 */

package Pelanggan;

import Connection.connectionDB;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Administrator
 */
public class addPelanggan extends JFrame {

    private Statement st;
    private Connection conn = connectionDB.connect();
    private panelPelanggan panelPelanggan;

    public addPelanggan(panelPelanggan panel) {
        initComponents();
        this.panelPelanggan = panel;
    }

    private void bSimpan(ActionEvent e) {
        try {
            st = conn.createStatement();

            String query = "INSERT INTO pelanggan (nama, telepon, alamat) VALUES ('"
                    + nama.getText() + "', '"
                    + telepon.getText() + "', '"
                    + alamat.getText() + "')";

            st.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Berhasil menambahkan data pelanggan");

            bersih();
            panelPelanggan.tampilData("");
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Error: " + exc.getMessage());
            exc.printStackTrace();
        }
    }

    private void bBatal(ActionEvent e) {
        dispose();
    }

    private void bersih() {
        nama.setText("");
        telepon.setText("");
        alamat.setText("");
    }

    private void bTambah(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        nama = new JTextField();
        telepon = new JTextField();
        alamat = new JTextField();
        bSimpan = new JButton();
        bBatal = new JButton();
        lfPelanggan = new JLabel();

        //======== this ========
        setResizable(false);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Nama");

        //---- label2 ----
        label2.setText("Telepon");

        //---- label3 ----
        label3.setText("Alamat");

        //---- bSimpan ----
        bSimpan.setText("Tambah");
        bSimpan.addActionListener(e -> {
			bTambah(e);
			bSimpan(e);
		});

        //---- bBatal ----
        bBatal.setText("Batal");
        bBatal.addActionListener(e -> bBatal(e));

        //---- lfPelanggan ----
        lfPelanggan.setText("Tambah Data Pelanggan");
        lfPelanggan.setFont(new Font("Segoe UI", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(label3)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nama, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(telepon, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(alamat, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(bSimpan)
                            .addGap(47, 47, 47)
                            .addComponent(bBatal)))
                    .addContainerGap(12, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(70, Short.MAX_VALUE)
                    .addComponent(lfPelanggan)
                    .addGap(65, 65, 65))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(lfPelanggan)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(telepon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(alamat, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bSimpan)
                        .addComponent(bBatal))
                    .addContainerGap(19, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField nama;
    private JTextField telepon;
    private JTextField alamat;
    private JButton bSimpan;
    private JButton bBatal;
    private JLabel lfPelanggan;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
