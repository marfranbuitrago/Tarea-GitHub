/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * @author Francisco Caceres
 * @author Marfran Buitrago
 */
public class Pelicula extends Obra {
    private String productora;
    private int añoEstreno;
    private Artistas[] interpretes;
    
    Pelicula(String titulo, String autor, String productora, Artistas[] interpretes, int añoEstreno) {
        super(titulo, autor, añoEstreno);
            this.setTitulo(titulo);
            this.setAutor(autor);
            this.productora = productora;
            this.añoEstreno = añoEstreno;
            }

    public Artistas[] getInterpretes(){
        return interpretes;
    }
    
    public void setInterpretes(Artistas[] interpretes){
        this.interpretes=interpretes;
}  
    
    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

public void imprimir()
{
        System.out.println(" - Titulo: "+this.getTitulo());
        System.out.println(" - Autor: "+this.getAutor());
        System.out.println(" - Año de Estreno: "+this.getAñoEstreno());   
        System.out.println(" - Productora: "+productora);

}
  
}
