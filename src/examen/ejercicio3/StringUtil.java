package examen.ejercicio3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringUtil {

	
	
	
	public static int contarLetrasUnicas(String cadena){
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			for(int j=i;j<cadena.length();j++) {
			if(cadena.charAt(i)==cadena.charAt(j)) {
				cont++;
				
				
			}
		}
		
		
	
	
		

		}
		System.out.println(cont);
		return cont;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Examen de Programación";
		contarLetrasUnicas( cadena);
	}

}
