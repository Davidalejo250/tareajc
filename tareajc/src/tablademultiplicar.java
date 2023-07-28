import java.util.*;
public class tablademultiplicar {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
	        int numerodetabla;
	        
	        System.out.print("ingresa la tabla que deseas : ");
	        numerodetabla = entrada.nextInt();
	               
	        int cont=1;
	        while(cont<11) {
	        	
	        	int multiplicacion = 0;
	        	multiplicacion= cont*numerodetabla;
	        	System.out.println(numerodetabla + " * " + cont + " = " + multiplicacion);
	        	cont++;
	        	entrada.close();
	        }

		}
	

}
