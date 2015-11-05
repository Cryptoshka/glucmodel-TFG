package business.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Insulina {
	@Id
	@GeneratedValue
	private Paciente id_pac;
	private Date date;
	private int value;

	public Insulina() {
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
