/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Login;
import javax.swing.JFrame;

/**
 *
 * @author Favorito
 */
public class jControlador {
    private Login login;
    
    public jControlador( JFrame padre )
    {
        //this.frmprincipal = (frmPrincipal) padre;
        this.login = (Login) padre;
        
    }
}
