 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package herencia;
/**
 * MODULO DE ACTUALIZACION TECNOLOGICA
 * MAESTRIA EN INFORMATICA UNET
 * @Autores: 
 * @author Marfran Buitrago
 * @       C.I. 17.501.260
 * @author Francisco Cáceres
 * @       C.I. 16.778.548
 */
import java.io.*;

/**
 *

 */
public class Menu {
   static Artistas[] xArtistas;
    static int numero_artistas;
    static String xNombre;
    static int xAño;
    static Libro[] obritaL;
    static Disco[] obritaD;
    static Pelicula[] obritaP;
    static String Ob="", Titulo, AutorO, editori, discograf, busquedad="", productor, AutorP;
    static int nob=0, añoA=0,  nro_obras=0, con_obras=0,npag=0 , ncanc=0, nro_peliculas=0, añoP=0, opcrepor=0; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        menuP();
    }
    public static void menuP() throws IOException {        
        // TODO code application logic here
         BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
    int opcion,indice;
      indice=0;
    do
      {   
        opcion=0;
                        System.out.println("\t\t MENU PRINCIPAL "); 
                        System.out.println("\n1.- Artista"); 
			System.out.println("\n2.- Obras"); 
			System.out.println("\n3.- Pelicula"); 											
			System.out.println("\n4.- Reportes");
                        System.out.println("\n5.- Salir"); 
                        System.out.print("\n\n Ingrese Opcion : ");             

        try
         {
          opcion=Integer.parseInt(lectura.readLine());  
         }
        catch (IOException e)
         {
          System.out.println("Opcion Invalida");          
         }    
        catch (NumberFormatException e)
         {
          System.out.println("Debe ingresar el numero de la opcion.");          
         }    

        switch(opcion)
         {
           case 1:
               
                System.out.println("Ingrese la Cantidad de Artistas: ");
                numero_artistas =Integer.parseInt(lectura.readLine());
                int conArt=0;
                xArtistas = new Artistas[numero_artistas]; 
                for (int i=0;i<numero_artistas ;i++){
                xNombre="";
                xAño=0;               
                conArt=conArt+1;
                do
                {   
                System.out.print("Ingrese el Artista "+conArt+ ": ");
                System.out.print("\n Ingrese Nombre del Artista : ");
                try
                    {
                    xNombre=lectura.readLine();  
                    }
                catch (IOException e)
                    {
                    System.out.println("Opcion Invalida en el Nombre del Artista");          
                    }    
                } while(xNombre.equals(""));
                do
                {   
                System.out.print("Ingrese Año de Nacimiento del Artista : ");      
                try
                    {
                    xAño=Integer.parseInt(lectura.readLine());  
                    }
                catch (IOException e)
                    {
                    System.out.println("Opcion Invalida en el Año de Nacimiento del Artista");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Debe ingresar un valor numerico");          
                    }    
                }while (xAño==0);
                xArtistas[indice]= new Artistas(xNombre,xAño); 
                System.out.println("\n\t Los Datos Registrados del Artista son:"); 
                System.out.println("\n\t Artista : "+xArtistas[indice].getNombres());
                System.out.println("\n\t Año de Nacimiento del Artista : "+xArtistas[indice].getAñoNacimiento());      
                                
                indice++;
               }
                
                break;
           case 2:
                                do
                {   
                System.out.println("Desea cargar un Libro (L) o un Disco (D) ");
                try
                    {
                      Ob=lectura.readLine();  
                    }
                catch (IOException e)
                    {
                    System.out.println("Opcion No Valida ingrese otra Opcion ");          
                    }    
                
                } while(Ob.equals("") || (!Ob.equalsIgnoreCase("L") && !Ob.equalsIgnoreCase("D")) );
                
                do
                {   
                  System.out.println("¿Cuantas Obras Desea Registrar?");
                  try
                    {
                      nro_obras=Integer.parseInt(lectura.readLine());  
                    }
                catch (IOException e)
                    {
                    System.out.println("Opcion No Valida");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Debe ingresar un valor numerico");          
                    }    
                }while (nro_obras==0);
                if(Ob.equalsIgnoreCase("L")) {
              obritaL = new Libro[nro_obras];
          }
                  if(Ob.equalsIgnoreCase("D")) {
              obritaD = new Disco[nro_obras];
          }
                
                con_obras=0;
                for (int j=0;j<nro_obras;j++){
                Titulo="";
                AutorO="";
                añoA=0;
                editori="";
                discograf="";
                con_obras=con_obras+1;
                
                     System.out.print("Ingrese Datos del registro "+con_obras+ ": ");                
                     do
                     {
                     System.out.println("\n Titulo: "); 
                     try
                     {
                      Titulo=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Opcion No Valida");          
                     }    
                    }while(Titulo.equals(""));
                
                System.out.println("Los Autores existentes son: ");
                
                int totart=xArtistas.length,Secuen=0;
                for (int o=0;o<totart;o++)
                {                   
                    Secuen=Secuen+1;
                     System.out.println(xArtistas[o].getNombres()+"==="+Secuen);
                }
                System.out.println("Seleccione el autor segun su identificador");
                
                int posActor=0;
                posActor=Integer.parseInt(lectura.readLine());
                AutorO=xArtistas[posActor-1].getNombres();  
                System.out.println("El Autor Seleccionado es: "+AutorO);                
                
                do
                {
                System.out.println("Año de Edición");
                try
                {
                añoA=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Opcion Invalida");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Ingrese un valor numerico");          
                    }    
                }while (añoA==0);

                   if(Ob.equalsIgnoreCase("L"))
                    {
                     do
                     {
                     System.out.println("\n Editorial: "); 
                     try
                     {
                      editori=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Opcion Invalida");          
                     }    
                    }while(editori.equals(""));
                     
                do
                {
                System.out.println("Nro de Paginas");
                try
                {
                npag=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Opcion Invalida");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Introduzca un Valor Numerico");          
                    }    
                }while (npag==0);
                
                obritaL[j] = new Libro(editori, Titulo, AutorO, añoA,npag);
               }
                    if(Ob.equalsIgnoreCase("D"))
                    {
                     do
                     {
                     System.out.println("\n Discografia : "); 
                     try
                     {
                      discograf=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Opcion Invalida");          
                     }    
                    }while(discograf.equals(""));
                     
                do
                {
                System.out.println("Numero de Canciones");
                try
                {
                ncanc=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Opcion Invalida");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Introduzca un Valor Numerico");          
                    }    
                }while (ncanc==0);
                obritaD[j] = new Disco(discograf, AutorO, ncanc , Titulo, añoA);             
                    }
               
                   
            }
                do
                 {
                   System.out.println("Que desea buscar Libros(L) o Discos(D) ");
                   try
                   {
                     busquedad=lectura.readLine();  
                   }
                   catch (IOException e)
                   {
                     System.out.println("Opcion Invalida");          
                   }    
                 }while(busquedad.equals(""));
                        
                 if(busquedad.equalsIgnoreCase("L"))       
                 {                        
                    System.out.println("Los libros registrados son: ");
                    int Secuen1=0;
                    for (int Z=0;Z<obritaL.length;Z++)
                    {                   
                       Secuen1=Secuen1+1;
                       System.out.println("Libro "+obritaL[Z].getTitulo()+"==="+Secuen1);  
                    }
                    System.out.println("\n Seleccione el titulo del libro a busca por el numero que lo indica ");
                    int posLibro=0;
                    posLibro=Integer.parseInt(lectura.readLine());
                    System.out.println("\n\tLos Datos del libro son:");
                    System.out.println("\n\n\tTitulo "+obritaL[posLibro-1].getTitulo()+" Autor "+obritaL[posLibro-1].getAutor()+" Editorial "+obritaL[posLibro-1].getEditorial()+" Nro Paginas "+obritaL[posLibro-1].getnPaginas());                 
                    System.out.println("\n\n\n\tConsultar Editorial y Nro de Paginas ");
                    
                    String Cedito="";
                    int nPagB=0;                    
                     do
                     {
                     System.out.println("\n Ingrese la Editorial: "); 
                     try
                     {
                      Cedito=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Opcion Invalida");          
                     }    
                    }while(Cedito.equals(""));
                     
                    do
                    {
                    System.out.println("\n Ingrese el Numero Paginas: ");
                    try
                    {
                    nPagB=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Opcion Invalida");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Introduzca un Valor Numerico");          
                        }    
                    }while (nPagB==0);
                    
                    int sw=0,SecuenB=0;
                    for (int Z=0;Z<obritaL.length;Z++)
                    {                    
                       SecuenB=SecuenB+1;
                       if(obritaL[Z].getEditorial().equals(Cedito) && obritaL[Z].getnPaginas()==nPagB)
                       {    
                           System.out.println("Encontro el registro en la posicion "+SecuenB+" el registro es: "); 
                           System.out.println("Titulo "+obritaL[Z].getTitulo()+" Autor "+obritaL[Z].getAutor()+" Editorial "+obritaL[Z].getEditorial()+" Nro Paginas "+obritaL[Z].getnPaginas());                 
                           sw=1;
                       }
                         
                    }
                    if (sw!=1) {
                         System.out.println("\n Los Datos Buscados no Existen");
                     }
                    }
                 
                 
                  if(busquedad.equalsIgnoreCase("D"))       
                 {                        
                    System.out.println("Los Discos Registrados son: ");
                    int Secuen1=0;
                    for (int Z=0;Z<obritaD.length;Z++)
                    {                   
                       Secuen1=Secuen1+1;
                       System.out.println("Discos "+obritaD[Z].getTitulo()+"----->"+Secuen1);  
                    }
                    System.out.println("\n Seleccione el titulo del Disco a busca por el numero que lo indica ");
                    int posDisco;
                    posDisco=Integer.parseInt(lectura.readLine());
                    System.out.println("\n\tLos Datos del disco son: ");
                    System.out.println("\n\n\tTitulo "+obritaD[posDisco-1].getTitulo()+" Autor "+obritaD[posDisco-1].getAutor()+" Discografia "+obritaD[posDisco-1].getDiscografia()+" Nro Canciones "+obritaD[posDisco-1].getnCanciones());                 
                    System.out.println("\n\n\n\tConsultar Discografia y Nro de Canciones ");
                    
                    String Cedito="";
                    int nDisB=0;                    
                     do
                     {
                     System.out.println("\n Ingrese La Discografia: "); 
                     try
                     {
                      Cedito=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Opcion Invalida");          
                     }    
                    }while(Cedito.equals(""));
                     
                    do
                    {
                    System.out.println("\n Ingrese el Numero de Canciones: ");
                    try
                    {
                    nDisB=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Opcion Invalida");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Debe ingresar un valor numerico");          
                        }    
                    }while (nDisB==0);
                    
                    int sw=0,Secu=0;
                    for (int Z=0;Z<obritaD.length;Z++)
                    {                    
                       Secu=Secu+1;
                       if(obritaD[Z].getDiscografia().equals(Cedito) && obritaD[Z].getnCanciones()==nDisB)
                       {
                           System.out.println("Encontro el registro en la posicion "+Secu+" el registro es: "); 
                           System.out.println("Titulo "+obritaD[Z].getTitulo()+" Autor "+obritaD[Z].getAutor()+" Discografia "+obritaD[Z].getDiscografia()+" Nro Discografia "+obritaD[Z].getnCanciones());                 
                           sw=1;
                       }
                        
                    }
                    if (sw!=1) {
                         System.out.println("\n Los Datos Buscados no Existen");
                     }
             
                 }
             
                     break;
           case 3:             
                do
                    {
                    System.out.println("\n Cuantas Peliculas Desea Registrar?? : ");
                    try
                    {
                    nro_peliculas=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Opcion Invalida");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Debe Ingresar un Valor Numerico");          
                        }    
                    }while (nro_peliculas==0);
                Pelicula [] obritaP= new Pelicula [nro_peliculas]; 
                int con_pelis=0, can_inter=0, pelis=0;
                 for(int jPel=0;jPel<nro_peliculas;jPel++){
                    pelis=jPel+1;
                  System.out.println("Ingrese el Autor de la Pelicula: "+pelis);
                
                int totart=xArtistas.length,Secuen=0;
                for (int o=0;o<totart;o++)
                {                   
                    Secuen=Secuen+1;
                     System.out.println(xArtistas[o].getNombres()+"==="+Secuen);
                }
                System.out.println("Seleccione el autor por el numero que lo identifica");
                
                int posActorP=0;
                posActorP=Integer.parseInt(lectura.readLine());
                AutorP=xArtistas[posActorP-1].getNombres();  
                System.out.println("El Autor es : "+AutorP);                
              
                 do
                {
                System.out.println("Año de Edicion");
                try
                {
                añoP=Integer.parseInt(lectura.readLine());
                }
                catch (IOException e)
                    {
                    System.out.println("Opcion Invalida");          
                    }    
                catch (NumberFormatException e)
                    {
                    System.out.println("Debe Ingresar un Valor Numerico");          
                    }    
                }while (añoP==0);
                    
                
                   productor="";
                   con_pelis=con_pelis+1;
                   System.out.println("\n Ingrese los Datos a registrar: "+con_pelis+ ":");
                    do
                     {
                     System.out.println("\n Titulo: "); 
                     try
                     {
                      Titulo=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Opcion Invalida");          
                     }    
                    }while(Titulo.equals(""));
                   do
                    {
                    System.out.println("\n Productora: ");
                    try
                    {
                    productor=lectura.readLine();
                    }
                    catch (IOException e)
                        {
                        System.out.println("Opcion Invalida");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Introduzca un Valor Numerico");          
                        }    
                    }while (productor.equals(""));
                   
                
                   do
                    {
                    System.out.println("\n Ingrese la Cantidad de Interpretes: ");
                    try
                    {
                    can_inter=Integer.parseInt(lectura.readLine());
                    }
                    catch (IOException e)
                        {
                        System.out.println("Opcion Invalida");          
                        }    
                    catch (NumberFormatException e)
                        {
                        System.out.println("Introduzca un Valor Numerico");          
                        }    
                    }while (can_inter==0);
                   Artistas [] inter = new Artistas[can_inter]; 
                  
                for (int oA=0;oA<can_inter;oA++)
                {
                    inter [oA] = new Artistas(); 
                    System.out.println("Los Autores Registrados son: ");
                    int totartP=xArtistas.length,SecuenP=0;
                    for (int o1P=0;o1P<totartP;o1P++)
                    {                   
                        SecuenP=SecuenP+1; 
                        System.out.println(xArtistas[o1P].getNombres()+"===="+SecuenP);
                    }
                    int posActor1=0;
                    System.out.println("Seleccione el autor por el Numero de Registro");
                    posActor1=Integer.parseInt(lectura.readLine());
                    System.out.println("El autor Seleccionado es : "+xArtistas[posActor1-1].getNombres());                
                    inter[oA].setNombres(xArtistas[posActor1-1].getNombres()); 
                 }
                
                obritaP[jPel] = new Pelicula (Titulo, AutorP, añoP, productor,inter);
               
               }
                 
                   
                System.out.println("Las Peliculas registradas son ");
                    int SecuenP=0;
                    for (int Z=0;Z<obritaP.length;Z++)
                    {                   
                       SecuenP=SecuenP+1;
                       System.out.println("Pelicula "+obritaP[Z].getTitulo()+"==="+SecuenP);                     
                       
                    }
                    System.out.println("\n Seleccione el titulo de la pelicula a buscar por el numero de registro");
                    int posPelicu=0;
                    posPelicu=Integer.parseInt(lectura.readLine());
                    System.out.println("\n\n\tLos Datos de la pelicula son:");
                    System.out.println("\n\n\n\tTitulo "+obritaP[posPelicu-1].getTitulo()+" Autor "+obritaP[posPelicu-1].getAutor()+" Productora "+obritaP[posPelicu-1].getProductora());                 
                    
                         for (int Z1=0;Z1<obritaP[posPelicu-1].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("Los Datos Interprete son:");
                     System.out.println("Titulo "+obritaP[posPelicu-1].getInterpretes()[Z1].getNombres());
                    
                    }
                    System.out.println("Consultar Productora ");
                    String Conpro="";
                     do
                     {
                     System.out.println("\n Ingrese La Productora: "); 
                     try
                     {
                      Conpro=lectura.readLine();  
                     }
                     catch (IOException e)
                     {
                     System.out.println("Opcion Invalida");          
                     }    
                    }while(Conpro.equals(""));
                     
                    int swP=0,SecuenBP=0;
                    for (int Z=0;Z<obritaP.length;Z++)
                    {                    
                       SecuenBP=SecuenBP+1;
                       if(obritaP[Z].getProductora().equals(Conpro))
                       {    
                           System.out.println("Encontro el registro en la posicion "+SecuenBP+" el registro es: "); 
                           System.out.println("Titulo "+obritaP[Z].getTitulo()+" Autor "+obritaP[Z].getAutor()+" Productora "+obritaP[Z].getProductora());                 
                           for (int Z1=0;Z1<obritaP[Z].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("Los Datos Interprete son:");
                     System.out.println("Titulo "+obritaP[Z].getInterpretes()[Z1].getNombres());
                    
                    }
                           swP=1;
                       }
                         
                    }
                    if (swP!=1)
                      System.out.println("Los Datos Buscados no Existen");
                break;
          
           case 4:
                menuReportes();
               break;
    
           case 5:
                System.out.println("Saliendo..."); 
                break;
           default :               
                System.out.println("La Opcion no es Valida");                
         }   
     }while(opcion!=5);  
         
               
    }


    public static void menuReportes() throws IOException 
    {
        // TODO code application logic here
         BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
     
    do
      {   
        opcrepor=0;

        System.out.println("\t\t\tMENU DE REPORTES");
        System.out.println("\n\t1.- Generar Listado de Obras,");
        System.out.println("\n\t2.- Generar Listado de Peliculas.");     
        System.out.println("\n\t3.- Busqueda de todas las Obras de un Autor (Nombre)."); 
        System.out.println("\n\t4.- Busqueda de todas las Peliculas de un Autor (Nombre)."); 
        System.out.println("\n\t5.- Regresar al menu principal."); 
        System.out.print("Ingrese Opcion : ");             

        try
         {
          opcrepor=Integer.parseInt(lectura.readLine());  
         }
        catch (IOException e)
         {
          System.out.println("Opcion Invalida");          
         }    
        catch (NumberFormatException e)
         {
          System.out.println("Introduzca un Valor Numerico");          
         }    

        switch(opcrepor)
         { 
            case 1:
            { 
                System.out.println("\n\tLISTADO DE LIBROD");
                for (int Z=0;Z<obritaL.length;Z++) 
                {
                    System.out.println("\nInformacion del Registro de Libros");
                       obritaL[Z].imprimir();
                }
                System.out.println("\n\tLISTADO DE DISCOS");
                for (int Z=0;Z<obritaD.length;Z++) 
                {
                    System.out.println("\nInformacion del Registro de Discos");
                       obritaD[Z].imprimir();
                }
                break;
            }  
            case 2:
            {
              System.out.println("\n\tLISTADO DE PELICULAS");
                for (int Z=0;Z<obritaP.length;Z++) 
                {
                    System.out.println("\n\nInformacion del Registro de Peliculas");
                       obritaP[Z].imprimir();
                            for (int Z1=0;Z1<obritaP[Z].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("\nLos Datos de los Interpretes son:");
                     System.out.println("\nTitulo "+obritaP[Z].getInterpretes()[Z1].getNombres());
                    
                    }
                }
                break;
            }
          
            
            case 3:
            {
                String nombreAutor="";                
                 do
                    {
                    System.out.println("\n Ingrese el nombre del autor: ");
                    try
                    {
                    nombreAutor=lectura.readLine();
                    }
                    catch (IOException e)
                        {
                        System.out.println("Opción Inválida");          
                        }    
                    }while (nombreAutor.equals(""));
                    
                    int sL=0,SeBL=0,sD=0,SeBD=0;
                    for (int Z=0;Z<obritaL.length;Z++)
                    {                    
                       SeBL=SeBL+1;
                       if(obritaL[Z].getAutor().equals(nombreAutor))
                       {    
                           System.out.println("Se encontro el registro en la posicion "+SeBL+" el registro es: "); 
                           System.out.println("El Titulo del Libro es "+obritaL[Z].getTitulo()+" Autor "+obritaL[Z].getAutor()+" Editorial "+obritaL[Z].getEditorial()+" Nro Paginas "+obritaL[Z].getnPaginas());                 
                           sL=1;
                       }
                         
                    }
                    if (sL!=1)
                      System.out.println("\n Los datos buscados no existen ");

                    for (int Z=0;Z<obritaD.length;Z++)
                    {                    
                       SeBD=SeBD+1;
                       if(obritaD[Z].getAutor().equals(nombreAutor))
                       {    
                           System.out.println("Se encontro el registro en la posicion "+SeBD+" el registro es: "); 
                           System.out.println("El Titulo del Disco es "+obritaD[Z].getTitulo()+" Autor "+obritaD[Z].getAutor()+" Discografia "+obritaD[Z].getDiscografia()+" Nro Canciones "+obritaD[Z].getDiscografia());                 
                           sD=1;
                       }
                         
                    }
                    if (sD!=1)
                      System.out.println("\n Los datos buscados no se encuentran cargados");
                    break;
            }  
            case 4: 
                {
                 String nombreAutor="";                
                 do
                  {
                    System.out.println("\n Ingrese el nombre del autor de la pelicula: ");
                    try
                    {
                    nombreAutor=lectura.readLine();
                    }
                    catch (IOException e)
                        {
                        System.out.println("Opcion Inválida");          
                        }    
                   }while (nombreAutor.equals(""));
                    
                    int sP=0,SeBP=0;
                    for (int Z=0;Z<obritaP.length;Z++)
                    {                    
                       SeBP=SeBP+1;
                       if(obritaP[Z].getAutor().equals(nombreAutor))
                       {    
                           System.out.println("Encontro el registro en la posicion "+SeBP+" el registro es: "); 
                           System.out.println("El Titulo de la pelicula es "+obritaP[Z].getTitulo()+" Autor "+obritaP[Z].getAutor()+" Productora "+obritaP[Z].getProductora());
                           for (int Z1=0;Z1<obritaP[Z].getInterpretes().length;Z1++)
                    {                   
                     System.out.println("Los Datos Interprete son:");
                     System.out.println("Titulo "+obritaP[Z].getInterpretes()[Z1].getNombres());
                    
                    }
                           sP=1;
                       }
                         
                    }
                    if (sP!=1)
                      System.out.println("\n Los datos buscados no existen");

                   break;
                }
            case 5:
            {
                menuP();
                break;
            }
        }
      }while(opcrepor!=5);
    }
}   