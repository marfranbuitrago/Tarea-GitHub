/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * @author Francisco Caceres
 * @author Marfran Buitrago
 */
public class Obra {
    private String titulo;
    private Artistas autor = new Artistas();
    private int añoEdicion;

public Obra(String titulo, String autor, int añoEdicion) {
		this.titulo = titulo;
		this.autor.setNombres(autor);
		this.añoEdicion = añoEdicion;
	}
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor.getNombres();
    }

    public void setAutor(String autor) {
        this.autor.setNombres(autor);
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public void imprimir()
    {
 
    }
}
