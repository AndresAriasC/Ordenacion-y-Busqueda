package Tarea;

public class DatosGenerales {
	
	private String curso;
	private String pLectivo;
	private String carrera;
	private String modalidad;
	private String codigo;
	private String grupo;
	private String cAsignatura;
	private String cPrograma;
	private int cEstudiantes;

	public DatosGenerales() {

		
		//course data
		curso = "";
		pLectivo = "";
		carrera = "";
		modalidad = "";
		codigo = "";
		grupo = "";
		cAsignatura = "";
		cPrograma = "";
		cEstudiantes = 0;
	}
	
	public DatosGenerales(String curso, String pLectivo, String carrera, String modalidad, String codigo, String grupo, String cAsignatura, String cPrograma, int cEstudiantes) {

		
		//course data
		this.curso = curso;
		this.pLectivo = pLectivo;
		this.carrera = carrera;
		this.modalidad = modalidad;
		this.codigo = codigo;
		this.grupo = grupo;
		this.cAsignatura = cAsignatura;
		this.cPrograma = cPrograma;
		this.cEstudiantes = cEstudiantes;
	}
	
//getters*************************************

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getpLectivo() {
		return pLectivo;
	}

	public void setpLectivo(String pLectivo) {
		this.pLectivo = pLectivo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getcAsignatura() {
		return cAsignatura;
	}

	public void setcAsignatura(String cAsignatura) {
		this.cAsignatura = cAsignatura;
	}

	public String getcPrograma() {
		return cPrograma;
	}

	public void setcPrograma(String cPrograma) {
		this.cPrograma = cPrograma;
	}

	public int getcEstudiantes() {
		return cEstudiantes;
	}

	public void setcEstudiantes(int cEstudiantes) {
		this.cEstudiantes = cEstudiantes;
	}

	
}
