package beans;

/**
 * Session Bean implementation class InfoBasicaPaciente
 */
public class InfoBasicaPaciente {

	// Atributos
	private String nomApell;
	private double peso;
	private float altura;
	private float imc;
	private int tipoDiabetes;
	private String[] otrasEnfermedades;
	
	// Getters & Setters
	public String getNomApell() {
		return nomApell;
	}

	public void setNomApell(String nomApell) {
		this.nomApell = nomApell;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public int getTipoDiabetes() {
		return tipoDiabetes;
	}

	public void setTipoDiabetes(int tipoDiabetes) {
		this.tipoDiabetes = tipoDiabetes;
	}

	public String[] getOtrasEnfermedades() {
		return otrasEnfermedades;
	}

	public void setOtrasEnfermedades(String[] otrasEnfermedades) {
		this.otrasEnfermedades = otrasEnfermedades;
	}

	public String[] getMedicacionActual() {
		return medicacionActual;
	}

	public void setMedicacionActual(String[] medicacionActual) {
		this.medicacionActual = medicacionActual;
	}

	private String[] medicacionActual;
	
    /**
     * Default constructor. 
     */
    public InfoBasicaPaciente() {
        // TODO Auto-generated constructor stub
    }
}
