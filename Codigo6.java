import java.util.Scanner;

public class Codigo5 {
	//Metodo main
	public static void main(String[] args) {
		//Importar la liberia Scanner y el System.in para indicar que es entrada 
	    Scanner sc = new Scanner(System.in);
	    //Uso de comillas simples y dobles incorrecto 
	    System.out.print("Introduzca un número: ");
	    int ni = sc.nextInt();
	    
	    int c = ni;
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = ni % 10;
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	    }   ni /= 10; 
	    } //cerrar el while 

	    if (afo > noAfo) {
	    	//Error sintanxis print
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}


