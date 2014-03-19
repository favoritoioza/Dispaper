/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Vista.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Favorito
 */
public class jControlador implements ActionListener,MouseListener,KeyListener{
    
    private Login login = new Login();
    private modelo mimodelo = new modelo();
    private MenuMaster menumaster = new MenuMaster();
    private String pswd, datE;
    private Vista.AltaPapel altapapel = new AltaPapel();
    private Vista.MovimientosPapel movimientos = new MovimientosPapel();
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Accion.valueOf(e.getActionCommand())){
            case __SALIR:
                int sali=JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Salida",JOptionPane.OK_CANCEL_OPTION);
                if (sali==JOptionPane.OK_OPTION){
                    System.exit(0);
                }
                break;
            case __INICIA_SESION:
                String user=this.login.__Usuario.getText();
                String contra=this.login.__Pswd.getText();
                try {
                       pswd=this.mimodelo.buscarUser(user);
                       System.out.println(pswd);
                       if(contra.equals(pswd)){
                           datE = JOptionPane.showInputDialog(null, "ingresa la fecha");
                           menumaster.setLocationRelativeTo(null);
                           menumaster.setVisible(true);
                           menumaster.__etqUsuarioMenuMaster.setText(user);
                           menumaster.__etqFechaMenuMaster.setText(datE);
                           login.dispose();
                       }else{
                           JOptionPane.showMessageDialog(null, "error, usuario o contraseña erroneas");
                           login.__Pswd.setText("");
                           login.__Usuario.setText("");
                           login.__Usuario.requestFocus();
                       }
                       
                }catch (SQLException ex) {
                       Logger.getLogger(jControlador.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case __MENU_MASTER_ALTA_PAPEL:
                menumaster.dispose();
                altapapel.setVisible(true);
                altapapel.setName("Alata de Papel");
                break;
            case __MENU_MASTER_MOVIMIENTOS:
                menumaster.dispose();
                movimientos.setVisible(true);
                movimientos.setLocationRelativeTo(null);
           
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public enum Accion{
        __INICIA_SESION, //-> Ejecuta Login
        __SALIR, //-> Sale del sistema
        __BLOQ,
        __MENU_MASTER_ALTA_PAPEL,
        __MENU_MASTER_MOVIMIENTOS,
        __MENU_MASTER_REPORTES,
        __MENU_MASTER_CONSULTAS,
        __MENU_MASTER_CANCELAR
    }
    
    
    public jControlador( JFrame padre )
    {
        //this.frmprincipal = (frmPrincipal) padre;
        this.login = (Login) padre;
        
    }
    
    public void iniciar(){
        //formulario login
        this.login.setLocationRelativeTo(null);
        this.login.setVisible(true);
        Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
        this.login.__etqBloqMayus.setVisible(false);
        this.login.__INICIA_SESION.setActionCommand("__INICIA_SESION");
        this.login.__INICIA_SESION.addActionListener(this);
        this.login.__SALIR_SISTEMA.setActionCommand("__SALIR");
        this.login.__SALIR_SISTEMA.addActionListener(this);
        this.menumaster.__ALTA_PAPEL.setActionCommand("__MENU_MASTER_ALTA_PAPEL");
        this.menumaster.__ALTA_PAPEL.addActionListener(this);
        this.menumaster.__MOVIMIENTOS.setActionCommand("__MENU_MASTER_MOVIMIENTOS");
        this.menumaster.__MOVIMIENTOS.addActionListener(this);
        this.menumaster.__REPORTES.setActionCommand("__MENU_MASTER_REPORTES");
        this.menumaster.__REPORTES.addActionListener(this);
        this.menumaster.__CONSULTAS.setActionCommand("__MENU_MASTER_CONSULTAS");
        this.menumaster.__CONSULTAS.addActionListener(this);
        this.menumaster.__CANCELAR.setActionCommand("__MENU_MASTER_CANCELAR");
        this.menumaster.__CANCELAR.addActionListener(this);
        this.login.__Usuario.addFocusListener(new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt) {}
            public void focusLost(java.awt.event.FocusEvent evt) {
                    campo=evaluaCampoVacio(login.__Usuario);
                    if(campo==true){
                        login.__Pswd.requestFocus();
                    }else{
                        //JOptionPane.showMessageDialog(null, "Ingresa tu nombre de usuario","Alerta",JOptionPane.INFORMATION_MESSAGE);
                        login.__Usuario.requestFocus();
                    }
            }
        });
        this.login.__Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTipedLetras(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt){
                int evento=evt.getKeyCode();
                if(evt.getKeyCode()==evt.VK_CAPS_LOCK){
                    if(a == 0){
                        login.__etqBloqMayus.setVisible(true);
                        a=1;
                    }
                    else {
                        login.__etqBloqMayus.setVisible(false);
                        a=0;
                    }
                }
            }
        });
        this.login.__Pswd.addFocusListener(new java.awt.event.FocusAdapter(){
            public void focusGained(java.awt.event.FocusEvent evt) {}
            public void focusLost(java.awt.event.FocusEvent evt) {
                    campo=evaluaCampoVacio(login.__Pswd);
                    if(campo==true){
                        //login.__Pswd.requestFocus();
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingresa tu contraseña","Alerta",JOptionPane.INFORMATION_MESSAGE);
                        login.__Pswd.requestFocus();
                    }
            }
        });
        this.login.__Pswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTipedLetrasNum(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt){
                int evento=evt.getKeyCode();
                if(evt.getKeyCode()==evt.VK_CAPS_LOCK){
                    if(a == 0){
                        login.__etqBloqMayus.setVisible(true);
                        a=1;
                    }
                    else {
                        login.__etqBloqMayus.setVisible(false);
                        a=0;
                    }
                }
            }
        });
        
    }
    
    boolean campo;
    public boolean evaluaCampoVacio(JTextField campo){
       String texto=campo.getText();
       if(texto.isEmpty())return false;
       else return true;
    }
    private void KeyTipedLetras(KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if(((caracter < 'a') || (caracter > 'z')) && ((caracter < 'A') || (caracter > 'Z'))){
            evt.consume();
        }
    }
    
    private void KeyTipedLetrasNum(KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if(((caracter < 'a') || (caracter > 'z')) && ((caracter < 'A') || (caracter > 'Z'))  && ((caracter < '0') || (caracter > '9')) ){
            evt.consume();
        }
    }
    int a=0;
}
