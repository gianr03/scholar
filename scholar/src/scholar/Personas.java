
package scholar;

import java.util.Scanner;


public class Personas extends Persona {
    
    

     Personas datos[] = new Personas[5]; 
     Scanner lectura = new Scanner (System.in);
     
    public Personas (){
    
     this.mostrarMenu();
    
    }
    public void mostrarMenu (){
        
        
        System.out.println("Personas\n"
                + "1-Ingresar datos de persona\n"
                + "2-Mostrar datos personas\n"
                + "3-Cerrar\n"
                + "Escoja opcion");
        
        int opcion=lectura.nextInt();
        this.cargarOpcion(opcion);
    }
    public void leerPersona (){
    
        for(int i=0; i<datos.length;i++){
            
            System.out.println("digite nombre");
            datos.nombre[i]=lectura.nextLine();
        
        
        
        }
    
    
    }
    public void escribirPersona(){
    
    
    
    }
    public void cargarOpcion(int op){
    
    switch(op) {
    
        case 1: this.leerPersona();
        break;
        
        case 2: this.escribirPersona();
        break;
        
        case 3: System.out.println("Usted ha finalizado el programa");
        break;
        
        default: System.out.println("Opcion invalida");
    
    
    }
    
    }
    
    
    
    
    
    
    
}

