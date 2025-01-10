/*
 * Created by JFormDesigner on Wed Jan 08 15:22:53 WIB 2025
 */

package Layanan;

import Connection.connectionDB;
import Layanan.panelLayanan;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Administrator
 */
public class addLayanan extends JFrame {

    private Statement st;
    private Connection conn = connectionDB.connect();
    private panelLayanan panelLayanan;

    public addLayanan(panelLayanan panel) {
        initComponents();
        this.panelLayanan = panel;
    }

    private void bSimpan(ActionEvent e) {
        String hargaString = harga.getText();
        int hargaPerKg = Integer.parseInt(hargaString);

        try {
            st = conn.createStatement();

            String query = "INSERT INTO layanan (nama_layanan, harga_per_kg) VALUES ('"
                    + nama.getText() + "', '"
                    + hargaPerKg + "')";

            st.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Berhasil menambahkan data layanan");

            bersih();
            panelLayanan.tampilData("");
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
        harga.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
        label1 = new JLabel();
        label2 = new JLabel();
        nama = new JTextField();
        harga = new JTextField();
        bSimpan = new JButton();
        bBatal = new JButton();
        lfLayanan = new JLabel();

        //======== this ========
        setResizable(false);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Nama Layanan");

        //---- label2 ----
        label2.setText("Harga/Kilogram");

        //---- bSimpan ----
        bSimpan.setText("Tambah");
        bSimpan.addActionListener(e -> {
			bSimpan(e);
			bSimpan(e);
		});

        //---- bBatal ----
        bBatal.setText("Batal");
        bBatal.addActionListener(e -> {
			bBatal(e);
			bBatal(e);
		});

        //---- lfLayanan ----
        lfLayanan.setText("Tambah Data Layanan");
        lfLayanan.setFont(new Font("Segoe UI", Font.BOLD, 16));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(lfLayanan)
                            .addGap(0, 90, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nama, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(harga, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(bSimpan)
                    .addGap(38, 38, 38)
                    .addComponent(bBatal)
                    .addContainerGap(85, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(lfLayanan, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(harga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bBatal)
                        .addComponent(bSimpan))
                    .addContainerGap(25, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
    private JLabel label1;
    private JLabel label2;
    private JTextField nama;
    private JTextField harga;
    private JButton bSimpan;
    private JButton bBatal;
    private JLabel lfLayanan;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
