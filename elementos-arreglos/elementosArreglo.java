/**Proyecto 6: Haga un programa con men� que contiene las siguientes opciones, aplique BufferedReader, JOption, Constructor, dos clases,
 *metodos, objeto, try catch, leer e imprimir en el main.
 *Men�: 1. Cargar, 2. Insertar, 3. Reemplazar, 4. Mover, 5. Salir
 *1. Cargar un arreglo de tipo caracter de 10 elementos m�ximo
 *2. Inserte un asterisco al final del arreglo. Verifique que el arreglo tenga disponibilidad de insercion
 *3. Remplazar las 'a' por un valor que el usuario debe proporcionarle, si no existe inicarle que no existe.
 *4. Mueva el arreglo completamente una posicion a la derecha
 *5. Salir
 *
 * @(#)PROY6.java
 * @Jeymar Herrera/20-70-5165
 * @2020/11/24
 */

//imports
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

//clase dos
class arreglo
{ //atributos privados
  private char Arreglo[] = new char [10];

	//constructor
	arreglo()
	{

	}


	arreglo(char A[])
	{
	 Arreglo=A;
	}

	//metodo cargarArreglo
	char [] cargarArreglo(int N, String Cadena)
	{ int i;
	  char C=0;
	  	for(i=0; i<10; i++)
		{
			Arreglo[i] = ' ';
		}

		for(i=0; i<N; i++)
		{
			C=Cadena.charAt(i);
			Arreglo[i] = C;
		}
	  return Arreglo;
	}

	//metodo insertarArreglo
	char [] insertarArreglo()
	{ int i;
		for(i=0; i<10; i++)
		{
			if (Arreglo[i] == ' ')
				Arreglo[i] = '*';
				i=11;
		}
	 return Arreglo;
	}


	//metodo reemplazarA
	char [] reemplazarA(char V)
	{ int i;
		for(i=0; i<10; i++)
		{
			if ((Arreglo[i] == 'a') || (Arreglo[i] == 'A'))
				Arreglo[i] = V;
		}
	  return Arreglo;
	}


	//metodo moverArreglo
	char [] moverArreglo()
	{ int i;
	  char aux;
	  aux=Arreglo[9];
	  for(i=9; i>0; i--)
	  {
	  	Arreglo[i]=Arreglo[i-1];
	  }
	  Arreglo[0]=aux;
	  return Arreglo;
	}

}
//clase uno
class elementosArreglo
{public static void main(String args []) throws IOException
{ //bloque de declarativas
  char arreglo[] = new char [10];
  char c;
  int i, n=0, cont;
  String opc, caracter, cantidad, contC;
  String opciones[] = {"Opci�n 1","Opci�n 2","Opci�n 3","Opci�n 4","Opci�n 5"};

  //declaracion del objeto
  arreglo obj = new arreglo();

  //BufferedReader
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);


  do
  {
  opc = (String) JOptionPane.showInputDialog(null,"1. Cargar el arreglo                  \n"
    									 		 +"2. Insertar '*' en el arreglo         \n"
    									 		 +"3. Remplazar elementos 'a'            \n"
    									 		 +"4. Mover el arreglo                   \n"
    									 		 +"5. Salir								 \n"
    									 		 +"�Qu� opci�n deseas ver?               \n"
  									     		 ,"MEN�"
  									     		 , JOptionPane.QUESTION_MESSAGE
   										 		 , null
   										 		 , opciones
   										 		 , opciones[0]
   												 );

  if(opc == null)
  	opc="DEFAULT";
  System.out.println(opc);
  switch(opc)
  {
   case "Opci�n 1":
  	 	try
  	 	{
  	 	 do
  	 	 {
  	 	   contC="";
  	 	   System.out.println("\n\t�CU�NTOS CAR�CTERES DESEA INGRESAR? \n\t  *Recuerde que el maximo son 10*");
  	 	   cantidad = br.readLine();
  		   n = Integer.parseInt(cantidad);
  	     }
  		 while (n < 0 || n > 10);

		 for(i=0; i<n; i++)
		 {
		   System.out.println("\nINGRESE CAR�CTER: ");
  		   caracter = br.readLine();
  		   c = caracter.charAt(0);
  		   contC=contC+c;
		 }

		   obj = new arreglo(arreglo);
		   arreglo = obj.cargarArreglo(n,contC);
		   	for (i=0; i<10; i++)
			{
		   	 System.out.print("["+arreglo[i]+"]");

	    	}
	    	System.out.println("\n");
		   JOptionPane.showMessageDialog(null,"\nArreglo cargado correctamente"
  	 		 								 , "�EXITO!"
  	 										 , JOptionPane.INFORMATION_MESSAGE);
		   System.out.println("_________________________________________________________________");
  	 	}
  	 	catch (NumberFormatException e)
  	 	{
  	 	   JOptionPane.showMessageDialog(null,"\nError, la cantidad es de valor n�merica"
  	 		 								 , "�ERROR!"
  	 										 , JOptionPane.ERROR_MESSAGE);
  	 	}
  	 	catch (StringIndexOutOfBoundsException e)
  	 	{
  	 	   JOptionPane.showMessageDialog(null,"\nNo has insertado ning�n caracter"
  	 		 							     , "�ERROR!"
  	 									     , JOptionPane.ERROR_MESSAGE);
  	    }
		break;

   case "Opci�n 2":

		cont=0;
		System.out.print("\nLOS ASTERISCOS REPRESENTAN LOS ESPACIOS VACIOS DEL ARREGLO \n\n");
		arreglo = obj.insertarArreglo();
		for (i=0; i<10; i++)
		{
		   System.out.print("["+arreglo[i]+"]");
		   if(arreglo[i]== '*')
		   		cont++;
	    }
		System.out.println("\n\nCantidad de espacios vacios: "+cont);
		   if(cont == 0)
		   {
		   JOptionPane.showMessageDialog(null,"No hay disponibilidad de inserci�n"
		   									 , "�UPS!"
  	 										 , JOptionPane.INFORMATION_MESSAGE);
		   }
		   else
		   {
		   JOptionPane.showMessageDialog(null,"\nInserci�n realizada correctamente"
  	 		 								 , "�EXITO!"
  	 										 , JOptionPane.INFORMATION_MESSAGE);
		   }
		   System.out.println("\n");
		   System.out.println("_________________________________________________________________");
		break;

	case "Opci�n 3":
		cont=0;
		System.out.print("\nSE REEMPLAZAR� TODAS LAS 'A' QUE SE ENCUENTRAN EN EL ARREGLO");
		System.out.print("\nIntroduzca el caracter por el que desea reemplazarlo: \n");
		caracter = br.readLine();
  		c = caracter.charAt(0);
  		for(i=0; i<10; i++)
		{
			if ((arreglo[i] == 'a') || (arreglo[i] == 'A'))
				cont++;
		}
		if(cont==0)
		{
		  JOptionPane.showMessageDialog(null,"\nEl car�cter 'a' no existe en el arreglo"
  	 		 								, "�UPS!"
  	 										, JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
  		arreglo=obj.reemplazarA(c);
  		for (i=0; i<10; i++)
		{
			System.out.print("["+arreglo[i]+"]");
		}
		System.out.println("\n");
		JOptionPane.showMessageDialog(null,"\nSe ha realizado el reemplazo correctamente"
  	 		 								 , "�EXITO!"
  	 										 , JOptionPane.INFORMATION_MESSAGE);

		}
		System.out.println("_________________________________________________________________");
		break;

	case "Opci�n 4":

		System.out.print("\nARREGLO ANTES DE MOVERLO UNA POSICI�N HACIA LA DERECHA: \n");
		for (i=0; i<10; i++)
		{
			System.out.print("["+arreglo[i]+"]");
		}
		System.out.print("\n\nARREGLO DESPUES DE MOVERLO UNA POSICI�N HACIA LA DERECHA: \n");
		arreglo=obj.moverArreglo();
		for (i=0; i<10; i++)
		{
			System.out.print("["+arreglo[i]+"]");
		}
		System.out.println("\n");
		JOptionPane.showMessageDialog(null,"\n       Se ha movido el arreglo una posici�n \n  hacia la derecha de manera correctamente"
  	 		 								 , "�EXITO!"
  	 										 , JOptionPane.INFORMATION_MESSAGE);
		System.out.println("_________________________________________________________________");
		break;

	case "Opci�n 5":

		ImageIcon despedida = new ImageIcon("iconoAdios.png");
		JOptionPane.showMessageDialog(null,"   �HASTA LA PR�XIMA!   "
										  , "�ADI�S!"
  	 									  , JOptionPane.WARNING_MESSAGE,despedida);
		System.exit(0);
		System.out.println("\n");
		System.out.println("_________________________________________________________________");
		      break;

	default:

		JOptionPane.showMessageDialog(null,"�Deseas salir? Solo podr�s hacerlo desde la opci�n 5"
										  , "�CUIDADO!"
  	 									  , JOptionPane.WARNING_MESSAGE);
		System.out.println("\n");
  }
  } while(opc != "Opci�n 5");
}
}


