package beans;

/**
 * Session Bean implementation class NombresPacientes
 */
public class NombresPacientes {
	
	// Cada celda del array representará el nombre y apellidos de uno de los pacientes.
	private String[] nombres;
    private int[] ids;			// Necesitaremos los IDs para los enlaces a la página de cada paciente.
	
    /**
     * Default constructor. 
     */
    public NombresPacientes() {
        // TODO Auto-generated constructor stub
    }

	public String[] getNombres() {
		return nombres;
	}

	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

}
