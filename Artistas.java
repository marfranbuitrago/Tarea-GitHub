/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * @author Francisco Cáceres
 * @author Marfran Buitrago
 */
class Artistas {
    private String nombres;
    private int añoNacimiento;
     

public Artistas(String nombres, int añoNacimiento) {
		this.nombres = nombres;
		this.añoNacimiento = añoNacimiento; 
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public void imprimir()
    {
 
    }
}