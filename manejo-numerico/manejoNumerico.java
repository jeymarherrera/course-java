/**@(#)PROY3.java - PROYECTO 3
 *
 *Haga siguientes programas,EN UN MENU aplicando dos clases un objeto y  m�todos, aplique constructores, atributos privados
 *lea e imprima solo en el main para aplicar encapsulaci�n, aplique tambi�n polimorfismo.
 *
 *@Jeymar Herrera/Pablo Lizana
 * @2020/10/20
 */
import java.io.*;
import javax.swing.JOptionPane;

class MENU//Clase 2
{ //Atributos privados
   private int numA;

	MENU(int num)//Constructor
	{
	numA=num;
	}


	String paginaPresentacion () //M�todo 1: Opci�n 1
	{ String pres;
		 pres="\t\t*******************************************************\n\n"
	 			+"\n\n\t\t\t\t\t\t\tPROYECTO No 3"
				+"\n\t\t\t\t\tJEYMAR HERRERA"
			    +"\n\n\n\t\t*******************************************************\n";
		return pres;
	}


	String investigarCapicua() //M�todo 2: Opci�n 2
	{ String r;
	 int unidad, decena, centena;

      unidad = numA % 10;
      decena = numA / 10;
      centena = (numA/100)%10;

	 	if(unidad == centena)
        {
        r="Es capicua";
        }
        else
        {
        r="No es capicua";
        }
	 	return r;
	}



	int generarSuma() //M�todo 3: Opci�n 3
	{int sumaD;

	 sumaD = 0;
	 while(numA!=0)
	 {
	  sumaD = sumaD + (numA % 10);
	  numA = (numA/10);
	 }
	 return sumaD;
	}



	int calcHora() //M�todo 4: Opci�n 4
	{ int minuto;

	 minuto=numA+1;
	 return minuto;
	}



	String generarNum() //M�todo 5: Opci�n 5
	{int unidad, decena;
	 String u = "", d = "", d2 = "",r="";

	 unidad = numA % 10; //residuo
     decena = numA / 10; //cociente

	//Valores unidades
    if (unidad == 0)
      u = u + "Cero";
    if (unidad == 1)
      u = u + "uno";
    if (unidad == 2)
      u = u + "dos";
    if (unidad == 3)
      u = u + "tres";
    if (unidad == 4)
      u = u + "cuatro";
    if (unidad == 5)
      u = u + "cinco";
    if (unidad == 6)
      u = u + "seis";
    if (unidad == 7)
      u = u + "siete";
    if (unidad == 8)
      u = u + "ocho";
    if (unidad == 9)
      u = u + "nueve";
	//Valores decenas
    if (decena == 1 && unidad == 0)
       d = "Diez";
    if (decena == 1 && unidad == 1)
       d = "Once";
    if (decena == 1 && unidad == 2)
       d = "Doce";
    if (decena == 1 && unidad == 3)
       d = "Trece";
    if (decena == 1 && unidad == 4)
       d =  "Catorce";
    if (decena == 1 && unidad == 5)
       d = "Quince";
    if (decena == 1 && unidad == 6)
       d = "Dieciseis";
    if (decena == 1 && unidad == 7)
       d = "Diecisiete";
    if (decena == 1 && unidad == 8)
       d = "Dieciocho";
     if (decena == 1 && unidad == 9)
       d = "Diecinueve";

    if (decena == 2)
      d2 = d2 + "Veinte";
    if(decena == 3)
      d2 = d2 +  "Treinta";
    if(decena == 4)
      d2 = d2 +  "Cuarenta";
    if(decena == 5)
      d2 = d2 +  "Cincuenta";
    if(decena == 6)
      d2 = d2 +  "Sesenta";
    if(decena == 7)
      d2 = d2 +  "Setenta";
    if(decena == 8)
      d2 = d2 +  "Ochenta";
    if(decena == 9)
      d2 = d2 +  "Noventa";

    if (numA < 10)
    r=u;
    else if(numA < 20)
    r=d;
    else if(numA < 100)
    {
    if (numA % 10 == 0)
    {
    r=d2;
    }
    else
    {
    r=d2+" y "+u;
    }
    }
    return r;
	}



	String generarRomano() //M�todo 6: Opci�n 8
	{int unidad, decena, centena;
	 String nRomano = "";
	 int i;

	unidad = numA % 10;
	decena = (numA / 10)%10;
	centena = (numA/100)%10;

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

class manejoNumerico //clase 1
{public static void main(String args[]) throws IOException
 { String opcion, nEntero, caracterIn;
 	int opc, nEnt, digito, hora, minutos, nMax, i, numCua, a, b,num;
 	char control, caracter;
 	MENU obj; //Declaracion del objeto

	control=1;

 	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr); //BufferedReader



		obj=new MENU(0);//creci�n del objeto;

		JOptionPane.showMessageDialog(null,"        Hola! como estas? \n en este programa encontraras \n      8 opciones para probar!"
										  ,"Bienvenidos",JOptionPane.INFORMATION_MESSAGE);

		while (control == 1)
		{

		 System.out.println("\n\t            ****************MENu***************");
    	 System.out.println("\n\t\t            1. PRESENTACIoN");
    	 System.out.println("\n\t\t            2. NuMERO CAPICuA");
    	 System.out.println("\n\t\t            3. GENERAR 3 DIGITOS Y SUMARLOS");
    	 System.out.println("\n\t\t            4. HORA Y MINUTOS");
    	 System.out.println("\n\t\t            5. NuMEROS ALFABETICOS");
    	 System.out.println("\n\t\t            6. MOSTRAR NuMEROS");
    	 System.out.println("\n\t\t            7. DIBUJAR CUADRADO");
    	 System.out.println("\n\t\t            8. NuMEROS ROMANOS");
    	 System.out.println("\n\t\t            9. SALIR");
    	 System.out.println("\n\t            ************************************");
    	 System.out.println("\n ELIJA LA OPCIoN QUE DESEE VER");

		opcion=br.readLine();
		opc=Integer.parseInt(opcion);

	 	switch(opc)
			{
			case 1://Opci�n 1: P�gina de Presentaci�n
				System.out.println(obj.paginaPresentacion());
				break;

			case 2://Opci�n 2: N�mero Capic�a
			   do
			   	{
				 nEntero=JOptionPane.showInputDialog(null, "                OPCIoN 2 \n"
			    	+"INGRESE UN N�MERO DE 3 DIGITOS \n"
			    	,"PROGRAMA CON JOPTION" ,JOptionPane.QUESTION_MESSAGE); //JOption 1
				nEnt=Integer.parseInt(nEntero);
				obj = new MENU(nEnt);
				}
				while(nEnt != 000 && nEnt < 100 || nEnt > 999 );
				if (nEnt == 0)
				JOptionPane.showMessageDialog(null," USTED ACABA DE INGRESAR \n                    '000' \n" ,"ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
				else
				System.out.println("\n\n*******************************************************"
									+"\n\t\t              OPCI�N 2                             "
									+"\n*******************************************************\n"
									+"                    "+nEntero+" "+obj.investigarCapicua()
									+"\n*******************************************************\n\n");
				break;

			case 3://Opci�n 3: Generar n�mero de 3 digitos y sumarlos
		    	System.out.println("\n\n*******************************************************");
				System.out.println("\t\t                  OPCI�N 3                             ");
				System.out.println("*******************************************************\n");
		    	digito = (int)(Math.random()*899+100);
		    	System.out.println("Generando un n�mero de 3 d�gitos... "+digito);
		    	obj = new MENU(digito);
		    	System.out.println("La suma de los digitos del numero "+digito+" es igual a "+obj.generarSuma());
		    	System.out.println("\n*******************************************************\n\n");
				break;

			case 4://Opci�n 4: Formato hora, minutos. Mostrar minuto siguiente
				System.out.println("\n\n*******************************************************");
				System.out.println("\t\t                  OPCI�N 4                             ");
				System.out.println("*******************************************************\n");
				System.out.println("Generando hora...");
			    hora= (int)(Math.random()*23+1);
	            minutos= (int)(Math.random()*60);
	            obj = new MENU(minutos);
	            if(minutos<9)
				System.out.println("La hora es "+hora+":0"+minutos+" un minuto m�s tarde ser�an las "+hora+":0"+obj.calcHora());
	            else
			    System.out.println("La hora es "+hora+":"+minutos+" un minuto m�s tarde ser�an las "+hora+":"+obj.calcHora());
				System.out.println("\n*******************************************************\n\n");
				break;

			case 5://Opci�n 5: Generar n�mero del 0 al 99
				System.out.println("\n\n*******************************************************");
				System.out.println("\t\t                  OPCI�N 5                             ");
				System.out.println("*******************************************************\n");
				num= (int)(Math.random()*99);
				obj = new MENU(num);
				System.out.println("\t\t\t\t"+num+" - "+obj.generarNum());
				System.out.println("\n*******************************************************\n\n");
				break;

			case 6://Opci�n 6: Mostrar n�meros del 1 al m�ximo generado
				System.out.println("\n\n*******************************************************");
				System.out.println("\t\t                  OPCI�N 6                             ");
				System.out.println("*******************************************************\n");
				nMax=(int)(Math.random()*49+1);
				System.out.println("\nN�meros del 1 al "+nMax+": ");
				for (i=1; i <=nMax; i++)
				{
				System.out.println(i);
				}
				System.out.println("\n*******************************************************\n\n");
				break;

			case 7://Opci�n 7: Generar n�mero y realizar un cuadrado con el caracter ingresado
			    System.out.println("\n\n*******************************************************");
				System.out.println("\t\t                  OPCI�N 7                             ");
				System.out.println("*******************************************************\n");
				numCua = (int)(Math.random()*8+1);
				System.out.println("INGRESE EL CARACTER QUE DESEA USAR");
				caracterIn = br.readLine();
    		    caracter = caracterIn.charAt(0);
				System.out.println("\nUn cuadrado de '"+caracter+"' con un valor de "+numCua+" es: ");
				for(a=1;a<=numCua; a++)
				{
				System.out.print("\n\t\t\t\t");
				for(b=1;b<=numCua ;b++)
				{
				System.out.print(caracter);
				}
				}
				System.out.println("\n\n*******************************************************\n\n");
				break;

			case 8://Opci�n 8: Generar n�meros del 1 al 100 y asignarle el valor en n�meros romanos
				System.out.println("\n\n*******************************************************");
				System.out.println("\t\t                  OPCI�N 8                             ");
				System.out.println("*******************************************************\n");
     		    for (i=1; i <=100; i++)
				{
				obj = new MENU(i);
				System.out.println(i+ " = " + obj.generarRomano());
				}
				System.out.println("\n*******************************************************\n\n");
				break;

			case 9://Opci�n 9: Salida
				System.out.println("\n\n*******************************************************");
				System.out.println("\t\t                SALIENDO...                            ");
				System.out.println("*******************************************************\n");
				control=0;
				break;

			default:
				System.out.println("\n\n*******************************************************");
				System.out.println("\n\t\t        **N�MERO FUERA DE RANGO**");
				System.out.println("\n\t\t         ELIJA UNA OPCI�N V�LIDA");
				System.out.println("\n*******************************************************\n\n");
				break;
			}
		}JOptionPane.showMessageDialog(null,"\t                                   �Adi�s!        "
    		    									+"\n            Gracias por usar nuestro programa          "
    		    									+"\n                              �Vuelva pronto!     "
    		    									,"Despedida"
    		    									,JOptionPane.PLAIN_MESSAGE); //JOption 3
 }
}
