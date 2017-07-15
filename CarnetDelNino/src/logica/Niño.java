package logica;
/*Comentario*/
import java.util.Calendar;

public class Niño {
	
	private String nombre;
	private int documento;
	private Calendar fechaNacimiento;
	private String servicioMedico;
	private String medicoCabecera;
	private boolean tieneFonasa;
	private Registro[] registros;
	private int cantRegistrosIngresados;
	
	public Niño(String nombre, int documento, Calendar fechaNacimiento, String servicioMedico, String medicoCabecera,
			boolean tieneFonasa, Registro[] registros, int cantRegistrosIngresados) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.servicioMedico = servicioMedico;
		this.medicoCabecera = medicoCabecera;
		this.tieneFonasa = tieneFonasa;
		this.registros = registros;
		this.cantRegistrosIngresados = cantRegistrosIngresados;
	}
	
	public Niño(String nombre, int documento, Calendar fechaNacimiento, String servicioMedico, String medicoCabecera,
			boolean tieneFonasa) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.servicioMedico = servicioMedico;
		this.medicoCabecera = medicoCabecera;
		this.tieneFonasa = tieneFonasa;
		this.registros = null;
		this.cantRegistrosIngresados = 0;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getServicioMedico() {
		return servicioMedico;
	}

	public void setServicioMedico(String servicioMedico) {
		this.servicioMedico = servicioMedico;
	}

	public String getMedicoCabecera() {
		return medicoCabecera;
	}

	public void setMedicoCabecera(String medicoCabecera) {
		this.medicoCabecera = medicoCabecera;
	}

	public boolean isTieneFonasa() {
		return tieneFonasa;
	}

	public void setTieneFonasa(boolean tieneFonasa) {
		this.tieneFonasa = tieneFonasa;
	}

	public Registro[] getRegistros() {
		return registros;
	}

	public void setRegistros(Registro[] registros) {
		this.registros = registros;
	}

	public int getCantRegistrosIngresados() {
		return cantRegistrosIngresados;
	}

	public void setCantRegistrosIngresados(int cantRegistrosIngresados) {
		this.cantRegistrosIngresados = cantRegistrosIngresados;
	}
	public String toString() {
		String retorno = "Nombre:" + nombre + "Documento: " +documento +"Fecha Nacimiento: " +fechaNacimiento +"Servicio: " +servicioMedico + "Medico Cabecera: " +medicoCabecera + "Tiene Fonasa: " +tieneFonasa + "Registros: " + "Cantidad Registros: ";
		return retorno;
	}
	//no me deja hacer el push
	
}
