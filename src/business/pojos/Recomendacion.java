package business.pojos;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class Recomendacion {
	private String titulo;
	private String desc;
	private int prio;
	@Enumerated
	private Causa causa[];

	public Recomendacion() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	public Causa[] getCausa() {
		return causa;
	}

	public void setCausa(Causa[] causa) {
		this.causa = causa;
	}

}
