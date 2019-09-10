package scholar;

import java.util.Scanner;

public class Scholar {

   
    public static void main(String[] args) {
     
   Scanner lectura=new Scanner(System.in);  
     
    int año_nacimiento;
    int año_actual;
    double edad;
    
        Empleado empleado1 = new Empleado();
      
        empleado1.nombre="gian ";
        empleado1.apellido="roman ";
        
        System.out.println("digite año de nacimiento");
        año_nacimiento=lectura.nextInt();
        
        System.out.println("digite año actual");
        año_actual=lectura.nextInt();
        
        edad=año_actual-año_nacimiento;
        
        System.out.println("tu edad es "+edad);
   
       
        //System.out.println("el nombre del empleado es "+empleado1.nombre);
        //System.out.println("el apellido del empleado es "+empleado1.apellido);
        
        Estudiante estudiante1=new Estudiante();
        
        estudiante1.nombre="gian";
        estudiante1.apellido="roman";
        
        
        //System.out.println("el nombre del estudiante es "+estudiante1.nombre+"\n"
                //+ "el apellido del estudiante es "+estudiante1.apellido);
        
        
        
        
        
           
        
    }
    
   
    }

