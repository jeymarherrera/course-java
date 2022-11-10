/**Taller: Haga un programa si se tiene una matriz cuadrada (n x n) de 25 elementos enteros e imprima
 *los elemento que conforman sus dos diagonales
 * @(#)tallerPractico3.java
 *
 *
 * @Jeymar Herrera
 * @2020/12/2
 */
import java.io.*;
class matriz
{ private int Matriz[][] = new int [5][5];

	matriz(int matriZ[][])
	{
	Matriz=matriZ;
	}


	int [][] imprimirMatriz()
	{
		return Matriz;
	}
}
class diagonalesMatriz
{public static void main(String args[]) throws IOException
{int f, c, entero, i;
  String valor;
  int matriz[][] = new int [5][5];

  matriz obj = new matriz(matriz);

	InputStreamReader isr = new InputStreamReader(System.in);
  	BufferedReader br = new BufferedReader(isr);


  	System.out.println("\nCargando Matriz de 5 x 5 ...\n");
  	for(f=0; f<5; f++)
  	 { for(c=0; c<5; c++)
  	  	{
  	  	System.out.println("\nIngrese los valores enteros: ");
  	  	valor =br.readLine();
  		entero = Integer.parseInt(valor);
		matriz[f][c] =entero;
  	  	}
  	  }


  	System.out.println("\nMatriz cargada!\n");
  	obj = new matriz(matriz);


  	matriz = obj.imprimirMatriz();
  	System.out.println("\nMatriz Completa\n");
	for(f=0; f<5; f++)
  	 { for(c=0; c<5; c++)
  	  		System.out.print("["+matriz[f][c]+"]");
  	  	System.out.println("\n");
  	  }


  	System.out.println("\n\nDiagonal Principal");
	for(f=0; f<5; f++)
  	 { for(c=0; c<5; c++)
  	 	{ if(f==c)
  	 	  	System.out.print("["+matriz[f][c]+"]");
  	 	}
  	  }


  	System.out.println("\n\nDiagonal Secundaria");
	i=4;
	for(f=0; f<5; f++)
  	 { for(c=0; c<5; c++)
  	 	{ if(f==c)
  	 	  {
  	 	  System.out.print("["+matriz[f][i]+"]");
  	 	  i--;
  	 	  }
  	 	}
  	 }

}
}