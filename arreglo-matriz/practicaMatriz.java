/**Carga de matrices
 * @(#)practicaMatriz.java
 *
 *
 * @author
 * @version 1.00 2020/11/21
 */

import java.io.*;
class M
{private int Matriz[][] = new int [3][3]; //Atributo privado; matriz

	M(int matrizz[][]) //constructor
	{
	 Matriz=matrizz;
	}


	String metodoCadena()
	{ int j, k;
	  String cadena = "";
	  for(j=0; j<3; j++)
	  {
	  	for(k=0; k<3; k++)
	  		cadena = cadena + Matriz[j][k];
	  }
	  return cadena;
	}
}
class practicaMatriz
{public static void main(String args[]) throws IOException
{ int n,r=0,m=6,i,j,k;
  char respuesta;
  String Cadena;

  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);

  int matriz[][] = new int [][] {{10,20,30},{40,50,60},{70,80,90},};
  int matriZ[][] = new int [3][3];
  M obj;

  do
  {
  	System.out.println("\nCargar matriz de 9 elementos cargada\n\n");
  	for(i=0; i<3; i++)
  	 {
  	  for(k=0; k<3; k++)
  	  { System.out.println("\nIngrese un valor: ");
  	  	n = Integer.parseInt(br.readLine());
  	  	matriZ[i][k]=n;
  	  }

  	}
  	System.out.println("\nMatriz cargada...\n\n");
  	obj = new M(matriZ);

  	System.out.println("\n¿Deseas ver la matriz? s/n \n\n");
  	Cadena = br.readLine();
  	respuesta = Cadena.charAt(0);
  	if (respuesta == 's')
  	{ System.out.println("\nLa matriz es \n\n\n");
  	  for(j=0; j<3; j++)
  	  {
  	  	for(k=0; k<3; k++)
  	  		System.out.print(matriZ	[j][k]+"\t");
  	  	System.out.println("\n");
  	  }
  	}
  } while (respuesta == 's');

  System.out.println("\nTrabajando con la siguiente matriz de valores fijos\n\n");



  do
  {
  	System.out.println("\nMatriz de 9 elementos cargada\n\n");
  	System.out.println("\nMatriz cargada...\n\n");
  	obj = new M(matriz);

  	System.out.println("\n¿Deseas ver la matriz? s/n \n\n");
  	Cadena = br.readLine();
  	respuesta = Cadena.charAt(0);
  	if (respuesta == 's')
  	{ System.out.println("\nLa matriz es \n\n\n");
  	  for(j=0; j<3; j++)
  	  {
  	  	for(k=0; k<3; k++)
  	  		System.out.print(matriz[j][k]+"\t");
  	  	System.out.println("\n");
  	  }

  	  //Otra forma de imprimir la matriz
  	  Cadena = obj.metodoCadena();
  	  System.out.println("\n\nLa otra forma de imprimir la matriz\n\n\n");
  	  for(j=0; j<18; j++)
  	  {
  	  	r++;
  	  	respuesta = Cadena.charAt(j);
  	  	System.out.print(respuesta);
  	  	if(j%2!=0)
  	  		System.out.print("\t");
  	  	if(r==m)
  	  	{
  	  	 m=m+6;
  	  	 System.out.println("\n");
  	  	}
  	  }
  	}
  		System.out.println("\n\n\t¿Deseas continuar? s/n :");
  		Cadena = br.readLine();
  		respuesta = Cadena.charAt(0);
  	} while (respuesta == 's');
  	  System.out.println("\n\n¡Hasta luego!\n\n");
  }
}
