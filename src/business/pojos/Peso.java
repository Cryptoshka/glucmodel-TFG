package business.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Peso {
	@Id
	@GeneratedValue
	private Paciente id_pac;
	private Date date;
	private double value;

	public Peso() {
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

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
