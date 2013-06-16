/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Marfran Buitrago
 */
class Artistas {
    private String nombres;
    private String apellidos;
    private int añoNacimiento;
    private Artistas [] interpretes = new Artistas[3]; 

        Artistas(String nombres, String apellidos, int añoNacimiento) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.añoNacimiento = añoNacimiento;
        }

      
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

}