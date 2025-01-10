/*
 * Created by JFormDesigner on Tue Dec 24 12:55:27 WIB 2024
 */

package Pelanggan;

import Connection.connectionDB;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

/**
 * @author Administrator
 */
public class panelPelanggan extends JFrame {

    private Statement st;
    private ResultSet rs;
    private DefaultTableModel tModel;
    private Connection conn = connectionDB.connect();
    private Pelanggan selectData;

    public panelPelanggan() {
        initComponents();

        judul();
        tampilData("");
        bHapus.setEnabled(false);
        bEdit.setEnabled(false);
    }

    public void judul() {
        Object[] judul = {"ID", "Nama", "Telepon", "Alamat"};
        tModel = new DefaultTableModel(null, judul);
        tblPelanggan.setModel(tModel);
    }

    public void tampilData(String where) {
        try {
            st = conn.createStatement();
            tModel.getDataVector().removeAllElements();
            tModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM pelanggan " + where);

            while (rs.next()) {
                Object[] data = {
                        rs.getString("id"),
                        rs.getString("nama"),
                        rs.getString("telepon"),
                        rs.getString("alamat"),
                };
                tModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void bTambah(ActionEvent e) {
        addPelanggan formPelanggan = new addPelanggan(this);
        formPelanggan.setVisible(true);
    }

    private void bEdit(ActionEvent e) {
        updatePelanggan formPelanggan = new updatePelanggan(this.selectData, this);
        formPelanggan.setVisible(true);
    }

    private void tblPelangganMouseClicked(MouseEvent e) {
        String id = tblPelanggan.getValueAt(tblPelanggan.getSelectedRow(), 0).toString();
        String nama = tblPelanggan.getValueAt(tblPelanggan.getSelectedRow(), 1).toString();
        String telepon = tblPelanggan.getValueAt(tblPelanggan.getSelectedRow(), 2).toString();
        String alamat = tblPelanggan.getValueAt(tblPelanggan.getSelectedRow(), 3).toString();

        this.selectData = new Pelanggan(id, nama, telepon, alamat);

        bTambah.setEnabled(false);
        bEdit.setEnabled(true);
        bHapus.setEnabled(true);
    }

    private void bHapus(ActionEvent e) {
        try {
            int jawab;

            if ((jawab = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
                st = conn.createStatement();
                st.executeUpdate("DELETE FROM pelanggan WHERE id = '"
                        + tModel.getValueAt(tblPelanggan.getSelectedRow(), 0) + "'");

                tampilData("");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
        lPelanggan = new JLabel();
        bTambah = new JButton();
        bEdit = new JButton();
        bHapus = new JButton();
        tPelanggan = new JScrollPane();
        tblPelanggan = new JTable();

        //======== this ========
        setFont(new Font("Segoe UI", Font.PLAIN, 12));
        setResizable(false);
        var contentPane = getContentPane();

        //---- lPelanggan ----
        lPelanggan.setText("PELANGGAN");
        lPelanggan.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- bTambah ----
        bTambah.setText("Tambah");
        bTambah.addActionListener(e -> {
			bTambah(e);
		});

        //---- bEdit ----
        bEdit.setText("Ubah");
        bEdit.addActionListener(e -> bEdit(e));

        //---- bHapus ----
        bHapus.setText("Hapus");
        bHapus.addActionListener(e -> bHapus(e));

        {
            //---- tblPelanggan ----
            tblPelanggan.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    tblPelangganMouseClicked(e);
                }
            });
            tPelanggan.setViewportView(tblPelanggan);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 262, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(lPelanggan)
                                    .addGap(264, 264, 264))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(bTambah)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bEdit)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bHapus)
                                    .addContainerGap())))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(tPelanggan, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                            .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lPelanggan)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bHapus)
                        .addComponent(bEdit)
                        .addComponent(bTambah))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tPelanggan, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
    private JLabel lPelanggan;
    private JButton bTambah;
    private JButton bEdit;
    private JButton bHapus;
    private JScrollPane tPelanggan;
    private JTable tblPelanggan;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
