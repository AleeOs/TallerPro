/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



     String Nombre="";
     String Apellido="";
     String Correo="";
     String Codigo="";
     String id="";
     int Año_Ingreso=0;
     int bandera=0;
     int Cantidad=0;
     int opc=0;
     
     // creacion de objetos
     Scanner scan = new Scanner(System.in);
     ArrayList<Empleado>listaempleados= new ArrayList<>();
     Empleado objempleado1= new Empleado("Fernando", "Gueso", "fer@gmail.com", "1001", id, 2000);
     Empleado objempleado2= new Empleado("Ady", "Quinayas", "Ady@gmail.com", "1002", id, 2001);
     Empleado objempleado3= new Empleado("Alexander", "Tocoche", "alexander@gmail.com", "1003", id, 2004);
     Empleado objempleado4= new Empleado("Alexis", "Zambrano", "Alexis@gmail.com", "1004", id, 2005);
     Empleado objempleado5= new Empleado("Andres Fe", "Calambas", "Andres@gmail.com", "1005", id, 2004);
     listaempleados.add(objempleado1);
     listaempleados.add(objempleado2);
     listaempleados.add(objempleado3);
     listaempleados.add(objempleado4);
     listaempleados.add(objempleado5);
     
        do {            
            //Creando menu de opciones
    System.out.println("1. Registrar Empleado");
            System.out.println("2. Editar Empleado");
            System.out.println("3. Consultar Empleado");
            System.out.println("4. Mostrar Empleados");
            System.out.println("5. Eliminar Empleado");
            System.out.println("6. Salir");
     
     
      
      
       
           
            System.out.println("Digite la opcion");
            opc= scan.nextInt();
           
            switch(opc){
                
                case 1:
                     //Algoritmo en lenguaje JAVA Registrar
                    System.out.println("Digite la cantidad de empleados a registrar: ");
                    Cantidad= scan.nextInt();
                    scan.nextLine();
                    
                    if (Cantidad >0){
                    for (int i = 1; i <= Cantidad; i++) {
                        scan.nextLine();
                        System.out.println("Digite el nombre del empleado: "+"\t"+i);
                        Nombre= scan.nextLine();
                        System.out.println("Digite el codigo del empleado: "+"\t"+i);
                        Codigo= scan.nextLine();
                        System.out.println("Digite el aÃ±o de ingreso del empleado: "+"\t"+i);
                        Año_Ingreso= scan.nextInt();
                        Empleado objempleado= new Empleado(Nombre, Apellido, Correo, Codigo, id, Año_Ingreso);
                        
                        listaempleados.add(objempleado);
                        System.out.println("El Numero de registrados es: "+"\t"+i);
                    }
                    }
                    else{
                            System.out.println("El numero Digitado no es valido");
                            }
                    
                    break;
                    case 2:
                      //Algoritmo en lenguaje JAVA Editar
                        scan.nextLine();
                        System.out.println("Digite el id del empleado a modificar");
                        id = scan.nextLine();

                        for (int i = 0; i < listaempleados.size(); i++) {
                            if (listaempleados.get(i).getCodigo().equals(id)) {
                            System.out.println("Digite el nombre del empleado");
                            String nombre = scan.nextLine();
                            
                            System.out.println("Digite el apellido del empleado");
                            String apellido = scan.nextLine();
                            
                            System.out.println("Digite el correo del empleado");
                            String correo = scan.nextLine();
                            
                            System.out.println("Digite el codigo del empleado");
                            String codigo = scan.nextLine();
                            
                            System.out.println("Digite el año de ingreso del empleado");
                            int año_Ingreso = scan.nextInt();
                           
                            listaempleados.get(i).setNombre(nombre);
                            listaempleados.get(i).setCodigo(codigo);
                            listaempleados.get(i).setAño_Ingreso(Año_Ingreso);
                           
                        
                            
                            
                            
                            
                            
                            
                            
                            
                         bandera = 0;
                         } else {
                         bandera = 1; 
                    }
                }        

                 if (bandera == 1) {
                    System.out.println("El id del empleado no existe o no se encuentra en el sistema");
                }
    
  
  
                    break; 
                    
                    case 3:
                        //Algoritmo en lenguaje JAVA Consultar
                         if(listaempleados.size()>0){
                        scan.nextLine();
                        System.out.println("Digite el codigo del empleado a buscar");
                        id=scan.nextLine();
                        double startTime = System.currentTimeMillis();
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(id))
                            {

                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El Año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());
                            }  
                        }
                         }else{
                            System.out.println("No hay empleados registrados");
                        }
                    break;
                    case 4:
                        //Algoritmo en lenguaje JAVA Mostrar
                        if(listaempleados.size()>0){
                        for (int i = 0; i < listaempleados.size(); i++) {
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El aÃ±o de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());
                                
                               
                            }
                        }else{
                            System.out.println("No hay empleados registrados");
                        }
                    break;
                    case 5:
                        
                         //Algoritmo en lenguaje JAVA Eliminar
                        scan.nextLine();
                        System.out.println("Digite el cÃ³digo del empleado a buscar");
                        id = scan.nextLine();
                        boolean empleadoEliminado = false;

                         for (int i = 0; i < listaempleados.size(); i++) {
                           if (listaempleados.get(i).getCodigo().equals(id)) {
                             System.out.println("\nEmpleado" + "\t" + (i + 1));
                             listaempleados.remove(i);
                             empleadoEliminado = true;
                        break; 
                        }
                      }

                         if (empleadoEliminado) {
                             System.out.println("El empleado ha sido eliminado.");
                              } else {
                                 System.out.println("El cÃ³digo del empleado no existe o no se encuentra en el sistema.");
                                }
    
                    break;
                    
                        
                        
                    
                    case 6:
                        //Algoritmo java para salir}
                        System.out.println("tarea finalizada con exito");
                    break;
                    default:
                        System.out.println("Opcion no valida para el menu");                     
            }
        } while (opc!= 6);  
    } 

    public Main() {
    }
    public static int RetornarValor(String Nombre){
      int letra =0;
      int numero=0;
      
      for (int i=0; i < Nombre.length(); i++){
          boolean bandera = Character.isDigit(Nombre.charAt(i));
          if (bandera)
          {
          System.out.println ("Es un numero"+Nombre.charAt(i));
      numero++;
          }else
          {
              System.out.println ("Es un numero"+Nombre.charAt(i));
              letra++;
          }
      }
        return numero;  
    }
}