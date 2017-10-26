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
 * @author JCBOT
 */
public class Crud_salario {
    
    
    
    public boolean update(Salario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "update tablee set NameTable = ? where IdTable = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNameTabla());
            preparedStmt.setInt(2, t.getIdTabla());
            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
}
