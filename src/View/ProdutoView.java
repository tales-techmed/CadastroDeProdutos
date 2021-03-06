package View;

import Controller.ProdutoController;
import Model.Produto;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ProdutoView extends javax.swing.JFrame {

    ProdutoController controller;
    int flag; //0-novo, 1-editar
    
    public ProdutoView() {
        super("Cadastro de Produtos");
        initComponents();
        configuraTela("inicio");
        flag=0;
        controller = new ProdutoController();
        tblProdutos.setModel(controller.getModeloTabela()); // modelo
       /* tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);//tamanho das colunas
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(70);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(70);
        tblProdutos.getTableHeader().setResizingAllowed(false);//não deixa alterar a largua
        tblProdutos.getTableHeader().setReorderingAllowed(false);//não deixa trocar as colunas de lugar
        tblProdutos.setAutoCreateRowSorter(true);// habilitar a ordenação de dados por coluna
        tblProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // selecionar apenas uma linha
        DefaultTableCellRenderer r = new DefaultTableCellRenderer(); // alinhamento
        r.setHorizontalAlignment(SwingConstants.RIGHT); //alinhamento a direita
        tblProdutos.getColumnModel().getColumn(2).setCellRenderer(r);
        tblProdutos.getColumnModel().getColumn(3).setCellRenderer(r);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        painelDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cEstoque = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        painelConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addComponent(btNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btNovo)
                .addComponent(btPesquisar)
                .addComponent(btEditar)
                .addComponent(btSalvar)
                .addComponent(btDeletar)
                .addComponent(btLimpar)
                .addComponent(btCancelar))
        );

        jLabel2.setText("Id:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Preço:");

        jLabel5.setText("Estoque:");

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOk))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNome)))
                .addContainerGap())
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(painelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        configuraTela("novo");
        cNome.requestFocus();
        this.flag=0;
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(this.flag==0){
            if(!controller.insere(cNome.getText(),
                              cPreco.getText(),
                              cEstoque.getText()))
            {
                JOptionPane.showMessageDialog(null,"Erro!");
            }
        } else {
            if(!controller.edita(cId.getText(),
                              cNome.getText(),
                              cPreco.getText(),
                              cEstoque.getText()))
            {
                JOptionPane.showMessageDialog(null,"Erro!");
            }
        }
        //cConsulta.setText(controller.mostraTudo());
        tblProdutos.setAutoCreateRowSorter(false);
        tblProdutos.revalidate();
        tblProdutos.setAutoCreateRowSorter(true);
        limpardados();
        configuraTela("inicio");
    }//GEN-LAST:event_btSalvarActionPerformed

    private void limpardados(){
        cId.setText("");
        cNome.setText("");
        cPreco.setText("");
        cEstoque.setText("");
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpardados();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        configuraTela("pesquisar");
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        
        configuraTela("inicio");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        Produto p = controller.pesquisa(Integer.parseInt(cId.getText()));
        if(p!=null){
            cNome.setText(p.getNome());
            cPreco.setText(String.valueOf(p.getPreco()));
            cEstoque.setText(String.valueOf(p.getQuantidade()));
        }
        configuraTela("ok");
    }//GEN-LAST:event_btOkActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        configuraTela("editar");
        this.flag=1;
        /*if(tblProdutos.getSelectedRowCount()==1){
            int i = tblProdutos.getSelectedRow();
            cId.setText(controller.getModeloTabela().getValueAt(i, 0).toString());
            cNome.setText(controller.getModeloTabela().getValueAt(i, 1).toString());
            cPreco.setText(controller.getModeloTabela().getValueAt(i, 2).toString());
            cEstoque.setText(controller.getModeloTabela().getValueAt(i, 3).toString());
        }*/
    }//GEN-LAST:event_btEditarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
/*        if(tblProdutos.getSelectedRowCount()==1){
            cId.setText(controller.getModeloTabela().getValueAt(tblProdutos.getSelectedRow(), 0).toString());
        }
        try{
            int confirma = JOptionPane.showConfirmDialog(this, "Excluir o Produto " + controller.getModeloTabela().getValueAt(tblProdutos.getSelectedRow(), 1).toString() +"?");
            if(confirma==0){
                controller.delete(cId.getText());
                limpardados();
                configuraTela("inicio");
                tblProdutos.repaint();
               // cLista.setText(controller.lista());
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao excluir!");
        }*/
    }//GEN-LAST:event_btDeletarActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        btEditar.setEnabled(true);
        btDeletar.setEnabled(true);
        btNovo.setEnabled(false);
        btCancelar.setEnabled(true);
        btPesquisar.setEnabled(false);
    }//GEN-LAST:event_tblProdutosMouseClicked

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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }
    
    public void configuraTela(String modo){
        if(modo=="inicio"){
            btNovo.setEnabled(true);
            btPesquisar.setEnabled(true);
            btEditar.setEnabled(false);
            btSalvar.setEnabled(false);
            btDeletar.setEnabled(false);
            btLimpar.setEnabled(false);
            btCancelar.setEnabled(true);
            btOk.setVisible(false);
            cId.setEditable(false);
            cNome.setEditable(false);
            cPreco.setEditable(false);
            cEstoque.setEditable(false);
          //  cConsulta.setEditable(false);
        } else {
            if(modo=="novo"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(false);
                btSalvar.setEnabled(true);
                btDeletar.setEnabled(false);
                btLimpar.setEnabled(true);
                btCancelar.setEnabled(true);
                btOk.setVisible(false);
                cId.setEditable(false);
                cNome.setEditable(true);
                cPreco.setEditable(true);
                cEstoque.setEditable(true);
             //   cConsulta.setEditable(false);
            }
            else if(modo=="pesquisar"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(false);
                btSalvar.setEnabled(false);
                btDeletar.setEnabled(false);
                btLimpar.setEnabled(true);
                btCancelar.setEnabled(true);
                btOk.setVisible(true);
                cId.setEditable(true);
                cNome.setEditable(false);
                cPreco.setEditable(false);
                cEstoque.setEditable(false);
               // cConsulta.setEditable(false);
            } else if(modo=="ok"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(true);
                btSalvar.setEnabled(false);
                btDeletar.setEnabled(true);
                btLimpar.setEnabled(false);
                btCancelar.setEnabled(true);
                btOk.setVisible(true);
                cId.setEditable(true);
                cNome.setEditable(false);
                cPreco.setEditable(false);
                cEstoque.setEditable(false);
              //  cConsulta.setEditable(false);
            } else if(modo=="editar"){
                btNovo.setEnabled(false);
                btPesquisar.setEnabled(false);
                btEditar.setEnabled(false);
                btSalvar.setEnabled(true);
                btDeletar.setEnabled(false);
                btLimpar.setEnabled(true);
                btCancelar.setEnabled(true);
                btOk.setVisible(false);
                cId.setEditable(false);
                cNome.setEditable(true);
                cPreco.setEditable(true);
                cEstoque.setEditable(true);
               // cConsulta.setEditable(false);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cEstoque;
    private javax.swing.JTextField cId;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}
