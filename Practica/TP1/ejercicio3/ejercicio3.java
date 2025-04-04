package ejercicio3;

public class ejercicio3{




	public static void main (String [] args) {
		//vector de estudiantes
				Estudiante [] estudiantes = new Estudiante [2];
				estudiantes[0] = new Estudiante ("Juan", "Gomez", "superfacha@yahoo.com","5", "Calle Falsa 123");
				estudiantes[1] = new Estudiante ("Martina", "Herrera", "ladiosa@gmail.com","6", "Avenina Siempre Viva");
				
				//vector de profesores
				Profesor [] profesores = new Profesor [3];
				profesores[0] = new Profesor("Carlos", "Calvo", "amodesaprobaralumnos@hotmail.com", "CADP", "UBA");
				profesores[1] = new Profesor("Hernan", "Hernandez", "megustaaprobaralumnos@outlook.com", "CADP", "UCALP");
				profesores[2] = new Profesor("Maria", "Perez", "megustaelmate@unlp.com", "CADP", "UNLP");
				
				//Imprimir la información 
				System.out.println("-------ESTUDIANTES--------");
				for(int i = 0; i<estudiantes.length; i++) {
					System.out.println("---Estudiante "+(i+1));
					System.out.println(estudiantes[i].toString());
					System.out.println();
				}
				
				System.out.println("-------PROFESORES--------");
				for(int i = 0; i<profesores.length; i++) {
					System.out.println("---Profesor "+(i+1));
					System.out.println(profesores[i].toString());
					System.out.println();
				}
		
	}

}