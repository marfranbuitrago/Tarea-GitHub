/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * @author  Marfran Buitrago
 * @author  Francisco Caceres
 */
public class Disco extends Obra{
    private String discografia;
    private int nCanciones;

public Disco(String titulo, String artista, String discografia, int nCanciones) {
            super(titulo, artista, nCanciones);
          	this.discografia = discografia;
		this.nCanciones = nCanciones;
	}

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public int getnCanciones() {
        return nCanciones;
    }

    public void setnCanciones(int nCanciones) {
        this.nCanciones = nCanciones;
    }

    public void imprimir()
{
        System.out.println(" Titulo "+this.getTitulo());
        System.out.println(" Autor "+this.getArtista());
        System.out.println(" Año de Edicion "+this.getAñoEdicion());   
        System.out.println(" Discografia "+discografia);
        System.out.println(" Nro Canciones "+nCanciones);
}   
}