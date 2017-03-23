package readurl;



/**
 *
 * @author hudson
 */
public class HsMain extends javax.swing.JFrame {

    public HsMain() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tfWord = new javax.swing.JTextField();
        lbWord = new javax.swing.JLabel();
        tfEN = new javax.swing.JTextField();
        tfFR = new javax.swing.JTextField();
        tfDE = new javax.swing.JTextField();
        tfPT = new javax.swing.JTextField();
        lbEN = new javax.swing.JLabel();
        lbFR = new javax.swing.JLabel();
        lbDE = new javax.swing.JLabel();
        lbPT = new javax.swing.JLabel();
        rbEN = new javax.swing.JRadioButton();
        rbFR = new javax.swing.JRadioButton();
        rbDE = new javax.swing.JRadioButton();
        rbPT = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWordActionPerformed(evt);
            }
        });

        lbWord.setText("Palavra:");

        tfEN.setSize(new java.awt.Dimension(100, 28));

        lbEN.setText("EN");

        lbFR.setText("FR");

        lbDE.setText("DE");

        lbPT.setText("PT");

        buttonGroup1.add(rbEN);
        rbEN.setSelected(true);
        rbEN.setText("EN");

        buttonGroup1.add(rbFR);
        rbFR.setText("FR");

        buttonGroup1.add(rbDE);
        rbDE.setText("DE");

        buttonGroup1.add(rbPT);
        rbPT.setText("PT");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbWord)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbEN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPT)
                        .addContainerGap(263, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfWord)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEN)
                    .addComponent(lbEN)
                    .addComponent(tfFR)
                    .addComponent(lbFR)
                    .addComponent(tfDE)
                    .addComponent(lbDE)
                    .addComponent(lbPT)
                    .addComponent(tfPT))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEN)
                    .addComponent(rbFR)
                    .addComponent(rbDE)
                    .addComponent(rbPT))
                .addGap(18, 18, 18)
                .addComponent(lbEN)
                .addGap(2, 2, 2)
                .addComponent(tfEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFR)
                .addGap(2, 2, 2)
                .addComponent(tfFR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDE)
                .addGap(2, 2, 2)
                .addComponent(tfDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPT)
                .addGap(2, 2, 2)
                .addComponent(tfPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWordActionPerformed

        String word = tfWord.getText().trim();
        int from = -1;

        if (rbEN.isSelected()) {
            from = Commons.EN;
        }
        if (rbFR.isSelected()) {
            from = Commons.FR;
        }
        if (rbDE.isSelected()) {
            from = Commons.DE;
        }
        if (rbPT.isSelected()) {
            from = Commons.PT;
        }

        tfEN.setText(HsCoreTranslate.getInstance().toEnglish(word,from));
        tfFR.setText(HsCoreTranslate.getInstance().toFrench(word,from));
        tfDE.setText(HsCoreTranslate.getInstance().toGerman(word,from));
        tfPT.setText(HsCoreTranslate.getInstance().toPortuguese(word,from));

    }//GEN-LAST:event_tfWordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbDE;
    private javax.swing.JLabel lbEN;
    private javax.swing.JLabel lbFR;
    private javax.swing.JLabel lbPT;
    private javax.swing.JLabel lbWord;
    private javax.swing.JRadioButton rbDE;
    private javax.swing.JRadioButton rbEN;
    private javax.swing.JRadioButton rbFR;
    private javax.swing.JRadioButton rbPT;
    private javax.swing.JTextField tfDE;
    private javax.swing.JTextField tfEN;
    private javax.swing.JTextField tfFR;
    private javax.swing.JTextField tfPT;
    private javax.swing.JTextField tfWord;
    // End of variables declaration//GEN-END:variables
}
