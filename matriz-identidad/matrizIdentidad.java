/**Taller: La matriz identidad es aquella en que los elementos de su diagonal principal son la unidad y el resto es cero
 *invertigue si la matriz es identidad
 *1 0 0 0
 *0 1 0 0
 *0 0 1 0
 *0 0 0 1
 * @(#)tallerPractico2.java
 *
 *
 * @Jeymar Herrera
 * @2020/12/2
 */

import java.io.*;
class matriz
{ private int Matriz[][] = new int [4][4];

	matriz(int matriZ[][])
	{
	Matriz=matriZ;
	}

	String investigarIdentidad()
	{int f,c, cont=0;
	  String resultado ="";

	  for(f=0; f<4; f++)
		{ for(c=0; c<4; c++)
		   { if(f==c)
		     {
		   	 if(Matriz[f][c]==1)
		   	 		cont++;
		   	 }
		   }
		 }
		 if(cont==4)
		 	resultado="\n\tEs una matriz identidad\n";
		 else
		 	resultado="\n\tNo es una matriz identidad\n";
	return resultado;
	}

	int [][] imprimirMatriz()
	{
		return Matriz;
	}
}
class matrizIdentidad
{public static void main(String args[]) throws IOException
{ int f, c, entero;
  String valor;
  int matriz[][] = new int [4][4];

  matriz obj = new matriz(matriz);

	InputStreamReader isr = new InputStreamReader(System.in);
  	BufferedReader br = new BufferedReader(isr);

  	System.out.println("\nCargando Matriz de 4 x 4 ...\n");

  	for(f=0; f<4; f++)
  	 { for(c=0; c<4; c++)
  	  	{
  	  	System.out.println("\nIngrese los valores enteros: ");
  	  	valor=br.readLine();
  		entero = Integer.parseInt(valor);
		matriz[f][c] =entero;
  	  	}
  	  }

  	System.out.println("\n�Matriz cargada!\n");
  	obj = new matriz(matriz);

	System.out.println("\nInvestigando si es o no una matriz identidad...\n");
  	System.out.println(obj.investigarIdentidad());

  	matriz =obj.imprimirMatriz();

  	for(f=0; f<4; f++)
  	 { for(c=0; c<4; c++)
  	  		System.out.print("["+matriz[f][c]+"]");
  	  	System.out.println("\n");
  	  }
}
}