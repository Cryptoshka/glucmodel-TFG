package business.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prueba {
	@Id
	@GeneratedValue
	private Paciente id_pac;
	private Date date;
	private String value;

	public Prueba() {
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
