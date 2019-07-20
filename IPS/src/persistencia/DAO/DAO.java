/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Andre Sarmiento
 */
public interface DAO {

    public void insertar(Object objeto) throws SQLException;

    public void modificar(Object objeto) throws SQLException;

    public void eliminar(Object objeto) throws SQLException;

    public List<Object> consultar() throws SQLException;

    public List<Object> consultarByName(Object objeto) throws SQLException;
}
