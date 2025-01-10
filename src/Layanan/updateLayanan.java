/*
 * Created by JFormDesigner on Wed Jan 08 15:23:02 WIB 2025
 */

package Layanan;

import Pelanggan.panelPelanggan;
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
public class updateLayanan extends JFrame {

    private Statement st;
    private Connection conn = connectionDB.connect();
    private panelLayanan panelLayanan;

    public updateLayanan(Layanan data, panelLayanan panel) {
        initComponents();

        this.panelLayanan = panel;

        id.setText(data.getId());
        id.setVisible(false);

        nama.setText(data.getNama());
        harga.setText(data.getHarga());
    }

    private void bSimpan(ActionEvent e) {
        try {
            st = conn.createStatement();
            st.executeUpdate("UPDATE layanan SET "
                    + "nama_layanan = '" + nama.getText() + "', "
                    + "harga_per_kg = '" + harga.getText() + "' "
                    + "WHERE id = '" + id.getText() + "'");
            panelLayanan.tampilData("");
            JOptionPane.showMessageDialog(null, "Data berhasil di update!");
            dispose();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private void bBatal(ActionEvent e) {
        dispose();
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
        id = new JLabel();

        //======== this ========
        setResizable(false);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Nama Layanan");

        //---- label2 ----
        label2.setText("Harga/Kilogram");

        //---- bSimpan ----
        bSimpan.setText("Ubah");
        bSimpan.addActionListener(e -> bSimpan(e));

        //---- bBatal ----
        bBatal.setText("Batal");
        bBatal.addActionListener(e -> {
			bBatal(e);
			bBatal(e);
		});

        //---- lfLayanan ----
        lfLayanan.setText("Ubah Data Layanan");
        lfLayanan.setFont(new Font("Segoe UI", Font.BOLD, 16));

        //---- id ----
        id.setText("Id");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label1)
                                .addComponent(id))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nama, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(harga, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(lfLayanan))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(bSimpan)
                            .addGap(34, 34, 34)
                            .addComponent(bBatal)))
                    .addContainerGap(10, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(lfLayanan, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(id)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(harga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bSimpan)
                        .addComponent(bBatal))
                    .addContainerGap(31, Short.MAX_VALUE))
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
    private JLabel id;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
