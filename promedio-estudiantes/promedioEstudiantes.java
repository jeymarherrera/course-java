/**Taller: Calcule el promedio de notas de 5 estudiantes con 3 notas parciales cargadas en una matriz,
 *obtenga el resultado en dos arreglos de una dimension 1 con la nota num�rica y el otro con la nota alfabetica en dos metodos diferentes
 * @(#)tallerPractico4.java
 *
 *
 * @Jeymar Herrera
 * @2020/12/2
 */

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class calculos
{ private int Matriz[][] = new int [5][3];
  private int Arreglo1[] = new int [5];
  private char Arreglo2[] = new char [5];

	//constructores
	calculos()
	{

	}

	calculos(int matriZ[][], int a1[], char a2[])
	{
	Matriz=matriZ;
	Arreglo1=a1;
	Arreglo2=a2;
	}

	//metodos

	String mostrarPresentacion()
	 { String pres;

	  pres = "	  				                                       Presentacion \n\n"
	 								   +"                                   Realizado por: \n"
	 								   +"                                Jeymar Herrera \n\n";

	  return pres;
	 }

	//calcular promedio
	int [] calcularPromedio()
	{ int f,c,i=0, cont=0;
		for(f=0; f<5; f++)
  	 	{ for(c=0; c<3; c++)
  	  		cont =cont +Matriz[f][c];
  	  	cont=cont/3;
  	  	Arreglo1[f]=cont;
  	  	cont=0;
  	 	}
  	 return Arreglo1;
	}

	//promedio
	char [] promedioAlfabetico()
	{	int i;
		char letra;
		for(i=0; i<5; i++)
		{
			if(Arreglo1[i] >= 91 && Arreglo1[i] <= 100)
			{
			Arreglo2[i] ='A';
			}
			else if(Arreglo1[i] >= 81&& Arreglo1[i] <= 90)
			{
			Arreglo2[i] ='B';
			}
			else if(Arreglo1[i] >= 71 && Arreglo1[i] <= 80)
			{
			Arreglo2[i] ='C';
			}
			else if(Arreglo1[i] >= 61 && Arreglo1[i] <= 70)
			{
			Arreglo2[i] ='D';
			}
			else if(Arreglo1[i] <= 60)
			{
			Arreglo2[i] ='F';
			}
			else
			{
			Arreglo2[i] ='N';
			}
		}
	return Arreglo2;
	}

}

class promedioEstudiantes
{public static void main(String args[]) throws IOException
{ int f, c, i, entero;
  String opc, valor, resultado;

  //Arreglos y Matrices
  String opciones[] = {"Presentaci�n","Opci�n 1","Opci�n 2","Opci�n 3","Opci�n 4","Opci�n 5"};
  int matriz[][] = new int [5][3];
  int arreglo1[] = new int [5];
  char arreglo2[] = new char [5];

  //Objeto
  calculos obj = new calculos();

 //BufferedReader
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);

 //Menu
  do
  {
  opc = (String) JOptionPane.showInputDialog(null,"									                        PROMEDIOS							\n\n"
  																				  +"1. Cargar matriz con notas de estudiantes           				 						\n"
    									 		  								  +"2. Imprimir matriz                				   								   							\n"
    									 		 								  +"3. Imprimir promedios n�mericos             												   \n"
																				  +"4. Imprimir promedios alfabeticos								   								\n"
    									 		 								  +"5. Salir								 			 				  								 				\n"
    									 		 								  +"�Qu� opci�n deseas ver?               				   								  				 \n"
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

  //opcion presentacion
  case "Presentaci�n":

  ImageIcon iconoU = new ImageIcon("MyIcon.png");
  JOptionPane.showMessageDialog(null, obj.mostrarPresentacion()
	 								   		 					, "PRESENTACI�N"
	                                   		  					, JOptionPane.INFORMATION_MESSAGE, iconoU);
  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  //Entrada de datos
  case "Opci�n 1":
  try
  {
  for(f=0; f<5; f++)
  { for(c=0; c<3; c++)
  	 { do
  	  	{
  	  		valor=JOptionPane.showInputDialog(null,"\nIngrese las 3 notas parciales de cada estudiante ...\n"
  	  																		  +"\nIngrese la nota "+(c+1)+" del estudiantes "+(f+1)
  	  																		   ,"Entrada de Datos"
  	  																		   , JOptionPane.QUESTION_MESSAGE);

  			entero = Integer.parseInt(valor);
  	  	}   while (entero < 0 || entero > 100);
			matriz[f][c] =entero;
  	  }
  }
  JOptionPane.showMessageDialog(null,"\n�Se ha ingresado todas las notas!\n"
  																,"�EXITO!"
  																,JOptionPane.WARNING_MESSAGE);

  obj = new calculos(matriz, arreglo1, arreglo2);
  System.out.println("\n");
  System.out.println("_________________________________________________________________");
 }
  catch (NumberFormatException e)
  {
  	JOptionPane.showMessageDialog(null,e
  																  ,"ERROR"
  																  ,JOptionPane.ERROR_MESSAGE);
  }
  break;

  //opcion cargar matriz
  case "Opci�n 2":

	resultado = "";
	for(f=0; f<5; f++)
  	 { for(c=0; c<3; c++)
  	 	{	resultado += " ["+matriz[f][c]+"] ";
  	  	resultado += " ";
  	 	}
  	 resultado += "\n";
  	 }
  JOptionPane.showMessageDialog(null, "         Notas ingresadas\n"+resultado
  																,"Matriz"
  																,JOptionPane.PLAIN_MESSAGE);
  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

 //resultados numericos
  case "Opci�n 3":

  	System.out.println("\nPromedios obtenidos\n");
  	arreglo1 = obj.calcularPromedio();
  	for (i=0; i<5; i++)
		System.out.println("Promedio Estudiante "+i+" = "+arreglo1[i]+" ");
	System.out.println("\n");
  	System.out.println("_________________________________________________________________");
	break;

	case "Opci�n 4":
	System.out.println("\nPromedios obtenidos alfabeticos\n");
	arreglo2 = obj.promedioAlfabetico();
	for (i=0; i<5; i++)
		JOptionPane.showMessageDialog(null, "Promedio Estudiante "+i+" = "+arreglo2[i]+" ");
	System.out.println("\n");
    System.out.println("_________________________________________________________________");
	break;

	case "Opci�n 5":

	System.out.println("\nSALIDA");
	JOptionPane.showMessageDialog(null,"\n�Hasta la pr�xima!\n"
  																 ,"DESPEDIDA"
  																 ,JOptionPane.WARNING_MESSAGE);
  	System.out.println("\n");
    System.out.println("_________________________________________________________________");
	break;

	case "DEFAULT":

	System.out.println("\nWARNING!");
	JOptionPane.showMessageDialog(null,"\nDebe salir con la opci�n del 5 del men�\n"
  																 ,"DEFAULT"
  																 ,JOptionPane.WARNING_MESSAGE);
  	System.out.println("\n");
    System.out.println("_________________________________________________________________");
	break;


  }
  } while(opc != "Opci�n 5");

}
}