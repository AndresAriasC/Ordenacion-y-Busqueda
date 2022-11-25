package Tarea;

import java.util.Scanner;

public class ActasDeNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DatosGenerales dt[] = new DatosGenerales[1];
		DatosEstudiantes de[] = new DatosEstudiantes[0];
		
	 String carnet; 
	 String apellidos;
	 String nombres;
	 double notaPP;	 double notaSP;
	 double sistematicos;
		
	 String curso = "";
	 String pLectivo = "";
	 String carrera = "";
	 String modalidad = "";
	 String codigo = "";
	 String grupo = "";
	 String cAsignatura = "";
	 String cPrograma = "";
	 int cEstudiantes = 0;
		
		
		for (int i = 0; i < dt.length; i++) {
			System.out.print("Nombre del Curso: ");
			curso = entrada.nextLine();
			System.out.print("Periodo lectivo: ");
			pLectivo = entrada.nextLine();
			System.out.println("Carrera: ");
			carrera = entrada.nextLine();
			System.out.println("Modaldiad: ");
			modalidad = entrada.nextLine();
			System.out.println("Cod. del Curso: ");
			codigo = entrada.nextLine();
			System.out.println("Grupo: ");
			grupo = entrada.nextLine();
			System.out.println("Cod. Asignatura: ");
			cAsignatura = entrada.nextLine();
			System.out.println("Cod. Programa: ");
			cPrograma = entrada.nextLine();
			System.out.println("Cant Estudiantes: ");
			cEstudiantes = entrada.nextInt();
			
			
			dt[i] = new DatosGenerales(curso,pLectivo,carrera,modalidad,codigo,grupo,cAsignatura,cPrograma,cEstudiantes);
		}
		
		for (int i = 0; i < dt.length; i++) {
			System.out.println("Datos generales \n");
			System.out.println("* Curso: " + (dt[i].getCurso()+"		"+ "* Cod. Curso: " +dt[i].getCodigo() + "		" + "Grupo: " +dt[i].getGrupo()));
			System.out.println("* Perido Lectivo: " + dt[i].getpLectivo() +"		"+ "* Cod. Asignatura: " +dt[i].getcAsignatura());
			System.out.println("* Carrera: " + dt[i].getCarrera()  +"		" + "* Cod. Programa: " +dt[i].getcPrograma() );
			System.out.println("* Modalidad: " +dt[i].getModalidad()+ "		" + "* Cant. Estudiantes: " +dt[i].getcEstudiantes());
		}
		
		
entrada.close();
	}

}
