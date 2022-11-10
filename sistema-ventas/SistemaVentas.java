import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

class Ventas
{ private double Matriz[][] = new double [3][3];
  private double Arreglo1[] = new double [3];
  private double Arreglo2[] = new double [3];

	Ventas()
	{

	}

	Ventas(double M[][], double a1[], double a2[])
	{
	Matriz=M;
	Arreglo1=a1;
	Arreglo2=a2;
	}


	String mostrarPresentacion()
	 { String pres;

	  pres = "    Presentacion \n\n"
	        +"  Realizado por: \n"
	 		+"Jeymar Herrera \n\n";
	 								  
	  return pres;
	 }


	 void ventasAlmacen()
	 {int f, c;
	 double cont=0;
		for(f=0; f<3; f++)
  	 	{ for(c=0; c<3; c++)
  	  		cont =cont +Matriz[f][c];
  	  	Arreglo1[f]=cont;
  	  	cont=0;
  	 	}
	 }



	 void ventasDepartamento()
	 {int f,c;
	 	double cont=0;
		for(f=0; f<3; f++)
  	 	{ for(c=0; c<3; c++)
  	  		cont =cont +Matriz[c][f];
  	  	Arreglo2[f]=cont;
  	  	cont=0;
  	 	}
	 }

	 double [][] imprimirMatriz()
	 {
	 	return Matriz;
	 }

	 double [] imprimirArreglo1()
	 {
	 	return Arreglo1;
	 }

	 double [] imprimirArreglo2()
	 {
	 	return Arreglo2;
	 }

}
class SistemaVentas
{public static void main(String args[]) throws IOException
{ int f,c, i;
  String opc, valor;
  double ventas;

  String opciones[] = {"Presentacion","Opcion 1","Opcion 2","Opcion 3","Opcion 4","Opcion 5","Opcion 6","Opcion 7","Opcion 8"};
  double matriz[][] = new double [3][3];
  double arreglo1[] = new double [3];
  double arreglo2[] = new double [3];


  Ventas obj = new Ventas();


  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);


  do
  {
  opc = (String) JOptionPane.showInputDialog(null,"									                        MENU						\n\n"
  																				  +"1.  Cargar matriz        				 										  \n"
    									 		  								  +"2.  Calcular ventas por almacen             				   			\n"
    									 		 								  +"3.  Calcular ventas por departamento           					 	\n"
																				  +"4. 	Imprimir matriz							   									\n"
																				  +"5.  Imprimir las ventas por almacen          				   		 \n"
    									 		 								  +"6.  imprimir las ventas por departamento         				 \n"
																				  +"7. 	Imprimir todos los resultados						   			   \n"
    									 		 								  +"8. Salir								 			 				  					 \n"
    									 		 								  +"Que opcion deseas ver?               				   					 \n"
  									     										    ,"MENU"
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

  case "Presentacion":

 ;  JOptionPane.showMessageDialog(null, obj.mostrarPresentacion()
	 								   		 					, "PRESENTACION"
	                                   		  					, JOptionPane.INFORMATION_MESSAGE);
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 1":
  System.out.println("\n Matriz Cargando...");
  try
  {
  for(f=0; f<3; f++)
  { for(c=0; c<3; c++)
  	 {
  	  		valor=JOptionPane.showInputDialog(null,"\nIngrese las ventas por departamento ...\n"
  	  																		  +"\nIngrese la venta "+(c)+","+(f)
  	  																		   ,"Entrada de Datos"
  	  																		   , JOptionPane.QUESTION_MESSAGE);

  			ventas = Double.parseDouble(valor);
			matriz[c][f] =ventas;
  	  }
  }
  JOptionPane.showMessageDialog(null,"\nSe ha ingresado todas las ventas!\n"
  																,"EXITO!"
  																,JOptionPane.WARNING_MESSAGE);

  obj = new Ventas(matriz, arreglo1, arreglo2);
 }
  catch (NumberFormatException e)
  {
  	JOptionPane.showMessageDialog(null,e
  																  ,"ERROR"
  																  ,JOptionPane.ERROR_MESSAGE);
  }

  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 2":
  System.out.println("\n Ventas por Almacen");

  obj.ventasAlmacen();

  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 3":
  System.out.println("\n Ventas por Departamento");

  obj.ventasDepartamento();

  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 4":
  System.out.println("\nImprimiedo Matriz...\n ");

   matriz=obj.imprimirMatriz();
   	for(f=0; f<3; f++)
  	 { for(c=0; c<3; c++)
  	  		System.out.print("["+matriz[f][c]+"]");
  	  	System.out.println("\n");
  	  }

  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 5":
  System.out.println("\nImprimiendo Arreglo 1\n ");
  arreglo1=obj.imprimirArreglo1();
  	for (i=0; i<3; i++)
		System.out.print(arreglo1[i]+" ");
  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 6":

  System.out.println("\nImprimiendo Arreglo 2 \n");
  arreglo2=obj.imprimirArreglo2();
  	for (i=0; i<3; i++)
		System.out.print(arreglo2[i]+" ");
  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 7":

  System.out.println("\nImprimiendo Resultados\n ");
  	i=0;
  	for(f=0; f<3; f++)
  	 { for(c=0; c<3; c++)
  	  		System.out.print(" "+matriz[f][c]+" ");
  	  	System.out.print("  "+arreglo1[i]+" ");
  	  	i++;
  	  	System.out.println("\n");
  	  }

		for (i=0; i<3; i++)
		System.out.print(" "+arreglo2[i]+" ");


  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "Opci�n 8":

  	System.out.println("\nSALIDA");
	JOptionPane.showMessageDialog(null,"\nHasta la proxima!\n"
  																 ,"DESPEDIDA"
  																 ,JOptionPane.WARNING_MESSAGE);

  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;

  case "DEFAULT":

	System.out.println("\nWARNING!");
	JOptionPane.showMessageDialog(null,"\nDebe salir con la opcion  8 del menu\n"
  																 ,"DEFAULT"
  																 ,JOptionPane.WARNING_MESSAGE);
  System.out.println("\n");
  System.out.println("_________________________________________________________________");
  break;


  }
  } while(opc != "Opcion 8");
}
}