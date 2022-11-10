/** PROGRAMA QUE GENERA UN NUMERO, REDONDEA Y HACE CONVERSIONES EXPLICITAS
 * @(#)Ejem1O.java
 *2020/9/10
 */

class generarConversion //clase secundaria
{ double a; //atributo de la clase secundaria

	double aleatorio() //Metodo de la clase secundaria 1
	{
		a = (Math.random()*10); //valor del atributo
		return a; //retorno del valor a la variable  del main
	}
	double redoround() //Metodo de la clase secundaria 2
	{ double redo; //variable donde se almacenara el valor en el metodo
		redo = Math.round(a); // calculo de redondeo del valor del atributo
		return redo; // retorno del valor a la variable  del main
	}
}
 class conversiones //clase principal
 { public static void main(String args[]) //main
   { double z,b; // variables de almacenamiento de valores de retorno
   	 int c; // variable

   	 generarConversion obj = new generarConversion(); //creacion del objeto
   	 z = obj.aleatorio(); //mensaje al metodo y retorno de valor
   	 c = (int)z; //redondeo de la variable z
   	 b = obj.redoround(); //mensaje al metodo y retorno de valor


   	 System.out.println("\tPROGRAMA QUE GENERA UN NUMERO, REDONDEA Y HACE CONVERSIONES EXPLICITAS");
   	 System.out.println("\n\t\t Numero Generado = "+z);
   	 System.out.println("\n\t\t Numero Generado y Redondeado con Round = "+b);
   	 System.out.println("\n\t\t Numero Generado y Redondeado a Entero = "+c);
   }
}