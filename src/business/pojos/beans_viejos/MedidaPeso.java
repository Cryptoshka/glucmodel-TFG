package business.pojos.beans_viejos;

import java.sql.Date;

/**
 * Session Bean implementation class MedidaPeso
 */
public class MedidaPeso {

	// Atributos
	private Date fecha;
	private double peso;
	
	// Getters & Setters
    public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
     * Default constructor. 
     */
    public MedidaPeso() {
        // TODO Auto-generated constructor stub
    }

}
