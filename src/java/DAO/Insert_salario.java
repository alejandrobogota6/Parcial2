/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dato.Salario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Labing I5
 */
public class Insert_salario {
    
    
    
    public boolean update(Salario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "update empleado set Salario = ? where Cedula = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getSalario());
            preparedStmt.setInt(2, t.getCedula());
            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
}
