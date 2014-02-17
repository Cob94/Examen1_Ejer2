import java.util.Scanner;
public class Exa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi_escaner= new Scanner(System.in);
		for (int i=0;i<4;i++){
			System.out.println("Nombre del Alumno:");
			String nombre= mi_escaner.next();
			System.out.println(nombre);
			System.out.println("Ingrese nota 1:");
			double n1= mi_escaner.nextInt();
			System.out.println(n1);
			System.out.println("Ingrese nota 2:");
			double n2= mi_escaner.nextInt();
			System.out.println(n2);
			System.out.println("Ingrese nota 3:");
			double n3= mi_escaner.nextInt();
			System.out.println(n3);
			double operacion= ((n1+n2+n3)/3);
			System.out.println("Promedio "+operacion);
			if (operacion<60){
				System.out.println("Reprobado");
			}else{
				System.out.println("Aprobado");
			}
		}

		}
	}


