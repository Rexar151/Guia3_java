import java.util.Scanner;
public class Caso7 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("======");
		System.out.println("Datos");
		System.out.println("======");
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();

				
		for (int i=1;i<=10;i++){
			System.out.println(i+". Bienvenido "+nombre+" al curso.");
		}
	}
	}