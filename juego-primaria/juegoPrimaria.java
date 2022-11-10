/**
 * @(#)ProyJuego.java
 *
 * ProyJuego application
 *
 * Jeymar Herrera
 * @ 2020/10/22
 */
import java.io.*;
import javax.swing.JOptionPane;

class calculos
{
	int ran1,ran2;

	  calculos(int num1,int num2)
	  {
	  	ran1 = num1;
	  	ran2 = num2;
	  }

	  int suma()
	  {
	  	int res;
	  	res = ran1+ran2;
	  	return res;
	  }

}
class juegoPrimaria
{

    public static void main(String[] args)
    {
    	String nombre,opc,opcnum,edad;
    	int opcion,num1,num2,opcnumInt,resp,edadInt,control=1;

    	InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr); //BufferedReader

	    calculos obj; //declaracion del objeto



		do
		{
		nombre = JOptionPane.showInputDialog (null, "             Hola amiguit@! Hoy sere tu tutor \n                     Cual es tu nombre?    ", "Bienvenido(a)!",JOptionPane.PLAIN_MESSAGE);
    	edad = JOptionPane.showInputDialog (null,"                     Cual es tu edad? ", "Bienvenido(a)!",JOptionPane.PLAIN_MESSAGE);
		edadInt = Integer.parseInt(edad);
		}
		while(edadInt < 1 || edadInt > 6);



    	while (control == 1)
    	{

	    opc = JOptionPane.showInputDialog (null," ************************************** \n\t\t1. Juego \n\t\t2. Salir \n **************************************"
	    									   ,"Menu",JOptionPane.INFORMATION_MESSAGE);
	    opcion = Integer.parseInt(opc);

	    	switch(opcion)
	    	{

	    		case 1:

	    			num1 = (int)(Math.random()*9+1);
	    			num2 = (int)(Math.random()*9+1);

	    			obj = new calculos(num1,num2);

					try
				    {
		    	 	opcnum = JOptionPane.showInputDialog (null, "Ok "+nombre+"\n Cuanto es "+num1+" + "+num2+"? ", "PREGUNTA",JOptionPane.QUESTION_MESSAGE);
					opcnumInt = Integer.parseInt(opcnum);

					 resp = obj.suma();
					 if (resp==opcnumInt)
		    	 	 {
		    	 	 JOptionPane.showMessageDialog(null,"                         MUY BIEN "+nombre
		    	 	                            	+"! \n              Eres todo un geni@"
		    	 	                            	+" \n                      FELICIDADES! "
		    	 	 	                        	,"GANASTE!",JOptionPane.PLAIN_MESSAGE);
		    	 	 }
		    	 	 else if (resp != opcnumInt)
		    	 	 {
		    	 	 JOptionPane.showMessageDialog(null,"                          Lo sentimos! "+nombre
		    	 	 							   +", \n           Te has equivocado, la respuesta era: "+resp
		    	 	 							   +"\n                Vuelve a intentarlo, tu puedes!","Perdiste D:",JOptionPane.PLAIN_MESSAGE);
		    	 	 }
					 else
					 {
					 throw new NumberFormatException();
					 }
				    }
				    catch(NumberFormatException e) //Excepcion String-Numeric
   					 {
       				  JOptionPane.showMessageDialog(null,"                                  Upss!  Lo siento, "+nombre
       				  								+" \n              Al parecer ingresaste letras en lugar de numeros"
       				  								+"\n                 Vuelve a intentarlo que lo conseguiras!","HUBO UN ERROR ",JOptionPane.WARNING_MESSAGE);
   					 }

		    	 	break;

	    	 	case 2:
	    	 		control = 0;
	    	 	break;

	    	 	default:
	    	 		JOptionPane.showMessageDialog(null,"                      Nos disculpamos, aun no tenemos esa opcion"
	    	 			+"\n pero, puedes eligir la opcion 1 para jugar y la opcion 2 para salir","LO SENTIMOS",JOptionPane.ERROR_MESSAGE);
	    	 	break;
	    	}
        }
       JOptionPane.showMessageDialog(null,"                                  Adios "+nombre+"!"
       	+"                    \n      Espero que la hayas pasado muy bien "
       	+"\n                             Vuelve pronto!","Despedida",JOptionPane.PLAIN_MESSAGE);
    }
}
