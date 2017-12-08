package fatec.poo.model.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoVendedor;
import fatec.poo.model.Vendedor;
import fatec.poo.validacoes.Validacao;
import javax.swing.JOptionPane;

public class GuiVendedor extends javax.swing.JFrame {

    public GuiVendedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ftfCPFVendedor = new javax.swing.JFormattedTextField();
        txtNomeVendedor = new javax.swing.JTextField();
        txtEnderecoVendedor = new javax.swing.JTextField();
        txtCidadeVendedor = new javax.swing.JTextField();
        txtCEPVendedor = new javax.swing.JTextField();
        txtSalBaseVendedor = new javax.swing.JTextField();
        cmbUFVendedor = new javax.swing.JComboBox<>();
        txtDDDVendedor = new javax.swing.JTextField();
        txtTelVendedor = new javax.swing.JTextField();
        txtTaxaComisVendedor = new javax.swing.JTextField();
        btnConsultarVendedor = new javax.swing.JButton();
        btnIncluirVendedor = new javax.swing.JButton();
        btnAlterarVendedor = new javax.swing.JButton();
        btnExcluirVendedor = new javax.swing.JButton();
        btnSairVendedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Vendedor");
        setPreferredSize(new java.awt.Dimension(690, 395));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CPF");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cidade");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CEP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Salário Base");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("UF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Telefone");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Taxa de Comissão");

        try {
            ftfCPFVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNomeVendedor.setEnabled(false);

        txtEnderecoVendedor.setEnabled(false);

        txtCidadeVendedor.setEnabled(false);

        txtCEPVendedor.setEnabled(false);

        txtSalBaseVendedor.setEnabled(false);

        cmbUFVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cmbUFVendedor.setEnabled(false);

        txtDDDVendedor.setEnabled(false);

        txtTelVendedor.setEnabled(false);

        txtTaxaComisVendedor.setEnabled(false);

        btnConsultarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/pesq.png"))); // NOI18N
        btnConsultarVendedor.setMnemonic('C');
        btnConsultarVendedor.setText("Consultar");
        btnConsultarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVendedorActionPerformed(evt);
            }
        });

        btnIncluirVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/add.png"))); // NOI18N
        btnIncluirVendedor.setMnemonic('c');
        btnIncluirVendedor.setText("Incluir");
        btnIncluirVendedor.setEnabled(false);
        btnIncluirVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirVendedorActionPerformed(evt);
            }
        });

        btnAlterarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/Alterar.png"))); // NOI18N
        btnAlterarVendedor.setMnemonic('A');
        btnAlterarVendedor.setText("Alterar");
        btnAlterarVendedor.setEnabled(false);
        btnAlterarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVendedorActionPerformed(evt);
            }
        });

        btnExcluirVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/Eraser.png"))); // NOI18N
        btnExcluirVendedor.setMnemonic('E');
        btnExcluirVendedor.setText("Excluir");
        btnExcluirVendedor.setEnabled(false);
        btnExcluirVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendedorActionPerformed(evt);
            }
        });

        btnSairVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/exit.png"))); // NOI18N
        btnSairVendedor.setMnemonic('S');
        btnSairVendedor.setText("Sair");
        btnSairVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5)
                        .addGap(53, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNomeVendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                        .addComponent(txtEnderecoVendedor, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCEPVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDDDVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidadeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbUFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSalBaseVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftfCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(157, 157, 157)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTaxaComisVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnConsultarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluirVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSairVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ftfCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEnderecoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidadeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbUFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCEPVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDDDVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalBaseVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTaxaComisVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirVendedor)
                    .addComponent(btnAlterarVendedor)
                    .addComponent(btnSairVendedor)
                    .addComponent(btnExcluirVendedor)
                    .addComponent(btnConsultarVendedor))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairVendedorActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairVendedorActionPerformed

    private void btnConsultarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVendedorActionPerformed
        if (Validacao.validarCPF(ftfCPFVendedor.getText())) {
            vendedor = daoVendedor.consultar(ftfCPFVendedor.getText().replace(".", "").replace("-", ""));

            if (vendedor == null) {
                txtNomeVendedor.setEnabled(true);
                txtEnderecoVendedor.setEnabled(true);
                txtCidadeVendedor.setEnabled(true);
                cmbUFVendedor.setEnabled(true);
                txtCEPVendedor.setEnabled(true);
                txtDDDVendedor.setEnabled(true);
                txtTelVendedor.setEnabled(true);
                txtSalBaseVendedor.setEnabled(true);
                txtTaxaComisVendedor.setEnabled(true);
                ftfCPFVendedor.setEnabled(false);

                txtNomeVendedor.requestFocus();

                btnConsultarVendedor.setEnabled(false);
                btnIncluirVendedor.setEnabled(true);

            } else {
                txtNomeVendedor.setEnabled(true);
                txtEnderecoVendedor.setEnabled(true);
                txtCidadeVendedor.setEnabled(true);
                cmbUFVendedor.setEnabled(true);
                txtCEPVendedor.setEnabled(true);
                txtDDDVendedor.setEnabled(true);
                txtTelVendedor.setEnabled(true);
                txtSalBaseVendedor.setEnabled(true);
                txtTaxaComisVendedor.setEnabled(true);
                ftfCPFVendedor.setEnabled(false);

                txtNomeVendedor.setText(vendedor.getNome());
                txtEnderecoVendedor.setText(vendedor.getEndereco());
                txtCidadeVendedor.setText(vendedor.getCidade());
                cmbUFVendedor.setSelectedItem(vendedor.getUf());
                txtCEPVendedor.setText(vendedor.getCep());
                txtDDDVendedor.setText(vendedor.getDdd());
                txtTelVendedor.setText(vendedor.getTelefone());
                txtSalBaseVendedor.setText(String.valueOf(vendedor.getSalarioBase()));
                txtTaxaComisVendedor.setText(String.valueOf(vendedor.getComissao()));
                ftfCPFVendedor.setEnabled(false);  

                txtNomeVendedor.requestFocus();

                btnConsultarVendedor.setEnabled(false);
                btnAlterarVendedor.setEnabled(true);
                btnExcluirVendedor.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF Inválido.");
            ftfCPFVendedor.setText("");
            ftfCPFVendedor.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarVendedorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system", "sanja123");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoVendedor = new DaoVendedor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnExcluirVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendedorActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir esse Vendedor?") == 0) {
            daoVendedor.excluir(vendedor);

            ftfCPFVendedor.setText("");
            txtNomeVendedor.setText("");
            txtEnderecoVendedor.setText("");
            txtCidadeVendedor.setText("");
            cmbUFVendedor.setSelectedIndex(-1);
            txtDDDVendedor.setText("");
            txtTelVendedor.setText("");
            txtCEPVendedor.setText("");
            txtSalBaseVendedor.setText("");
            txtTaxaComisVendedor.setText("");

            ftfCPFVendedor.setEnabled(true);
            txtNomeVendedor.setEnabled(false);
            txtEnderecoVendedor.setEnabled(false);
            txtCidadeVendedor.setEnabled(false);
            cmbUFVendedor.setEnabled(false);
            txtDDDVendedor.setEnabled(false);
            txtTelVendedor.setEnabled(false);
            txtCEPVendedor.setEnabled(false);
            txtSalBaseVendedor.setEnabled(false);
            txtTaxaComisVendedor.setEnabled(false);

            btnConsultarVendedor.setEnabled(true);
            btnAlterarVendedor.setEnabled(false);
            btnExcluirVendedor.setEnabled(false);
            
            JOptionPane.showMessageDialog(null, "Vendedor excluído com sucesso.");
            ftfCPFVendedor.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirVendedorActionPerformed

    private void btnAlterarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVendedorActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Deseja confirmar alteração?") == 0) {
            vendedor.setNome(txtNomeVendedor.getText());
            vendedor.setEndereco(txtEnderecoVendedor.getText());
            vendedor.setCep(txtCEPVendedor.getText());
            vendedor.setCidade(txtCidadeVendedor.getText());
            vendedor.setDdd(txtDDDVendedor.getText());
            vendedor.setTelefone(txtTelVendedor.getText());
            vendedor.setUf(String.valueOf(cmbUFVendedor.getSelectedItem()));
            vendedor.setComissao(Double.parseDouble(txtTaxaComisVendedor.getText().replace(',', '.')));
            vendedor.setSalarioBase(Double.parseDouble(txtSalBaseVendedor.getText().replace(',', '.')));
            
            daoVendedor.alterar(vendedor);
        }
        ftfCPFVendedor.setText("");
        txtNomeVendedor.setText("");
        txtEnderecoVendedor.setText("");
        txtCidadeVendedor.setText("");
        cmbUFVendedor.setSelectedIndex(-1);
        txtDDDVendedor.setText("");
        txtTelVendedor.setText("");
        txtCEPVendedor.setText("");
        txtSalBaseVendedor.setText("");
        txtTaxaComisVendedor.setText("");

        ftfCPFVendedor.setEnabled(true);
        txtNomeVendedor.setEnabled(false);
        txtEnderecoVendedor.setEnabled(false);
        txtCidadeVendedor.setEnabled(false);
        cmbUFVendedor.setEnabled(false);
        txtDDDVendedor.setEnabled(false);
        txtTelVendedor.setEnabled(false);
        txtCEPVendedor.setEnabled(false);
        txtSalBaseVendedor.setEnabled(false);
        txtTaxaComisVendedor.setEnabled(false);

        btnConsultarVendedor.setEnabled(true);
        btnExcluirVendedor.setEnabled(false);
        btnAlterarVendedor.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Vendedor alterado com sucesso.");
        ftfCPFVendedor.requestFocus();
    }//GEN-LAST:event_btnAlterarVendedorActionPerformed

    private void btnIncluirVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirVendedorActionPerformed
            vendedor = new Vendedor(ftfCPFVendedor.getText().replace(".", "").replace("-", ""), txtNomeVendedor.getText(), Double.parseDouble(txtSalBaseVendedor.getText().replace(',', '.').replace('.', ',')));
            vendedor.setCep(txtCEPVendedor.getText());
            vendedor.setCidade(txtCidadeVendedor.getText());
            vendedor.setDdd(txtDDDVendedor.getText());
            vendedor.setTelefone(txtTelVendedor.getText());
            vendedor.setUf(String.valueOf(cmbUFVendedor.getSelectedItem()));
            vendedor.setEndereco(txtEnderecoVendedor.getText());
            vendedor.setComissao(Double.parseDouble(txtTaxaComisVendedor.getText().replace(',', '.')));
            
            daoVendedor.inserir(vendedor);
       
            ftfCPFVendedor.setText("");
            txtNomeVendedor.setText("");
            txtEnderecoVendedor.setText("");
            txtCidadeVendedor.setText("");
            cmbUFVendedor.setSelectedIndex(-1);
            txtDDDVendedor.setText("");
            txtTelVendedor.setText("");
            txtCEPVendedor.setText("");
            txtSalBaseVendedor.setText("");
            txtTaxaComisVendedor.setText("");

            ftfCPFVendedor.setEnabled(true);
            txtNomeVendedor.setEnabled(false);
            txtEnderecoVendedor.setEnabled(false);
            txtCidadeVendedor.setEnabled(false);
            cmbUFVendedor.setEnabled(false);
            txtDDDVendedor.setEnabled(false);
            txtTelVendedor.setEnabled(false);
            txtCEPVendedor.setEnabled(false);
            txtSalBaseVendedor.setEnabled(false);
            txtTaxaComisVendedor.setEnabled(false);

            btnConsultarVendedor.setEnabled(true);
            btnExcluirVendedor.setEnabled(false);
            btnIncluirVendedor.setEnabled(false);
            
            JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso.");
            ftfCPFVendedor.requestFocus();
    }//GEN-LAST:event_btnIncluirVendedorActionPerformed

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
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarVendedor;
    private javax.swing.JButton btnConsultarVendedor;
    private javax.swing.JButton btnExcluirVendedor;
    private javax.swing.JButton btnIncluirVendedor;
    private javax.swing.JButton btnSairVendedor;
    private javax.swing.JComboBox<String> cmbUFVendedor;
    private javax.swing.JFormattedTextField ftfCPFVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCEPVendedor;
    private javax.swing.JTextField txtCidadeVendedor;
    private javax.swing.JTextField txtDDDVendedor;
    private javax.swing.JTextField txtEnderecoVendedor;
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JTextField txtSalBaseVendedor;
    private javax.swing.JTextField txtTaxaComisVendedor;
    private javax.swing.JTextField txtTelVendedor;
    // End of variables declaration//GEN-END:variables
    private DaoVendedor daoVendedor = null;
    private Vendedor vendedor = null;
    private Conexao conexao = null;
}
