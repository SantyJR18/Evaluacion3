package entidades;


/**
 * @author manza
 * @version 1.0
 * @created 22-nov.-2022 15:43:14
 */
public class Vendedor {

	private int codigo;
	private String nombres;
	private String apellidos;

	public Vendedor(){

	}

    public Vendedor(int codigo, String nombres, String apellidos) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
        
        

        
        
	public void finalize(){

	}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
}//end Vendedor