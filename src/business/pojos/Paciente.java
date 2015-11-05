package business.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class Paciente {
	private String name;
	private String surname1;
	private String surname2;
	private Date birthdate;
	private String dni;
	private String email;
	private int height;
	private String diabetis_type;
	@Enumerated
	private Gender gender;
	private String pass;
	private String illnesses;
	private String medication;

	public Paciente() {
		// TODO Auto-generated constructor stub
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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getDiabetis_type() {
		return diabetis_type;
	}

	public void setDiabetis_type(String diabetis_type) {
		this.diabetis_type = diabetis_type;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getIllnesses() {
		return illnesses;
	}

	public void setIllnesses(String illnesses) {
		this.illnesses = illnesses;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

}
