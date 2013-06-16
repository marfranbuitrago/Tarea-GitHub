/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author  Francisco Caceres
 */
public class Disco extends Obra{
    private String discografia;
	private int nCanciones;

	Disco(String titulo, String artista, String discografia, int nCanciones) {
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

}