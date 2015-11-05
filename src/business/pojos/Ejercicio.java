package business.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ejercicio {
	@Id
	@GeneratedValue
	private Paciente id_pac;
	private Date date;
	private int length;
	private int intensity;

	public Ejercicio() {
		// TODO Auto-generated constructor stub
	}

	public Paciente getId_pac() {
		return id_pac;
	}

	public void setId_pac(Paciente id_pac) {
		this.id_pac = id_pac;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

}
