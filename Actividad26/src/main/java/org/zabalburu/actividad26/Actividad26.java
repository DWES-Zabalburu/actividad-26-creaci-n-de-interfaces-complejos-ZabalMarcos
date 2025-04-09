/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.actividad26;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class Actividad26 extends JFrame {
    private Dimension dnVentana = new Dimension(800, 600);
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    private JLabel lblNombre = new JLabel("Nombre Completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("Correo Electronico");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono = new JLabel("Telefono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel("Direccion");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblWeb = new JLabel("Sitio WEB");
    private JTextField txtWeb = new JTextField();
    private JButton btnGuardar = new JButton("Guardar Cambios");
    private JButton btnCancelar = new JButton("Cancelar");
    private JPanel pnlDatos = new JPanel(new GridLayout(10, 1, 0, 10));
    private JPanel pnlBotones = new JPanel(new FlowLayout());
   
    public Actividad26(){
        
        this.setSize(dnVentana);
        this.setTitle("Mi Perfil");
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(Color.red);
        this.add(lblTitulo, BorderLayout.NORTH);
         
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblWeb);
        pnlDatos.add(txtWeb);
        this.add(pnlDatos, BorderLayout.CENTER);
        
        pnlBotones.add(btnGuardar);
        pnlBotones.add(btnCancelar);
        this.add(pnlBotones, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        new Actividad26().setVisible(true);
    }
}
