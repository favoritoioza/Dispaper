/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Favorito
 */
public class AltaPapel extends javax.swing.JFrame {

    /**
     * Creates new form AltaPapel
     */
    public AltaPapel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        __Bobina = new javax.swing.JRadioButton();
        __Hoja = new javax.swing.JRadioButton();
        __etqFecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        __TipoPapel = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        __NombrePapel = new javax.swing.JComboBox();
        __ColorPapel = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        __etqNewNombre = new javax.swing.JLabel();
        __etqNewColor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        __Cara1 = new javax.swing.JRadioButton();
        __Cara2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        __Gramos = new javax.swing.JLabel();
        __Gramaje = new javax.swing.JTextField();
        __Ancho = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        __Marca = new javax.swing.JComboBox();
        __Propiedad = new javax.swing.JComboBox();
        __NewMarca = new javax.swing.JLabel();
        __etqNewPropiedad = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        __etqClave = new javax.swing.JLabel();
        __GUARDAR = new javax.swing.JButton();
        __NUEVO = new javax.swing.JButton();
        __SALIR = new javax.swing.JButton();
        __etqAlto_ = new javax.swing.JLabel();
        __etqcm_ = new javax.swing.JLabel();
        __Alto_ = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel2.setText("Alta de Papel");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Clase de Papel"));

        buttonGroup1.add(__Bobina);
        __Bobina.setText("Bobina");

        buttonGroup1.add(__Hoja);
        __Hoja.setText("Hoja");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(__Bobina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(__Hoja)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(__Bobina)
                    .addComponent(__Hoja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        __etqFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        __etqFecha.setText("DD/MM/AAAA");

        jLabel4.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de Papel:");

        __TipoPapel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona....." }));
        __TipoPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __TipoPapelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel5.setText("Ancho:");

        __NombrePapel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona....." }));
        __NombrePapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __NombrePapelActionPerformed(evt);
            }
        });

        __ColorPapel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona....." }));
        __ColorPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __ColorPapelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel6.setText("Color:");

        __etqNewNombre.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        __etqNewNombre.setText("Nuevo Nombre...");

        __etqNewColor.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        __etqNewColor.setText("Nuevo Color...");

        jLabel9.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel9.setText("El Papel Tiene");

        buttonGroup2.add(__Cara1);
        __Cara1.setText("1 Cara");
        __Cara1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __Cara1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(__Cara2);
        __Cara2.setText("2 Caras");

        jLabel10.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel10.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel11.setText("cm.");

        jLabel12.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel12.setText("Granaje:");

        __Gramos.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        __Gramos.setText("grs.");

        __Gramaje.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N

        __Ancho.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel14.setText("Marca:");

        jLabel15.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel15.setText("Propiedad:");

        __Marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona....." }));
        __Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __MarcaActionPerformed(evt);
            }
        });

        __Propiedad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona....." }));
        __Propiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __PropiedadActionPerformed(evt);
            }
        });

        __NewMarca.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        __NewMarca.setText("Nueva Marca...");

        __etqNewPropiedad.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        __etqNewPropiedad.setText("Nuevo Propietario...");

        jLabel18.setText("Clave de Papel:");

        __etqClave.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        __GUARDAR.setText("Guardar");
        __GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __GUARDARActionPerformed(evt);
            }
        });

        __NUEVO.setText("Nuevo");
        __NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __NUEVOActionPerformed(evt);
            }
        });

        __SALIR.setText("Salir");
        __SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __SALIRActionPerformed(evt);
            }
        });

        __etqAlto_.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        __etqAlto_.setText("Alto:");

        __etqcm_.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        __etqcm_.setText("cm.");

        __Alto_.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Regresar al menú anterior");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Consultas");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Generar un reporte...");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Cerrar Sesion");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Salir del Sistema");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Cambiar Fecha del Sistema");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Nuevo Usuario...");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Cambiar mi Contraseña");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Reporte de Usuarios");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem10.setText("Ayuda");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Acerca de...");
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(__etqFecha))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(57, 57, 57)
                                                    .addComponent(jLabel4))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(__NombrePapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6)))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(__TipoPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(__ColorPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(__etqNewNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(__etqNewColor)
                                            .addGap(52, 52, 52)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(__Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(__etqAlto_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(__Alto_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(__etqcm_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(__Gramaje, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(__Gramos)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(__Propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(__etqNewPropiedad)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(__GUARDAR)
                                .addGap(18, 18, 18)
                                .addComponent(__NUEVO)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(__Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(__NewMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(__etqClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(__SALIR)
                                .addGap(53, 53, 53))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(__Cara1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(__Cara2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(__etqFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(__TipoPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(__NombrePapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(__ColorPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(__etqNewNombre)
                    .addComponent(__etqNewColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(__Cara1)
                    .addComponent(__Cara2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(__Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(__Alto_, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(__etqcm_)
                    .addComponent(__etqAlto_)
                    .addComponent(jLabel12)
                    .addComponent(__Gramaje, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(__Gramos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(__Propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__etqNewPropiedad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(__Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(__NewMarca)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(__GUARDAR)
                            .addComponent(__NUEVO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(__etqClave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(__SALIR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void __TipoPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___TipoPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___TipoPapelActionPerformed

    private void __NombrePapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___NombrePapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___NombrePapelActionPerformed

    private void __ColorPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___ColorPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___ColorPapelActionPerformed

    private void __Cara1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___Cara1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___Cara1ActionPerformed

    private void __MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___MarcaActionPerformed

    private void __PropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___PropiedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___PropiedadActionPerformed

    private void __GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___GUARDARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___GUARDARActionPerformed

    private void __NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___NUEVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___NUEVOActionPerformed

    private void __SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___SALIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event___SALIRActionPerformed

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
            java.util.logging.Logger.getLogger(AltaPapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaPapel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField __Alto_;
    private javax.swing.JTextField __Ancho;
    private javax.swing.JRadioButton __Bobina;
    private javax.swing.JRadioButton __Cara1;
    private javax.swing.JRadioButton __Cara2;
    private javax.swing.JComboBox __ColorPapel;
    private javax.swing.JButton __GUARDAR;
    private javax.swing.JTextField __Gramaje;
    private javax.swing.JLabel __Gramos;
    private javax.swing.JRadioButton __Hoja;
    private javax.swing.JComboBox __Marca;
    private javax.swing.JButton __NUEVO;
    private javax.swing.JLabel __NewMarca;
    private javax.swing.JComboBox __NombrePapel;
    private javax.swing.JComboBox __Propiedad;
    private javax.swing.JButton __SALIR;
    private javax.swing.JComboBox __TipoPapel;
    private javax.swing.JLabel __etqAlto_;
    private javax.swing.JLabel __etqClave;
    private javax.swing.JLabel __etqFecha;
    private javax.swing.JLabel __etqNewColor;
    private javax.swing.JLabel __etqNewNombre;
    private javax.swing.JLabel __etqNewPropiedad;
    private javax.swing.JLabel __etqcm_;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}