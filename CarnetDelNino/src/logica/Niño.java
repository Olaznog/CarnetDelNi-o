package logica;

import java.io.Serializable;
import java.util.Calendar;

import excepciones.hayLugarException;

public class Niño implements Serializable {
	
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

	public int getEdadNiño(Calendar FechaNacimiento) {
        Calendar hoy = Calendar.getInstance();
        int año = hoy.get(Calendar.YEAR) - FechaNacimiento.get(Calendar.YEAR);
        int mes = hoy.get(Calendar.MONTH) - FechaNacimiento.get(Calendar.MONTH);
        int dia = hoy.get(Calendar.DAY_OF_MONTH) - FechaNacimiento.get(Calendar.DAY_OF_MONTH);
        
        //Si está en ese año pero todavía no los ha cumplido
        if(mes < 0 || (mes == 0 && dia < 0)) {
            año = año -1;                        
        }
        return año;
    }
	
	public void agregarRegistroNiño(Registro nuevoRegistro)throws hayLugarException {
		if(hayLugarRegistros() == true){
		this.registros[cantRegistrosIngresados] = nuevoRegistro;
        cantRegistrosIngresados++;
		}else
			throw new hayLugarException("Ya no hay lugar en el arreglo de registros de este niño");
	}
	public boolean hayLugarRegistros() {
		boolean hayLugar  = false;
		
		if(cantRegistrosIngresados == registros.length)
			hayLugar = false;
		else 
			hayLugar = true;
		return hayLugar;
	}
	
	public String toString() {
		//No sabemos como mostrar los registros en este metodo
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH);
		int año = fechaNacimiento.get(Calendar.YEAR);
		String retorno = "Nombre:" + nombre + " Documento: " +documento +" Fecha Nacimiento: "+dia+"/"+mes+"/"+año +" Servicio: " +servicioMedico + " Medico Cabecera: " +medicoCabecera + " Tiene Fonasa: " +tieneFonasa  + " Registros: " +registros + " Cantidad Registros: " +cantRegistrosIngresados;
		return retorno;
	}
	public int cuantasConsultasAntesDe(Calendar fecha) {
		int cuantas = 0;
		for(int i = 0; i < cantRegistrosIngresados; i++)
		{
			if(registros[i] instanceof Consulta)
			if(registros[i].getFecha().before(fecha))
				cuantas++;
		}
		return cuantas;
			
	}
	public String toStringListadoNiño() {
		int Edad = getEdadNiño(fechaNacimiento);
		String retorno = "Nombre:" + nombre + " Documento: " +documento +" Edad: "+Edad+" Servicio: " +servicioMedico;
		return retorno;
	}
	
}
