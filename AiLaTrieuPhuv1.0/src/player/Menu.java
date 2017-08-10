package player;

public class Menu extends javax.swing.JFrame {
    
    private String username = "";

    /**
     * Creates new form Menu
     */
    public Menu(String username) {
        super("Ai là triệu phú");
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.username = username;
        LbHello.setText("Hello, " + this.username);
        btnAddQuestion();
    }
    
    //Nếu là admin sẽ hiện nút thêm câu hỏi và ngược lại
    private void btnAddQuestion() {
        if (this.username.equals("admin")) {
            addQuestion.setEnabled(true);
        }
        else {
            addQuestion.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LbHello = new javax.swing.JLabel();
        addQuestion = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        play.setText("Chơi ngay");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Chào mừng bạn đến với chương trình");

        LbHello.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbHello.setForeground(new java.awt.Color(255, 0, 51));
        LbHello.setText("Hello, ");

        addQuestion.setText("Thêm câu hỏi");
        addQuestion.setEnabled(false);
        addQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionActionPerformed(evt);
            }
        });

        exit.setText("Thoát");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(LbHello)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LbHello)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(play)
                .addGap(29, 29, 29)
                .addComponent(addQuestion)
                .addGap(30, 30, 30)
                .addComponent(exit)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Bắt đầu chơi game
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        MenuSS ss = new MenuSS();
        ss.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playActionPerformed

    //Thêm câu hỏi
    private void addQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionActionPerformed
        AddQuestion addQ = new AddQuestion();
        addQ.setVisible(true);
    }//GEN-LAST:event_addQuestionActionPerformed

    //Thoát
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbHello;
    private javax.swing.JButton addQuestion;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
