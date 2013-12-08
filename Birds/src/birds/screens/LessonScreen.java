/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package birds.screens;

import birds.graphics.Background;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Lukas
 */
public class LessonScreen extends Background {

    /**
     * Creates new form LessonScreen
     */
    public LessonScreen() {
        initComponents();
        this.BirdInfo.setBackground(new Color(255,255,255,0));
        this.BirdInfo.setForeground(new Color(0,0,0,255));
        this.Picture.setIcon(new ImageIcon("lib\\orel.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        background1 = new birds.graphics.Background();
        Popis = new javax.swing.JLabel();
        LessonChooser = new javax.swing.JComboBox();
        Picture = new javax.swing.JLabel();
        baseStat = new birds.graphics.LessonPanel();
        jmenoLabel = new javax.swing.JLabel();
        radLabel = new javax.swing.JLabel();
        celedLabel = new javax.swing.JLabel();
        jmeno = new javax.swing.JLabel();
        celed = new javax.swing.JLabel();
        rad = new javax.swing.JLabel();
        celedLabel1 = new javax.swing.JLabel();
        celed1 = new javax.swing.JLabel();
        BirdInfo = new birds.graphics.TextArea();

        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));

        Popis.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        Popis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Popis.setText("Výukový program na znalost ptáků ČR");
        Popis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Popis.setMaximumSize(new java.awt.Dimension(500, 80));
        Popis.setMinimumSize(new java.awt.Dimension(500, 80));
        Popis.setPreferredSize(new java.awt.Dimension(500, 80));

        LessonChooser.setBackground(new java.awt.Color(252, 197, 80));
        LessonChooser.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        LessonChooser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lekce č. 1", "Lekce č. 2", "Lekce č. 3", "Lekce č. 4", "Lekce č. 5", "Lekce č. 6", "Lekce č. 7", "Lekce č. 8", "Lekce č. 9", "Lekce č. 10" }));

        Picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 197, 80), 4));

        baseStat.setOpaque(false);

        jmenoLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jmenoLabel.setText("Jméno:");

        radLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        radLabel.setText("Řád:");

        celedLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        celedLabel.setText("Čeleď:");

        jmeno.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jmeno.setText("Orel Bělohlavý");

        celed.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        celed.setText("jestřábovití");

        rad.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        rad.setText("dravci");

        celedLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        celedLabel1.setText("Rod:");

        celed1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        celed1.setText("orel");

        javax.swing.GroupLayout baseStatLayout = new javax.swing.GroupLayout(baseStat);
        baseStat.setLayout(baseStatLayout);
        baseStatLayout.setHorizontalGroup(
            baseStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseStatLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(baseStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseStatLayout.createSequentialGroup()
                        .addComponent(celedLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celed1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                    .addGroup(baseStatLayout.createSequentialGroup()
                        .addComponent(jmenoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jmeno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(baseStatLayout.createSequentialGroup()
                        .addComponent(radLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rad, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                    .addGroup(baseStatLayout.createSequentialGroup()
                        .addComponent(celedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celed, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        baseStatLayout.setVerticalGroup(
            baseStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseStatLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(baseStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmenoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmeno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(baseStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celed, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(baseStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(celedLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celed1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        BirdInfo.setEditable(false);
        BirdInfo.setBorder(null);
        BirdInfo.setColumns(20);
        BirdInfo.setRows(5);
        BirdInfo.setTabSize(4);
        BirdInfo.setText("\n        Popis:\n        Dospělý jedinec má hnědé peří na těle a bílé na hlavě a ocasu. \n        Ocas nemá příliš dlouhý a jeho tvar poněkud připomíná \n        trojúhelník. Samci i samice jsou zbarveni stejně. Zobák,\n        pařáty a duhovky má orel bělohlavý svítivě žluté. \n        Na neopeřených pařátech má krátké silné prsty s velkými drápy. ");
        BirdInfo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        BirdInfo.setMaximumSize(new java.awt.Dimension(500, 200));
        BirdInfo.setMinimumSize(new java.awt.Dimension(500, 200));
        BirdInfo.setPreferredSize(new java.awt.Dimension(500, 200));
        BirdInfo.setRequestFocusEnabled(false);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(LessonChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(baseStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BirdInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(250, 250, 250))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Popis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(LessonChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baseStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(BirdInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background1.setBounds(0, 0, 1000, 700);
        jLayeredPane1.add(background1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private birds.graphics.TextArea BirdInfo;
    private javax.swing.JComboBox LessonChooser;
    private javax.swing.JLabel Picture;
    private javax.swing.JLabel Popis;
    private birds.graphics.Background background1;
    private birds.graphics.LessonPanel baseStat;
    private javax.swing.JLabel celed;
    private javax.swing.JLabel celed1;
    private javax.swing.JLabel celedLabel;
    private javax.swing.JLabel celedLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jmeno;
    private javax.swing.JLabel jmenoLabel;
    private javax.swing.JLabel rad;
    private javax.swing.JLabel radLabel;
    // End of variables declaration//GEN-END:variables
}
