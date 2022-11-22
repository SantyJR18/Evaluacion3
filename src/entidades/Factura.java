package entidades;

import java.util.List;


/**
 * @author manza
 * @version 1.0
 * @created 22-nov.-2022 15:43:21
 */
public class Factura {

	private int codigo;
	private String fecha;
	private Producto m_Producto;
	private Vendedor m_Vendedor;
	private Cliente m_Cliente;

	public Factura(){

	}

    public Factura(int codigo, String fecha, Producto m_Producto, Vendedor m_Vendedor, Cliente m_Cliente, double , double ) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.m_Producto = m_Producto;
        this.m_Vendedor = m_Vendedor;
        this.m_Cliente = m_Cliente;
        this.<error> = <error>;
        this.<error> = <error>;
    }
    
	/**
	 * 
	 * @param Producto
	 */
	public double calcTotal(List<Producto> Producto){
	    return 0;
	}

	/**
	 * 
	 * @param double
	 */
	public double aplicarIVA(double, double){
            return 0;
	}

	/**
	 * 
	 * @param double
	 */
	public double calcMonto(double, double double){
		return 0;
	}

	/**
	 * 
	 * @param Producto
	 */
	public void agregarProducto(Producto Producto){

	}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Producto getM_Producto() {
        return m_Producto;
    }

    public void setM_Producto(Producto m_Producto) {
        this.m_Producto = m_Producto;
    }

    public Vendedor getM_Vendedor() {
        return m_Vendedor;
    }

    public void setM_Vendedor(Vendedor m_Vendedor) {
        this.m_Vendedor = m_Vendedor;
    }

    public Cliente getM_Cliente() {
        return m_Cliente;
    }

    public void setM_Cliente(Cliente m_Cliente) {
        this.m_Cliente = m_Cliente;
    }
    
}//end Factura