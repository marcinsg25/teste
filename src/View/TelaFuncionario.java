
package View;

import Controller.FuncionarioController;
import Controller.UsuarioController;
import Controller.enderecoController;
import Models.DAO;
import Models.TabelaModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


public class TelaFuncionario extends javax.swing.JInternalFrame {
    private PreparedStatement statement;
    private ResultSet resultSet;
    
    public DAO DAO;
    String sqlTabela=null;
   
    
    public TelaFuncionario() {
        initComponents();
        
        
        
        carregarTabela();
        sqlTabela = "select * from funcionario";
         preencherTabela(sqlTabela);
        
        habilitaCampos(false,false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false);
        
        habilitabotoes(true,false,true,true,true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblIdFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtRgFuncionario = new javax.swing.JFormattedTextField();
        txtCpfFuncionario = new javax.swing.JFormattedTextField();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtTelFuncionario = new javax.swing.JFormattedTextField();
        txtCelFuncionario = new javax.swing.JFormattedTextField();
        lblFuncionario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtLogradouroFuncionario = new javax.swing.JTextField();
        txtComplementoFuncionario = new javax.swing.JTextField();
        txtCidadeFuncionario = new javax.swing.JTextField();
        txtEstadoFuncionario = new javax.swing.JTextField();
        txtCepFuncionario = new javax.swing.JFormattedTextField();
        txtBairroFuncionario = new javax.swing.JTextField();
        txtNumeroFuncionario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtUsuarioFuncionario = new javax.swing.JTextField();
        txtSenhaFuncionario = new javax.swing.JPasswordField();
        txtConfirmacaoSenha = new javax.swing.JPasswordField();
        cbPerfilFuncionario = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFuncionario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnNovoFuncionario = new javax.swing.JButton();
        btnGravarFuncionario = new javax.swing.JButton();
        btnLimparFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnCancelarFuncionario = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        setClosable(true);
        setTitle("CADASTRO DE FUNCIONÁRIOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Group-icon.png"))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Id :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("RG :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("CPF :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Telefone :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Celular :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("E-mail :");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Data Nasc :");

        lblIdFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        try {
            txtRgFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("****-****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblFuncionario.setText(".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeFuncionario))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmailFuncionario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFuncionario))
                    .addComponent(lblIdFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("CEP :");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Logradouro :");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Bairro :");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Número :");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Complemento :");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Cidade :");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Estado :");

        try {
            txtCepFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLogradouroFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplementoFuncionario)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLogradouroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtComplementoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Usuário :");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Senha :");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Confirmar Senha :");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Perfil :");

        cbPerfilFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionário", "Gerente" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenhaFuncionario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPerfilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConfirmacaoSenha)))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cbPerfilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jFuncionario);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnNovoFuncionario.setText("Novo Funcionário");
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnGravarFuncionario.setText("Gravar");
        btnGravarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarFuncionarioActionPerformed(evt);
            }
        });

        btnLimparFuncionario.setText("Limpar");

        btnAlterarFuncionario.setText("Alterar");
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarFuncionario.setText("Cancelar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnNovoFuncionario)
                .addGap(29, 29, 29)
                .addComponent(btnGravarFuncionario)
                .addGap(18, 18, 18)
                .addComponent(btnLimparFuncionario)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarFuncionario)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFuncionario)
                    .addComponent(btnGravarFuncionario)
                    .addComponent(btnLimparFuncionario)
                    .addComponent(btnAlterarFuncionario)
                    .addComponent(btnCancelarFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        lblEndereco.setText(".");
        lblEndereco.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEndereco)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //<editor-fold defaultstate="collapsed" desc=" BOTÃO NOVO ">
    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
          btnNovoFuncionario.setEnabled(true);
          btnGravarFuncionario.setEnabled(true);
          btnLimparFuncionario.setEnabled(false);
          btnAlterarFuncionario.setEnabled(false);
          btnCancelarFuncionario.setEnabled(true);
          
           habilitaCampos(true, true, true, true, true, true, true, true, true, 
                   true, true, true, true, true, true, true, true, true );
           
           limparCampos();
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc=" BOTÃO ALTERAR ">
    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        habilitaCampos(true, true, true, true, true, true, true, true, true, 
                   true, true, true, true, true, true, true, true, true );
         habilitabotoes(false,true,true,false,true);
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" BOTÃO GRAVAR ">
    private void btnGravarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarFuncionarioActionPerformed
       FuncionarioController Fc = new FuncionarioController();
       enderecoController  End = new enderecoController();
        UsuarioController User = new UsuarioController();
        int inte = 1;
        
       End.salvarEndereco(txtCepFuncionario.getText(),txtBairroFuncionario.getText(),txtLogradouroFuncionario.getText(),
               txtComplementoFuncionario.getText(),txtNumeroFuncionario.getText(),txtCidadeFuncionario.getText(),
               txtEstadoFuncionario.getText());
                
       User.salvarUsuario(txtUsuarioFuncionario.getText(), (String) cbPerfilFuncionario.getSelectedItem(),txtSenhaFuncionario.getText(),
               txtConfirmacaoSenha.getText(),inte/*Integer.parseInt(lblFuncionario.getText())*/);
         
       
       String msg = Fc.salvarFuncionario(txtNomeFuncionario.getText(),txtCpfFuncionario.getText(),txtRgFuncionario.getText(),
               txtTelFuncionario.getText(),txtCelFuncionario.getText(),txtEmailFuncionario.getText(),txtDataNasc.getText(),
               inte/*Integer.parseInt(lblEndereco.getText())*/,inte);
                JOptionPane.showMessageDialog(null, msg);
                
        habilitaCampos(false,false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false);        
                
         
       
    }//GEN-LAST:event_btnGravarFuncionarioActionPerformed
    //</editor-fold>
  
    //<editor-fold defaultstate="collapsed" desc=" METODO BOTAO ">
    private void habilitabotoes (boolean addFnc,boolean gravaFnc,boolean alterarFnc,
            boolean limparFnc,boolean cancelarFnc ) {                                                   
        
        btnNovoFuncionario.setEnabled(addFnc);
        btnGravarFuncionario.setEnabled(gravaFnc);
         btnAlterarFuncionario.setEnabled(alterarFnc);
        btnLimparFuncionario.setEnabled(limparFnc);
        btnCancelarFuncionario.setEnabled(cancelarFnc);
          
          
    }                                                  
    //</editor-fold>
  
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CAMPO ">
        public void habilitaCampos(boolean nomeFcn, boolean rgFcn, boolean cpfFcn, boolean dataNascFcn, 
                boolean telFcn, boolean celFcn, boolean emailFcn, boolean cepFcn,boolean logradouroFcn,
                boolean bairroFcn,boolean numeroFcn,boolean complementoFcn, boolean CidadeFcn,boolean estadoFcn,
                boolean usuarioFcn,boolean SenhaFcn,boolean ConfirmSenhaFcn,boolean perfilFcn) {
           
           // FUNCIONARIO 
           txtNomeFuncionario.setEnabled(nomeFcn);
           txtRgFuncionario.setEnabled(rgFcn);
           txtCpfFuncionario.setEnabled(cpfFcn);
           txtDataNasc.setEnabled(dataNascFcn);
           txtTelFuncionario.setEnabled(telFcn);
           txtCelFuncionario.setEnabled(celFcn);
           txtEmailFuncionario.setEnabled(emailFcn);
           
           // ENDERECO
           txtCepFuncionario.setEnabled(cepFcn);
           txtLogradouroFuncionario.setEnabled(logradouroFcn);
           txtBairroFuncionario.setEnabled(bairroFcn);
           txtNumeroFuncionario.setEnabled(numeroFcn);
           txtComplementoFuncionario.setEnabled(complementoFcn);
           txtCidadeFuncionario.setEnabled( CidadeFcn);
           txtEstadoFuncionario.setEnabled(estadoFcn);
            
            // USUARIO
            txtUsuarioFuncionario.setEnabled(usuarioFcn);
            txtSenhaFuncionario.setEnabled(SenhaFcn);
            txtConfirmacaoSenha.setEnabled(ConfirmSenhaFcn);
            cbPerfilFuncionario.setEnabled(perfilFcn);
        }
        //</editor-fold>
        
      
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR CAMPOS ">    
    public void atualizarCampos(){
        try{
            if(resultSet.isAfterLast()){
                resultSet.last();
            }
            if(resultSet.isBeforeFirst()){
                resultSet.first();
            }
            txtNomeFuncionario.setText(resultSet.getString("nomeFuncionario"));
            txtCpfFuncionario.setText(resultSet.getString("cpf"));
            txtRgFuncionario.setText(resultSet.getString("rg"));
            txtTelFuncionario.setText(resultSet.getString("telefone"));
            txtCelFuncionario.setText(resultSet.getString("celular"));
            txtEmailFuncionario.setText(resultSet.getString("email"));
            txtDataNasc.setText(resultSet.getString("dataNascimento"));
            lblEndereco.setText(resultSet.getString("Fkendereco"));
            
            txtCepFuncionario.setText(resultSet.getString("cep"));
            txtBairroFuncionario.setText(resultSet.getString("bairro"));
            txtLogradouroFuncionario.setText(resultSet.getString("logradouro"));
            txtComplementoFuncionario.setText(resultSet.getString("complemento"));
            txtNumeroFuncionario.setText(resultSet.getString("numero"));
            txtCidadeFuncionario.setText(resultSet.getString("cidade"));
            txtEstadoFuncionario.setText(resultSet.getString("estado"));
            
            
            txtUsuarioFuncionario.setText(resultSet.getString("login"));
            txtSenhaFuncionario.setText(resultSet.getString("senha"));
            txtConfirmacaoSenha.setText(resultSet.getString("confiSenha"));
            cbPerfilFuncionario.setSelectedItem(resultSet.getString("perfil"));
            lblFuncionario.setText(resultSet.getString("FKfuncionario"));
            
        
           
        
        
        }catch(SQLException erro){}
    }
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LIMPAR CAMPOS ">
    public void limparCampos(){
      txtNomeFuncionario.setText("");
      txtRgFuncionario.setText("");
      txtCpfFuncionario.setText("");
      txtDataNasc.setText("");
      txtTelFuncionario.setText("");
      txtCelFuncionario.setText("");
      txtEmailFuncionario.setText("");
      txtCepFuncionario.setText("");
      txtLogradouroFuncionario.setText("");
      txtBairroFuncionario.setText("");
      txtNumeroFuncionario.setText("");
      txtComplementoFuncionario.setText("");
      txtCidadeFuncionario.setText("");
      txtEstadoFuncionario.setText("");

      txtUsuarioFuncionario.setText("");
      txtSenhaFuncionario.setText("");
      txtConfirmacaoSenha.setText("");

    
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CARREGAR TABELA ">
    public void carregarTabela(){
        String sql = "select * from funcionario";
        try{
            statement = DAO.bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro! " + erro.toString());
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA ">
    public void preencherTabela(String SQL){
        System.out.println("1");
        ArrayList dados = new ArrayList();
         String[] colunas = new String[]{"idFuncionario","nomeFuncionario","cpf","rg",
             "telefone","celular","email","dataNascimento"};
         System.out.println("2");
        DAO.executaSQL(SQL);  
        System.out.println("3");
        try{
            DAO.resultSet.first();  
            do{    
                dados.add(new Object[]{DAO.resultSet.getString("idFuncionario"),DAO.resultSet.getString("nomeFuncionario"),
                    DAO.resultSet.getString("cpf"),DAO.resultSet.getString("rg"), DAO.resultSet.getString("telefone"), 
                    DAO.resultSet.getString("celular"), DAO.resultSet.getString("email"),DAO.resultSet.getString("dataNascimento"),
                   } );
            }while(DAO.resultSet.next());
        }catch(SQLException ex){}
        
        
        
        TabelaModelo modelo = new TabelaModelo(dados, colunas);
        jFuncionario.setModel(modelo); // recebe o modelo criado
        jFuncionario.getColumnModel().getColumn(0).setPreferredWidth(50);  
        jFuncionario.getColumnModel().getColumn(0).setResizable(false); 
        jFuncionario.getColumnModel().getColumn(1).setPreferredWidth(250);  // define o tamanho das colunas e se será redimensionado ou não
        jFuncionario.getColumnModel().getColumn(1).setResizable(true);  // não permite alterar o tamanho da coluna
        jFuncionario.getColumnModel().getColumn(2).setPreferredWidth(70);  
        jFuncionario.getColumnModel().getColumn(2).setResizable(false); 
        jFuncionario.getColumnModel().getColumn(3).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(3).setResizable(false); 
        jFuncionario.getColumnModel().getColumn(4).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(4).setResizable(false);
        jFuncionario.getColumnModel().getColumn(5).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(5).setResizable(false);
        jFuncionario.getColumnModel().getColumn(6).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(6).setResizable(false); 
        jFuncionario.getColumnModel().getColumn(7).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(7).setResizable(false);  
        jFuncionario.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jFuncionario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnCancelarFuncionario;
    private javax.swing.JButton btnGravarFuncionario;
    private javax.swing.JButton btnLimparFuncionario;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JComboBox<String> cbPerfilFuncionario;
    private javax.swing.JTable jFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JTextField txtBairroFuncionario;
    private javax.swing.JFormattedTextField txtCelFuncionario;
    private javax.swing.JFormattedTextField txtCepFuncionario;
    private javax.swing.JTextField txtCidadeFuncionario;
    private javax.swing.JTextField txtComplementoFuncionario;
    private javax.swing.JPasswordField txtConfirmacaoSenha;
    private javax.swing.JFormattedTextField txtCpfFuncionario;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtEstadoFuncionario;
    private javax.swing.JTextField txtLogradouroFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNumeroFuncionario;
    private javax.swing.JFormattedTextField txtRgFuncionario;
    private javax.swing.JPasswordField txtSenhaFuncionario;
    private javax.swing.JFormattedTextField txtTelFuncionario;
    private javax.swing.JTextField txtUsuarioFuncionario;
    // End of variables declaration//GEN-END:variables
}
