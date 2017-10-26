/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

import java.sql.Date;

/**
 *
 * @author Labing I5
 */
public class Empleado {
    
    private int NumeroEmpleado;
    private String Nombre;
    private int Cedula;
    private String Estado;
    private String Nacimiento;
    private Date Ingreso;
    private int Salario;

    public Empleado(int NumeroEmpleado, String Nombre, int Cedula, String Estado, String Nacimiento, Date Ingreso, int Salario) {
        this.NumeroEmpleado = NumeroEmpleado;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Estado = Estado;
        this.Nacimiento = Nacimiento;
        this.Ingreso = Ingreso;
        this.Salario = Salario;
    }
    
    

    public int getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public void setNumeroEmpleado(int NumeroEmpleado) {
        this.NumeroEmpleado = NumeroEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public Date getIngreso() {
        return Ingreso;
    }

    public void setIngreso(Date Ingreso) {
        this.Ingreso = Ingreso;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
    
    
    
}
