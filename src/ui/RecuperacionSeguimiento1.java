package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   
        // Metodo pow de Math
        
        

        // Declaracion de info a pedir del usuario 
       int num1, num2, num3, calcularIguales, resultadoIgualdad;

		String nombre, saludoDespedida, mensaje;
		int unocero;

		String palabra1, palabra2, palabra3;
		int palabralongitud;

		String word1, word2;
		boolean validación;

		int aa, bb, cc;
		double resultadoRaizPositiva, resultadoRaizNegativa;

        // Pedir info al usuario 

		System.out.println("Seleccione el ejercicio:");
		System.out.println("1. Ejercicio 1");
		System.out.println("2. Ejercicio 2");
		System.out.println("3. Ejercicio 3");
		System.out.println("4. Ejercicio 4");
		System.out.println("5. Ejercicio 5");
		int option = escaner.nextInt();
		escaner.nextLine();

		switch (option){
			case 1:
				System.out.println("Ejercicio 1");
				System.out.println("Vamos a determinar los parámetros que sean iguales.");
				//Entradas
				System.out.println("Introduzca el primer número:");
				num1 = escaner.nextInt();
				escaner.nextLine();
				System.out.println("Introduzca el segundo número:");
				num2 = escaner.nextInt();
				escaner.nextLine();
				System.out.println("Introduzca el tercer número:");
				num3 = escaner.nextInt();
				escaner.nextLine();
				//Salidas
				resultadoIgualdad = calcularIguales(num1, num2, num3);
				System.out.println("Los parámetros iguales son: " + resultadoIgualdad);


				break;
			case 2:
				System.out.println("Ejercicio 2");
				System.out.println("Saludo o Despedida:");
				//Entradas
				System.out.println("Introduzca su nombre:");
				nombre = escaner.nextLine();
				System.out.println("Escriba 1 para saludo y 0 para despedida:");
				unocero = escaner.nextInt();
				escaner.nextLine();
				//Salidas
				mensaje = saludoDespedida(nombre, unocero);
				System.out.println(mensaje);

				break;
			case 3:
				System.out.println("Ejercicio 3");
				System.out.println("Longitud de palabras:");
				//Entradas
				System.out.println("Introduzca la primera palabra:");
				palabra1 = escaner.nextLine();
				System.out.println("Introduzca la segunda palabra:");
				palabra2 = escaner.nextLine();
				System.out.println("Introduzca la tercera palabra:");
				palabra3 = escaner.nextLine();
				//Salidas
				palabralongitud = longitud(palabra1, palabra2, palabra3);
				System.out.println("Las palabras con cuatro o más carácteres son: " + palabralongitud);

				break; 
			case 4:
				System.out.println("Ejercicio 4");
				System.out.println("Igualdad en la posición 2:");
				//Entradas
				System.out.println("Introduzca la primera palabra:");
				word1 = escaner.nextLine();
				System.out.println("Introduzca la segunda palabra:");
				word2 = escaner.nextLine();
				//Salidas
				validación = comparación(word1, word2);
				System.out.println("La validación es: " + validación);

				break;
			case 5:
				System.out.println("Ejercicio 5");
				System.out.println("Fórmula cuadrática:");
				//Entradas
				System.out.println("Introduzca el valor de a:");
				aa = escaner.nextInt();
				escaner.nextLine();
				System.out.println("Introduzca el valor de b:");
				bb = escaner.nextInt();
				escaner.nextLine();
				System.out.println("Introduzca el valor de c:");
				cc = escaner.nextInt();
				escaner.nextLine();
				//Salidas
				resultadoRaizPositiva = raizPositiva(aa, bb, cc);
				resultadoRaizNegativa = raizNegativa(aa,bb,cc);
				System.out.println("La raíz positiva es: " + resultadoRaizPositiva);
				System.out.println("La raíz negativa es: " + resultadoRaizNegativa);

				break;
			default:
				System.out.println("Error");
				break;
			
		}

        // Declaracion de salidas calculadas 
       
        // Calculo de salidas mediante metodos 

        // Mostramos las salidas al usuario
        
	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}

	public static int calcularIguales (int num1, int num2, int num3){
		if (num1 == num2 && num2 == num3){
			return 3;
		}else if (num1 == num2 || num1 == num3 || num2==num3){
			return 2;
		}else {
			return 0;
		}
		//Este método sirve para calcular la cantidad de números que son iguales, ejercicio 1.
	}

	public static String saludoDespedida(String nombre, int unocero){
		String mensaje;
		String holaChao ="";
		if (unocero == 1){
			return mensaje = ("Hola " + nombre);
		}else if (unocero == 0){
			return mensaje = ("Chao " + nombre);
		}else {
			return mensaje = ("Error, seleccione 1 para Hola y 0 para Chao");
		}
		//Este método es para operar que al poner 1 o 0 salga Hola o Chao respectivamente.
	}
	public static int longitud(String palabra1, String palabra2, String palabra3){
		int count = 0;
		if (palabra1.length() >=3){
			count ++;
		}
		if (palabra2.length() >=3){
			count ++;
		}
		if (palabra3.length() >=3){
			count ++;
		}
		return count;
	}
	public static boolean comparación (String word1, String word2){

		if (word1.length() <3|| word2.length() <3){
			System.out.println("Error, ambas palaras deben tener por lo menos 3 caracteres.");
			return false;
		}else{
			if(word1.charAt(2) == word2.charAt(2)){
				return true;
			}
		}
		return false;
	}

	public static double raizPositiva(int aa, int bb, int cc){
		double raiz1;
		double discriminante = Math.pow(bb,2)-4*aa*cc;

		if(discriminante <0){
			System.out.println("La ecuación no tiene resultados en los números reales.");

		}else{
			return raiz1 = (-bb + Math.sqrt(discriminante))/(2*aa);
		}
		return -1;
	}
	public static double raizNegativa(int aa, int bb, int cc){
		double raiz2;
		double discriminante = Math.pow(bb,2)-4*aa*cc;

		if (discriminante <0){
			System.out.println("La ecuación no tiene resultados en los números reales.");
		}else{
			return raiz2 = (-bb - Math.sqrt(discriminante))/(2*aa);
		}
		return -1;
		
	}
	
}