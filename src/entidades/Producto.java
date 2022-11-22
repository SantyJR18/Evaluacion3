package entidades;


/**
 * @author manza
 * @version 1.0
 * @created 22-nov.-2022 15:43:17
 */
public class Producto {

	private int codigo;
	private String nombre;
	private double precio;

	public Producto(){

	}

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}//end Producto