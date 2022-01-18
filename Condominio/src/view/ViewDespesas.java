package view;

import controller.ControllerDespesas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelDespesas;


/**
 *
 * @author Mariana Barretto
 */
public class ViewDespesas extends javax.swing.JFrame {
      ModelDespesas modelDespesas = new ModelDespesas();
      ControllerDespesas controllerDespesas = new ControllerDespesas();
      List<ModelDespesas> listaModelDespesas = new ArrayList<>();  
      String cadAlt = "cad";
    
      
      
      
    public ViewDespesas() {
        initComponents();
        setLocationRelativeTo(null);
        exibirDespesas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfTipo = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jtfVencimento = new javax.swing.JTextField();
        jtfValor = new javax.swing.JTextField();
        jcbStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDespesas = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas de Unidades");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Despesas das Unidades");

        jLabel2.setText("Descrição");

        jtfVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVencimentoActionPerformed(evt);
            }
        });

        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Não Pago" }));

        jtDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Tipo de despesa", "Valor", "Vencimento da fatura", "Status de pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDespesas);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor");

        jLabel5.setText("Vencimento da Fatura");

        jLabel6.setText("Status de Pagamento");

        jLabel7.setText("Tipo de Despesa");

        jtfId.setEditable(false);

        jLabel8.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEditar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar))
                .addContainerGap())
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

    private void jtfVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVencimentoActionPerformed
private void limparFormulario(){
        jtfId.setText("");
        jtfDescricao.setText("");
        jtfTipo.setText("");
        jtfValor.setText("");
        jtfVencimento.setText("");
        cadAlt = "cad";      
    } 
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        modelDespesas = new ModelDespesas();
        modelDespesas.setDescricao(jtfDescricao.getText());
        modelDespesas.setTipoDespesa(jtfTipo.getText());
        modelDespesas.setValor(Double.parseDouble(jtfValor.getText()));
        modelDespesas.setVencimentoFatura(jtfVencimento.getText());
        modelDespesas.setStatusPagamento(jcbStatus.getSelectedItem().toString());
        if (cadAlt.equals("cad")){
            if (controllerDespesas.salvarDespesasController(modelDespesas)) {
                //cadastrou despesa
                JOptionPane.showMessageDialog(this, "Despesa cadastrada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                // limpar
                limparFormulario();
                exibirDespesas();
            } else {
                // não cadastrou
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar despesa!", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }else{
            modelDespesas.setIdDespesas(Integer.parseInt(jtfId.getText()));
            if (controllerDespesas.atualizarDespesasController(modelDespesas)) {
                //alterou despesa
                JOptionPane.showMessageDialog(this, "Despesa alterado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                // limpar
                limparFormulario();
                exibirDespesas();
            } else {
                // não alterou
                JOptionPane.showMessageDialog(this, "Erro ao alterar despesa!", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        cadAlt = "alt";
        modelDespesas = new ModelDespesas();        
        int linha = jtDespesas.getSelectedRow();
        if (linha < 0 ){
            JOptionPane.showMessageDialog(this, "Você deve seleciononar uma desoesa!");
        }else{
            int pIdDespesas = (int) jtDespesas.getValueAt(linha, 0);
           modelDespesas = controllerDespesas.getDespesasController(pIdDespesas);
           jtfId.setText(String.valueOf(modelDespesas.getIdDespesas()));
           jtfDescricao.setText(String.valueOf(modelDespesas.getDescricao()));
           jtfValor.setText(String.valueOf(modelDespesas.getValor()));
           jtfTipo.setText(modelDespesas.getTipoDespesa());
           jtfVencimento.setText(String.valueOf(modelDespesas.getVencimentoFatura()));
           jcbStatus.setSelectedItem(modelDespesas.getStatusPagamento());
                  
            
       }
    }//GEN-LAST:event_jbEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDespesas().setVisible(true);
            }
        });
    }
private void exibirDespesas(){
      listaModelDespesas = controllerDespesas.getListaDespesasController();
      DefaultTableModel modelo = (DefaultTableModel) jtDespesas.getModel();
      modelo.setNumRows (0);
      
      for (int i = 0; i < listaModelDespesas.size(); i++){
        modelo.addRow(new Object[]{
           listaModelDespesas.get(i).getIdDespesas(), 
           listaModelDespesas.get(i).getDescricao(),
           listaModelDespesas.get(i).getTipoDespesa(),
           listaModelDespesas.get(i).getValor(),
           listaModelDespesas.get(i).getVencimentoFatura(),
           listaModelDespesas.get(i).getStatusPagamento(),
        
        });
      
      }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JTable jtDespesas;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfTipo;
    private javax.swing.JTextField jtfValor;
    private javax.swing.JTextField jtfVencimento;
    // End of variables declaration//GEN-END:variables
}
