import Layanan.panelLayanan;
import Pelanggan.panelPelanggan;
import Pesanan.panelPesanan;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

public class mainMenu extends JFrame {

    public mainMenu() {
        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    private void iPelanggan(ActionEvent e) {
        panelPelanggan pPelanggan = new panelPelanggan();
        pPelanggan.setVisible(true);
    }

    private void iLayanan(ActionEvent e) {
        panelLayanan pLayanan = new panelLayanan();
        pLayanan.setVisible(true);
    }

    private void iLihat(ActionEvent e) {
        panelPesanan pPesanan = new panelPesanan();
        pPesanan.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
        menuBar1 = new JMenuBar();
        mMaster = new JMenu();
        iPelanggan = new JMenuItem();
        iLayanan = new JMenuItem();
        mPesanan = new JMenu();
        iBuat = new JMenuItem();
        iLihat = new JMenuItem();
        label2 = new JLabel();

        //======== this ========
        setResizable(false);
        var contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== mMaster ========
            {
                mMaster.setText("Master");

                //---- iPelanggan ----
                iPelanggan.setText("Pelanggan");
                iPelanggan.addActionListener(e -> {
			iPelanggan(e);
		});
                mMaster.add(iPelanggan);

                //---- iLayanan ----
                iLayanan.setText("Layanan");
                iLayanan.addActionListener(e -> iLayanan(e));
                mMaster.add(iLayanan);
            }
            menuBar1.add(mMaster);

            //======== mPesanan ========
            {
                mPesanan.setText("Pesanan");

                //---- iBuat ----
                iBuat.setText("Buat Pesanan");
                mPesanan.add(iBuat);

                //---- iLihat ----
                iLihat.setText("Lihat Pesanan");
                iLihat.addActionListener(e -> iLihat(e));
                mPesanan.add(iLihat);
            }
            menuBar1.add(mPesanan);
        }
        setJMenuBar(menuBar1);

        //---- label2 ----
        label2.setText("\u00a92025");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label2)
                    .addContainerGap(637, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(404, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addContainerGap())
        );
        setSize(680, 480);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new mainMenu();
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mochamad Farhan Ali
    private JMenuBar menuBar1;
    private JMenu mMaster;
    private JMenuItem iPelanggan;
    private JMenuItem iLayanan;
    private JMenu mPesanan;
    private JMenuItem iBuat;
    private JMenuItem iLihat;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
