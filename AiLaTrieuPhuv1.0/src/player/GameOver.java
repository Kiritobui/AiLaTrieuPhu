package player;

public class GameOver extends javax.swing.JFrame {
    
    private int ketQua = 0;

    /**
     * Creates new form GameOver
     * @param ketQua
     */
    public GameOver(int ketQua) {
        super("Ai là triệu phú");
        setLocationRelativeTo(null);
        setResizable(false);
        this.ketQua = ketQua;
        initComponents();
        score();
    }
    
    //Điểm đạt được
    private void score() {
        String score = "Điểm số: " + String.valueOf(this.ketQua);
        LbScore.setText(score);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        LbScore = new javax.swing.JLabel();
        btnRePlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GAME OVER");

        btnCancel.setText("Thoát");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        LbScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnRePlay.setText("Chơi lại");
        btnRePlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRePlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRePlay)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(LbScore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(LbScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnRePlay))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Thoát
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    //Chơi lại
    private void btnRePlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRePlayActionPerformed
        this.dispose();
        play replay = new play();
        replay.setVisible(true);
    }//GEN-LAST:event_btnRePlayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbScore;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRePlay;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
