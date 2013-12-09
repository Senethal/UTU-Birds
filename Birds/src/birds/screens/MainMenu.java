/*
 * Projekt ITU
 * Výukový program na znalost ptáků
 * Třída implementujici hlavni menu a jeho obsluhu
 * 
 */
package birds.screens;

import birds.graphics.Background;

/**
 *
 * @author Lukas
 */
public class MainMenu extends Background {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        super();
        initComponents();
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popis = new javax.swing.JLabel();
        Vyuka = new javax.swing.JButton();
        Testy = new javax.swing.JButton();
        Vysledky = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));

        Popis.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        Popis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Popis.setText("Výukový program na znalost ptáků ČR");
        Popis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Popis.setMaximumSize(new java.awt.Dimension(500, 80));
        Popis.setMinimumSize(new java.awt.Dimension(500, 80));
        Popis.setPreferredSize(new java.awt.Dimension(500, 80));

        Vyuka.setBackground(new java.awt.Color(252, 197, 80));
        Vyuka.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Vyuka.setText("Výuka");
        Vyuka.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        Vyuka.setFocusable(false);
        Vyuka.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Vyuka.setMaximumSize(new java.awt.Dimension(300, 70));
        Vyuka.setMinimumSize(new java.awt.Dimension(300, 70));
        Vyuka.setPreferredSize(new java.awt.Dimension(300, 70));
        Vyuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VyukaActionPerformed(evt);
            }
        });

        Testy.setBackground(new java.awt.Color(252, 197, 80));
        Testy.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Testy.setText("Testy");
        Testy.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        Testy.setFocusable(false);
        Testy.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Testy.setMaximumSize(new java.awt.Dimension(300, 70));
        Testy.setMinimumSize(new java.awt.Dimension(300, 70));
        Testy.setPreferredSize(new java.awt.Dimension(300, 70));
        Testy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestyActionPerformed(evt);
            }
        });

        Vysledky.setBackground(new java.awt.Color(252, 197, 80));
        Vysledky.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Vysledky.setText("Výsledky");
        Vysledky.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        Vysledky.setFocusable(false);
        Vysledky.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Vysledky.setMaximumSize(new java.awt.Dimension(300, 70));
        Vysledky.setMinimumSize(new java.awt.Dimension(300, 70));
        Vysledky.setPreferredSize(new java.awt.Dimension(300, 70));
        Vysledky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VysledkyActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(252, 197, 80));
        logout.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        logout.setText("Odhlásit");
        logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        logout.setFocusable(false);
        logout.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logout.setMaximumSize(new java.awt.Dimension(300, 70));
        logout.setMinimumSize(new java.awt.Dimension(300, 70));
        logout.setPreferredSize(new java.awt.Dimension(300, 70));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(Testy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(Vyuka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Vysledky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Vyuka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Testy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Vysledky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    /*
     * Tlacitko pro odhlaseni bylo stisknuto
     */
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       this.Okno.setHlavniMenuVisible(false);
       this.Okno.setprihlObrazovkaVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void TestyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestyActionPerformed
        this.Okno.setHlavniMenuVisible(false);
        this.Okno.setvyberTestuObrazovkaObrazovkaVisible(true);
    }//GEN-LAST:event_TestyActionPerformed

    private void VyukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VyukaActionPerformed
        this.Okno.setHlavniMenuVisible(false);
        this.Okno.setlekceObrazovkaVisible(true);
    }//GEN-LAST:event_VyukaActionPerformed

    private void VysledkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VysledkyActionPerformed
        this.Okno.setHlavniMenuVisible(false);
        this.Okno.setstatistikyObrazovkaVisible(true);
    }//GEN-LAST:event_VysledkyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Popis;
    private javax.swing.JButton Testy;
    private javax.swing.JButton Vysledky;
    private javax.swing.JButton Vyuka;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
