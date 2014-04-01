
package paquete_Ej_151;

// @author Manuel

public class Principal_151 extends javax.swing.JFrame {

    public Principal_151() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoEnlaces = new javax.swing.JTextArea();
        panelRegistro = new javax.swing.JTabbedPane();
        panelIdentificarse = new javax.swing.JPanel();
        etiquetaLogin = new javax.swing.JLabel();
        campoTextoIdentificarseLogin = new javax.swing.JTextField();
        etiquetaPass = new javax.swing.JLabel();
        campoTextoIdentificarsePass = new javax.swing.JTextField();
        botonAceptarIdentificarse = new javax.swing.JButton();
        panelRegistrarse = new javax.swing.JPanel();
        etiquetaLogin1 = new javax.swing.JLabel();
        campoTextoRegistrarseLogin1 = new javax.swing.JTextField();
        etiquetaPass1 = new javax.swing.JLabel();
        campoTextoRegistrarsePass1 = new javax.swing.JTextField();
        etiquetaNombreCompleto1 = new javax.swing.JLabel();
        campoTextoNombreCompleto = new javax.swing.JTextField();
        botonAceptarRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 15.1");

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        areaTextoEnlaces.setColumns(20);
        areaTextoEnlaces.setRows(5);
        jScrollPane1.setViewportView(areaTextoEnlaces);

        etiquetaLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaLogin.setText("login:");

        campoTextoIdentificarseLogin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        etiquetaPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaPass.setText("pass:");

        campoTextoIdentificarsePass.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        botonAceptarIdentificarse.setText("Aceptar");

        javax.swing.GroupLayout panelIdentificarseLayout = new javax.swing.GroupLayout(panelIdentificarse);
        panelIdentificarse.setLayout(panelIdentificarseLayout);
        panelIdentificarseLayout.setHorizontalGroup(
            panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdentificarseLayout.createSequentialGroup()
                .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdentificarseLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelIdentificarseLayout.createSequentialGroup()
                                .addComponent(etiquetaPass)
                                .addGap(18, 18, 18)
                                .addComponent(campoTextoIdentificarsePass, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIdentificarseLayout.createSequentialGroup()
                                .addComponent(etiquetaLogin)
                                .addGap(18, 18, 18)
                                .addComponent(campoTextoIdentificarseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelIdentificarseLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(botonAceptarIdentificarse)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        panelIdentificarseLayout.setVerticalGroup(
            panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdentificarseLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLogin)
                    .addComponent(campoTextoIdentificarseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIdentificarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPass)
                    .addComponent(campoTextoIdentificarsePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(botonAceptarIdentificarse)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        panelRegistro.addTab("Identificarse", panelIdentificarse);

        etiquetaLogin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaLogin1.setText("login deseado:");

        campoTextoRegistrarseLogin1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        etiquetaPass1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaPass1.setText("pass deseada:");

        campoTextoRegistrarsePass1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        etiquetaNombreCompleto1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaNombreCompleto1.setText("nombre completo:");

        campoTextoNombreCompleto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        botonAceptarRegistrarse.setText("Aceptar");

        javax.swing.GroupLayout panelRegistrarseLayout = new javax.swing.GroupLayout(panelRegistrarse);
        panelRegistrarse.setLayout(panelRegistrarseLayout);
        panelRegistrarseLayout.setHorizontalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistrarseLayout.createSequentialGroup()
                                .addComponent(etiquetaNombreCompleto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistrarseLayout.createSequentialGroup()
                                        .addComponent(etiquetaPass1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoTextoRegistrarsePass1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                                        .addComponent(etiquetaLogin1)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoTextoRegistrarseLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(98, 98, 98))))
                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(botonAceptarRegistrarse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegistrarseLayout.setVerticalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLogin1)
                    .addComponent(campoTextoRegistrarseLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPass1)
                    .addComponent(campoTextoRegistrarsePass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreCompleto1)
                    .addComponent(campoTextoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botonAceptarRegistrarse)
                .addGap(25, 25, 25))
        );

        panelRegistro.addTab("Registrarse", panelRegistrarse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)))
                .addComponent(botonSalir)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_botonSalirActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal_151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_151().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoEnlaces;
    private javax.swing.JButton botonAceptarIdentificarse;
    private javax.swing.JButton botonAceptarRegistrarse;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoTextoIdentificarseLogin;
    private javax.swing.JTextField campoTextoIdentificarsePass;
    private javax.swing.JTextField campoTextoNombreCompleto;
    private javax.swing.JTextField campoTextoRegistrarseLogin1;
    private javax.swing.JTextField campoTextoRegistrarsePass1;
    private javax.swing.JLabel etiquetaLogin;
    private javax.swing.JLabel etiquetaLogin1;
    private javax.swing.JLabel etiquetaNombreCompleto1;
    private javax.swing.JLabel etiquetaPass;
    private javax.swing.JLabel etiquetaPass1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelIdentificarse;
    private javax.swing.JPanel panelRegistrarse;
    private javax.swing.JTabbedPane panelRegistro;
    // End of variables declaration//GEN-END:variables


class Usuario {
    private int id_usuario;
    private String login;
    private String pass;
    private String nombreCompleto;

        public int getId_usuario() {
            return id_usuario;
        }

        public String getLogin() {
            return login;
        }

        public String getPass() {
            return pass;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public void setId_usuario(int id_usuario) {
            this.id_usuario = id_usuario;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }
    
}




}
