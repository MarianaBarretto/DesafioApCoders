package view;

import model.ModelDespesas;
import controller.ControllerDespesas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariana Barretto
 */
public class ViewFiltros extends javax.swing.JFrame {
      ModelDespesas modelDespesas = new ModelDespesas();
      ControllerDespesas controllerDespesas = new ControllerDespesas();
      List<ModelDespesas> listaModelDespesas = new ArrayList<>();
    
      
    public ViewFiltros() {
        initComponents();
        setLocationRelativeTo(null);
        exibirFiltroUnidades(condominio(jcbCondominio));
        exibirFiltroFatura(vencimento(jcbFatura));
    }
    
    private String condominio (javax.swing.JComboBox<String> comboBoxFatura){
        switch (comboBoxFatura.getSelectedItem().toString()){
            case "Mar e Sol":
               return "Mar e Sol";
            case"Solar":   
                return "Solar";
            default:
                return "";
        }
    }
    private String vencimento (javax.swing.JComboBox<String> comboBoxFatura){
        switch (comboBoxFatura.getSelectedItem().toString()){
            case "Vencidas":
               return "Vencida";
            case"Pagas":   
                return "Paga";
            case"A Pagar":   
                return "A Pagar";
            default:
                return "";
        }
    }
    
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFiltro = new javax.swing.JTable();
        jcbFatura = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbCondominio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro");

        jLabel1.setText("Filtrar por fatura");

        jLabel2.setText("Filtar por Unidade");

        jtFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Descrição", "Tipo", "Valor", "Vencimento", "Status", "Condomínio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtFiltro);

        jcbFatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vencidas", "Pagas", "A Pagar" }));
        jcbFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFaturaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Filtrar");

        jcbCondominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mar e Sol", "Solar" }));
        jcbCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCondominioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jcbFatura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbCondominio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jcbCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );

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

    private void jcbFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFaturaActionPerformed
       exibirFiltroFatura(vencimento(jcbFatura));
    }//GEN-LAST:event_jcbFaturaActionPerformed

    private void jcbCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCondominioActionPerformed
        exibirFiltroUnidades(condominio(jcbCondominio));
    }//GEN-LAST:event_jcbCondominioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFiltros().setVisible(true);
            }
        });
    }
private void exibirFiltroFatura(String vencimento){
      listaModelDespesas = controllerDespesas.getListaDespesasVencidasController(vencimento);
      DefaultTableModel modelo = (DefaultTableModel) jtFiltro.getModel();
      modelo.setNumRows (0);
      
      for (int i = 0; i < listaModelDespesas.size(); i++){
        modelo.addRow(new Object[]{
           listaModelDespesas.get(i).getDescricao(),
           listaModelDespesas.get(i).getTipoDespesa(),
           listaModelDespesas.get(i).getValor(),
           listaModelDespesas.get(i).getVencimentoFatura(),
           listaModelDespesas.get(i).getStatusPagamento(),
           listaModelDespesas.get(i).getCondominio(),
        });
      
      }
    }
private void exibirFiltroUnidades(String condominio){
      listaModelDespesas = controllerDespesas.getListaDespesasComFiltroController(condominio);
      DefaultTableModel modelo = (DefaultTableModel) jtFiltro.getModel();
      modelo.setNumRows (0);
      
      for (int i = 0; i < listaModelDespesas.size(); i++){
        modelo.addRow(new Object[]{
           listaModelDespesas.get(i).getDescricao(),
           listaModelDespesas.get(i).getTipoDespesa(),
           listaModelDespesas.get(i).getValor(),
           listaModelDespesas.get(i).getVencimentoFatura(),
           listaModelDespesas.get(i).getStatusPagamento(),
           listaModelDespesas.get(i).getCondominio(),
        
        });
      
      }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCondominio;
    private javax.swing.JComboBox<String> jcbFatura;
    private javax.swing.JTable jtFiltro;
    // End of variables declaration//GEN-END:variables
}
