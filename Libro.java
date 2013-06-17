/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * @author  Marfran Buitrago
 * @author  Francisco Caceres
 */

public class Libro extends Obra{
    private String editorial;
    private int nPaginas;
    private int año;

public Libro(String titulo, String artista, String editorial, int nPaginas, int año) {
            super(titulo, artista, año);
                this.editorial = editorial;
                this.nPaginas = nPaginas;
		this.año = año;
	}

       
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void imprimir()
    {
 
    }
}
