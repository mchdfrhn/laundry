/*
 * Created by JFormDesigner on Wed Jan 08 15:21:39 WIB 2025
 */

package Layanan;

import Connection.connectionDB;
import Pelanggan.Pelanggan;

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
public class panelLayanan extends JFrame {

    private Statement st;
    private ResultSet rs;
    private DefaultTableModel tModel;
    private Connection conn = connectionDB.connect();
    private Layanan selectData;

    public panelLayanan() {
        initComponents();
        judul();
        tampilData("");
        bHapus.setEnabled(false);
        bEdit.setEnabled(false);
    }

    private void bTambah(ActionEvent e) {
        addLayanan formLayanan = new addLayanan(this);
        formLayanan.setVisible(true);
    }

    private void bEdit(ActionEvent e) {
        updateLayanan formLayanan = new updateLayanan(this.selectData, this);
        formLayanan.setVisible(true);
    }

    public void judul() {
        Object[] judul = {"ID", "Nama Layanan", "Harga Perkilo"};
        tModel = new DefaultTableModel(null, judul);
        tblLayanan.setModel(tModel);
    }

    public void tampilData(String where) {
        try {
            st = conn.createStatement();
            tModel.getDataVector().removeAllElements();
            tModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM layanan " + where);

            while (rs.next()) {
                Object[] data = {
                        rs.getString("id"),
                        rs.getString("nama_layanan"),
                        rs.getString("harga_per_kg"),
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

    private void tblLayananMouseClicked(MouseEvent e) {
        String id = tblLayanan.getValueAt(tblLayanan.getSelectedRow(), 0).toString();
        String nama = tblLayanan.getValueAt(tblLayanan.getSelectedRow(), 1).toString();
        String harga = tblLayanan.getValueAt(tblLayanan.getSelectedRow(), 2).toString();

        this.selectData = new Layanan(id, nama, harga);

        bTambah.setEnabled(false);
        bEdit.setEnabled(true);
        bHapus.setEnabled(true);
    }

    private void bHapus(ActionEvent e) {
        try {
            int jawab;

            if ((jawab = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
                st = conn.createStatement();
                st.executeUpdate("DELETE FROM layanan WHERE id = '"
                        + tModel.getValueAt(tblLayanan.getSelectedRow(), 0) + "'");

                tampilData("");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
        lLayanan = new JLabel();
        bTambah = new JButton();
        bEdit = new JButton();
        bHapus = new JButton();
        pnlLayanan = new JScrollPane();
        tblLayanan = new JTable();

        //======== this ========
        setFont(new Font("Segoe UI", Font.PLAIN, 12));
        setResizable(false);
        var contentPane = getContentPane();

        //---- lLayanan ----
        lLayanan.setText("LAYANAN");
        lLayanan.setFont(new Font("Segoe UI", Font.BOLD, 20));

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

        //======== pnlLayanan ========
        {

            //---- tblLayanan ----
            tblLayanan.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    tblLayananMouseClicked(e);
                }
            });
            pnlLayanan.setViewportView(tblLayanan);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 399, Short.MAX_VALUE)
                            .addComponent(bTambah)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bEdit)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bHapus))
                        .addComponent(pnlLayanan, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(284, Short.MAX_VALUE)
                    .addComponent(lLayanan)
                    .addGap(273, 273, 273))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lLayanan)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bHapus)
                        .addComponent(bEdit)
                        .addComponent(bTambah))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnlLayanan, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
    private JLabel lLayanan;
    private JButton bTambah;
    private JButton bEdit;
    private JButton bHapus;
    private JScrollPane pnlLayanan;
    private JTable tblLayanan;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
