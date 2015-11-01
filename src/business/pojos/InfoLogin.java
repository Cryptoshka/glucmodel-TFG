package business.pojos;

/**
 * Información de login que se almacena en el objeto de sesión.
 * @author amiedes
 */
public class InfoLogin {
	
	// Attributes
	private int usr_id;
	private String name;	// nombre completo
	private int usr_type;
	
	// Getters & Setters
	public int getUsr_id() {
		return usr_id;
	}
	public void setUsr_id(int usr_id) {
		this.usr_id = usr_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUsr_type() {
		return usr_type;
	}
	public void setUsr_type(int usr_type) {
		this.usr_type = usr_type;
	}
}
