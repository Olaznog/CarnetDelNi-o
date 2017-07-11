package logica;

public class Vacuna extends Registro {
	
	private String nombre;
	private int dosis;
	private boolean obligatoria;
	
	public Vacuna(Fecha fecha, String comentario, String nombre, int dosis, boolean obligatoria) {
		super(fecha, comentario);
		this.nombre = nombre;
		this.dosis = dosis;
		this.obligatoria = obligatoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public boolean isObligatoria() {
		return obligatoria;
	}

	public void setObligatoria(boolean obligatoria) {
		this.obligatoria = obligatoria;
	}
	
	

}
