package beans;
// Generated Nov 25, 2015 7:22:42 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Insulinas generated by hbm2java
 */
public class Insulinas {

	private Integer idInsulinas;
	private Integer idPac;
	private Date date;
	private Integer value;

	public Integer getIdInsulinas() {
		return this.idInsulinas;
	}

	public void setIdInsulinas(Integer idInsulinas) {
		this.idInsulinas = idInsulinas;
	}

	public Integer getIdPac() {
		return this.idPac;
	}

	public void setIdPac(Integer idPac) {
		this.idPac = idPac;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
