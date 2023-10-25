/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Alexis
 */
//Declarando atributos
public class Empleado {
        public String Nombre;
        public String Apellido;
        public String Correo;
        public String Codigo;
        public String Id;
        public int Año_Ingreso;
        
            //constructor no parametrizado
public Empleado (){}

   


    //construtor parametrizado

    public Empleado(String Nombre, String Apellido, String Correo, String Codigo, String Id, int Año_Ingreso) {
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Codigo = Codigo;
        this.Id = Id;
        this.Año_Ingreso = Año_Ingreso;
    }
    
    
    
        //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setAño_Ingreso(int Año_Ingreso) {
        this.Año_Ingreso = Año_Ingreso;
    }

   

    
        //getters
    
 public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getId() {
        return Id;
    }

    public int getAño_Ingreso() {
        return Año_Ingreso;
    }
}