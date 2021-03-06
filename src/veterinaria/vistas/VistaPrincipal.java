/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.vistas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author PabloOjeda
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jColorChooser1 = new javax.swing.JColorChooser();
        escritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        Edicion = new javax.swing.JMenu();
        btnNuevaVisita = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Mascotas = new javax.swing.JMenu();
        btnAltaMascota = new javax.swing.JMenuItem();
        btnBajaMascota = new javax.swing.JMenuItem();
        Tratamiento = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        escritorio.setName(""); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        Archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/vistas/Imagenes/Iconos/huella-de-pata-de-animal.png"))); // NOI18N
        Archivo.setText("Archivo");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Archivo.add(jMenuItem4);

        BarraMenu.add(Archivo);

        Edicion.setText("Visitas");

        btnNuevaVisita.setText("Nueva Visita");
        btnNuevaVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVisitaActionPerformed(evt);
            }
        });
        Edicion.add(btnNuevaVisita);

        BarraMenu.add(Edicion);

        Cliente.setText("Cliente");

        jMenuItem1.setText("Alta de Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem1);

        jMenuItem2.setText("Editar Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem2);

        BarraMenu.add(Cliente);

        Mascotas.setText("Mascotas");

        btnAltaMascota.setText("Alta de mascota");
        btnAltaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaMascotaActionPerformed(evt);
            }
        });
        Mascotas.add(btnAltaMascota);

        btnBajaMascota.setText("Editar mascota");
        btnBajaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaMascotaActionPerformed(evt);
            }
        });
        Mascotas.add(btnBajaMascota);

        BarraMenu.add(Mascotas);

        Tratamiento.setText("Tipos de tratamientos");

        jMenuItem3.setText("Formulario de Tratamientos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Tratamiento.add(jMenuItem3);

        BarraMenu.add(Tratamiento);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ArchivoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AltaCliente ac = new AltaCliente();
        ac.setVisible(true);
        escritorio.add(ac);
        escritorio.moveToFront(ac);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaCliente vc = new VistaCliente();
        vc.setVisible(true);
        escritorio.add(vc);
        escritorio.moveToFront(vc);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnAltaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaMascotaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaNuevaMascota nm = new VistaNuevaMascota();
        nm.setVisible(true);
        escritorio.add(nm);
        escritorio.moveToFront(nm);
    }//GEN-LAST:event_btnAltaMascotaActionPerformed

    private void btnNuevaVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVisitaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaFormularioVisitas formVisitas = new VistaFormularioVisitas();
        formVisitas.setVisible(true);
        escritorio.add(formVisitas);
        escritorio.moveToFront(formVisitas);
    }//GEN-LAST:event_btnNuevaVisitaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaFormularioTratamientos formTrat = new VistaFormularioTratamientos();
        formTrat.setVisible(true);
        escritorio.add(formTrat);
        escritorio.moveToFront(formTrat);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnBajaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaMascotaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaMascota vm = new VistaMascota();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
    }//GEN-LAST:event_btnBajaMascotaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenu Edicion;
    private javax.swing.JMenu Mascotas;
    private javax.swing.JMenu Tratamiento;
    private javax.swing.JMenuItem btnAltaMascota;
    private javax.swing.JMenuItem btnBajaMascota;
    private javax.swing.JMenuItem btnNuevaVisita;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("veterinaria/vistas/Imagenes/Iconos/huella-de-pata-de-animal.png"));
        
        return retValue;
    }
    
}
