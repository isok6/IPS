/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andre Sarmiento
 */
public class DBConnection {

    private String url;
    protected Connection connect;

    public DBConnection() {
        System.out.println("URL: " + getClass().getResource("/recursos/datos/gestor.db").getFile());
        url = getClass().getResource("/recursos/datos/gestor.db").getFile() /*"G:\\gestor.db"*/;
    }

    public Connection conectarDB() {
        try {
            connect = DriverManager.getConnection("jdbc:postgresql:" + url);
            connect.setAutoCommit(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de datos");
        }
        return connect;
    }

    public void close() {
        try {
            connect.close();
        } catch (SQLException localSQLException) {
        }
    }
}
