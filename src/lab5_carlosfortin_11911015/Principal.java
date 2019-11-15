package lab5_carlosfortin_11911015;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Fortin
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registro = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_agrnombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_agrapellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_agrusuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pf_agrpassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        dc_nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jb_color = new javax.swing.JButton();
        jb_agrregistro = new javax.swing.JButton();
        jd_menu = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_mazos = new javax.swing.JTree();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_miembros = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        jb_ingresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jb_registro = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setText("Registro");

        jLabel7.setText("Nombre");

        jLabel8.setText("Apellido");

        jLabel9.setText("Nombre de usuario");

        jLabel10.setText("Password");

        jLabel11.setText("Fecha de nacimiento");

        jLabel12.setText("Color favorito");

        jb_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_colorMouseClicked(evt);
            }
        });

        jb_agrregistro.setText("Registrarse");
        jb_agrregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agrregistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_agrregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_registroLayout.createSequentialGroup()
                            .addGap(192, 192, 192)
                            .addComponent(jLabel6))
                        .addGroup(jd_registroLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_registroLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(dc_nacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jd_registroLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pf_agrpassword))
                                    .addComponent(jLabel9)
                                    .addGroup(jd_registroLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_agrnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jd_registroLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_agrapellido))
                                    .addComponent(tf_agrusuario))))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_agrnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_agrapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_agrusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pf_agrpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dc_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jb_agrregistro)
                .addGap(89, 89, 89))
        );

        jLabel13.setText("Tus mazos");

        jScrollPane1.setViewportView(jt_mazos);

        jLabel14.setText("Tu clan");

        jl_miembros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jl_miembros);

        jMenu1.setText("Mazos");

        jMenuItem1.setText("Agregar cartas");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clan");

        jMenuItem3.setText("Crear clan");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Unirse a un clan");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jd_menu.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_menuLayout = new javax.swing.GroupLayout(jd_menu.getContentPane());
        jd_menu.getContentPane().setLayout(jd_menuLayout);
        jd_menuLayout.setHorizontalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                .addGroup(jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jd_menuLayout.setVerticalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Clash Royale");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Login");

        jLabel3.setText("Usuario");

        jLabel4.setText("Password");

        jb_ingresar.setText("Ingresar");
        jb_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ingresarMouseClicked(evt);
            }
        });

        jLabel5.setText("No tienes cuenta?");

        jb_registro.setText("Registrate");
        jb_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_usuario)
                                .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jb_ingresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_registro)
                            .addComponent(jLabel5))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jb_ingresar)
                .addGap(66, 66, 66)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_registro)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registroMouseClicked
        jd_registro.setVisible(true);
        jd_registro.pack();
        //jd_registro.setModal(true);
    }//GEN-LAST:event_jb_registroMouseClicked

    private void jb_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_colorMouseClicked
        jb_color.setBackground(JColorChooser.showDialog(jd_registro, "Seleccione un color", Color.blue));
    }//GEN-LAST:event_jb_colorMouseClicked

    private void jb_agrregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agrregistroMouseClicked
        usuarios.add(new Usuario(tf_agrnombre.getText(), tf_agrapellido.getText(), tf_agrusuario.getText(), pf_agrpassword.getText(), dc_nacimiento.getDate(), jb_color.getBackground()));
        tf_agrnombre.setText("");
        tf_agrapellido.setText("");
        tf_agrusuario.setText("");
        pf_agrpassword.setText("");
        dc_nacimiento.setDate(null);
        jb_color.setBackground(Color.blue);
        JOptionPane.showMessageDialog(jd_registro, "Usuario registrado correctamente");
        jd_registro.dispose();
        //this.setVisible(true);
        
    }//GEN-LAST:event_jb_agrregistroMouseClicked

    private void jb_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarMouseClicked
        for (Usuario u : usuarios) {
            if(u.getNombre_usuario().endsWith(tf_usuario.getText())){
                if(u.getNombre_usuario().equals(tf_usuario.getText()) && u.getPassword().equals(pf_password.getText())){
                    actual=u;
                    JOptionPane.showMessageDialog(this, "Se ha ingresado correctamente");
                    break;
                }
                else
                    JOptionPane.showMessageDialog(this, "El usuario o la password es incorrecta");
            }
        }
        tf_usuario.setText("");
        pf_password.setText("");
        jd_menu.setVisible(true);
        jd_menu.pack();
    }//GEN-LAST:event_jb_ingresarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dc_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_agrregistro;
    private javax.swing.JButton jb_color;
    private javax.swing.JButton jb_ingresar;
    private javax.swing.JButton jb_registro;
    private javax.swing.JDialog jd_menu;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JList<String> jl_miembros;
    private javax.swing.JTree jt_mazos;
    private javax.swing.JPasswordField pf_agrpassword;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_agrapellido;
    private javax.swing.JTextField tf_agrnombre;
    private javax.swing.JTextField tf_agrusuario;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuario> usuarios=new ArrayList();
    Usuario actual;
    ArrayList<Clan> clanes=new ArrayList();
}
