package entidades;


/**
 * @author manza
 * @version 1.0
 * @created 22-nov.-2022 15:43:19
 */
public class Cliente {

	private int codigo;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String email;
	private Factura m_Factura;

	public Cliente(){

	}

    public Cliente(int codigo, String nombres, String apellidos, String direccion, String telefono, String email, Factura m_Factura) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.m_Factura = m_Factura;
    }

    public Factura getM_Factura() {
        return m_Factura;
    }

    public void setM_Factura(Factura m_Factura) {
        this.m_Factura = m_Factura;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
}//end Cliente