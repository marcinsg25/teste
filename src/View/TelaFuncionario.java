
package View;

import Controller.FuncionarioController;
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
    String sqlTabela2=null;
    public FuncionarioController fc;
    public ResultSet rs;
    public String[] codigo;
    public String[] codigop ; 
    int vd = 0;
    
    boolean dp;
    int x = 0;
    public TelaFuncionario() {
        initComponents();
        DAO = new DAO ();
        fc = new FuncionarioController ();
        if(!fc.logarBD()){
            JOptionPane.showMessageDialog(null,"Falha ao conectar, o sistema será fechado");
            System.exit(0);    
        }
        
        
       sqlTabela = "select * from funcionario inner join endereco on FKendereco = idendereco inner join usuario on FKfuncionario = idfuncionario";
       sqlTabela2 = "select * from usuario inner join funcionario on FKfuncionario = idfuncionario inner join endereco on idendereco = FKendereco ";
        carregarTabela();
        atualizarCampos();
        preencherTabelaFuncionario(sqlTabela);
        preencherTabelaUsuario(sqlTabela2);
        habilitaCampos(false,false,false,false,false,false,false,false,false,
                    false,false,false,false,false,false,false,false,false);
        
        habilitabotoes(true,true,false,false,false);
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
        lblexistecpf = new javax.swing.JLabel();
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
        lblexistecep = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtUsuarioFuncionario = new javax.swing.JTextField();
        txtSenhaFuncionario = new javax.swing.JPasswordField();
        txtConfirmacaoSenha = new javax.swing.JPasswordField();
        cbPerfilFuncionario = new javax.swing.JComboBox<>();
        lblexisteusuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFuncionario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jUsuario = new javax.swing.JTable();
        btnNovoFuncionario = new javax.swing.JButton();
        btnGravarFuncionario = new javax.swing.JButton();
        btnLimparFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnCancelarFuncionario = new javax.swing.JButton();

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
        txtCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfFuncionarioActionPerformed(evt);
            }
        });

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

        lblexistecpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblexistecpf.setForeground(new java.awt.Color(255, 0, 0));
        lblexistecpf.setText(".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomeFuncionario))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
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
                                .addComponent(txtCelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblexistecpf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(txtRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexistecpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lblexistecep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblexistecep.setForeground(new java.awt.Color(255, 0, 0));
        lblexistecep.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addComponent(txtComplementoFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblexistecep, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexistecep))
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

        lblexisteusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblexisteusuario.setForeground(new java.awt.Color(255, 0, 0));
        lblexisteusuario.setText(".");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConfirmacaoSenha)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblexisteusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(cbPerfilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexisteusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPerfilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(33, Short.MAX_VALUE))
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
        jFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jFuncionario);

        jUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jUsuario);

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
        btnLimparFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFuncionarioActionPerformed(evt);
            }
        });

        btnAlterarFuncionario.setText("Alterar");
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarFuncionario.setText("Cancelar");
        btnCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
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
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFuncionario)
                    .addComponent(btnGravarFuncionario)
                    .addComponent(btnLimparFuncionario)
                    .addComponent(btnAlterarFuncionario)
                    .addComponent(btnCancelarFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //<editor-fold defaultstate="collapsed" desc=" BOTÃO NOVO ">
    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
          btnNovoFuncionario.setEnabled(false);
          btnGravarFuncionario.setEnabled(true);
          btnLimparFuncionario.setEnabled(true);
          btnAlterarFuncionario.setEnabled(false);
          btnCancelarFuncionario.setEnabled(true);
          vd = 1;
          
           habilitaCampos(true, true, true, true, true, true, true, true, true, 
                   true, true, true, true, true, true, true, true, true );
           
           limparCampos();
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc=" BOTÃO ALTERAR ">
    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        habilitaCampos(true, true, true, true, true, true, true, true, true, 
                   true, true, true, true, true, true, true, true, true );
        lblexistecep.setText("");
        lblexistecpf.setText("");
        lblexisteusuario.setText("");
        
         vd = 2;
        
          
         habilitabotoes(false,true,false,false,true);
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" BOTÃO GRAVAR ">
    private void btnGravarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarFuncionarioActionPerformed
       
       boolean cf = DAO.cslcpf(txtCpfFuncionario.getText());
       boolean cs = DAO.cslEndereco(txtCepFuncionario.getText());
       boolean cuser = DAO.csluser(txtUsuarioFuncionario.getText());
      
        lblexistecep.setText("");
        lblexistecpf.setText("");
        lblexisteusuario.setText("");
       
       
                if (cf == true){
                   pesquisaCpf(cs);
               }else if(cs == true){
                 
                    pesquisaCep(cs);
               }else if(cuser == true){     
            
                    pesquisaUser(cuser);    
               }
       
       
       switch (vd){
             case 1:
              
                if(txtNomeFuncionario.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Preencha o campo Produto.");
                   txtNomeFuncionario.requestFocus();
                    return;
                } 
                 
                 
               if (cf != true && cs != true && cuser!=true){
                    FuncionarioController Fc = new FuncionarioController();
                    Fc.salvarFuncionario(txtNomeFuncionario.getText(),txtCpfFuncionario.getText(),
                    txtRgFuncionario.getText(), txtTelFuncionario.getText(),txtCelFuncionario.getText(),
                    txtEmailFuncionario.getText(),txtDataNasc.getText(),txtCepFuncionario.getText(),txtBairroFuncionario.getText(),
                    txtLogradouroFuncionario.getText(),txtComplementoFuncionario.getText(),txtNumeroFuncionario.getText(),
                    txtCidadeFuncionario.getText(),txtEstadoFuncionario.getText(), txtUsuarioFuncionario.getText(), (String) cbPerfilFuncionario.getSelectedItem(),txtSenhaFuncionario.getText(),
                    txtConfirmacaoSenha.getText());
                    habilitaCampos(false,false,false,false,false,false,false,false,false,
                    false,false,false,false,false,false,false,false,false);
        
                    habilitabotoes(true,false,false,false,false); 
                    JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO");
                
                    lblexistecep.setText("");
                    lblexistecpf.setText("");
                    lblexisteusuario.setText("");
                
                   
                
                
                }
                
                break;
                  
            case 2:
                FuncionarioController ac = new FuncionarioController();
                ac.alterarFuncionario(txtNomeFuncionario.getText(),txtCpfFuncionario.getText(),
                txtRgFuncionario.getText(), txtTelFuncionario.getText(),txtCelFuncionario.getText(),txtEmailFuncionario.getText(),
                txtDataNasc.getText(),txtCepFuncionario.getText(),txtBairroFuncionario.getText(),
                    txtLogradouroFuncionario.getText(),txtComplementoFuncionario.getText(),txtNumeroFuncionario.getText(),
                    txtCidadeFuncionario.getText(),txtEstadoFuncionario.getText(),txtUsuarioFuncionario.getText(), 
                    (String) cbPerfilFuncionario.getSelectedItem(),txtSenhaFuncionario.getText(), txtConfirmacaoSenha.getText());
                    habilitaCampos(false,false,false,false,false,false,false,false,false,
                     false,false,false,false,false,false,false,false,false);
                        lblexistecep.setText("");
                        lblexistecpf.setText("");
                        lblexisteusuario.setText("");
                  
                    habilitabotoes(true,false,false,false,false); 
                    JOptionPane.showMessageDialog(null, "ALTERACAO REALIZADA");
                 
                 break;
               
           }
            
    
  
          
        preencherTabelaFuncionario(sqlTabela);
        preencherTabelaUsuario(sqlTabela2);
        
   
         
       
    }//GEN-LAST:event_btnGravarFuncionarioActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" PESQUISA CPF ">
    public void pesquisaCpf(boolean cpf) {
          if (cpf == true ) {
             lblexistecpf.setText("CPF cadastrado");
             
          }else{
               lblexistecpf.setText("");
           }
   }
   //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc=" PESQUISA CEP ">
    public void pesquisaCep(boolean cep) {
       if (cep == true ) {
             lblexistecep.setText("CEP cadastrado");
       } else{
               lblexistecep.setText("");
       }    
          
   }
   //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc=" PESQUISA USUARIO ">
    public void pesquisaUser(boolean user) {
        if ( user == true ) {
             lblexisteusuario.setText("Usuario cadastrado");
         } else{
               lblexisteusuario.setText("");
        }           
          
   }
   //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc=" METODO SELECAO LINHA FUNCIONARIO E BAIRRO ">
    private void jFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFuncionarioMouseClicked
        
        int linhaSelecionada = jFuncionario.getSelectedRow();  // pega a linha selecionada
        
        
        lblFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 0).toString());
        txtNomeFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 1).toString());
        txtCpfFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 2).toString());
        txtRgFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 3).toString());
        txtTelFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 4).toString());
        txtCelFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 5).toString());
        txtEmailFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 6).toString());
        
        String dataCompra = jFuncionario.getValueAt(linhaSelecionada, 7).toString();
        String  data = dataCompra;
        String data1 = data.replaceAll("-","");
        String data2 = data1.substring(0,2);
        String data3 = data1.substring(2,4);
        String data4 = data1.substring(4,8);
        String dataC = data4 +  data2  + data3;
        txtDataNasc.setText(dataC);
        
        
        txtCepFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 8).toString());
        txtBairroFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 9).toString());
        txtLogradouroFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 10).toString());
        txtComplementoFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 11).toString());
        txtNumeroFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 12).toString());
        txtCidadeFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 13).toString());
        txtEstadoFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 14).toString());
        
        
        txtUsuarioFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 15).toString());
        cbPerfilFuncionario.setSelectedItem(jFuncionario.getValueAt(linhaSelecionada, 16).toString());
        txtSenhaFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 17).toString());
        txtConfirmacaoSenha.setText(jFuncionario.getValueAt(linhaSelecionada, 18).toString());
        
        habilitaCampos(false,false,false,false,false,false,false,false,false,
                    false,false,false,false,false,false,false,false,false);
         habilitabotoes(false,false,true,false,true);
         
    }//GEN-LAST:event_jFuncionarioMouseClicked
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" METODO SELECAO LINHA USUARIO ">
    private void jUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsuarioMouseClicked
        
        int linhaSelecionada = jUsuario.getSelectedRow();  // pega a linha selecionada
        
        txtUsuarioFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 1).toString());
        cbPerfilFuncionario.setSelectedItem(jUsuario.getValueAt(linhaSelecionada, 2).toString());
        txtSenhaFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 3).toString());
        txtConfirmacaoSenha.setText(jUsuario.getValueAt(linhaSelecionada, 4).toString());
        
        
        lblFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 5).toString());
        txtNomeFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 6).toString());
        txtCpfFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 7).toString());
        txtRgFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 8).toString());
        txtTelFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 9).toString());
        txtCelFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 10).toString());
        txtEmailFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 11).toString());
        
        String dataCompra = jUsuario.getValueAt(linhaSelecionada, 12).toString();
        String  data = dataCompra;
        String data1 = data.replaceAll("-","");
        String data2 = data1.substring(0,2);
        String data3 = data1.substring(2,4);
        String data4 = data1.substring(4,8);
        String dataC = data4 +  data2  + data3;
        txtDataNasc.setText(dataC);
        
        
        
        txtCepFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 13).toString());
        txtBairroFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 14).toString());
        txtLogradouroFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 15).toString());
        txtComplementoFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 16).toString());
        txtNumeroFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 17).toString());
        txtCidadeFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 18).toString());
        txtEstadoFuncionario.setText(jUsuario.getValueAt(linhaSelecionada, 19).toString());
        
        habilitaCampos(false,false,false,false,false,false,false,false,false,
                    false,false,false,false,false,false,false,false,false);
        
        habilitabotoes(false,false,true,false,true);
        
    }//GEN-LAST:event_jUsuarioMouseClicked
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" BOTAO CANCELAR ">
    private void btnCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFuncionarioActionPerformed
        carregarTabela();
        atualizarCampos();
        
        habilitabotoes(true,false,false,false,false);
        habilitaCampos(false,false,false,false,false,false,false,false,false,
                false,false,false,false,false,false,false,false,false);
        
    }//GEN-LAST:event_btnCancelarFuncionarioActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" BOTAO LIMPAR ">
    private void btnLimparFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFuncionarioActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparFuncionarioActionPerformed

    private void txtCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfFuncionarioActionPerformed
        boolean cf = DAO.cslcpf(txtCpfFuncionario.getText());
        String msg2 = "Cpf JÁ CADASTRADO";
       if (cf == true && dp == true){
        lblexistecpf.setText(msg2);
       }
    }//GEN-LAST:event_txtCpfFuncionarioActionPerformed
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
            
            lblFuncionario.setText(resultSet.getString("idfuncionario"));
            txtNomeFuncionario.setText(resultSet.getString("nomeFuncionario"));
            txtCpfFuncionario.setText(resultSet.getString("cpf"));
            txtRgFuncionario.setText(resultSet.getString("rg"));
            txtTelFuncionario.setText(resultSet.getString("telefone"));
            txtCelFuncionario.setText(resultSet.getString("celular"));
            txtEmailFuncionario.setText(resultSet.getString("email"));
            
            String dataCompra = resultSet.getString("dataNascimento");
            String  data = dataCompra;
            String data1 = data.replaceAll("-","");
            String data2 = data1.substring(0,2);
            String data3 = data1.substring(2,4);
            String data4 = data1.substring(4,8);
            String dataC = data4 +  data2  + data3;
            txtDataNasc.setText(dataC);
            
           txtCepFuncionario.setText(resultSet.getString("cep"));
           txtBairroFuncionario.setText(resultSet.getString("bairro"));
           txtLogradouroFuncionario.setText(resultSet.getString("logradouro"));
           txtComplementoFuncionario.setText(resultSet.getString("complemento"));
           txtNumeroFuncionario.setText(resultSet.getString("numero"));  
           txtCidadeFuncionario.setText(resultSet.getString("cidade"));
           txtEstadoFuncionario.setText(resultSet.getString("estado"));
           
           txtUsuarioFuncionario.setText(resultSet.getString("login"));
           cbPerfilFuncionario.setSelectedItem(resultSet.getString("perfil"));   
           txtSenhaFuncionario.setText(resultSet.getString("senha"));   
           txtConfirmacaoSenha.setText(resultSet.getString("confiSenha"));   
              
        }catch(SQLException erro){}
    }
    //</editor-fold>
   
    
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LIMPAR CAMPOS ">
    public void limparCampos(){
      lblFuncionario.setText("");
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
      lblexistecep.setText("");
       lblexistecpf.setText("");
       lblexisteusuario.setText("");

    
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CARREGAR TABELA ">
    public void carregarTabela(){
        String sql = "select * from funcionario inner join endereco on FKendereco = idendereco inner join usuario on FKfuncionario = idfuncionario";
        try{
            statement = DAO.bd.connection.prepareStatement(sql);
            resultSet  = statement.executeQuery();
            
            
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro! " + erro.toString());
        }
    }
    //</editor-fold>
    
    
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA FUNCIONARIO E BAIRRO">
    public void preencherTabelaFuncionario(String SQL){
       
        ArrayList dados = new ArrayList();
         String[] colunas = new String[]{"idFuncionario","nomeFuncionario","cpf","rg",
             "telefone","celular","email","dataNascimento","cep","bairro","logradouro",
             "complemento","numero","cidade","estado","login","perfil","senha","confiSenha"};
         
        DAO.executaSQL(SQL);  
        
        
        try{
            DAO.resultSet.first();  
            do{    
                dados.add(new Object[]{DAO.resultSet.getString("idfuncionario"),DAO.resultSet.getString("nomeFuncionario"),DAO.resultSet.getString("cpf"),
                DAO.resultSet.getString("rg"), DAO.resultSet.getString("telefone"),DAO.resultSet.getString("celular"), 
                DAO.resultSet.getString("email"),DAO.resultSet.getString("dataNascimento"),DAO.resultSet.getString("cep"),
                DAO.resultSet.getString("Bairro"),DAO.resultSet.getString("logradouro"),DAO.resultSet.getString("complemento"),
                DAO.resultSet.getString("numero"),DAO.resultSet.getString("cidade"),DAO.resultSet.getString("estado"), 
                DAO.resultSet.getString("login"),DAO.resultSet.getString("perfil"),DAO.resultSet.getString("senha"), 
                DAO.resultSet.getString("confiSenha")});
                    
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
        jFuncionario.getColumnModel().getColumn(8).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(8).setResizable(false);
        jFuncionario.getColumnModel().getColumn(9).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(9).setResizable(false); 
        jFuncionario.getColumnModel().getColumn(10).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(10).setResizable(false); 
        jFuncionario.getColumnModel().getColumn(11).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(11).setResizable(false); 
        jFuncionario.getColumnModel().getColumn(12).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(12).setResizable(false);
        jFuncionario.getColumnModel().getColumn(13).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(13).setResizable(false);
        jFuncionario.getColumnModel().getColumn(14).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(14).setResizable(false);
        jFuncionario.getColumnModel().getColumn(15).setPreferredWidth(120);  
        jFuncionario.getColumnModel().getColumn(15).setResizable(false);
        jFuncionario.getColumnModel().getColumn(16).setMinWidth(0);  
        jFuncionario.getColumnModel().getColumn(16).setMaxWidth(0); 
        jFuncionario.getColumnModel().getColumn(17).setMinWidth(0);  
        jFuncionario.getColumnModel().getColumn(17).setMaxWidth(0);
        jFuncionario.getColumnModel().getColumn(18).setMinWidth(0);  
        jFuncionario.getColumnModel().getColumn(18).setMaxWidth(0);
        
       
       
        
        jFuncionario.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jFuncionario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA USUARIO">
     public void preencherTabelaUsuario(String SQL){
          ArrayList dados = new ArrayList();
         String[] colunas = new String[]{"idUsuário","Login","Perfil","Senha",
             "CofirmaçaoSenha","idfuncionario","nomeFuncionario","cpf","rg",
             "telefone","celular","email","dataNascimento","cep","bairro",
             "logradouro","complemento","numero","cidade","estado"};
         
        DAO.executaSQL(SQL);  
        
       
        try{
            DAO.resultSet.first();  
            do{    
                dados.add(new Object[]{DAO.resultSet.getString("idUsuario"),DAO.resultSet.getString("login"),DAO.resultSet.getString("perfil"),DAO.resultSet.getString("senha"), 
                    DAO.resultSet.getString("confiSenha"),DAO.resultSet.getString("idfuncionario"),DAO.resultSet.getString("nomeFuncionario"),
                    DAO.resultSet.getString("cpf"),DAO.resultSet.getString("rg"), DAO.resultSet.getString("telefone"),DAO.resultSet.getString("celular"), 
                    DAO.resultSet.getString("email"),DAO.resultSet.getString("dataNascimento"),DAO.resultSet.getString("cep"),
                    DAO.resultSet.getString("bairro"),DAO.resultSet.getString("logradouro"),DAO.resultSet.getString("complemento"),
                    DAO.resultSet.getString("numero"),DAO.resultSet.getString("cidade"),DAO.resultSet.getString("estado")} );
            }while(DAO.resultSet.next());
        }catch(SQLException ex){}
        
        
        TabelaModelo modelo = new TabelaModelo(dados, colunas);
        jUsuario.setModel(modelo); // recebe o modelo criado
        jUsuario.getColumnModel().getColumn(0).setPreferredWidth(50); 
        jUsuario.getColumnModel().getColumn(0).setResizable(false); 
        jUsuario.getColumnModel().getColumn(1).setPreferredWidth(250);  // define o tamanho das colunas e se será redimensionado ou não
        jUsuario.getColumnModel().getColumn(1).setResizable(true);  // não permite alterar o tamanho da coluna
        jUsuario.getColumnModel().getColumn(2).setPreferredWidth(70);  
        jUsuario.getColumnModel().getColumn(2).setResizable(false); 
        jUsuario.getColumnModel().getColumn(3).setPreferredWidth(120);  
        jUsuario.getColumnModel().getColumn(3).setResizable(false); 
        jUsuario.getColumnModel().getColumn(4).setPreferredWidth(250);  
        jUsuario.getColumnModel().getColumn(4).setResizable(false); 
        jUsuario.getColumnModel().getColumn(5).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(5).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(5).setResizable(false); 
        jUsuario.getColumnModel().getColumn(6).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(6).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(6).setResizable(false); 
        jUsuario.getColumnModel().getColumn(7).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(7).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(7).setResizable(false); 
        jUsuario.getColumnModel().getColumn(8).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(8).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(8).setResizable(false); 
        jUsuario.getColumnModel().getColumn(9).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(9).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(9).setResizable(false); 
        jUsuario.getColumnModel().getColumn(10).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(10).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(10).setResizable(false); 
        jUsuario.getColumnModel().getColumn(11).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(11).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(11).setResizable(false); 
        jUsuario.getColumnModel().getColumn(12).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(12).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(12).setResizable(false); 
        jUsuario.getColumnModel().getColumn(13).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(13).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(13).setResizable(false); 
        jUsuario.getColumnModel().getColumn(14).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(14).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(14).setResizable(false); 
        jUsuario.getColumnModel().getColumn(15).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(15).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(15).setResizable(false); 
        jUsuario.getColumnModel().getColumn(16).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(16).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(16).setResizable(false); 
        jUsuario.getColumnModel().getColumn(17).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(17).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(17).setResizable(false); 
        jUsuario.getColumnModel().getColumn(18).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(18).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(18).setResizable(false); 
        jUsuario.getColumnModel().getColumn(19).setMinWidth(0);  
        jUsuario.getColumnModel().getColumn(19).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(19).setResizable(false); 
        
        
        
        jUsuario.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
         
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable jUsuario;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JLabel lblexistecep;
    private javax.swing.JLabel lblexistecpf;
    private javax.swing.JLabel lblexisteusuario;
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
