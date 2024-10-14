//Nicolas Hobbins y Matias Medina
package Interfaz;

import Dominio.Sistema;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class MenuVentanas extends javax.swing.JFrame {
    private Sistema s;
    
    public MenuVentanas(){
        initComponents();
    }
    
    
    public MenuVentanas(Sistema unS) {
        this.s = unS;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSoloRubros = new javax.swing.JButton();
        btnSistemaNuevo = new javax.swing.JButton();
        btnSistemaAnterior = new javax.swing.JButton();
        jLabelInicio = new javax.swing.JLabel();
        jLabelOpcionesDeSistema = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenuRegistros = new javax.swing.JMenu();
        itmRegistroRubro = new javax.swing.JMenuItem();
        itmRegistroCapataz = new javax.swing.JMenuItem();
        itmRegistroPropietario = new javax.swing.JMenuItem();
        itmRegistroObra = new javax.swing.JMenuItem();
        jMenuGastos = new javax.swing.JMenu();
        itmRegistroGastoObra = new javax.swing.JMenuItem();
        itmPagoGasto = new javax.swing.JMenuItem();
        itmEstadoObra = new javax.swing.JMenuItem();
        JMenuImpExp = new javax.swing.JMenu();
        itmImportarDatos = new javax.swing.JMenuItem();
        itmExportarDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Pequeñas Obras - Realizado por Nicolas Hobbins y Matías Medina ");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btnSoloRubros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        btnSoloRubros.setText("Sólo rubros");
        btnSoloRubros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoloRubrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSoloRubros);
        btnSoloRubros.setBounds(390, 160, 110, 40);

        btnSistemaNuevo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        btnSistemaNuevo.setText("Sistema Nuevo");
        btnSistemaNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSistemaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSistemaNuevo);
        btnSistemaNuevo.setBounds(270, 160, 110, 40);

        btnSistemaAnterior.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        btnSistemaAnterior.setText("Sistema Anterior");
        btnSistemaAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSistemaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnSistemaAnterior);
        btnSistemaAnterior.setBounds(140, 160, 120, 40);

        jLabelInicio.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabelInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInicio.setText("Inicio");
        jLabelInicio.setName(""); // NOI18N
        getContentPane().add(jLabelInicio);
        jLabelInicio.setBounds(290, 110, 60, 30);

        jLabelOpcionesDeSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        jLabelOpcionesDeSistema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelOpcionesDeSistema);
        jLabelOpcionesDeSistema.setBounds(130, 100, 380, 130);

        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 0, 400, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 0, 70, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 70, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 0, 70, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 140, 70, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 210, 70, 70);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 280, 70, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 330, 70, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 330, 70, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 330, 70, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 60, 70, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 190, 70, 70);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(470, 120, 70, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 50, 70, 70);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 260, 70, 70);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(540, 330, 70, 70);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(540, 260, 70, 70);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(540, 190, 70, 70);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(540, 120, 70, 70);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(540, 50, 70, 70);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(540, 0, 70, 70);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(50, 0, 70, 70);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(30, 60, 70, 70);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 70, 70, 70);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(50, 130, 70, 70);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(50, 170, 70, 70);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(50, 240, 70, 70);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(50, 310, 70, 70);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(120, 330, 70, 70);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(560, 330, 70, 70);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel31);
        jLabel31.setBounds(560, 260, 70, 70);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(560, 190, 70, 70);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel33);
        jLabel33.setBounds(560, 120, 70, 70);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(560, 50, 70, 70);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(400, 330, 70, 70);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel36);
        jLabel36.setBounds(60, 330, 70, 70);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel37);
        jLabel37.setBounds(190, 330, 70, 70);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel38);
        jLabel38.setBounds(260, 330, 70, 70);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ort.jpg"))); // NOI18N
        getContentPane().add(jLabel39);
        jLabel39.setBounds(330, 330, 70, 70);

        menuBar.setBackground(new java.awt.Color(242, 242, 242));

        jMenuRegistros.setBackground(new java.awt.Color(242, 242, 242));
        jMenuRegistros.setMnemonic('f');
        jMenuRegistros.setText("Registros");
        jMenuRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itmRegistroRubro.setMnemonic('s');
        itmRegistroRubro.setText("Registrar rubro");
        itmRegistroRubro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmRegistroRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroRubroActionPerformed(evt);
            }
        });
        jMenuRegistros.add(itmRegistroRubro);

        itmRegistroCapataz.setMnemonic('o');
        itmRegistroCapataz.setText("Registrar capataz");
        itmRegistroCapataz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmRegistroCapataz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroCapatazActionPerformed(evt);
            }
        });
        jMenuRegistros.add(itmRegistroCapataz);

        itmRegistroPropietario.setMnemonic('a');
        itmRegistroPropietario.setText("Registrar propietario");
        itmRegistroPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmRegistroPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroPropietarioActionPerformed(evt);
            }
        });
        jMenuRegistros.add(itmRegistroPropietario);

        itmRegistroObra.setMnemonic('x');
        itmRegistroObra.setText("Registrar obra");
        itmRegistroObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmRegistroObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroObraActionPerformed(evt);
            }
        });
        jMenuRegistros.add(itmRegistroObra);

        menuBar.add(jMenuRegistros);

        jMenuGastos.setText("Gastos");
        jMenuGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itmRegistroGastoObra.setText("Registrar gasto para obra");
        itmRegistroGastoObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmRegistroGastoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroGastoObraActionPerformed(evt);
            }
        });
        jMenuGastos.add(itmRegistroGastoObra);

        itmPagoGasto.setText("Pago de gasto");
        itmPagoGasto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmPagoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPagoGastoActionPerformed(evt);
            }
        });
        jMenuGastos.add(itmPagoGasto);

        itmEstadoObra.setText("Estado de obra");
        itmEstadoObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmEstadoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEstadoObraActionPerformed(evt);
            }
        });
        jMenuGastos.add(itmEstadoObra);

        menuBar.add(jMenuGastos);

        JMenuImpExp.setText("Importación y Exportación");
        JMenuImpExp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenuImpExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuImpExpActionPerformed(evt);
            }
        });

        itmImportarDatos.setText("Importar Datos");
        itmImportarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmImportarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmImportarDatosActionPerformed(evt);
            }
        });
        JMenuImpExp.add(itmImportarDatos);

        itmExportarDatos.setText("Exportar Datos");
        itmExportarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itmExportarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExportarDatosActionPerformed(evt);
            }
        });
        JMenuImpExp.add(itmExportarDatos);

        menuBar.add(JMenuImpExp);

        setJMenuBar(menuBar);
        menuBar.setVisible(false);

        setSize(new java.awt.Dimension(646, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmRegistroObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroObraActionPerformed
        VentanaRegistroObra v = new VentanaRegistroObra(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistroObraActionPerformed

    private void itmRegistroGastoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroGastoObraActionPerformed
        VentanaRegistroGasto v = new VentanaRegistroGasto(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistroGastoObraActionPerformed

    private void itmRegistroPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroPropietarioActionPerformed
        VentanaRegistroPropietario v = new VentanaRegistroPropietario(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistroPropietarioActionPerformed

    private void itmRegistroRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroRubroActionPerformed
        VentanaRegistroRubro v = new VentanaRegistroRubro(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistroRubroActionPerformed

    private void itmRegistroCapatazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroCapatazActionPerformed
        VentanaRegistroCapataz v = new VentanaRegistroCapataz(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistroCapatazActionPerformed

    private void itmPagoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPagoGastoActionPerformed
        VentanaPagoGasto v = new VentanaPagoGasto(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmPagoGastoActionPerformed

    private void itmEstadoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEstadoObraActionPerformed
        VentanaEstadoObra v = new VentanaEstadoObra(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmEstadoObraActionPerformed

    private void itmImportarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmImportarDatosActionPerformed
        VentanaOpcionesImportacion v = new VentanaOpcionesImportacion(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmImportarDatosActionPerformed

    private void btnSistemaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaNuevoActionPerformed
        mostrarMenu();
    }//GEN-LAST:event_btnSistemaNuevoActionPerformed

    private void btnSistemaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaAnteriorActionPerformed
        cargarSistema();
        mostrarMenu();
    }//GEN-LAST:event_btnSistemaAnteriorActionPerformed

    private void btnSoloRubrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoloRubrosActionPerformed
        s.registrarRubro("Pintura","Renovación de Pintura");
        s.registrarRubro("Sanitaria","Reparación de Sanitaria");
        s.registrarRubro("Eléctrica","Instalación Eléctrica");
        s.registrarRubro("Carpintería","Trabajo en Madera");
        s.registrarRubro("Albañilería","Reparación de Paredes");
        s.registrarRubro("Pisos","Instalación de Pisos");
        s.registrarRubro("Cambio de Ventanas","Reemplazo de Ventanas");
        s.registrarRubro("Baño","Remodelación de Baño");
        s.registrarRubro("Cocina","Renovación de Cocina");
        s.registrarRubro("Aislamiento Térmico","Mejora Térmica");
        mostrarMenu();
        
    }//GEN-LAST:event_btnSoloRubrosActionPerformed

    private void itmExportarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExportarDatosActionPerformed
        VentanaOpcionesExportacion v = new VentanaOpcionesExportacion(s);
        v.setVisible(true);
    }//GEN-LAST:event_itmExportarDatosActionPerformed

    private void JMenuImpExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuImpExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMenuImpExpActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarSistema();
    }//GEN-LAST:event_formWindowClosing

    public void mostrarMenu(){
        menuBar.setVisible(true);
        //oculto botones
        btnSistemaAnterior.setVisible(false);
        btnSistemaNuevo.setVisible(false);
        btnSoloRubros.setVisible(false);
        //oculto labels
        jLabelOpcionesDeSistema.setVisible(false);
        jLabelInicio.setVisible(false);
    }
    
    private void cargarSistema() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("sistema.ser"))) {
            s = (Sistema) in.readObject();
            JOptionPane.showMessageDialog(null, "Sistema cargado correctamente.");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar el sistema.");
        }
    }

    private void guardarSistema() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema.ser"))) {
            out.writeObject(s);
            JOptionPane.showMessageDialog(null, "Sistema guardado correctamente.");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el sistema.");
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Sistema s1 = new Sistema();
            Bienvenida b = new Bienvenida();
            MenuVentanas v = new MenuVentanas(s1);
            b.setVisible(true);
            //creo el scheduler para que el frame de bienvenida desaparezca despues de unos segundos
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

            Runnable tarea = new Runnable() {
                @Override
                public void run() {
                    b.setVisible(false);
                    v.setVisible(true);
                }
            };

            scheduler.schedule(tarea, 3, TimeUnit.SECONDS);
            // cierro scheduler
            scheduler.shutdown();
            
            
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuImpExp;
    private javax.swing.JButton btnSistemaAnterior;
    private javax.swing.JButton btnSistemaNuevo;
    private javax.swing.JButton btnSoloRubros;
    private javax.swing.JMenuItem itmEstadoObra;
    private javax.swing.JMenuItem itmExportarDatos;
    private javax.swing.JMenuItem itmImportarDatos;
    private javax.swing.JMenuItem itmPagoGasto;
    private javax.swing.JMenuItem itmRegistroCapataz;
    private javax.swing.JMenuItem itmRegistroGastoObra;
    private javax.swing.JMenuItem itmRegistroObra;
    private javax.swing.JMenuItem itmRegistroPropietario;
    private javax.swing.JMenuItem itmRegistroRubro;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelOpcionesDeSistema;
    private javax.swing.JMenu jMenuGastos;
    private javax.swing.JMenu jMenuRegistros;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}