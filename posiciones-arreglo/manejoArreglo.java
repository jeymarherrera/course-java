/**Programa utilizando inicializaci�n de arreglos posiciones pares 0 posiciones impares 1
 * @(#)LAB24.java
 * @Jeymar Herrera
 * @2020/11/17
 */
import java.io.*;
class arreglo
{ private int arreglo[]= {0,1,0,1,0,1,0,1,0,1};


	int [] mostrarArreglo()
	{
	return arreglo;
	}


	int sumarElementos()
	{ int res=0, i;
		for(i=0; i<arreglo.length; i++)
		{
		 res += arreglo[i];
		}
		return res;
	}


	int multiplicarElementos()
	{ int res=0, i;
		for(i=0; i<arreglo.length; i++)
		{
		 res *= arreglo[i];
		}
		return res;
	}


	String informarArreglo()
	{ String res;
		res=("\nSe ha cargado el arreglo de la siguiente manera --> ' int arreglo[]= {0,1,0,1,0,1,0,1,0,1};'"
			+ "\ndonde las constantes estan separadas por comas, se encierran entre llaves y su tama�o se determina automaticamente\n"
			+ "\nEl tama�o del arreglo actual es de 10 posiciones \nLas posici�nes estan en un rango de 0 - 9  \nEs un arreglo bidimensional");

		return res;
	}
}

class manejoArreglo {
public static void main(String args[]) throws IOException
 { int Arreglo[] = new int [10];
   int i,opc;
   String respuesta,opcion;
   char res;
   boolean salir;

	salir=false;

 	arreglo obj=new arreglo();

 	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);


	System.out.println( "\n\t\t\tLaboratorio No.24 - Inicializacion de arreglos\n");
	System.out.println( "\nN�mero de posiciones pares '0' - N�meros de posiciones impares '1'\n");
    System.out.println( " �Arreglo cargado!\n");
    Arreglo=obj.mostrarArreglo();
    for(i=0;i<10;i++)
    {
    System.out.print(Arreglo[i]+" ");
    }
	System.out.print("\n^ ^ ^ ^ ^ ^ ^ ^ ^ ^");
	System.out.print("\n");

    for(i=0;i<10;i++)
    {
    System.out.print(i+" ");
    }
	System.out.print("\n--------------------");
	System.out.print("\nPosiciones del arreglo ");


	System.out.print("\n\n\n\t�Deseas realizar alguna operaci�n con este arreglo? s/n  ");
	respuesta=br.readLine();
	res=respuesta.charAt(0);

	if(res == 's' || res == 'S')
	{
	do
	{
	System.out.println("\n\t\tMENU");
	System.out.println("1.SUMAR LOS N�MEROS DEL ARREGLO");
	System.out.println("2.MULTIPLICAR LOS N�MEROS DEL ARREGLO");
	System.out.println("3.INFORMACI�N DEL ARREGLO");
	System.out.println("4.SALIR");
	opcion=br.readLine();
	opc=Integer.parseInt(opcion);

	switch(opc)
			{
			case 1:
	    	    System.out.println("\nSuma de los n�meros del arreglo");
	    	    System.out.println("\nTotal de la suma = "+obj.sumarElementos());
				break;
			case 2:
				System.out.println("\nMultiplici�n de los numeros del arreglo");
				System.out.println("\nTotal de la multiplicaci�n = "+obj.multiplicarElementos());
				break;
			case 3:
				System.out.println("\nInformaci�n sobre el arreglo");
				System.out.println(obj.informarArreglo());
			case 4:
				salir=true;
				break;
			default:
				System.out.println("\n**Numero fuera de rango** \n   -Intente de nuevo-");
				break;
	     	}
		}
	while (opc != 4);
	}
	else
	{
		System.out.println("\n�Hasta luego!");
		salir=true;
	}

}
}