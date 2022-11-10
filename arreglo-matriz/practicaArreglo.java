/**Carga y suma Arreglo
 * @(#)practicaArreglo.java
 *
 *
 * @author
 * @version 1.00 2020/11/21
 */

import java.io.*;
class A
{ private int Arreglo[] = new int [10];

	void cargarArreglo()
	{ int i;
		for(i=0; i<10; i++)
		{
			Arreglo[i] = i;
		}
	}


	int [] mostrarArreglo()
	{
		return Arreglo;
	}


	int calcularSuma()
	{ int i, suma;
		suma = 0;
		for(i=0; i<10; i++)
		{
		 suma = suma + Arreglo[i];
		}
	 return suma;
	}
}
class practicaArreglo
{public static void main(String args []) throws IOException
{ int arreglo[] = new int [10];
	A obj = new A();
	int opc=0, s, i;

	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	while(opc != 4)
	{
		System.out.println("\n\n\n\t\tMenú");
		System.out.println("\n\nElija una opción del menú");
		System.out.println("\n1. Cargar el arreglo");
		System.out.println("\n2. Mostrar los elementos del arreglo");
		System.out.println("\n3. Sumar los elementos del arreglo");
		System.out.println("\n4. Salir del programa");
		opc = Integer.parseInt(br.readLine());
	switch(opc)
	{
		case 1: obj.cargarArreglo();
				System.out.println("Arreglo cargado...\n");
				break;
		case 2: arreglo = obj.mostrarArreglo();
				for (i=0; i<10; i++)
					System.out.print(arreglo[i]+" ");
				System.out.print("\n\n\n");
				break;
		case 3: s = obj.calcularSuma();
				System.out.print("El resultado de la suma es = "+s+"\n");
				break;
		case 4: System.out.println("\n¡Hasta luego!");
				break;
		default:System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("*La opción no está disponible en el menú");
				System.out.println("Elija otra opción");
	}
	}
}
}