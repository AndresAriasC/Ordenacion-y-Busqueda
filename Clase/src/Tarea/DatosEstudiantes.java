package Tarea;

public class DatosEstudiantes {

	
	private String carnet; 
	private String apellidos;
	private String nombres;
	private double notaPP;
	private double notaSP;
	private double sistematicos;
	
	public DatosEstudiantes(){
		/weunas
		carnet = "";
		apellidos = "";
		nombres = "";
		notaPP = 0;
		notaSP = 0;
		sistematicos = 0;
	}
	
	public DatosEstudiantes(String carnet, String apellidos, String nombres, double notaPP, double notaSP, double sistematicos){

		this.carnet = carnet;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.notaPP = notaPP;
		this.notaSP = notaSP;
		this.sistematicos = sistematicos;
	}
	
	
	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public double getNotaPP() {
		return notaPP;
	}

	public void setNotaPP(double notaPP) {
		this.notaPP = notaPP;
	}

	public double getNotaSP() {
		return notaSP;
	}

	public void setNotaSP(double notaSP) {
		this.notaSP = notaSP;
	}

	public double getSistematicos() {
		return sistematicos;
	}

	public void setSistematicos(double sistematicos) {
		this.sistematicos = sistematicos;
	}
	
	
	
}
