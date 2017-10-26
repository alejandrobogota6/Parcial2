/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import DAO.Crud_salario;
import dato.Salario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.BD;

/**
 *
 * @author Labing I5
 */
public class Index extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
            String cedulaq = request.getParameter("cedula");
            String salarioq = request.getParameter("salario");
      
            int cedula=Integer.parseInt(cedulaq);
            int salario=Integer.parseInt(salarioq);
            
            Salario s=new Salario(cedula,salario);
            BD d = new BD();
            d.addNuevoreguistro(s);
            Crud_salario f = new Crud_salario();  
            System.out.println(f.update(d));
            
            
//            
//            
//            
//            
//            Venta j = new Venta(producto, valor_unitario, cantidad, total);
//            BD d = new BD();
//            d.addVenta(j);
//            Crud_ventas s = new Crud_ventas();   
//            try {
//                System.out.println(s.insert(d));
//                request.setAttribute("xxx", s);
//                request.getRequestDispatcher("index.jsp").forward(request, response);
//            } catch (SQLException ex) {
//                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
            

        }
    }
}
