
package game;

/**
 * Shows the user's progress
 * @author Hailey Pong
 */
public class Progress extends javax.swing.JFrame {

    private Player player;

    /**
     * Constructor
     * 
     * @param player 
     */
    public Progress(Player player) {
        initComponents();
        this.player = player;
        setProgColour();
    }


    /**
     * displays progress bar
     */
    public void setProgColour() {
        if (player.getProg() == 3) {
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hard.png"))); 
            easy.setBackground(new java.awt.Color(102, 102, 255));
            med.setBackground(new java.awt.Color(102, 102, 255));
            hard.setBackground(new java.awt.Color(102, 102, 255));
       }
        else if (player.getProg() == 2) {
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normal.png"))); 
            easy.setBackground(new java.awt.Color(102, 102, 255));
            med.setBackground(new java.awt.Color(102, 102, 255));
       }
        else if (player.getProg() == 1) {
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/easy.png"))); 
            easy.setBackground(new java.awt.Color(102, 102, 255));
       }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressLabel = new javax.swing.JLabel();
        easy = new javax.swing.JPanel();
        med = new javax.swing.JPanel();
        hard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 253, 237));

        jProgressLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jProgressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jProgressLabel.setText("Your Progress");

        easy.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout hardLayout = new javax.swing.GroupLayout(hard);
        hard.setLayout(hardLayout);
        hardLayout.setHorizontalGroup(
            hardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );
        hardLayout.setVerticalGroup(
            hardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout medLayout = new javax.swing.GroupLayout(med);
        med.setLayout(medLayout);
        medLayout.setHorizontalGroup(
            medLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medLayout.createSequentialGroup()
                .addGap(0, 206, Short.MAX_VALUE)
                .addComponent(hard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        medLayout.setVerticalGroup(
            medLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout easyLayout = new javax.swing.GroupLayout(easy);
        easy.setLayout(easyLayout);
        easyLayout.setHorizontalGroup(
            easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, easyLayout.createSequentialGroup()
                .addGap(0, 208, Short.MAX_VALUE)
                .addComponent(med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        easyLayout.setVerticalGroup(
            easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(med, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/easy.png"))); // NOI18N

        jLabel3.setText("Back to Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 173, Short.MAX_VALUE)
                .addComponent(easy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jProgressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jProgressLabel)
                .addGap(66, 66, 66)
                .addComponent(easy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Goes to main menu
     * @param evt 
     */
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Menu menu = new Menu(player);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel easy;
    private javax.swing.JPanel hard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jProgressLabel;
    private javax.swing.JPanel med;
    // End of variables declaration//GEN-END:variables
}
