/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.modelo;

import presentacion.vistas.LoginView;

/**
 *
 * @author Andre Sarmiento
 */
public class Modelo {
    
    private LoginView ventanaLogin;
    
    public Modelo() {
        ventanaLogin = getVentanaLogin();
    }
    
    public void iniciar() {
        ventanaLogin.setVisible(true);
    }

    public LoginView getVentanaLogin() {
        if(ventanaLogin == null) {
            ventanaLogin = new LoginView(this);
        }
        return ventanaLogin;
    }

    
    
}
