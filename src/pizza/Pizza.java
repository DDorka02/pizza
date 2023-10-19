package pizza;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;

public class Pizza extends javax.swing.JFrame {

    public Pizza() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        pnlMeret = new javax.swing.JPanel();
        rdbCm25 = new javax.swing.JRadioButton();
        rdbCm32 = new javax.swing.JRadioButton();
        rdbCm50 = new javax.swing.JRadioButton();
        pnlTeszta = new javax.swing.JPanel();
        rdbOlasz = new javax.swing.JRadioButton();
        rdbHagyomanyos = new javax.swing.JRadioButton();
        rdbTeljes = new javax.swing.JRadioButton();
        pnlFeltet = new javax.swing.JPanel();
        rdbHagyma = new javax.swing.JRadioButton();
        rdbAnanasz = new javax.swing.JRadioButton();
        rdbSonka = new javax.swing.JRadioButton();
        pnlAlap = new javax.swing.JPanel();
        rdbParadicsom = new javax.swing.JRadioButton();
        rbdTejfol = new javax.swing.JRadioButton();
        cmdDb = new javax.swing.JComboBox<>();
        lblElerhetoseg = new javax.swing.JLabel();
        BtMegvesz = new javax.swing.JButton();
        lblDb = new javax.swing.JLabel();
        pnlKep = new javax.swing.JPanel();
        lblKep = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdbMozzarella = new javax.swing.JRadioButton();
        rdbSajt = new javax.swing.JRadioButton();
        rdbSzalami = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlMeret.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Méret", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 2, 12))); // NOI18N
        pnlMeret.setForeground(new java.awt.Color(255, 255, 0));
        pnlMeret.setToolTipText("");

        buttonGroup1.add(rdbCm25);
        rdbCm25.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbCm25.setText("25 cm");

        buttonGroup1.add(rdbCm32);
        rdbCm32.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbCm32.setText("32 cm");

        buttonGroup1.add(rdbCm50);
        rdbCm50.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbCm50.setText("50 cm");

        javax.swing.GroupLayout pnlMeretLayout = new javax.swing.GroupLayout(pnlMeret);
        pnlMeret.setLayout(pnlMeretLayout);
        pnlMeretLayout.setHorizontalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbCm25)
                    .addComponent(rdbCm32)
                    .addComponent(rdbCm50))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMeretLayout.setVerticalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbCm25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbCm32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbCm50)
                .addGap(12, 12, 12))
        );

        pnlTeszta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tészta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 2, 12))); // NOI18N

        buttonGroup2.add(rdbOlasz);
        rdbOlasz.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbOlasz.setText("olasz");

        buttonGroup2.add(rdbHagyomanyos);
        rdbHagyomanyos.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbHagyomanyos.setText("hagyományos");

        buttonGroup2.add(rdbTeljes);
        rdbTeljes.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbTeljes.setText("teljes kiörlésű");

        javax.swing.GroupLayout pnlTesztaLayout = new javax.swing.GroupLayout(pnlTeszta);
        pnlTeszta.setLayout(pnlTesztaLayout);
        pnlTesztaLayout.setHorizontalGroup(
            pnlTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbOlasz)
                    .addComponent(rdbHagyomanyos)
                    .addComponent(rdbTeljes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTesztaLayout.setVerticalGroup(
            pnlTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTesztaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbOlasz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbHagyomanyos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbTeljes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pnlFeltet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Feltét", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 2, 12))); // NOI18N

        buttonGroup5.add(rdbHagyma);
        rdbHagyma.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbHagyma.setText("hagyma");

        buttonGroup5.add(rdbAnanasz);
        rdbAnanasz.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbAnanasz.setText("ananász");

        buttonGroup5.add(rdbSonka);
        rdbSonka.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbSonka.setText("sonka");

        javax.swing.GroupLayout pnlFeltetLayout = new javax.swing.GroupLayout(pnlFeltet);
        pnlFeltet.setLayout(pnlFeltetLayout);
        pnlFeltetLayout.setHorizontalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbHagyma)
                    .addComponent(rdbAnanasz)
                    .addComponent(rdbSonka))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFeltetLayout.setVerticalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbHagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbSonka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbAnanasz)
                .addGap(12, 12, 12))
        );

        pnlAlap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alap", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 2, 12))); // NOI18N

        buttonGroup3.add(rdbParadicsom);
        rdbParadicsom.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbParadicsom.setText("paradicsomos");

        buttonGroup3.add(rbdTejfol);
        rbdTejfol.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rbdTejfol.setText("tejfölös");

        javax.swing.GroupLayout pnlAlapLayout = new javax.swing.GroupLayout(pnlAlap);
        pnlAlap.setLayout(pnlAlapLayout);
        pnlAlapLayout.setHorizontalGroup(
            pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbdTejfol)
                    .addComponent(rdbParadicsom))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAlapLayout.setVerticalGroup(
            pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbParadicsom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbdTejfol)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        cmdDb.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        cmdDb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        cmdDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDbActionPerformed(evt);
            }
        });

        lblElerhetoseg.setText("<html><a href=\"#\">Elérhetőség</a></html>");
        lblElerhetoseg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElerhetosegMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblElerhetosegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblElerhetosegMouseExited(evt);
            }
        });

        BtMegvesz.setBackground(new java.awt.Color(255, 0, 0));
        BtMegvesz.setFont(new java.awt.Font("Segoe Script", 2, 12)); // NOI18N
        BtMegvesz.setText("Megvesz");
        BtMegvesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMegveszActionPerformed(evt);
            }
        });

        lblDb.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        lblDb.setText("db:");

        pnlKep.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kép", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 0, 12))); // NOI18N

        lblKep.setIcon(new javax.swing.ImageIcon("C:\\Users\\DobszayDorkaMária(SZ\\Documents\\Dorka_grid\\Kepek\\letöltés.jfif")); // NOI18N

        javax.swing.GroupLayout pnlKepLayout = new javax.swing.GroupLayout(pnlKep);
        pnlKep.setLayout(pnlKepLayout);
        pnlKepLayout.setHorizontalGroup(
            pnlKepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlKepLayout.setVerticalGroup(
            pnlKepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Még egy feltét (nem kötelező)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 0, 12))); // NOI18N

        buttonGroup4.add(rdbMozzarella);
        rdbMozzarella.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbMozzarella.setText("mozzarella");

        buttonGroup4.add(rdbSajt);
        rdbSajt.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbSajt.setText("sajt");

        buttonGroup4.add(rdbSzalami);
        rdbSzalami.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        rdbSzalami.setText("szalámi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbSzalami)
                    .addComponent(rdbSajt)
                    .addComponent(rdbMozzarella))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rdbMozzarella)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbSzalami)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(102, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jButton1.setText("Mégse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlAlap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMeret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblElerhetoseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTeszta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFeltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdDb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtMegvesz, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlKep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlTeszta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlMeret, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlFeltet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlAlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(BtMegvesz, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDb))
                    .addComponent(lblElerhetoseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblElerhetosegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElerhetosegMouseClicked
        try {
            Desktop.getDesktop().browse(URI.create("http://www.google.com"));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_lblElerhetosegMouseClicked

    private void lblElerhetosegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElerhetosegMouseEntered
        lblElerhetoseg.setText("<html><a href=\"#\"><b>Elérhetőség</b></a></html>");
    }//GEN-LAST:event_lblElerhetosegMouseEntered

    private void lblElerhetosegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElerhetosegMouseExited
        lblElerhetoseg.setText("<html><a href=\"#\">Elérhetőség</a></html>");
    }//GEN-LAST:event_lblElerhetosegMouseExited

    private void BtMegveszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMegveszActionPerformed
        boolean PizzaValasztva = cmdDb.getSelectedIndex()> 0;
        String uzenet, cim = "Figyelem!";
        int ikonTipus;
        if(PizzaValasztva){
            uzenet = "Oké!";
            ikonTipus = JOptionPane.CANCEL_OPTION;
        }else{
            uzenet = "Nincs pizza választva!";
            ikonTipus = JOptionPane.WARNING_MESSAGE;
        }
        JOptionPane.showMessageDialog(null, uzenet, cim, ikonTipus);
    }//GEN-LAST:event_BtMegveszActionPerformed

    private void cmdDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDbActionPerformed
        String mennyiseg = (String) cmdDb.getSelectedItem();
        String uzenet = "kiválasztott mennyiség = " + mennyiseg;
        JOptionPane.showMessageDialog(rootPane, uzenet);
    }//GEN-LAST:event_cmdDbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtMegvesz;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cmdDb;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDb;
    private javax.swing.JLabel lblElerhetoseg;
    private javax.swing.JLabel lblKep;
    private javax.swing.JPanel pnlAlap;
    private javax.swing.JPanel pnlFeltet;
    private javax.swing.JPanel pnlKep;
    private javax.swing.JPanel pnlMeret;
    private javax.swing.JPanel pnlTeszta;
    private javax.swing.JRadioButton rbdTejfol;
    private javax.swing.JRadioButton rdbAnanasz;
    private javax.swing.JRadioButton rdbCm25;
    private javax.swing.JRadioButton rdbCm32;
    private javax.swing.JRadioButton rdbCm50;
    private javax.swing.JRadioButton rdbHagyma;
    private javax.swing.JRadioButton rdbHagyomanyos;
    private javax.swing.JRadioButton rdbMozzarella;
    private javax.swing.JRadioButton rdbOlasz;
    private javax.swing.JRadioButton rdbParadicsom;
    private javax.swing.JRadioButton rdbSajt;
    private javax.swing.JRadioButton rdbSonka;
    private javax.swing.JRadioButton rdbSzalami;
    private javax.swing.JRadioButton rdbTeljes;
    // End of variables declaration//GEN-END:variables
}
