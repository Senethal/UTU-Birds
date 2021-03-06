/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.screens;

import birds.graphics.Background;

/**
 *
 * @author Lukas
 */
public class TestChooseScreen extends Background {

    /**
     * Creates new form TestChooseScreen
     */
    public TestChooseScreen() {
        initComponents();
        this.TestPanel.setVisible(true);
        this.DifficultTestPanel.setVisible(false);
        this.Potvrdit.setEnabled(false);
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
        Potvrdit = new javax.swing.JButton();
        BackToMenu = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        DifficultTestPanel = new birds.graphics.loginPanel();
        TestLabel = new javax.swing.JLabel();
        DifficultPanel = new javax.swing.JPanel();
        Easy = new javax.swing.JRadioButton();
        Medium = new javax.swing.JRadioButton();
        Hard = new javax.swing.JRadioButton();
        DifficultLabel = new javax.swing.JLabel();
        LessonChooser = new javax.swing.JComboBox();
        BackButton = new javax.swing.JButton();
        TestPanel = new birds.graphics.loginPanel();
        ClassicTestButton = new javax.swing.JButton();
        PictureTestButton = new javax.swing.JButton();
        FillTestButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));

        Popis.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        Popis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Popis.setText("Výběr testu");
        Popis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Popis.setMaximumSize(new java.awt.Dimension(500, 80));
        Popis.setMinimumSize(new java.awt.Dimension(500, 80));
        Popis.setPreferredSize(new java.awt.Dimension(500, 80));

        Potvrdit.setBackground(new java.awt.Color(252, 197, 80));
        Potvrdit.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Potvrdit.setText("Potvrdit výběr");
        Potvrdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        Potvrdit.setFocusable(false);
        Potvrdit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Potvrdit.setMaximumSize(new java.awt.Dimension(300, 70));
        Potvrdit.setMinimumSize(new java.awt.Dimension(300, 70));
        Potvrdit.setPreferredSize(new java.awt.Dimension(300, 70));
        Potvrdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotvrditActionPerformed(evt);
            }
        });

        BackToMenu.setBackground(new java.awt.Color(252, 197, 80));
        BackToMenu.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        BackToMenu.setText("Hlavní menu");
        BackToMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        BackToMenu.setFocusable(false);
        BackToMenu.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BackToMenu.setMaximumSize(new java.awt.Dimension(300, 70));
        BackToMenu.setMinimumSize(new java.awt.Dimension(300, 70));
        BackToMenu.setPreferredSize(new java.awt.Dimension(300, 70));
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        DifficultTestPanel.setOpaque(false);

        TestLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TestLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TestLabel.setText("Klasický test");
        TestLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        DifficultPanel.setOpaque(false);

        Easy.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Easy.setText("Snadná");
        Easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EasyActionPerformed(evt);
            }
        });

        Medium.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Medium.setText("Střední");
        Medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumActionPerformed(evt);
            }
        });

        Hard.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Hard.setText("Těžká");
        Hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardActionPerformed(evt);
            }
        });

        DifficultLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        DifficultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DifficultLabel.setText("Obtížnost");
        DifficultLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout DifficultPanelLayout = new javax.swing.GroupLayout(DifficultPanel);
        DifficultPanel.setLayout(DifficultPanelLayout);
        DifficultPanelLayout.setHorizontalGroup(
            DifficultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(DifficultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hard, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Medium, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Easy, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(DifficultPanelLayout.createSequentialGroup()
                .addComponent(DifficultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DifficultPanelLayout.setVerticalGroup(
            DifficultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(DifficultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Easy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Medium, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LessonChooser.setBackground(new java.awt.Color(251, 171, 0));
        LessonChooser.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        LessonChooser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. - 3. lekce", "4. - 6. lekce", "7. - 8. lekce", "všechny lekce" }));

        BackButton.setBackground(new java.awt.Color(252, 197, 80));
        BackButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        BackButton.setText("Zpět");
        BackButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        BackButton.setFocusable(false);
        BackButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BackButton.setMaximumSize(new java.awt.Dimension(300, 70));
        BackButton.setMinimumSize(new java.awt.Dimension(300, 70));
        BackButton.setPreferredSize(new java.awt.Dimension(300, 70));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DifficultTestPanelLayout = new javax.swing.GroupLayout(DifficultTestPanel);
        DifficultTestPanel.setLayout(DifficultTestPanelLayout);
        DifficultTestPanelLayout.setHorizontalGroup(
            DifficultTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultTestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DifficultTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DifficultTestPanelLayout.createSequentialGroup()
                        .addComponent(TestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DifficultTestPanelLayout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(DifficultTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LessonChooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DifficultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(63, 63, 63))))
        );
        DifficultTestPanelLayout.setVerticalGroup(
            DifficultTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultTestPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(DifficultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(LessonChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        DifficultTestPanel.setBounds(0, 0, 300, 400);
        jLayeredPane1.add(DifficultTestPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TestPanel.setOpaque(false);

        ClassicTestButton.setBackground(new java.awt.Color(252, 197, 80));
        ClassicTestButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        ClassicTestButton.setText("Klasický test");
        ClassicTestButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        ClassicTestButton.setFocusable(false);
        ClassicTestButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ClassicTestButton.setMaximumSize(new java.awt.Dimension(300, 70));
        ClassicTestButton.setMinimumSize(new java.awt.Dimension(300, 70));
        ClassicTestButton.setPreferredSize(new java.awt.Dimension(300, 70));
        ClassicTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassicTestButtonActionPerformed(evt);
            }
        });

        PictureTestButton.setBackground(new java.awt.Color(252, 197, 80));
        PictureTestButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        PictureTestButton.setText("Poznávací test");
        PictureTestButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        PictureTestButton.setFocusable(false);
        PictureTestButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PictureTestButton.setMaximumSize(new java.awt.Dimension(300, 70));
        PictureTestButton.setMinimumSize(new java.awt.Dimension(300, 70));
        PictureTestButton.setPreferredSize(new java.awt.Dimension(300, 70));
        PictureTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PictureTestButtonActionPerformed(evt);
            }
        });

        FillTestButton.setBackground(new java.awt.Color(252, 197, 80));
        FillTestButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        FillTestButton.setText("Doplňovací test");
        FillTestButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        FillTestButton.setFocusable(false);
        FillTestButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        FillTestButton.setMaximumSize(new java.awt.Dimension(300, 70));
        FillTestButton.setMinimumSize(new java.awt.Dimension(300, 70));
        FillTestButton.setPreferredSize(new java.awt.Dimension(300, 70));
        FillTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillTestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TestPanelLayout = new javax.swing.GroupLayout(TestPanel);
        TestPanel.setLayout(TestPanelLayout);
        TestPanelLayout.setHorizontalGroup(
            TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClassicTestButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PictureTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        TestPanelLayout.setVerticalGroup(
            TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestPanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(ClassicTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(PictureTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(FillTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        TestPanel.setBounds(0, 0, 300, 400);
        jLayeredPane1.add(TestPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Potvrdit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Potvrdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ClassicTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassicTestButtonActionPerformed
        
        this.TestPanel.setVisible(false);
        this.TestLabel.setText("Klasický test");
        this.Easy.setSelected(true);
        this.DifficultTestPanel.setVisible(true);
        this.Potvrdit.setEnabled(true);
        this.TestType = 1;
    }//GEN-LAST:event_ClassicTestButtonActionPerformed

    private void PictureTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PictureTestButtonActionPerformed
        this.TestPanel.setVisible(false);
        this.TestLabel.setText("Poznávací test");
        this.Easy.setSelected(true);
        this.DifficultTestPanel.setVisible(true);
        this.Potvrdit.setEnabled(true);
        this.TestType = 2;
    }//GEN-LAST:event_PictureTestButtonActionPerformed

    private void FillTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillTestButtonActionPerformed
        this.TestPanel.setVisible(false);
        this.TestLabel.setText("Doplňovací test");
        this.Easy.setSelected(true);
        this.DifficultTestPanel.setVisible(true);
        this.Potvrdit.setEnabled(true);
        this.TestType = 3;
    }//GEN-LAST:event_FillTestButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.DifficultTestPanel.setVisible(false);
        this.TestPanel.setVisible(true);
        this.Potvrdit.setEnabled(false);
        this.TestType = 0;
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        this.Okno.setvyberTestuObrazovkaObrazovkaVisible(false);
        this.Okno.setHlavniMenuVisible(true);
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void EasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EasyActionPerformed
        if(this.Easy.isSelected()){
            this.Medium.setSelected(false);
            this.Hard.setSelected(false);
        }
    }//GEN-LAST:event_EasyActionPerformed

    private void MediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumActionPerformed
        if(this.Medium.isSelected()){
            this.Easy.setSelected(false);
            this.Hard.setSelected(false);
        }
    }//GEN-LAST:event_MediumActionPerformed

    private void HardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardActionPerformed
        if(this.Hard.isSelected()){
            this.Medium.setSelected(false);
            this.Easy.setSelected(false);
        }
    }//GEN-LAST:event_HardActionPerformed

    private void PotvrditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotvrditActionPerformed
        if (this.TestType != 0){
            this.DifficultTestPanel.setVisible(false);
            this.TestPanel.setVisible(true);
            this.Okno.setTypeTest(TestType);
            this.Okno.setLesson(this.LessonChooser.getSelectedIndex());
            switch (this.TestType){
                case 1:{
                            this.Okno.setvyberTestuObrazovkaObrazovkaVisible(false);
                            this.Okno.setklasickyTestObrazovkaVisible(true);
                            this.Okno.createNewClassic();
                            break;
                       }
                case 2:{
                            this.Okno.setvyberTestuObrazovkaObrazovkaVisible(false);
                            this.Okno.setobrazTestObrazovkaVisible(true);
                            this.Okno.createNewPicture();
                            break;
                        }
                case 3:{
                            break;
                        }    
            
            }
            
            
        }
    }//GEN-LAST:event_PotvrditActionPerformed

    
    private int TestType = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackToMenu;
    private javax.swing.JButton ClassicTestButton;
    private javax.swing.JLabel DifficultLabel;
    private javax.swing.JPanel DifficultPanel;
    private birds.graphics.loginPanel DifficultTestPanel;
    private javax.swing.JRadioButton Easy;
    private javax.swing.JButton FillTestButton;
    private javax.swing.JRadioButton Hard;
    private javax.swing.JComboBox LessonChooser;
    private javax.swing.JRadioButton Medium;
    private javax.swing.JButton PictureTestButton;
    private javax.swing.JLabel Popis;
    private javax.swing.JButton Potvrdit;
    private javax.swing.JLabel TestLabel;
    private birds.graphics.loginPanel TestPanel;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
