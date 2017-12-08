package fatec.poo.model.view;

import fatec.poo.validacoes.Validacao;
import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCliente;

import fatec.poo.model.Cliente;
import javax.swing.JOptionPane;

public class GuiCliente extends javax.swing.JFrame {

    public GuiCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Endereço = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ftfCPFCliente = new javax.swing.JFormattedTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtCidadeCliente = new javax.swing.JTextField();
        cmbUFCliente = new javax.swing.JComboBox<>();
        txtDDDCliente = new javax.swing.JTextField();
        txtTelefoneCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCEPCliente = new javax.swing.JTextField();
        txtLimiteCreditoCliente = new javax.swing.JTextField();
        btnConsultarCliente = new javax.swing.JButton();
        btnIncluirCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnSairCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLimDispCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setMaximumSize(new java.awt.Dimension(18, 2147483647));
        setMinimumSize(new java.awt.Dimension(18, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
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

        Endereço.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Endereço.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cidade");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Limite de Crédito");

        try {
            ftfCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfCPFClienteActionPerformed(evt);
            }
        });

        txtNomeCliente.setEnabled(false);

        txtEnderecoCliente.setEnabled(false);

        txtCidadeCliente.setEnabled(false);

        cmbUFCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cmbUFCliente.setEnabled(false);
        cmbUFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUFClienteActionPerformed(evt);
            }
        });

        txtDDDCliente.setEnabled(false);

        txtTelefoneCliente.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("CEP");

        txtCEPCliente.setEnabled(false);
        txtCEPCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPClienteActionPerformed(evt);
            }
        });

        txtLimiteCreditoCliente.setEnabled(false);

        btnConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/pesq.png"))); // NOI18N
        btnConsultarCliente.setText("Consultar");
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        btnIncluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/add.png"))); // NOI18N
        btnIncluirCliente.setMnemonic('c');
        btnIncluirCliente.setText("Incluir");
        btnIncluirCliente.setEnabled(false);
        btnIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/Alterar.png"))); // NOI18N
        btnAlterarCliente.setMnemonic('A');
        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.setEnabled(false);
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/Eraser.png"))); // NOI18N
        btnExcluirCliente.setMnemonic('E');
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.setEnabled(false);
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnSairCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/model/view/Icon/exit.png"))); // NOI18N
        btnSairCliente.setMnemonic('S');
        btnSairCliente.setText("Sair");
        btnSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Limite Disponível ");

        txtLimDispCliente.setEnabled(false);
        txtLimDispCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimDispClienteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("UF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIncluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSairCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLimiteCreditoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Endereço)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCidadeCliente)
                            .addComponent(txtEnderecoCliente)
                            .addComponent(ftfCPFCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtDDDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLimDispCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtNomeCliente))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarCliente, btnConsultarCliente, btnExcluirCliente, btnIncluirCliente, btnSairCliente});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ftfCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereço)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDDDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLimiteCreditoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtLimDispCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncluirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSairCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftfCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfCPFClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja confirmar alteração?") == 0) {
            cliente.setNome(txtNomeCliente.getText());
            cliente.setEndereco(txtEnderecoCliente.getText());
            cliente.setCidade(txtCidadeCliente.getText());
            cliente.setTelefone(txtTelefoneCliente.getText());
            cliente.setDdd(txtDDDCliente.getText());
            cliente.setUf(String.valueOf(cmbUFCliente.getSelectedItem()));
            cliente.setCep(txtCEPCliente.getText());
            cliente.setLimiteCred(Double.parseDouble(txtLimiteCreditoCliente.getText().replace('.', ','))); // tá com erro
            
            daoCliente.alterar(cliente);
        }
        ftfCPFCliente.setText("");
        txtNomeCliente.setText("");
        txtEnderecoCliente.setText("");
        txtCidadeCliente.setText("");
        cmbUFCliente.setSelectedIndex(-1);
        txtDDDCliente.setText("");
        txtTelefoneCliente.setText("");
        txtCEPCliente.setText("");
        txtLimiteCreditoCliente.setText("");
        txtLimDispCliente.setText("");

        ftfCPFCliente.setEnabled(true);
        ftfCPFCliente.requestFocus();
        txtNomeCliente.setEnabled(false);
        txtEnderecoCliente.setEnabled(false);
        txtCidadeCliente.setEnabled(false);
        cmbUFCliente.setEnabled(false);
        txtDDDCliente.setEnabled(false);
        txtTelefoneCliente.setEnabled(false);
        txtCEPCliente.setEnabled(false);
        txtLimiteCreditoCliente.setEnabled(false);

        btnConsultarCliente.setEnabled(true);
        btnIncluirCliente.setEnabled(false);
        btnAlterarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(false);

        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso.");
        ftfCPFCliente.requestFocus();
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void txtCEPClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPClienteActionPerformed

    private void txtLimDispClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimDispClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLimDispClienteActionPerformed

    private void cmbUFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUFClienteActionPerformed

    private void btnSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairClienteActionPerformed
    dispose();
    }//GEN-LAST:event_btnSairClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system", "sanja123");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCliente = new DaoCliente(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        if (Validacao.validarCPF(ftfCPFCliente.getText())) {
            cliente = null;
            cliente = daoCliente.consultar(ftfCPFCliente.getText().replace(".", "").replace("-", ""));

            if (cliente == null) {
                ftfCPFCliente.setEnabled(false);
                txtNomeCliente.setEnabled(true);
                txtEnderecoCliente.setEnabled(true);
                txtCidadeCliente.setEnabled(true);
                cmbUFCliente.setEnabled(true);
                txtDDDCliente.setEnabled(true);
                txtTelefoneCliente.setEnabled(true);
                txtCEPCliente.setEnabled(true);
                txtLimiteCreditoCliente.setEnabled(true);

                btnConsultarCliente.setEnabled(false);
                btnIncluirCliente.setEnabled(true);
                btnAlterarCliente.setEnabled(false);
                btnExcluirCliente.setEnabled(false);

            } else {
                txtNomeCliente.setText(cliente.getNome());
                txtEnderecoCliente.setText(cliente.getEndereco());
                txtCidadeCliente.setText(cliente.getCidade());
                cmbUFCliente.setSelectedItem(cliente.getUf());
                txtDDDCliente.setText(cliente.getDdd());
                txtTelefoneCliente.setText(cliente.getTelefone());
                txtCEPCliente.setText(cliente.getCep());
                txtLimiteCreditoCliente.setText(String.valueOf(cliente.getLimiteCred()));
                txtLimDispCliente.setText(String.valueOf(cliente.getLimiteDisp()));

                ftfCPFCliente.setEnabled(false);
                txtNomeCliente.setEnabled(true);
                txtNomeCliente.requestFocus();
                txtEnderecoCliente.setEnabled(true);
                txtCidadeCliente.setEnabled(true);
                cmbUFCliente.setEnabled(true);
                txtDDDCliente.setEnabled(true);
                txtTelefoneCliente.setEnabled(true);
                txtCEPCliente.setEnabled(true);
                txtLimiteCreditoCliente.setEnabled(true);

                btnConsultarCliente.setEnabled(false);
                btnIncluirCliente.setEnabled(false);
                btnAlterarCliente.setEnabled(true);
                btnExcluirCliente.setEnabled(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido.");
            ftfCPFCliente.setText("");
            ftfCPFCliente.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirClienteActionPerformed
            cliente = new Cliente(ftfCPFCliente.getText().replace(".", "").replace("-", ""), txtNomeCliente.getText(), Double.parseDouble(txtLimiteCreditoCliente.getText().replace(',', '.')));
            cliente.setCep(txtCEPCliente.getText());
            cliente.setCidade(txtCidadeCliente.getText());
            cliente.setDdd(txtDDDCliente.getText());
            cliente.setTelefone(txtTelefoneCliente.getText());
            cliente.setUf(String.valueOf(cmbUFCliente.getSelectedItem()));
            cliente.setEndereco(txtEnderecoCliente.getText());
            daoCliente.inserir(cliente);
            
            btnConsultarCliente.setEnabled(true);
            btnIncluirCliente.setEnabled(false);

            ftfCPFCliente.setText("");
            txtNomeCliente.setText("");
            txtEnderecoCliente.setText("");
            txtCidadeCliente.setText("");
            cmbUFCliente.setSelectedIndex(-1);
            txtDDDCliente.setText("");
            txtTelefoneCliente.setText("");
            txtCEPCliente.setText("");
            txtLimiteCreditoCliente.setText("");
            txtLimDispCliente.setText("");

            ftfCPFCliente.setEnabled(true);
            ftfCPFCliente.requestFocus();
            txtNomeCliente.setEnabled(false);
            txtEnderecoCliente.setEnabled(false);
            txtCidadeCliente.setEnabled(false);
            cmbUFCliente.setEnabled(false);
            txtDDDCliente.setEnabled(false);
            txtTelefoneCliente.setEnabled(false);
            txtCEPCliente.setEnabled(false);
            txtLimiteCreditoCliente.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
            
    }//GEN-LAST:event_btnIncluirClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse Cliente?") == 0) {
            daoCliente.excluir(cliente);

            ftfCPFCliente.setText("");
            txtNomeCliente.setText("");
            txtEnderecoCliente.setText("");
            txtCidadeCliente.setText("");
            cmbUFCliente.setSelectedIndex(-1);
            txtDDDCliente.setText("");
            txtTelefoneCliente.setText("");
            txtCEPCliente.setText("");
            txtLimiteCreditoCliente.setText("");
            txtLimDispCliente.setText("");

            ftfCPFCliente.setEnabled(true);
            txtNomeCliente.setEnabled(false);
            txtEnderecoCliente.setEnabled(false);
            txtCidadeCliente.setEnabled(false);
            cmbUFCliente.setEnabled(false);
            txtDDDCliente.setEnabled(false);
            txtTelefoneCliente.setEnabled(false);
            txtCEPCliente.setEnabled(false);
            txtLimiteCreditoCliente.setEnabled(false);

            btnConsultarCliente.setEnabled(true);
            btnIncluirCliente.setEnabled(false);
            btnAlterarCliente.setEnabled(false);
            btnExcluirCliente.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.");
            ftfCPFCliente.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Endereço;
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnIncluirCliente;
    private javax.swing.JButton btnSairCliente;
    private javax.swing.JComboBox<String> cmbUFCliente;
    private javax.swing.JFormattedTextField ftfCPFCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCEPCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JTextField txtDDDCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtLimDispCliente;
    private javax.swing.JTextField txtLimiteCreditoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
    private DaoCliente daoCliente = null;
    private Conexao conexao = null;
    private Cliente cliente = null;
}
