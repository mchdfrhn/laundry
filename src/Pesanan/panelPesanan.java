/*
 * Created by JFormDesigner on Thu Jan 09 14:15:14 WIB 2025
 */

package Pesanan;

import Pelanggan.Pelanggan;
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
public class panelPesanan extends JFrame {

    private Statement st;
    private ResultSet rs;
    private DefaultTableModel tModel;
    private Connection conn = connectionDB.connect();
    private Pesanan selectData;

    public panelPesanan() {
        initComponents();

        judul();
        tampilData("");
        bDetail.setEnabled(false);
        bHapus.setEnabled(false);
        bEdit.setEnabled(false);
    }

    public void judul() {
        Object[] judul = {"ID", "Pelanggan", "Tanggal", "Status", "Total Harga"};
        tModel = new DefaultTableModel(null, judul);
        tblPesanan.setModel(tModel);
    }

    public void tampilData(String where) {
        try {
            st = conn.createStatement();
            tModel.getDataVector().removeAllElements();
            tModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT ps.id, pl.nama, ps.tanggal_pesanan, ps.status, ps.total_harga FROM pesanan AS ps INNER JOIN pelanggan AS pl ON ps.id_pelanggan = pl.id " + where);

            while (rs.next()) {
                Object[] data = {
                        rs.getString("id"),
                        rs.getString("nama"),
                        rs.getString("tanggal_pesanan"),
                        rs.getString("status"),
                        rs.getString("total_harga"),
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

    private void tblPesananMouseClicked(MouseEvent e) {
        String id = tblPesanan.getValueAt(tblPesanan.getSelectedRow(), 0).toString();
        String pelanggan = tblPesanan.getValueAt(tblPesanan.getSelectedRow(), 1).toString();
        String tanggal = tblPesanan.getValueAt(tblPesanan.getSelectedRow(), 2).toString();
        String status = tblPesanan.getValueAt(tblPesanan.getSelectedRow(), 3).toString();
        String total = tblPesanan.getValueAt(tblPesanan.getSelectedRow(), 4).toString();

        this.selectData = new Pesanan(id, pelanggan, tanggal, status, total);

        bDetail.setEnabled(true);
        bEdit.setEnabled(true);
        bHapus.setEnabled(true);
    }

    private void bDetail(ActionEvent e) {
        detailPesanan formDetail = new detailPesanan();
        formDetail.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
        lPesanan = new JLabel();
        bDetail = new JButton();
        tPesanan = new JScrollPane();
        tblPesanan = new JTable();
        bEdit = new JButton();
        bHapus = new JButton();

        //======== this ========
        setFont(new Font("Segoe UI", Font.PLAIN, 12));
        setResizable(false);
        var contentPane = getContentPane();

        //---- lPesanan ----
        lPesanan.setText("PESANAN");
        lPesanan.setFont(new Font("Segoe UI", Font.BOLD, 20));

        //---- bDetail ----
        bDetail.setText("Lihat Detail");
        bDetail.addActionListener(e -> {
			bDetail(e);
		});

        //======== tPesanan ========
        {
            //---- tblPesanan ----
            tblPesanan.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    tblPesananMouseClicked(e);
                }
            });
            tPesanan.setViewportView(tblPesanan);
        }

        //---- bEdit ----
        bEdit.setText("Ubah");

        //---- bHapus ----
        bHapus.setText("Hapus");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 358, Short.MAX_VALUE)
                            .addComponent(bDetail)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bEdit)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bHapus)
                            .addGap(26, 26, 26))
                        .addComponent(tPesanan, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(284, Short.MAX_VALUE)
                    .addComponent(lPesanan)
                    .addGap(275, 275, 275))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lPesanan)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(bHapus)
                        .addComponent(bEdit)
                        .addComponent(bDetail))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tPesanan, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
    private JLabel lPesanan;
    private JButton bDetail;
    private JScrollPane tPesanan;
    private JTable tblPesanan;
    private JButton bEdit;
    private JButton bHapus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
