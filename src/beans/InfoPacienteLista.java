package beans;

/**
 * Clase utilizada en el servicio que recopila la lista de pacientes para un
 * médico, dado su ID.
 * @author amiedes
 */
public class InfoPacienteLista {
	
	// Attributes
	private Integer id;
	private String name;
	private String surname1;
	private String surname2;
	
	// Getters & Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname1() {
		return surname1;
	}
	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}
	public String getSurname2() {
		return surname2;
	}
	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}
	
}
