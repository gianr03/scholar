package scholar;
public class Scholar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Empleado empleado1 = new Empleado();
        
        empleado1.nombre="gian ";
        empleado1.apellido="roman ";
        empleado1.fecha_nacimiento="2001-11-03";
        empleado1.calEdad();
        System.out.println("la edad es "+ empleado1.calEdad());
   
        
        //System.out.println("el nombre del empleado es "+empleado1.nombre);
        //System.out.println("el apellido del empleado es "+empleado1.apellido);
        
        Estudiante estudiante1=new Estudiante();
        
        estudiante1.nombre="gian";
        estudiante1.apellido="roman";
        
        
        //System.out.println("el nombre del estudiante es "+estudiante1.nombre+"\n"
                //+ "el apellido del estudiante es "+estudiante1.apellido);
        
        
        
        
        
           
        
    }
    
}
