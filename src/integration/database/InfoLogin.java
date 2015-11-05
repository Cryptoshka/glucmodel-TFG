package integration.database;

public class InfoLogin {
	
	// Attributes
	private int id;
	private int idDoc;
	private int rolcurso;
	private String name;
	private String surname1;
	private String surname2;
	private boolean esMedico;
	private boolean loginCorrecto;
	
	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdDoc() {
		return idDoc;
	}
	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}
	public int getRolcurso() {
		return rolcurso;
	}
	public void setRolcurso(int rolcurso) {
		this.rolcurso = rolcurso;
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
	public boolean isEsMedico() {
		return esMedico;
	}
	public void setEsMedico(boolean esMedico) {
		this.esMedico = esMedico;
	}
	public boolean isLoginCorrecto() {
		return loginCorrecto;
	}
	public void setLoginCorrecto(boolean loginCorrecto) {
		this.loginCorrecto = loginCorrecto;
	}
}
