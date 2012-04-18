
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Contador = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("say Hello");

        Contador.setText("Contador");

        jButton3.setText("Calculadora");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(Contador)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            //String paso1="cmd C:\\Users\\TEC\\Dropbox\\IAD\\entregarIAD\\calculadoraCORBA\\src\\Paso1.bat";
            String paso="cmd/C\"C:\\Users\\TEC\\Dropbox\\IAD\\entregarIAD\\calculadoraCORBA\\src\\instruccionesCorbaDos";
//            String paso2="cmd.exe C:\\Users\\TEC\\Dropbox\\IAD\\entregarIAD\\calculadoraCORBA\\src\\Paso2.bat";
//            String paso3="cmd.exe C:\\Users\\TEC\\Dropbox\\IAD\\entregarIAD\\calculadoraCORBA\\src\\Paso3.bat";
                       try{     
                        Runtime rt=Runtime.getRuntime();
                        Process p1=rt.exec(paso);
//                        Process p2=rt.exec(paso2);
//                        Process p3=rt.exec(paso3);
                       }
                       catch(Exception e){
                       System.err.println("ERROR AL EJECUTAR .BAT: "+e);
                       e.printStackTrace(System.out);
                       }
            
//            try { 
//        String linea; 
//        Process p1 = Runtime.getRuntime().exec(paso1); 
//        Process p2 = Runtime.getRuntime().exec(paso2); 
//        Process p3 = Runtime.getRuntime().exec(paso3); 
//        BufferedReader input1 = new BufferedReader (new InputStreamReader (p1.getInputStream())); 
//        BufferedReader input2 = new BufferedReader (new InputStreamReader (p1.getInputStream()));
//        BufferedReader input3 = new BufferedReader (new InputStreamReader (p1.getInputStream()));
//        while (((linea = input1.readLine()) != null)&&((linea = input2.readLine()) != null)&&((linea = input3.readLine()) != null)) { 
//             System.out.println(linea); 
//         } 
//           input1.close(); 
//           input2.close();
//           input3.close();
//    }catch (Exception err) { 
//           err.printStackTrace(); 
//    } 
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
