package player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class play extends javax.swing.JFrame {
    
    Connection conn = new Database().connect();
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String dapAnDung = "";
    private String CauTraLoi = "A";
    private int score = -1;
    private int level = 0;

    /**
     * Creates new form formCauHoi
     */
    public play() {
        super("Ai là triệu phú");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        choi();
    }
    
    private void choi() {
        layCauHoi();
        score++;
        level++;
        LbScore.setText(String.valueOf(score));
        LbLevel.setText(String.valueOf(level));
        bg.clearSelection();
    }
    
    //Lấy ngẫu nhiên 1 câu hỏi trong database
    private void layCauHoi() {
        int id = ranId(1, tongSoCauHoi());
        String sql = "SELECT * FROM questions WHERE id = ? ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next()) {
                String ch = rs.getString("question");
                txtQuestion.setText(ch);
                rA.setText("A." + rs.getString("A"));
                rB.setText("B." + rs.getString("B"));
                rC.setText("C." + rs.getString("C"));
                rD.setText("D." + rs.getString("D"));
                dapAnDung = rs.getString("Answer");
            }
        }
        catch(Exception e) {
            System.out.println("Error!");
        }
    }
    
    //Tổng số câu hỏi trong db
    private int tongSoCauHoi() {
        String sql = "SELECT * FROM questions";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.last();
            return rs.getInt(1);
        }
        catch(Exception e) {
            
        }
        return 0;
    }
    
    //random số ngẫu nhiên trong khoảng min đến max
    private int ranId(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        rA = new javax.swing.JRadioButton();
        rB = new javax.swing.JRadioButton();
        rC = new javax.swing.JRadioButton();
        rD = new javax.swing.JRadioButton();
        btnDapan = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        lbScore = new javax.swing.JLabel();
        lbLv = new javax.swing.JLabel();
        LbScore = new javax.swing.JLabel();
        LbLevel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        rA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAActionPerformed(evt);
            }
        });

        rB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBActionPerformed(evt);
            }
        });

        rC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCActionPerformed(evt);
            }
        });

        rD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDActionPerformed(evt);
            }
        });

        btnDapan.setText("TRẢ LỜI");
        btnDapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDapanActionPerformed(evt);
            }
        });

        btnStop.setText("STOP");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        lbScore.setText("Score: ");

        lbLv.setText("Level: ");

        LbScore.setForeground(new java.awt.Color(255, 0, 0));

        LbLevel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbScore)
                        .addGap(3, 3, 3)
                        .addComponent(LbScore)
                        .addGap(52, 52, 52)
                        .addComponent(lbLv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStop))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rC)
                            .addComponent(rA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rB)
                            .addComponent(rD))
                        .addGap(45, 45, 45)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDapan)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStop)
                    .addComponent(lbScore)
                    .addComponent(lbLv)
                    .addComponent(LbScore)
                    .addComponent(LbLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rB)
                    .addComponent(rA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rC)
                    .addComponent(rD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDapan)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Dừng cuộc chơi
    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        this.dispose();
        GameOver go = new GameOver(score);
        go.setVisible(true);
    }//GEN-LAST:event_btnStopActionPerformed

    //Trả lời câu hỏi
    private void btnDapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDapanActionPerformed
        JOptionPane.showConfirmDialog(null, "Bạn chắc chắn chứ?");
        if(CauTraLoi.equalsIgnoreCase(dapAnDung.trim())) {
            choi();
        }
        else {
            this.dispose();
            GameOver go = new GameOver(score);
            go.setVisible(true);
        }
    }//GEN-LAST:event_btnDapanActionPerformed

    //Nhóm đáp án
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        bg.add(rA);
        bg.add(rB);
        bg.add(rC);
        bg.add(rD);
    }//GEN-LAST:event_formWindowOpened

    private void rAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAActionPerformed
        CauTraLoi = "A";
    }//GEN-LAST:event_rAActionPerformed

    private void rBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBActionPerformed
        CauTraLoi = "B";
    }//GEN-LAST:event_rBActionPerformed

    private void rCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCActionPerformed
        CauTraLoi = "C";
    }//GEN-LAST:event_rCActionPerformed

    private void rDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDActionPerformed
        CauTraLoi = "D";
    }//GEN-LAST:event_rDActionPerformed
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbLevel;
    private javax.swing.JLabel LbScore;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton btnDapan;
    private javax.swing.JButton btnStop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLv;
    private javax.swing.JLabel lbScore;
    private javax.swing.JRadioButton rA;
    private javax.swing.JRadioButton rB;
    private javax.swing.JRadioButton rC;
    private javax.swing.JRadioButton rD;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
