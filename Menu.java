/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.io.InputStream;
import java.util.Scanner;
 
     
/**
 *
 * @author Francisco Cáceres
 */
public class Menu {

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
            Menu scan = new Menu(System.in);
            int op = 0;

		do{
			System.out.println("\n1.- Artista"); 
			System.out.println("\n2.- Obra"); 
			System.out.println("\n3.- Pelicula"); 											
			System.out.println("\n4.- Reportes");
                        System.out.println("\n5.- Salir");
                        
			op = scan.nextInt(); 
			switch(op){
				case 1: 
					int op1 = 0; 
					do{
						System.out.println("\n\t1.- Crear Artista"); 
						System.out.println("\n\t2.- Salir"); 
						op1= scan.nextInt(); 
						switch(op1){
							case 1: 
                                                            System.out.println("\nIngrese el Nombre del Artista:");
                                                            System.out.println("\nIngrese el Apellido del Artista:");
                                                            System.out.println("\nIngrese el Año de Nacimiento del Artista:");
                                                        break; 
							default: System.out.println("Saliendo..."); 
                                                        break; 
						}
					}while(op1<2); 
					break; 
				case 2:
				int op2; 
                                op2 = 0;
					do{
					System.out.println("\n Crear Obra");
                                        System.out.println("\n\t1.- Crear Libro");
                                        System.out.println("\n\t2.- Crear Disco"); 
					System.out.println("\n\t3.- Salir"); 
						op2= scan.nextInt(); 
						switch(op2){
							case 1: 
                                                            System.out.println("\nIngrese el Nombre del Libro:");
                                                            System.out.println("\nIngrese la Editorial:");
                                                            System.out.println("\nIngrese el Numero de Paginas:");
                                                            System.out.println("\nIngrese el Año Edicion:");
                                                        break; 
                                                        case 2: 
                                                            System.out.println("\nIngrese el Nombre del Disco:");
                                                            System.out.println("\nIngrese el Numero de Canciones:");
                                                        break;    
							default: System.out.println("Saliendo..."); 
                                                        break; 
						}
					}while(op2<3); 
					break;
                             ///continuar con los casos
}
 //   private Menu(InputStream in) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

   // private int nextInt() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

}
