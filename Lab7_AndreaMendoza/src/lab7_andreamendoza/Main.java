package lab7_andreamendoza;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileFilter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        LogIn.setVisible(true);
        LogIn.setVisible(true);
        LogIn.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogIn = new javax.swing.JFrame();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jt_userlogin = new javax.swing.JTextField();
        pf_pwlogin = new javax.swing.JPasswordField();
        b_login = new javax.swing.JButton();
        NewUser = new javax.swing.JButton();
        b_shutdown = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        Mensajeria = new javax.swing.JDialog();
        jScrollPane13 = new javax.swing.JScrollPane();
        amigos = new javax.swing.JList<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        chisme = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Calendario = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        listdates = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        listinteresados = new javax.swing.JList<>();
        place = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Premium = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        InteresesC = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        UsuariosC = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Modificar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        usuario1 = new javax.swing.JTextField();
        pw1 = new javax.swing.JPasswordField();
        s_edad1 = new javax.swing.JSpinner();
        SaveNewU1 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        f1 = new javax.swing.JRadioButton();
        jLabel65 = new javax.swing.JLabel();
        m1 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        desc1 = new javax.swing.JTextArea();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        intereses1 = new javax.swing.JTextArea();
        CPremium1 = new javax.swing.JCheckBox();
        propic1 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        AddPP1 = new javax.swing.JButton();
        NewUser1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        s_edad = new javax.swing.JSpinner();
        SaveNewU = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        f = new javax.swing.JRadioButton();
        jLabel60 = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        intereses = new javax.swing.JTextArea();
        CPremium = new javax.swing.JCheckBox();
        propic = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        AddPP = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        VerUsuarios = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        listafriends = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        Perfil = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Intereses = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        AddDelete = new javax.swing.JButton();
        sexo1 = new javax.swing.JLabel();
        Age1 = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Requests = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        frequests = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        EscribirMensaje = new javax.swing.JDialog();
        jScrollPane15 = new javax.swing.JScrollPane();
        amigos1 = new javax.swing.JList<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        chisme2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        CalendarioB = new javax.swing.JButton();
        ModificarB = new javax.swing.JButton();
        MensajeriaB = new javax.swing.JButton();
        PremiumB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Solicitudes = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        LogIn.setMinimumSize(new java.awt.Dimension(490, 330));
        LogIn.setResizable(false);
        LogIn.setSize(new java.awt.Dimension(490, 330));
        LogIn.getContentPane().setLayout(null);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Usuario");
        LogIn.getContentPane().add(jLabel45);
        jLabel45.setBounds(50, 100, 80, 20);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Contraseña");
        LogIn.getContentPane().add(jLabel46);
        jLabel46.setBounds(50, 150, 80, 20);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Iniciar Sesión");
        LogIn.getContentPane().add(jLabel47);
        jLabel47.setBounds(150, 30, 170, 40);
        LogIn.getContentPane().add(jt_userlogin);
        jt_userlogin.setBounds(160, 100, 270, 28);
        LogIn.getContentPane().add(pf_pwlogin);
        pf_pwlogin.setBounds(160, 150, 270, 28);

        b_login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        b_login.setText("Ingresar");
        b_login.setBorderPainted(false);
        b_login.setOpaque(false);
        b_login.setPreferredSize(new java.awt.Dimension(80, 31));
        b_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_loginMouseClicked(evt);
            }
        });
        LogIn.getContentPane().add(b_login);
        b_login.setBounds(260, 240, 80, 31);

        NewUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        NewUser.setText("Crear Nuevo Usuario");
        NewUser.setOpaque(false);
        NewUser.setPreferredSize(new java.awt.Dimension(80, 31));
        NewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewUserMouseClicked(evt);
            }
        });
        LogIn.getContentPane().add(NewUser);
        NewUser.setBounds(10, 240, 150, 31);

        b_shutdown.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        b_shutdown.setText("Apagar");
        b_shutdown.setOpaque(false);
        b_shutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_shutdownMouseClicked(evt);
            }
        });
        LogIn.getContentPane().add(b_shutdown);
        b_shutdown.setBounds(350, 240, 80, 31);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7_andreamendoza/fondo.jpg"))); // NOI18N
        bg.setMaximumSize(new java.awt.Dimension(338, 159));
        bg.setMinimumSize(new java.awt.Dimension(338, 159));
        bg.setPreferredSize(new java.awt.Dimension(338, 159));
        LogIn.getContentPane().add(bg);
        bg.setBounds(0, 0, 540, 330);

        amigos.setModel(new DefaultListModel());
        amigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amigosMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(amigos);

        chisme.setModel(new DefaultListModel());
        jScrollPane14.setViewportView(chisme);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel16.setText("Mensajes");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel17.setText("Mensajes Recibidos");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel18.setText("Amigos");

        jButton4.setText("Escribir Mensaje Nuevo");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MensajeriaLayout = new javax.swing.GroupLayout(Mensajeria.getContentPane());
        Mensajeria.getContentPane().setLayout(MensajeriaLayout);
        MensajeriaLayout.setHorizontalGroup(
            MensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(MensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MensajeriaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MensajeriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(173, 173, 173))
            .addGroup(MensajeriaLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MensajeriaLayout.setVerticalGroup(
            MensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensajeriaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(MensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MensajeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Calendario");

        listdates.setModel(new DefaultListModel());
        jScrollPane11.setViewportView(listdates);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Crear una nueva cita:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Historial de citas:");

        listinteresados.setModel(new DefaultListModel());
        jScrollPane12.setViewportView(listinteresados);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setText("Lugar:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setText("Fecha:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel15.setText("¿Con quién?");

        jButton2.setText("Crear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CalendarioLayout = new javax.swing.GroupLayout(Calendario.getContentPane());
        Calendario.getContentPane().setLayout(CalendarioLayout);
        CalendarioLayout.setHorizontalGroup(
            CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarioLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalendarioLayout.createSequentialGroup()
                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalendarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalendarioLayout.createSequentialGroup()
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CalendarioLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalendarioLayout.createSequentialGroup()
                                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))
                                        .addGap(18, 18, 18)
                                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(place)))
                                    .addGroup(CalendarioLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel15))))
                            .addGroup(CalendarioLayout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        CalendarioLayout.setVerticalGroup(
            CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CalendarioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGroup(CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CalendarioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CalendarioLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel15)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)))
                        .addGap(20, 20, 20))
                    .addGroup(CalendarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        InteresesC.setModel(new DefaultListModel());
        jScrollPane9.setViewportView(InteresesC);

        UsuariosC.setModel(new DefaultListModel());
        UsuariosC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosCMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(UsuariosC);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText("Usuarios");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setText("Intereses en Común");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Usuarios Compatibles");

        javax.swing.GroupLayout PremiumLayout = new javax.swing.GroupLayout(Premium.getContentPane());
        Premium.getContentPane().setLayout(PremiumLayout);
        PremiumLayout.setHorizontalGroup(
            PremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PremiumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(PremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PremiumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(105, 105, 105))
        );
        PremiumLayout.setVerticalGroup(
            PremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PremiumLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(PremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(761, 300));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(761, 500));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setText("Modificando Tu Cuenta");

        name1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        name1.setText("Nombre");
        name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name1ClearField(evt);
            }
        });

        usuario1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usuario1.setText("Nombre de Usuario");
        usuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuario1MouseClicked(evt);
            }
        });

        pw1.setText("Contraseña");
        pw1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pw1MouseClicked(evt);
            }
        });

        s_edad1.setModel(new javax.swing.SpinnerNumberModel(18, 18, 70, 1));

        SaveNewU1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SaveNewU1.setText("Guardar");
        SaveNewU1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveNewU1MouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel55.setText("Debe de contener 8 caracteres mínimo.");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel62.setText("Edad");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel64.setText("Contraseña");

        buttonGroup1.add(f1);
        f1.setText("Femenino");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel65.setText("Sexo");

        buttonGroup1.add(m1);
        m1.setText("Masculino");

        desc1.setColumns(20);
        desc1.setRows(5);
        jScrollPane7.setViewportView(desc1);

        jLabel66.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel66.setText("Intereses (Separados por comas)");

        intereses1.setColumns(20);
        intereses1.setRows(5);
        jScrollPane8.setViewportView(intereses1);

        CPremium1.setText("Cuenta Premium");

        propic1.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        propic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7_andreamendoza/default-avatar (1).png"))); // NOI18N

        jLabel67.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel67.setText("Descripción");

        AddPP1.setText("Cambiar Foto de Perfil");
        AddPP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPP1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(AddPP1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(propic1)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CPremium1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(f1)
                                        .addGap(18, 18, 18)
                                        .addComponent(m1))
                                    .addComponent(jLabel65)))))
                    .addComponent(jLabel49)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(SaveNewU1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel55)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(18, 18, 18)
                        .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(660, 660, 660)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62)
                                .addGap(8, 8, 8)
                                .addComponent(usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(CPremium1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(propic1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddPP1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel64))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel55))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel65)
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f1)
                                            .addComponent(m1))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(110, 110, 110)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveNewU1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar.getContentPane());
        Modificar.getContentPane().setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModificarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModificarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        NewUser1.setTitle("Nuevo Usuario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(761, 300));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(761, 500));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setText("Creando una nueva cuenta");

        name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        name.setText("Nombre");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameClearField(evt);
            }
        });

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usuario.setText("Nombre de Usuario");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });

        pw.setText("Contraseña");
        pw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwMouseClicked(evt);
            }
        });

        s_edad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 70, 1));

        SaveNewU.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SaveNewU.setText("Guardar");
        SaveNewU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveNewUMouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel53.setText("Debe de contener 8 caracteres mínimo.");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel58.setText("Edad");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel59.setText("Contraseña");

        buttonGroup1.add(f);
        f.setText("Femenino");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel60.setText("Sexo");

        buttonGroup1.add(m);
        m.setText("Masculino");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        jLabel61.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel61.setText("Intereses (Separados por comas)");

        intereses.setColumns(20);
        intereses.setRows(5);
        jScrollPane2.setViewportView(intereses);

        CPremium.setText("Cuenta Premium");
        CPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPremiumActionPerformed(evt);
            }
        });

        propic.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        propic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7_andreamendoza/default-avatar (1).png"))); // NOI18N

        jLabel63.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel63.setText("Descripción");

        AddPP.setText("Cambiar Foto de Perfil");
        AddPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(AddPP))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(propic)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CPremium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(f)
                                        .addGap(18, 18, 18)
                                        .addComponent(m))
                                    .addComponent(jLabel60)))))
                    .addComponent(jLabel48)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(SaveNewU, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel53)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(660, 660, 660)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58)
                                .addGap(8, 8, 8)
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(CPremium))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(propic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddPP)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel59))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel53))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f)
                                            .addComponent(m))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel63))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(110, 110, 110)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveNewU, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );

        NewUser1.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        VerUsuarios.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                VerUsuariosWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                VerUsuariosWindowClosing(evt);
            }
        });

        listafriends.setModel(new DefaultListModel());
        listafriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listafriendsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listafriends);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Usuarios Disponible");

        javax.swing.GroupLayout VerUsuariosLayout = new javax.swing.GroupLayout(VerUsuarios.getContentPane());
        VerUsuarios.getContentPane().setLayout(VerUsuariosLayout);
        VerUsuariosLayout.setHorizontalGroup(
            VerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        VerUsuariosLayout.setVerticalGroup(
            VerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerUsuariosLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7_andreamendoza/default-avatar_1.png"))); // NOI18N

        Name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Name.setText("jLabel3");

        Age.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Age.setText("jLabel3");

        sexo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sexo.setText("jLabel3");

        Descripcion.setEditable(false);
        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        jScrollPane4.setViewportView(Descripcion);

        Intereses.setEditable(false);
        Intereses.setColumns(20);
        Intereses.setRows(5);
        jScrollPane5.setViewportView(Intereses);

        jButton3.setText("Me Interesa");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        AddDelete.setText("Agregar como Amigo");
        AddDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddDeleteMouseClicked(evt);
            }
        });

        sexo1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        sexo1.setText("Sexo:");

        Age1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Age1.setText("Edad:");

        Name1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Name1.setText("Nombre:");

        jLabel3.setText("Intereses");

        jLabel5.setText("Descripción");

        jButton8.setText("Bloquear");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PerfilLayout = new javax.swing.GroupLayout(Perfil.getContentPane());
        Perfil.getContentPane().setLayout(PerfilLayout);
        PerfilLayout.setHorizontalGroup(
            PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerfilLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerfilLayout.createSequentialGroup()
                        .addComponent(Name1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PerfilLayout.createSequentialGroup()
                        .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PerfilLayout.createSequentialGroup()
                                .addComponent(Age1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Age))
                            .addGroup(PerfilLayout.createSequentialGroup()
                                .addComponent(sexo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sexo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, PerfilLayout.createSequentialGroup()
                        .addComponent(AddDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
            .addGroup(PerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PerfilLayout.setVerticalGroup(
            PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerfilLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(PerfilLayout.createSequentialGroup()
                        .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name1)
                            .addComponent(Name))
                        .addGap(18, 18, 18)
                        .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age1)
                            .addComponent(Age))
                        .addGap(18, 18, 18)
                        .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexo1)
                            .addComponent(sexo))))
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(AddDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        frequests.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        frequests.setModel(new DefaultListModel());
        frequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frequestsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(frequests);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Solicitudes de Amistad");

        javax.swing.GroupLayout RequestsLayout = new javax.swing.GroupLayout(Requests.getContentPane());
        Requests.getContentPane().setLayout(RequestsLayout);
        RequestsLayout.setHorizontalGroup(
            RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane6)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        RequestsLayout.setVerticalGroup(
            RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        amigos1.setModel(new DefaultListModel());
        amigos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amigos1MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(amigos1);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel20.setText("Escribir Mensaje");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel21.setText("Enviar un nuevo mensaje");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel22.setText("Seleccione un Amigo");

        jButton5.setText("Enviar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        chisme2.setColumns(20);
        chisme2.setRows(5);
        jScrollPane17.setViewportView(chisme2);

        javax.swing.GroupLayout EscribirMensajeLayout = new javax.swing.GroupLayout(EscribirMensaje.getContentPane());
        EscribirMensaje.getContentPane().setLayout(EscribirMensajeLayout);
        EscribirMensajeLayout.setHorizontalGroup(
            EscribirMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscribirMensajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EscribirMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(EscribirMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscribirMensajeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(EscribirMensajeLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane17)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscribirMensajeLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(173, 173, 173))
            .addGroup(EscribirMensajeLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EscribirMensajeLayout.setVerticalGroup(
            EscribirMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscribirMensajeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(EscribirMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EscribirMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jScrollPane17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setMinimumSize(new java.awt.Dimension(430, 300));
        setPreferredSize(new java.awt.Dimension(430, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("Ver Usuarios");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 80, 123, 40);

        CalendarioB.setBackground(new java.awt.Color(255, 102, 102));
        CalendarioB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CalendarioB.setText("Calendario");
        CalendarioB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CalendarioB.setContentAreaFilled(false);
        CalendarioB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalendarioBMouseClicked(evt);
            }
        });
        CalendarioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarioBActionPerformed(evt);
            }
        });
        getContentPane().add(CalendarioB);
        CalendarioB.setBounds(151, 187, 123, 89);

        ModificarB.setBackground(new java.awt.Color(255, 102, 102));
        ModificarB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ModificarB.setText("Editar mi Perfil");
        ModificarB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarB.setContentAreaFilled(false);
        ModificarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarBMouseClicked(evt);
            }
        });
        getContentPane().add(ModificarB);
        ModificarB.setBounds(10, 129, 123, 40);

        MensajeriaB.setBackground(new java.awt.Color(255, 102, 102));
        MensajeriaB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MensajeriaB.setText("Mensajería");
        MensajeriaB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MensajeriaB.setContentAreaFilled(false);
        MensajeriaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MensajeriaBMouseClicked(evt);
            }
        });
        getContentPane().add(MensajeriaB);
        MensajeriaB.setBounds(10, 187, 123, 89);

        PremiumB.setBackground(new java.awt.Color(255, 102, 102));
        PremiumB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PremiumB.setText("Premium");
        PremiumB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PremiumB.setContentAreaFilled(false);
        PremiumB.setEnabled(false);
        PremiumB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PremiumBMouseClicked(evt);
            }
        });
        getContentPane().add(PremiumB);
        PremiumB.setBounds(292, 80, 123, 89);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tander");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(167, 20, 90, 31);

        Exit.setBackground(new java.awt.Color(255, 102, 102));
        Exit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Exit.setText("Salir");
        Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.setContentAreaFilled(false);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(292, 187, 123, 89);

        Solicitudes.setBackground(new java.awt.Color(255, 102, 102));
        Solicitudes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Solicitudes.setText("Solicitudes");
        Solicitudes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Solicitudes.setContentAreaFilled(false);
        Solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolicitudesMouseClicked(evt);
            }
        });
        Solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitudesActionPerformed(evt);
            }
        });
        getContentPane().add(Solicitudes);
        Solicitudes.setBounds(151, 80, 123, 89);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab7_andreamendoza/tinder_logo.jpg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 430, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_loginMouseClicked
        String un = jt_userlogin.getText();
        String pw = pf_pwlogin.getText();
        if (Users.size() == 0) {
            JOptionPane.showMessageDialog(LogIn, "No hay usuarios registrado.\nCree una cuenta primero.");
            jt_userlogin.setText("");
            pf_pwlogin.setText("");
        }
        for (Usuario U : Users) {
            if (U.getUn().equalsIgnoreCase(un) && U.getPw().equals(pw)) {
                USER = U;
                jt_userlogin.setText("");
                pf_pwlogin.setText("");
                if (USER.isPremium()) {
                    PremiumB.setEnabled(true);
                }
                LogIn.setVisible(false);
                this.pack();
                this.setVisible(true);
                this.setLocationRelativeTo(null);
                break;
            } else if (U.getUn().equalsIgnoreCase(un) && (!U.getPw().equals(pw))) {
                pf_pwlogin.setBackground(Color.pink);
                JOptionPane.showMessageDialog(LogIn, "Contraseña incorrecta.\nInténtelo de nuevo.");
                pf_pwlogin.setText("");
                break;
            } else if ((Users.indexOf(U) == Users.size() - 1) && ((!U.getUn().equalsIgnoreCase(un)))) {
                JOptionPane.showMessageDialog(LogIn, "El usuario ingresado no existe.\nInténtelo de nuevo con otro usuario o contacte el administrador del equipo.");
                jt_userlogin.setText("");
                pf_pwlogin.setText("");
            }

        }
    }//GEN-LAST:event_b_loginMouseClicked

    private void NewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUserMouseClicked
        jt_userlogin.setText("");
        pf_pwlogin.setText("");
        name.setText("Nombre");
        usuario.setText("Nombre de Usuario");
        s_edad.setValue(18);
        Intereses.setText("");
        Descripcion.setText("");
        pw.setText("");
        CPremium.setSelected(false);
        propic.setIcon(new ImageIcon("./src/lab7_andreamendoza/default-avatar (1).png"));
        NewUser1.pack();
        NewUser1.setLocationRelativeTo(null);
        NewUser1.setVisible(true);
    }//GEN-LAST:event_NewUserMouseClicked

    private void b_shutdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_shutdownMouseClicked
        int resp = JOptionPane.showConfirmDialog(LogIn, "¿Desea salir del Sistema?");
        if (resp == JOptionPane.YES_OPTION) {
            BinaryArchivesAdmin BA = new BinaryArchivesAdmin("./User Information.aj");
            BA.setUsers(Users);
            BA.overrideArchive();
            System.exit(0);
        }
    }//GEN-LAST:event_b_shutdownMouseClicked

    private void SaveNewUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveNewUMouseClicked
        Usuario U;
        String sexo = "";
        boolean valid = true;
        if (f.isSelected()) {
            sexo = "Femenino";
        } else {
            sexo = "Masculino";
        }
        for (int i = 0; i < name.getText().length(); i++) {
            if (Character.isDigit(name.getText().charAt(i))) {
                JOptionPane.showMessageDialog(NewUser1, "El nombre no puede contener números. \nIngrese un nombre válido.");
                valid = false;
            }
        }
        for (Usuario User : Users) {
            if (User.getUn().equalsIgnoreCase(usuario.getText())) {
                JOptionPane.showMessageDialog(NewUser1, "El nombre de usuario no está disponible.");
                valid = false;
            }
        }
        if (pw.getText().length() < 8) {
            JOptionPane.showMessageDialog(NewUser1, "La contraseña no es válida.\nInténtelo de nuevo.");
            valid = false;
        }
        if (pw.getText().isEmpty() || name.getText().isEmpty() || usuario.getText().isEmpty() || desc.getText().isEmpty() || intereses.getText().isEmpty()) {
            JOptionPane.showMessageDialog(NewUser1, "No pueden haber casillas vacías.");
            valid = false;
        }
        if (!f.isSelected() && !m.isSelected()) {
            JOptionPane.showMessageDialog(NewUser1, "Por favor, seleccione un sexo.");
            valid = false;
        }
        int contint = 0;
        for (int i = 0; i < intereses.getText().length(); i++) {
            if (intereses.getText().charAt(i) == ',') {
                ++contint;
            }
        }
        if (contint < 9) {
            JOptionPane.showMessageDialog(NewUser1, "Por favor, ingrese 10 intereses como mínimo.");
            valid = false;
        }
        if (valid == true) {
            String interes = intereses.getText();
            String[] I = interes.split(",");
            String pw1 = pw.getText();
            ArrayList<String> Intereses1 = new ArrayList();
            ArrayList<Usuario> Amigos = new ArrayList();
            ArrayList<Usuario> Interesado = new ArrayList();
            ArrayList<Mensajes> Mensajes = new ArrayList();
            ArrayList<Usuario> Solicitudes = new ArrayList();
            ArrayList<Usuario> Bloqueados = new ArrayList();
            ArrayList<Cita> Calendario = new ArrayList();
            for (int i = 0; i < I.length; i++) {
                Intereses1.add(I[i]);
            }

            try {
                U = new Usuario(name.getText(),
                        (int) s_edad.getValue(),
                        sexo,
                        usuario.getText(),
                        pw1,
                        Intereses1, Amigos, Interesado,
                        desc.getText(),
                        Mensajes, Solicitudes, Bloqueados, Calendario,
                        CPremium.isSelected(),
                        propic.getIcon()
                );
                NewUser1.setVisible(false);
                Users.add(U);
                JOptionPane.showMessageDialog(NewUser1, "¡Usuario creado exitósamente!");
                NewUser1.setVisible(false);
                LogIn.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(NewUser1, "Ha ocurrido un error. Inténtelo de nuevo.");
            }
        }

    }//GEN-LAST:event_SaveNewUMouseClicked

    private void pwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwMouseClicked
        pw.setText("");
    }//GEN-LAST:event_pwMouseClicked

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        usuario.setText("");
    }//GEN-LAST:event_usuarioMouseClicked

    private void nameClearField(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameClearField
        name.setText("");
    }//GEN-LAST:event_nameClearField

    private void CPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPremiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPremiumActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        VerUsuarios.pack();
        VerUsuarios.setLocationRelativeTo(null);
        this.setVisible(false);
        VerUsuarios.setVisible(true);
        DefaultListModel m = (DefaultListModel) listafriends.getModel();
        for (Usuario User : Users) {
            if (!User.getBloqueados().contains(USER)) {
                m.addElement(User.toString());
            }
        }
        listafriends.setModel(m);
    }//GEN-LAST:event_jButton1MouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        PremiumB.setEnabled(false);
        this.setVisible(false);
        LogIn.setVisible(true);
    }//GEN-LAST:event_ExitMouseClicked

    private void listafriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listafriendsMouseClicked
        int row = listafriends.getSelectedIndex();
        Intereses.setText("");
        Target = Users.get(row);
        Name.setText(Target.getName());
        Age.setText(String.valueOf(Target.getAge()));
        sexo.setText(Target.getSexo());
        jLabel4.setIcon(Target.getPropic());
        for (String I : Target.getIntereses()) {
            Intereses.append(I + "\n");
        }
        Descripcion.setText(Target.getDescripcion());
        Perfil.pack();
        Perfil.setLocationRelativeTo(null);
        Perfil.setVisible(true);
    }//GEN-LAST:event_listafriendsMouseClicked

    private void VerUsuariosWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_VerUsuariosWindowClosed

    }//GEN-LAST:event_VerUsuariosWindowClosed

    private void VerUsuariosWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_VerUsuariosWindowClosing
        DefaultListModel m = (DefaultListModel) listafriends.getModel();
        m.removeAllElements();
        listafriends.setModel(m);
        this.setVisible(true);
    }//GEN-LAST:event_VerUsuariosWindowClosing

    private void AddDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDeleteMouseClicked
        if (USER != Target) {
            Target.getSolicitudes().add(USER);
            AddDelete.setEnabled(false);
            System.out.println(Target.getSolicitudes());
            JOptionPane.showMessageDialog(Perfil, "¡Solicitud de amistad enviada!");
        } else {
            JOptionPane.showMessageDialog(Perfil, "No se puede agregar a sí mismo.");
        }
    }//GEN-LAST:event_AddDeleteMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (USER != Target) {
            USER.getDates().add(Target);
            Target.getDates().add(USER);
            JOptionPane.showMessageDialog(Perfil, "¡El usuario ha sido agregado a tu lista de Interesados exitósamente!");
            jButton3.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(Perfil, "No se puede interesar en sí mismo. Egocéntrico.");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if (USER != Target) {
            if (USER.getAmigos().contains(Target)) {
                USER.getAmigos().remove(Target);
            }
            USER.getBloqueados().add(Target);
            JOptionPane.showMessageDialog(Perfil, "El usuario ha sido bloqueado.");
            jButton8.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(Perfil, "No se puede bloquear a sí mismo.");
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void AddPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPPMouseClicked
        JFileChooser FChooser = new JFileChooser();
        FileNameExtensionFilter Filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        FChooser.setFileFilter(Filter);
        try {
            int op = FChooser.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                Image img = Toolkit.getDefaultToolkit().createImage(FChooser.getSelectedFile().getPath()).getScaledInstance(160, 160, 0);
                propic.setIcon(new ImageIcon(img));
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_AddPPMouseClicked

    private void SolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitudesMouseClicked
        DefaultListModel m = (DefaultListModel) frequests.getModel();
        m.removeAllElements();
        for (Usuario s : USER.getSolicitudes()) {
            m.addElement(s.toString());
        }
        frequests.setModel(m);
        Requests.pack();
        Requests.setLocationRelativeTo(null);
        Requests.setVisible(true);
    }//GEN-LAST:event_SolicitudesMouseClicked

    private void frequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frequestsMouseClicked
        Target = USER.getSolicitudes().get(frequests.getSelectedIndex());
        DefaultListModel m = (DefaultListModel) frequests.getModel();
        int resp = JOptionPane.showConfirmDialog(Solicitudes, "¿Desea aceptar a " + Target.getName() + " como amigo?");
        if (resp == JOptionPane.YES_OPTION) {
            Target.getAmigos().add(USER);
            USER.getAmigos().add(Target);
            USER.getSolicitudes().remove(Target);
            JOptionPane.showMessageDialog(Solicitudes, "¡Ahora " + Target.getName() + " y tú son amigos!");
            m.remove(frequests.getSelectedIndex());
            frequests.setModel(m);
        } else {
            USER.getSolicitudes().remove(Target);
            JOptionPane.showMessageDialog(Solicitudes, "Has rechazado a " + Target.getName() + " como amigo.");
            m.remove(frequests.getSelectedIndex());
            frequests.setModel(m);
        }
    }//GEN-LAST:event_frequestsMouseClicked

    private void name1ClearField(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name1ClearField
        name1.setText("");
    }//GEN-LAST:event_name1ClearField

    private void usuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario1MouseClicked
        usuario1.setText("");
    }//GEN-LAST:event_usuario1MouseClicked

    private void pw1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pw1MouseClicked
        pw1.setText("");
    }//GEN-LAST:event_pw1MouseClicked

    private void SaveNewU1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveNewU1MouseClicked
        String sexo = "";
        boolean valid = true;
        if (f1.isSelected()) {
            sexo = "Femenino";
        } else {
            sexo = "Masculino";
        }
        for (int i = 0; i < name1.getText().length(); i++) {
            if (Character.isDigit(name1.getText().charAt(i))) {
                JOptionPane.showMessageDialog(Modificar, "El nombre no puede contener números. \nIngrese un nombre válido.");
                valid = false;
            }
        }
        for (Usuario User : Users) {
            if (!usuario1.getText().equals(USER.getUn())) {
                if (User.getUn().equalsIgnoreCase(usuario1.getText())) {
                    JOptionPane.showMessageDialog(Modificar, "El nombre de usuario no está disponible.");
                    valid = false;
                }
            }
        }
        if (pw1.getText().length() < 8) {
            JOptionPane.showMessageDialog(Modificar, "La contraseña no es válida.\nInténtelo de nuevo.");
            valid = false;
        }
        if (pw1.getText().equals("") || name1.getText().equals("") || usuario1.getText().equals("") || desc1.getText().equals("") || intereses1.getText().equals("")) {
            JOptionPane.showMessageDialog(Modificar, "No pueden haber casillas vacías.");
            valid = false;
        }
        if (!f1.isSelected() && !m1.isSelected()) {
            JOptionPane.showMessageDialog(Modificar, "Por favor, seleccione un sexo.");
            valid = false;
        }
        int contint = 0;
        if (contint < 9) {
            JOptionPane.showMessageDialog(Modificar, "Por favor, ingrese 10 intereses como mínimo.");
            valid = false;
        }
        if (valid == true) {
            String interes = intereses1.getText();
            String[] I = interes.split(",");
            ArrayList<String> InteresesA = new ArrayList();
            for (int i = 0; i < I.length; i++) {
                InteresesA.add(I[i]);
            }
            try {
                USER.setName(name1.getText());
                USER.setPw(pw1.getText());
                USER.setUn(usuario1.getText());
                USER.setAge((int) s_edad1.getValue());
                USER.setPremium(CPremium1.isSelected());
                USER.setSexo(sexo);
                USER.setDescripcion(desc1.getText());
                USER.setIntereses(InteresesA);
                USER.setPropic(propic1.getIcon());
                JOptionPane.showMessageDialog(Modificar, "¡Usuario modificado exitósamente!");
                Modificar.setVisible(false);
                this.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(Modificar, "Ha ocurrido un error. Inténtelo de nuevo.");
            }
        }
    }//GEN-LAST:event_SaveNewU1MouseClicked

    private void AddPP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPP1MouseClicked
        JFileChooser FChooser = new JFileChooser();
        FileNameExtensionFilter Filter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png", "gif");
        FChooser.setFileFilter(Filter);
        try {
            int op = FChooser.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                Image img = Toolkit.getDefaultToolkit().createImage(FChooser.getSelectedFile().getPath()).getScaledInstance(160, 160, 0);
                propic.setIcon(new ImageIcon(img));
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_AddPP1MouseClicked

    private void ModificarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarBMouseClicked
        name1.setText(USER.getName());
        this.usuario1.setText(USER.getUn());
        pw1.setText(USER.getPw());
        for (String i : USER.getIntereses()) {
            intereses1.append(i + ", ");
        }
        this.desc1.setText(USER.getDescripcion());
        this.s_edad1.setValue(USER.getAge());
        this.propic1.setIcon(USER.getPropic());
        CPremium1.setSelected(USER.isPremium());
        if (USER.getSexo().equals("Femenino")) {
            f1.isSelected();
        } else {
            m1.isSelected();
        }
        Modificar.pack();
        Modificar.setLocationRelativeTo(null);
        Modificar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ModificarBMouseClicked

    private void PremiumBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PremiumBMouseClicked
        if (PremiumB.isEnabled()) {
            DefaultListModel m = (DefaultListModel) UsuariosC.getModel();
            m.removeAllElements();
            DefaultListModel mw = (DefaultListModel) InteresesC.getModel();
            mw.removeAllElements();
            CommonI = new ArrayList();
            for (Usuario U : Users) {
                if (!U.equals(USER)) {
                    ArrayList<String> Temp = new ArrayList();
                    for (String i : USER.getIntereses()) {
                        for (String i2 : U.getIntereses()) {
                            if (i.equalsIgnoreCase(i2)) {
                                Temp.add(i2);
                            }
                        }
                    }
                    if (Temp.size() >= 3) {
                        m.addElement(U);
                        CommonI.add(Temp);
                    }
                }
            }
            Premium.pack();
            Premium.setLocationRelativeTo(null);
            Premium.setVisible(true);
        }
    }//GEN-LAST:event_PremiumBMouseClicked

    private void UsuariosCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosCMouseClicked
        DefaultListModel m = (DefaultListModel) InteresesC.getModel();
        int i = UsuariosC.getSelectedIndex();
        for (Object o : CommonI.get(i + 1)) {
            m.addElement(o);
        }
    }//GEN-LAST:event_UsuariosCMouseClicked

    private void CalendarioBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarioBMouseClicked
        DefaultListModel m = (DefaultListModel) listinteresados.getModel();
        m.removeAllElements();
        if (USER.getDates().size() > 0) {
            for (Usuario date : USER.getDates()) {
                m.addElement(date.toString());
            }
        }
        DefaultListModel m2 = (DefaultListModel) listdates.getModel();
        m2.removeAllElements();
        if (USER.getCalendar().size() > 0) {
            for (Cita date : USER.getCalendar()) {
                m2.addElement(date.toString());
            }
        }
        listdates.setModel(m2);
        listinteresados.setModel(m);
        Calendario.pack();
        Calendario.setLocationRelativeTo(null);
        Calendario.setVisible(true);
    }//GEN-LAST:event_CalendarioBMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        DefaultListModel m2 = (DefaultListModel) listdates.getModel();
        Target = Users.get(listinteresados.getSelectedIndex());
        if (!listinteresados.isSelectionEmpty()) {
            Cita Nueva = new Cita(fecha.getDate(), Target, place.getText());
            USER.getCalendar().add(Nueva);
            m2.addElement(Nueva.toString());
            Nueva.setU1(USER);
            Target.getCalendar().add(Nueva);
            JOptionPane.showMessageDialog(Calendario, "¡Cita creada exitósamente!");
            listdates.setModel(m2);
            place.setText("");
        } else {
            JOptionPane.showMessageDialog(Calendario, "No ha seleccionado a nadie de su lista de interesados.");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void MensajeriaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MensajeriaBMouseClicked
        DefaultListModel m = (DefaultListModel) amigos.getModel();
        m.removeAllElements();
        if (USER.getAmigos().size() > 0) {
            for (Usuario a : USER.getAmigos()) {
                m.addElement(a.toString());
            }
            amigos.setModel(m);
            Mensajeria.pack();
            Mensajeria.setLocationRelativeTo(null);
            Mensajeria.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(Mensajeria, "No tienes amigos agregados :( \nAgrega a alguien para poder mandar mensajes.");
        }

    }//GEN-LAST:event_MensajeriaBMouseClicked

    private void SolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitudesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SolicitudesActionPerformed

    private void amigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amigosMouseClicked
        DefaultListModel m = (DefaultListModel) chisme.getModel();
        m.removeAllElements();
        int row = amigos.getSelectedIndex();
        for (Mensajes men : USER.getMensajes()) {
            if (men.getEmisor().equals(USER.getAmigos().get(row))) {
                m.addElement("De: " + men.getEmisor() + "\n Para: " + men.getReceptor() + "\n Mensaje: " + men.toString() + "\n\n");
            }
        }
        chisme.setModel(m);
    }//GEN-LAST:event_amigosMouseClicked

    private void amigos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amigos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_amigos1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        DefaultListModel m = (DefaultListModel) amigos1.getModel();
        m.removeAllElements();
        for (Usuario amigo : USER.getAmigos()) {
            m.addElement(amigo.toString());
        }
        amigos1.setModel(m);
        chisme2.setText("");
        EscribirMensaje.pack();
        EscribirMensaje.setLocationRelativeTo(null);
        EscribirMensaje.setVisible(true);
        Mensajeria.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (!amigos1.isSelectionEmpty()) {
            USER.getMensajes().add(new Mensajes(USER, USER.getAmigos().get(amigos1.getSelectedIndex()), chisme2.getText()));
            USER.getAmigos().get(amigos1.getSelectedIndex()).getMensajes().add(new Mensajes(USER, USER.getAmigos().get(amigos1.getSelectedIndex()), chisme2.getText()));
            JOptionPane.showMessageDialog(EscribirMensaje, "Mensaje enviado.");
            int resp = JOptionPane.showConfirmDialog(this, "¿Desea enviar otro mensaje?");
            if (resp == JOptionPane.YES_OPTION) {
                chisme2.setText("");
            } else {
                chisme2.setText("");
                EscribirMensaje.setVisible(false);
                Mensajeria.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(EscribirMensaje, "No ha seleccionado ningún amigo.");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void CalendarioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalendarioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalendarioBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        BinaryArchivesAdmin BA = new BinaryArchivesAdmin("./User Information.aj");
        BA.loadArchive();
        Users = BA.getUsers();
        //  BA.overrideArchive();

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDelete;
    private javax.swing.JButton AddPP;
    private javax.swing.JButton AddPP1;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Age1;
    private javax.swing.JCheckBox CPremium;
    private javax.swing.JCheckBox CPremium1;
    private javax.swing.JDialog Calendario;
    private javax.swing.JButton CalendarioB;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JDialog EscribirMensaje;
    private javax.swing.JButton Exit;
    private javax.swing.JTextArea Intereses;
    private javax.swing.JList<String> InteresesC;
    private javax.swing.JFrame LogIn;
    private javax.swing.JDialog Mensajeria;
    private javax.swing.JButton MensajeriaB;
    private javax.swing.JDialog Modificar;
    private javax.swing.JButton ModificarB;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JButton NewUser;
    private javax.swing.JDialog NewUser1;
    private javax.swing.JDialog Perfil;
    private javax.swing.JDialog Premium;
    private javax.swing.JButton PremiumB;
    private javax.swing.JDialog Requests;
    private javax.swing.JButton SaveNewU;
    private javax.swing.JButton SaveNewU1;
    private javax.swing.JButton Solicitudes;
    private javax.swing.JList<String> UsuariosC;
    private javax.swing.JDialog VerUsuarios;
    private javax.swing.JList<String> amigos;
    private javax.swing.JList<String> amigos1;
    private javax.swing.JButton b_login;
    private javax.swing.JButton b_shutdown;
    private javax.swing.JLabel bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JList<String> chisme;
    private javax.swing.JTextArea chisme2;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextArea desc1;
    private javax.swing.JRadioButton f;
    private javax.swing.JRadioButton f1;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JList<String> frequests;
    private javax.swing.JTextArea intereses;
    private javax.swing.JTextArea intereses1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jt_userlogin;
    private javax.swing.JList<String> listafriends;
    private javax.swing.JList<String> listdates;
    private javax.swing.JList<String> listinteresados;
    private javax.swing.JRadioButton m;
    private javax.swing.JRadioButton m1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JPasswordField pf_pwlogin;
    private javax.swing.JTextField place;
    private javax.swing.JLabel propic;
    private javax.swing.JLabel propic1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JSpinner s_edad;
    private javax.swing.JSpinner s_edad1;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel sexo1;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables
    static ArrayList<Usuario> Users = new ArrayList();
    Usuario USER;
    Usuario Target;
    ArrayList<ArrayList> CommonI;
}
