/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory_system;



/**
 *
 * @author Sandun
 */
public class loading extends javax.swing.JFrame implements Runnable{
    
    Thread th;
    
    public loading() {
        super("loading");
        initComponents();
        th=new Thread((Runnable)this);
       
    }
    public void setUploading(){
        th.start();
    }
    public void run() {
        menu menu = new menu();
        loading sp = new loading();
        sp.setVisible(true);
         
        try {
            for(int i=0;i<=100;i++){
                 
                Thread.sleep(50);
                sp.jProgressBar1.setValue(i);
                
                sp.value.setText(i+"%");
                
                if(i==10){
                    sp.loading.setText("Turining Modules...");
                    
                }
                if(i==20){
                    sp.loading.setText("Connecting to database... ");
                    
                }
                if(i==40){
                    sp.loading.setText("Loading Data.");
                    
                }
                if(i==45){
                    sp.loading.setText("Loading Data..");
                    
                }
                if(i==50){
                    sp.loading.setText("Loading Data...");
                    
                }
                if(i==55){
                    sp.loading.setText("Loading Data.");
                    
                }
                if(i==60){
                    sp.loading.setText("Loading Data..");
                    
                }
                if(i==65){
                    sp.loading.setText("Loading Data...");
                    
                }
                if(i==75){
                    sp.loading.setText("App is Starting...");
                    
                }
                if(i==90){
                    sp.loading.setText("Thanks for Waiting..");
                }
              if(i==100){
                  menu.setVisible(true);
                  sp.setVisible(false);
                 
              }
            }
        } catch (Exception e) {
         
        }
            }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        value = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        value.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        value.setForeground(new java.awt.Color(51, 51, 255));
        value.setText("0 %");
        jPanel1.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 700, -1, -1));

        loading.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading...");
        jPanel1.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 1100, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setFont(new java.awt.Font("Times CG ATT", 3, 46)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enterprise Resources Planning System");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 870, 80));

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory_system/assests/square.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 330, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory_system/assests/desktop.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 540, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory_system/assests/pexels-francesco-ungaro-281260 re.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 940, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
