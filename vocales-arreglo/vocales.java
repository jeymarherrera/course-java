/**Cargar un arreglo ABC con las letras de nombre, m�ximo 15 elementos,
 *copiar el vector en otro llamado DEF y encontrar cuales vocales tiene y cuantas veces se repite cada una
 * @(#)lab25.java
 * @Jeymar Herrera
 * @2020/11/17
 */
import java.io.*;
class arreglo
{
	private char vec[] = new char[15];
	private int cont=0;

	arreglo(char[]DEF) //constructor
	{
		vec = DEF;
	}


	String contarVocales()
	{
		int i;
		int contA=0,contE=0,contI=0,contO=0,contU=0;
		String resultado;

		for(i=0; i<vec.length; i++)
        {
        	if(vec[i] == 'a')
        	{
        		cont++;
        		contA++;
        	}
	        	else if(vec[i] =='e')
	        	{
	        		cont++;
	        		contE++;
	        	}
		        	else if(vec[i] == 'i')
		        	{
		        		cont++;
		        		contI++;
		        	}
		        		else if(vec[i] == 'o')
		        		{
		        			cont++;
		        			contO++;
		        		}
			        		else if(vec[i] == 'u')
			        		{
			        			cont++;
			        			contU++;
			        		}
        }
        resultado = ("\nSe encontraron "+contA+" 'a'"
        		 	+"\nSe encontraron "+contE+" 'e'"
        		 	+"\nSe encontraron "+contI+" 'i'"
        		 	+"\nSe encontraron "+contO+" 'o'"
        		  	+"\nSe encontraron "+contU+" 'u'"
        		 	+"\nEl total de vocales encontradas fueron:  "+cont);
        return resultado;
	}
}

class vocales
{public static void main(String[] args)
    {	int i;
        char ABC[] = {'P','a','b','l','o',' ','J','e','y','m','a','r'};
    	char DEF[] = ABC;

    	arreglo obj = new arreglo(DEF);//objeto

		System.out.print("\n\t\t Arreglos con letra de nombres ");

    	System.out.print("\n\nArreglo ABC: ");
        for(i=0;i<ABC.length;i++)
        {
        	System.out.print(ABC[i]);
        }


        System.out.print("\n\nArreglo DEF: ");
        for(i=0;i<DEF.length;i++)
        {
        	System.out.print(DEF[i]);
        }
        System.out.println("\n");

       	System.out.println(obj.contarVocales());
    }
}
