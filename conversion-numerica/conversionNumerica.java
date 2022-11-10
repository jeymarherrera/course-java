 /**Haga los siguientes programas, aplicando men�, incluya dos clases, un objeto y metodos
 aplique constructores, manejo de excepciones, BufferedReader, JOption, constructores, atributos privados
 lea e imprima en el main para aplicar encapsulaci�n, aplique tambien polimorfismo**/
 /**
 * @(#)PROY5.java
 * @Jeymar Herrera / 20-70-5165
 * @2020/11/11 - Fecha de entrega
 */

//imports
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

//clase 2
class segundaClase
{ //atributos privados
  private int numR, num;

	//constructores
	segundaClase()
	{
	numR = (int)(Math.random()*9999);
	}


	segundaClase(int N)
	{
	 num=N;
	}


	 //metodos
	 String mostrarPresentacion()
	 { String pres;

	  pres = "	  				      Realizado por: \n"
	 								   +"                                Jeymar Herrera \n\n";

	  return pres;
	 }


	 int retornarAtributo()
	 { int nR;
	  nR=numR;
	  return nR;
	 }


	 String mostrarAlreves()
	 { int unidad, decena, centena, miles;
	   String nInvertido="";

	   unidad = numR%10;
	   decena = numR/10%10;
	   centena = numR/100%10;
	   miles = numR/1000;

	   if (numR >= 1000)
	   nInvertido=""+unidad+""+decena+""+centena+""+miles;
	   if (numR >=100 && numR <=999)
	   nInvertido=""+unidad+""+decena+""+centena+"";
	   if (numR >=10 && numR <=99)
	   nInvertido=""+unidad+""+decena+"";
	   if (numR < 10)
	   	nInvertido=""+unidad+"";
	  return nInvertido;
	 }


	 String convertirBinario()
	 { String nBinario;
	  nBinario=Integer.toBinaryString(num);
	  return nBinario;
	 }


	 String convertirOctal()
	 { String nOctal;
	  nOctal = Integer.toString(num,8); //Conversion a octal
	  return nOctal;
	 }


	 String convertirHexadecimal()
	 { String nHex;
	  nHex = Integer.toHexString(num); //Conversion a hexadecimal
	  return nHex;
	 }


	 String convertirRomano()
	 { int unidad, decena, centena;
	 String nRomano = "";
	 int i;

	 unidad = num % 10;
	 decena = (num / 10)%10;
	 centena = (num/100)%10;

	  //Valores centenas
      if (centena == 1)
      {
       nRomano = "C";
      }

      //Valores decenas
      if (decena == 9)
      {
       nRomano = nRomano + "XC";
      }
      else if (decena >= 5)
      {
       nRomano = nRomano + "L";
       for (i=6; i<=decena; i++)
      {
       nRomano = nRomano + "X";
      }
      }
      else if (decena == 4)
      {
       nRomano = nRomano + "XL";
      }
      else
      {
      for (i=1;i<=decena;i++)
      {
       nRomano = nRomano + "X";
      }
      }

      //Valores unidades
      if (unidad == 9)
      {
       nRomano = nRomano + "IX";
      }
      else if (unidad >= 5)
      {
       nRomano = nRomano + "V";
      for (i=6;i<= unidad;i++)
      {
       nRomano = nRomano + "I";
      }
      }
      else if (unidad == 4)
      {
       nRomano = nRomano + "IV";
      }
      else
      {
      for (i=1;i<= unidad;i++)
      {
       nRomano = nRomano + "I";
      }
      }
      return nRomano;
	 }

}

//clase 1
class conversionNumerica
{public static void main(String args[]) throws IOException //main
 { int opcion, numR, numI, salir, respuesta, cont=0;
   String resultado, numeroI, opc; //bloque de declarativas

 	resultado = "";
    numeroI = "";
 	segundaClase obj = new segundaClase(); //declaraci�n y creaci�n del objeto

 	//BufferedReader
 	InputStreamReader isr = new InputStreamReader(System.in);
   	BufferedReader br = new BufferedReader(isr);

	String[] opciones = { "Mostrar el numero al reves"
						, "Conversion a binario      "
						, "Conversion a octal        "
						, "Conversion a hexadecimal  "
						, "Conversion a romano       "
						};


	String botones[] = {  "1"
   						, "2"
   						, "3"
   						, "4"
   						, "5"
   						, "6"
   						, "0"
  				   	   };
	do
  	{
    opcion = JOptionPane.showOptionDialog(null
  									     ,"1.Presentacion                        \n"
  									     +"2.Generar numero y mostrarlo al reves \n"
  									     +"3.Convertir numero a binario          \n"
  									     +"4.Convertir numero a octal            \n"
  									     +"5.Convertir numero a hexadecimal      \n"
  									     +"6.Convertir numero a romano           \n"
  									     +"0.Salir                             \n\n"
  									     +"Que opcion deseas ver?               \n"
  									     ,"MENu"
  									     ,JOptionPane.YES_NO_OPTION
  									     ,JOptionPane.QUESTION_MESSAGE
  									     ,null
  									     ,botones
  									     ,"DEFAULT"
  									     );
  	switch(opcion)
  	{
  	 case 0:
  	 		ImageIcon icono = new ImageIcon("MyIcon.png");
	  		JOptionPane.showMessageDialog(null, obj.mostrarPresentacion()
	 								   		  , "PRESENTACIoN"
	                                   		  , JOptionPane.PLAIN_MESSAGE, icono);

  	 		break;

  	 case 1:
  	 		obj  =new segundaClase();
  	 		resultado = "Numero generado: "+obj.retornarAtributo()+" ---> "+"Numero al reves: "+obj.mostrarAlreves();
  	 		JOptionPane.showMessageDialog(null, resultado
  	 										  , "RESULTADO DEL N�MERO AL REV�S"
  	 										  , JOptionPane.WARNING_MESSAGE);
  	 		break;

  	 case 2:
  	 		try
  			{
  	 			do
  	 			{
  	 			numeroI = JOptionPane.showInputDialog(null, "Introduzca un valor entero de 0 al 100"
  	 												  	  , "INTRODUZCA NuMERO"
  	 													  , JOptionPane.QUESTION_MESSAGE);
  	 			numI = Integer.parseInt(numeroI);
  	 			}
  	 			while(numI < 0 || numI > 100);
  	 			obj = new segundaClase(numI);
				resultado = "N�mero ingresado: "+numI+" ---> "+"Numero en binario: "+obj.convertirBinario();
  	 			JOptionPane.showMessageDialog(null, resultado
  	 											  , "RESULTADO DE CONVERSIoN A BINARIO"
  	 											  , JOptionPane.WARNING_MESSAGE);
  	 		}
			catch(NumberFormatException e)
			{
				if (numeroI != null)
			 	{
			 	JOptionPane.showMessageDialog(null,"Recuerda que solo estamos trabajando con numeros"
       				  						   	  ,"ERROR!"
       				  						   	  ,JOptionPane.WARNING_MESSAGE);
			 	}
       		 	else
       		 	{
       		    JOptionPane.showMessageDialog(null,"Usted ha salido del programa"
       				  						   	  ,"ERROR!"
       				  						   	  ,JOptionPane.WARNING_MESSAGE);
       		 	}
			}
  	 		break;

  	 case 3:
  	 	    try
  			{
  	 			do
  	 			{
  	 			numeroI = JOptionPane.showInputDialog(null, "Introduzca un valor entero de 0 al 200"
  	 					 								  , "INTRODUZCA NuMERO"
  	 													  , JOptionPane.QUESTION_MESSAGE);
  	 			numI = Integer.parseInt(numeroI);
  	 			}
  	 			while (numI < 0 || numI > 200);
  	 			obj = new segundaClase(numI);
				resultado = "Numero ingresado: "+numI+" ---> "+"Numero en octal: "+obj.convertirOctal();
  	 			JOptionPane.showMessageDialog(null, resultado
  	 										      , "RESULTADO DE CONVERSIoN A OCTAL"
  	 										  	  , JOptionPane.WARNING_MESSAGE);
			}
			catch(NumberFormatException e)
			{
				if (numeroI != null)
			 	{
			 	JOptionPane.showMessageDialog(null,"Recuerda que solo estamos trabajando con numeros"
       				  						   	  ,"ERROR!"
       				  						   	  ,JOptionPane.WARNING_MESSAGE);
			 	}
       		 	else
       		 	{
       		    JOptionPane.showMessageDialog(null,"Usted ha salido del programa"
       				  						   	  ,"ERROR!"
       				  						   	  ,JOptionPane.WARNING_MESSAGE);
       		 	}
			}
  	 		break;

  	 case 4:
  	 	    try
  			{
  	 			do
  	 			{
  	 			numeroI = JOptionPane.showInputDialog(null, "Introduzca un valor entero de 0 a 255"
  	 												   	  , "INTRODUZCA NuMERO"
  	 													  , JOptionPane.QUESTION_MESSAGE);
  	 			numI = Integer.parseInt(numeroI);
  	 			}
  	 			while (numI < 0 || numI > 255);
  	 			obj = new segundaClase(numI);
				resultado = "Numero ingresado: "+numI+" ---> "+"Numero en hexadecimal: "+obj.convertirHexadecimal();
  	 			JOptionPane.showMessageDialog(null, resultado
  	 										 	  , "RESULTADO DE CONVERSIoN A HEXADECIMAL"
  	 										  	  , JOptionPane.WARNING_MESSAGE);
			}
			catch(NumberFormatException e)
			{
				if (numeroI != null)
			 	{
			 	JOptionPane.showMessageDialog(null,"Recuerda que solo estamos trabajando con numeros"
       				  						   	  ,"ERROR!"
       				  						   	  ,JOptionPane.WARNING_MESSAGE);
				}
       		 	else
       		 	{
       		    JOptionPane.showMessageDialog(null,"Usted ha salido del programa"
       				  						   	  ,"ERROR!"
       				  						   	  ,JOptionPane.WARNING_MESSAGE);
       		 	}
			}
  	 		break;

  	 case 5:
			try
  			{
  				cont=cont+1;
  	 			if (cont==1)
  	 			JOptionPane.showMessageDialog(null, "En este programa estaremos utilizando Buffered Reader \n"
  	 											  + "      Preparate para trabajar en la ventana del\n"
  	 											  + "            compilador de Java 'Build Output' "
  	 											  , "PROGRAMA CON BUFFERED READER"
  	 											  , JOptionPane.INFORMATION_MESSAGE);
  	 			do
  	 			{
  	 			System.out.println( "Introduzca un valor entero de 1 a 100");
  	 			numeroI = br.readLine();
  	 			numI = Integer.parseInt(numeroI);
  	 			}
  	 			while (numI < 1 || numI > 100);
  	 			obj = new segundaClase(numI);
				resultado = "Numero ingresado: "+numI+" ---> "+"Numero en romano: "+obj.convertirRomano();
  	 			JOptionPane.showMessageDialog(null, resultado
  	 											  , "RESULTADO DE CONVERSIoN A ROMANOS"
  	 											  , JOptionPane.WARNING_MESSAGE);
  			}
  			catch(NumberFormatException e)
			{

			 JOptionPane.showMessageDialog(null,"Recuerda que solo estamos trabajando con numeros"
       				  						   ,"ERROR!"
       				  						   ,JOptionPane.WARNING_MESSAGE);
			}
  	 		break;

  	 case 6:
  	 		salir = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas salir?"
  	 												  , "SALIR"
  	 												  , JOptionPane.YES_NO_OPTION
  	 												  , JOptionPane.QUESTION_MESSAGE);
  	 		if(salir == JOptionPane.YES_OPTION)
  	 		{
  	 		 JOptionPane.showMessageDialog(null, "     Gracias por usar el programa! \n"
  	 		 								   + " Antes de irte, quisiera saber tu opinion"
  	 		 								   , "HASTA LA PRoXIMA"
  	 		 								   , JOptionPane.WARNING_MESSAGE);

  	 		opc = (String) JOptionPane.showInputDialog(null, "Cual fue la opcion que mas te gusto?"
   														   , "OPINIoN"
   														   , JOptionPane.QUESTION_MESSAGE
   														   , null
   														   , opciones
   														   , opciones[0]);

			ImageIcon iconoB = new ImageIcon("like.png");
			if (opc != null)
			{
			JOptionPane.showMessageDialog(null, "La opcion: "
   									   + opc
   									   + "\nMe alegra que le haya gustado\n"
   									   + "    Su opinion es importante!"
   									   , "USTED ELIGIO..."
   									   , JOptionPane.WARNING_MESSAGE,iconoB);
			}
			else
			{
     		JOptionPane.showMessageDialog(null, "    Al parecer usted prefiere no dar su opinion \n"
   									   + "Sin embargo, me alegra que haya utilizado mi programa\n"
   									   , "USTED NO ELIGIO"
   									   , JOptionPane.WARNING_MESSAGE,iconoB);
   			}
  	 		System.exit(0);
  	 		}
  	 		break;

  	 default:
  	 		JOptionPane.showMessageDialog(null, "Si deseeas salir, debes dar uso a la opcion 0"
  	 										  , "ERROR"
  	 										  , JOptionPane.WARNING_MESSAGE);
  	 		break;

  	}
  	 respuesta = JOptionPane.showConfirmDialog(null, "Continuamos?"
  											 , "DESEAS SEGUIR?"
  											 , JOptionPane.YES_NO_OPTION
  											 , JOptionPane.QUESTION_MESSAGE);
  		   if(respuesta == JOptionPane.NO_OPTION)
  		   {
  		   	JOptionPane.showMessageDialog(null, "        Hasta la proxima experiencia en Java! \n"
  		   									  + "           Espero haya sido de su agrado,"
  		   									  +"\nme gustaria saber su opinion sobre los programas."
  		   									  , "FINALIZANDO..."
  		   									  , JOptionPane.WARNING_MESSAGE);
  		   }
    }
     while(respuesta == JOptionPane.YES_OPTION);
     opc = (String) JOptionPane.showInputDialog(null, "Note que decidiste no continuar, podrias hacerme saber...\n"
     												+ "Cual fue la opcion que menos te guste?"
   											        , "OPINIoN"
   													, JOptionPane.QUESTION_MESSAGE
   													, null
   													, opciones
   													, opciones[0]);
   	 if (opc != null)
   	 {
   	 ImageIcon iconoC = new ImageIcon("like.png");
     JOptionPane.showMessageDialog(null, "La opcion: "
   									   + opc
   									   + "\n      Gracias por tu opinion!\n"
   									   + "    Intentare seguir mejorando"
   									   , "USTED ELIGIO..."
   									   , JOptionPane.WARNING_MESSAGE, iconoC);
   	 }
	 else
	 {
	  ImageIcon iconoD = new ImageIcon("like.png");
	  JOptionPane.showMessageDialog(null, "      Al parecer usted prefiere no dar su opinion \n"
   										   + "Sin embargo, me alegra que haya utilizado mi programa\n"
   										   , "USTED NO ELIGIO"
   										   , JOptionPane.WARNING_MESSAGE,iconoD);
	 }
}
}