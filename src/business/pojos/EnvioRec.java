package business.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EnvioRec {
	private Recomendacion id_rec;
	@Id
	@GeneratedValue
	private Paciente id_pac;
	private Date fecha_rec;

	public EnvioRec() {
		// TODO Auto-generated constructor stub
	}

	public Recomendacion getId_rec() {
		return id_rec;
	}

	public void setId_rec(Recomendacion id_rec) {
		this.id_rec = id_rec;
	}

	public Paciente getId_pac() {
		return id_pac;
	}

	public void setId_pac(Paciente id_pac) {
		this.id_pac = id_pac;
	}

	public Date getFecha_rec() {
		return fecha_rec;
	}

	public void setFecha_rec(Date fecha_rec) {
		this.fecha_rec = fecha_rec;
	}

}
