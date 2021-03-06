package com.lineadecodigo.java.basico;

/**
 * @file DiasDelMes.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   03/sep/2015
 * @url     http://lineadecodigo.com/java/dias-del-mes-en-java/
 * @description Ejemplo de agrupaciones de sentencias case para poder calcular los d�as del mes con Java.  
 */

public class DiasDelMes {
	
public static void main(String[] args) {
		
		
		int iMes = 3;
		String sDias;

		switch (iMes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				sDias = "El mes tiene 31 d�as";
				break;
			case 4: case 6: case 9: case 11:
				sDias = "El mes tiene 30 d�as";
				break;
			case 2:
				
				sDias = "El mes tiene 28 d�as (o 29 d�as si es a�o bisiesto)";
				break;			
			default:
				sDias = "Mes incorrecto";
		}
		
		System.out.println(sDias);
		
	}

}
