/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.screens;

import birds.graphics.Background;
import java.awt.Color;

/**
 *
 * @author Lukas
 */
public class ClassicTestScreen extends Background {

    /**
     * Creates new form ClassicTestScreen
     */
    public ClassicTestScreen() {
        initComponents();
        this.Question.setBackground(new Color(255,255,255,0));
        this.Question.setForeground(new Color(0,0,0,255));
        this.Test.setVisible(true);
        this.Vyhodnoceni.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vrstva = new javax.swing.JLayeredPane();
        Test = new birds.graphics.Background();
        Popis = new javax.swing.JLabel();
        TestProgress = new javax.swing.JProgressBar();
        previousQ = new javax.swing.JButton();
        nextQ = new javax.swing.JButton();
        Question = new birds.graphics.TextArea();
        AnswerA = new birds.graphics.CheckButton();
        AnswerB = new birds.graphics.CheckButton();
        AnswerC = new birds.graphics.CheckButton();
        AnswerD = new birds.graphics.CheckButton();
        Vyhodnoceni = new birds.graphics.Background();
        Popis1 = new javax.swing.JLabel();
        Potvrdit = new javax.swing.JButton();
        TestProgress1 = new javax.swing.JProgressBar();
        VyhodnoceniPanel = new birds.graphics.loginPanel();
        Quest5 = new javax.swing.JRadioButton();
        Quest6 = new javax.swing.JRadioButton();
        Quest7 = new javax.swing.JRadioButton();
        Quest8 = new javax.swing.JRadioButton();
        Quest9 = new javax.swing.JRadioButton();
        Quest10 = new javax.swing.JRadioButton();
        Quest1 = new javax.swing.JRadioButton();
        Quest4 = new javax.swing.JRadioButton();
        Quest2 = new javax.swing.JRadioButton();
        Quest3 = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));

        vrstva.setPreferredSize(new java.awt.Dimension(1000, 700));

        Popis.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        Popis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Popis.setText("Klasický test");
        Popis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Popis.setMaximumSize(new java.awt.Dimension(500, 80));
        Popis.setMinimumSize(new java.awt.Dimension(500, 80));
        Popis.setPreferredSize(new java.awt.Dimension(500, 80));

        TestProgress.setForeground(new java.awt.Color(252, 197, 80));
        TestProgress.setMaximum(10);
        TestProgress.setString("");
        TestProgress.setStringPainted(true);

        previousQ.setBackground(new java.awt.Color(252, 197, 80));
        previousQ.setFont(new java.awt.Font("Impact", 0, 120)); // NOI18N
        previousQ.setText("<");
        previousQ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        previousQ.setFocusable(false);
        previousQ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        previousQ.setMaximumSize(new java.awt.Dimension(300, 70));
        previousQ.setMinimumSize(new java.awt.Dimension(300, 70));
        previousQ.setPreferredSize(new java.awt.Dimension(100, 100));
        previousQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousQActionPerformed(evt);
            }
        });

        nextQ.setBackground(new java.awt.Color(252, 197, 80));
        nextQ.setFont(new java.awt.Font("Impact", 0, 120)); // NOI18N
        nextQ.setText(">");
        nextQ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 171, 0), 8, true));
        nextQ.setFocusable(false);
        nextQ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nextQ.setMaximumSize(new java.awt.Dimension(300, 70));
        nextQ.setMinimumSize(new java.awt.Dimension(300, 70));
        nextQ.setPreferredSize(new java.awt.Dimension(100, 100));
        nextQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQActionPerformed(evt);
            }
        });

        Question.setEditable(false);
        Question.setBorder(null);
        Question.setColumns(20);
        Question.setRows(5);
        Question.setTabSize(4);
        Question.setText("\n\n\tTohle je testovaci otazka ");
        Question.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Question.setMaximumSize(new java.awt.Dimension(500, 200));
        Question.setMinimumSize(new java.awt.Dimension(500, 200));
        Question.setPreferredSize(new java.awt.Dimension(500, 200));
        Question.setRequestFocusEnabled(false);

        AnswerA.setText("Odpověď A");
        AnswerA.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        AnswerA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AnswerA.setIconTextGap(20);
        AnswerA.setOpaque(false);
        AnswerA.setPreferredSize(new java.awt.Dimension(300, 70));
        AnswerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerAActionPerformed(evt);
            }
        });

        AnswerB.setText("Odpověď B");
        AnswerB.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        AnswerB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AnswerB.setIconTextGap(20);
        AnswerB.setOpaque(false);
        AnswerB.setPreferredSize(new java.awt.Dimension(300, 70));
        AnswerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerBActionPerformed(evt);
            }
        });

        AnswerC.setText("Odpověď C");
        AnswerC.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        AnswerC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AnswerC.setIconTextGap(20);
        AnswerC.setOpaque(false);
        AnswerC.setPreferredSize(new java.awt.Dimension(300, 70));
        AnswerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerCActionPerformed(evt);
            }
        });

        AnswerD.setText("Odpověď D");
        AnswerD.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        AnswerD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AnswerD.setIconTextGap(20);
        AnswerD.setOpaque(false);
        AnswerD.setPreferredSize(new java.awt.Dimension(300, 70));
        AnswerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TestLayout = new javax.swing.GroupLayout(Test);
        Test.setLayout(TestLayout);
        TestLayout.setHorizontalGroup(
            TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestLayout.createSequentialGroup()
                .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TestLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(previousQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TestLayout.createSequentialGroup()
                                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(nextQ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TestLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TestProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(TestLayout.createSequentialGroup()
                                .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        TestLayout.setVerticalGroup(
            TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestLayout.createSequentialGroup()
                .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TestLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(nextQ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TestLayout.createSequentialGroup()
                        .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TestLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TestLayout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(previousQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107)
                        .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(TestProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Test.setBounds(0, 0, 1000, 700);
        vrstva.add(Test, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Popis1.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        Popis1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Popis1.setText("Klasický test - Vyhodnocení");
        Popis1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Popis1.setMaximumSize(new java.awt.Dimension(500, 80));
        Popis1.setMinimumSize(new java.awt.Dimension(500, 80));
        Popis1.setPreferredSize(new java.awt.Dimension(500, 80));

        Potvrdit.setBackground(new java.awt.Color(252, 197, 80));
        Potvrdit.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Potvrdit.setText("Potvrdit vyhodnocení");
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

        TestProgress1.setForeground(new java.awt.Color(252, 197, 80));
        TestProgress1.setMaximum(10);
        TestProgress1.setToolTipText("");
        TestProgress1.setValue(10);
        TestProgress1.setString("");
        TestProgress1.setStringPainted(true);

        VyhodnoceniPanel.setOpaque(false);
        VyhodnoceniPanel.setPreferredSize(new java.awt.Dimension(300, 400));

        Quest5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest5.setText("Otázka č. 5");
        Quest5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest5MouseClicked(evt);
            }
        });

        Quest6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest6.setText("Otázka č. 6");
        Quest6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest6MouseClicked(evt);
            }
        });

        Quest7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest7.setText("Otázka č. 7");
        Quest7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest7MouseClicked(evt);
            }
        });

        Quest8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest8.setText("Otázka č. 8");
        Quest8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest8MouseClicked(evt);
            }
        });

        Quest9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest9.setText("Otázka č. 9");
        Quest9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest9MouseClicked(evt);
            }
        });

        Quest10.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest10.setText("Otázka č. 10");
        Quest10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest10MouseClicked(evt);
            }
        });

        Quest1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest1.setText("Otázka č. 1");
        Quest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest1MouseClicked(evt);
            }
        });

        Quest4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest4.setText("Otázka č. 4");
        Quest4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest4MouseClicked(evt);
            }
        });

        Quest2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest2.setText("Otázka č. 2");
        Quest2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest2MouseClicked(evt);
            }
        });

        Quest3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Quest3.setText("Otázka č. 3");
        Quest3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Quest3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VyhodnoceniPanelLayout = new javax.swing.GroupLayout(VyhodnoceniPanel);
        VyhodnoceniPanel.setLayout(VyhodnoceniPanelLayout);
        VyhodnoceniPanelLayout.setHorizontalGroup(
            VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VyhodnoceniPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(VyhodnoceniPanelLayout.createSequentialGroup()
                            .addComponent(Quest4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Quest9))
                        .addGroup(VyhodnoceniPanelLayout.createSequentialGroup()
                            .addComponent(Quest3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Quest8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VyhodnoceniPanelLayout.createSequentialGroup()
                            .addComponent(Quest2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Quest7))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VyhodnoceniPanelLayout.createSequentialGroup()
                            .addComponent(Quest1)
                            .addGap(56, 56, 56)
                            .addComponent(Quest6)))
                    .addGroup(VyhodnoceniPanelLayout.createSequentialGroup()
                        .addComponent(Quest5)
                        .addGap(54, 54, 54)
                        .addComponent(Quest10)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        VyhodnoceniPanelLayout.setVerticalGroup(
            VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VyhodnoceniPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quest1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quest6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quest7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quest2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quest3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quest8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quest4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quest9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(VyhodnoceniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quest5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quest10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VyhodnoceniLayout = new javax.swing.GroupLayout(Vyhodnoceni);
        Vyhodnoceni.setLayout(VyhodnoceniLayout);
        VyhodnoceniLayout.setHorizontalGroup(
            VyhodnoceniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VyhodnoceniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VyhodnoceniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VyhodnoceniLayout.createSequentialGroup()
                        .addComponent(TestProgress1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VyhodnoceniLayout.createSequentialGroup()
                        .addComponent(Potvrdit, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))))
            .addGroup(VyhodnoceniLayout.createSequentialGroup()
                .addGroup(VyhodnoceniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VyhodnoceniLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(Popis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VyhodnoceniLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(VyhodnoceniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VyhodnoceniLayout.setVerticalGroup(
            VyhodnoceniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VyhodnoceniLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Popis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VyhodnoceniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Potvrdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(TestProgress1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Vyhodnoceni.setBounds(0, 0, 1000, 700);
        vrstva.add(Vyhodnoceni, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vrstva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vrstva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerAActionPerformed
        if (this.AnswerA.isSelected()){
            this.AnswerB.setSelected(false);
            this.AnswerC.setSelected(false);
            this.AnswerD.setSelected(false);
        }
    }//GEN-LAST:event_AnswerAActionPerformed

    private void AnswerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerBActionPerformed
        if (this.AnswerB.isSelected()){
            this.AnswerA.setSelected(false);
            this.AnswerC.setSelected(false);
            this.AnswerD.setSelected(false);
        }
    }//GEN-LAST:event_AnswerBActionPerformed

    private void AnswerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerCActionPerformed
        if (this.AnswerC.isSelected()){
            this.AnswerB.setSelected(false);
            this.AnswerA.setSelected(false);
            this.AnswerD.setSelected(false);
        }
    }//GEN-LAST:event_AnswerCActionPerformed

    private void AnswerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerDActionPerformed
        if (this.AnswerD.isSelected()){
            this.AnswerB.setSelected(false);
            this.AnswerC.setSelected(false);
            this.AnswerA.setSelected(false);
        }
    }//GEN-LAST:event_AnswerDActionPerformed

    private void nextQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQActionPerformed
        this.TestProgress.setValue(this.TestProgress.getValue()+1);
        if (this.TestProgress.getValue() == 10){
            this.Test.setVisible(false);
            this.Vyhodnoceni.setVisible(true);
        }
    }//GEN-LAST:event_nextQActionPerformed

    private void previousQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousQActionPerformed

        this.TestProgress.setValue(this.TestProgress.getValue()-1);
    }//GEN-LAST:event_previousQActionPerformed

    private void Quest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest1MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(0);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest1MouseClicked

    private void Quest2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest2MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(1);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest2MouseClicked

    private void Quest3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest3MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(2);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest3MouseClicked

    private void Quest4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest4MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(3);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest4MouseClicked

    private void Quest5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest5MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(4);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest5MouseClicked

    private void Quest6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest6MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(5);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest6MouseClicked

    private void Quest7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest7MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(6);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest7MouseClicked

    private void Quest8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest8MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(7);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest8MouseClicked

    private void Quest9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest9MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(8);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest9MouseClicked

    private void Quest10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest10MouseClicked
        this.Vyhodnoceni.setVisible(false);
        this.TestProgress.setValue(9);
        this.Test.setVisible(true);
    }//GEN-LAST:event_Quest10MouseClicked

    private void PotvrditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotvrditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PotvrditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private birds.graphics.CheckButton AnswerA;
    private birds.graphics.CheckButton AnswerB;
    private birds.graphics.CheckButton AnswerC;
    private birds.graphics.CheckButton AnswerD;
    private javax.swing.JLabel Popis;
    private javax.swing.JLabel Popis1;
    private javax.swing.JButton Potvrdit;
    private javax.swing.JRadioButton Quest1;
    private javax.swing.JRadioButton Quest10;
    private javax.swing.JRadioButton Quest2;
    private javax.swing.JRadioButton Quest3;
    private javax.swing.JRadioButton Quest4;
    private javax.swing.JRadioButton Quest5;
    private javax.swing.JRadioButton Quest6;
    private javax.swing.JRadioButton Quest7;
    private javax.swing.JRadioButton Quest8;
    private javax.swing.JRadioButton Quest9;
    private birds.graphics.TextArea Question;
    private birds.graphics.Background Test;
    private javax.swing.JProgressBar TestProgress;
    private javax.swing.JProgressBar TestProgress1;
    private birds.graphics.Background Vyhodnoceni;
    private birds.graphics.loginPanel VyhodnoceniPanel;
    private javax.swing.JButton nextQ;
    private javax.swing.JButton previousQ;
    private javax.swing.JLayeredPane vrstva;
    // End of variables declaration//GEN-END:variables
}
