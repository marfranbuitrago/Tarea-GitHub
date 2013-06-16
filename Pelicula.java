/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Marfran Buitrago
 */
public class Pelicula extends Obra {
    private String productora;
    private Artistas[] interpretes;
    private int añoEstreno;
    
    Pelicula(String titulo, String productora, String artistas, String interpretes, int añoEstreno) {
        super(titulo, artistas, añoEstreno);
            this.productora = productora;
            this.interpretes = interpretes;
            this.añoEstreno = añoEstreno;
            }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public Artistas[] getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(Artistas[] interpretes) {
        this.interpretes = interpretes;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

}
