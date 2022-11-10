/**PROYECTO 7: Haga un programa con 2 clases, objeto, metodos, manejo de excepciones, JOption, BufferedReader, constructor, polimorfismo, encapsulamiento
 *Diseee un menu con las siguientes opciones, cada opci�n del men� es un m�todo
 *MENu
 *1. Cargar un arreglo de una dimension de 25 elementos m�ximo llamado Arr
 *2. Cargar una matriz Mat por fila con los elementos del arreglo Arr
 *3. Imprimir la matriz Mat
 *4. Cargar un arreglo Arr2 de 5 elementos
 *5. Imprimir el arreglo Arr y Arr2
 *6. Buscar si Arr2 se encuentra en Mat en alguna fila o columna
 *7. Intercambie los elementos de las diagonales de Mat
 *8. Salir
 * @(#)PROY7.java
 * @Jeymar Herrera
 * @2020/12/01
 */

 //imports
 import java.io.*;
 import javax.swing.JOptionPane;
 import javax.swing.ImageIcon;
 
 class arregloMatriz
 { //Atributos privados
     private char Arr[] = new char [25]; //Arreglo Arr
     private char Mat[][] = new char [5][5]; // matriz
     private char Arr2[] = new char [5]; //Arreglo Arr2
 
     //constructores
     arregloMatriz()
     {
 
     }
 
     arregloMatriz(char arr[], char mat[][], char arr2[])
     {
       Arr=arr;
       Mat=mat;
       Arr2=arr2;
     }
 
 
     //METODOS
     //metodo 1: presentaci�n
     String mostrarPresentacion()
      { String pres;
 
       pres = "	  				                                         Presentacion \n\n"
                                         +"                                   Realizado por: \n"
                                         +"                                Jeymar Herrera \n\n";
 
       return pres;
      }
 
     //metodo 2: Cargar arreglo
     char [] cargarArreglo(String Datos, int Tamano)
     { int i;
       char D;
           //inicializando arreglo
           for(i=0; i<25; i++)
         {
             Arr[i] = ' ';
         }
         //cargando arreglo
         for(i=0; i<Tamano; i++)
         {
             D=Datos.charAt(i);
             Arr[i] = D;
         }
      return Arr;
     }
 
 
     //metodo 3: Cargando matriz
     char [][] cargarMatriz()
     { int f,c, i=0, j=0;
 
      //cargando matriz
       for(f=0; f<5; f++)
       {for(c=0; c<5; c++)
           {
            Mat[f][c] = Arr[i];
             i++;
         }
       }
      return Mat;
     }
 
 
   //metodo 4: imprimiendo matriz
     char [][] imprimirMatriz()
     {
     return Mat;
     }
 
     //metodo 5: cargando segundo arreglo
     char [] cargarSegundo(String Palabra)
     { int i;
       char P;
           //inicializando el arreglo
     /**  	for(i=0; i<5; i++)
             Arr2[i] = ' '; **/
         //cargando el arreglo
         for(i=0; i<Palabra.length(); i++)
         {
             P=Palabra.charAt(i);
             Arr2[i] = P;
         }
      return Arr2;
     }
 
     //metodo 6: buscando palabra
     String buscarPalabra()
     { int f,c;
       String palabra="";
 
     //recorriendo la matriz Mat
     for(f=0; f<Mat.length; f++)
     { for(c=0; c<Arr2.length; c++)
      { //recorriendo el arreglo 2
          if(Arr2[c]==Mat[f][c])
          {
          palabra="Palabra encontrada en la matriz";
          }
          else
          {
          palabra="Palabra no encontrada en la matriz";
          }
      }
     }
     return palabra;
     }
 
     //metodo 7: intercambiando diagonales
     char [][] intercambiarDiagonales()
     { int f,c, i=4;
       char aux;
 
         for(f=0; f<5; f++)
          {for(c=0; c<5; c++)
            { if(f==c)
              {
                 aux= Mat[f][i];
              Mat[f][i] = Mat[f][c];
              Mat[f][c]=aux;
                 i--;
            }
            }
          }
     return Mat;
     }
 
 
 }
 
 class ArreglosMatrices
 {public static void main (String args[]) throws IOException
 {   //declaracion de variables
     String opc, datos, res,cadena;
     int i,f,c,x,tamano;
 
     //Arreglos y Matriz
     String opciones[] = {"Presentacion","Opcion 1","Opcion 2","Opcion 3","Opcion 4","Opcion 5","Opcion 6","Opcion 7","Opcion 8"};
     char arr[] = new char [25];
     char mat[][] = new char [5][5];
     char arr2[] = new char [5];
 
      //declaracion del objeto
       arregloMatriz obj = new arregloMatriz();
 
       //Buffered Reader
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
 
     //menu
     do
       {
       opc = (String) JOptionPane.showInputDialog(null,"									                                   PROYECTO No 7							\n\n"
                                                                                     +"1. Cargar el arreglo 1 ''Arr''              				 							    \n"
                                                                                     +"2. Cargar matriz ''Mat''       				 				 							     \n"
                                                                                      +"3. Imprimir matriz ''Mat''                 				   								   \n"
                                                                                     +"4. Cargar arreglo 2 ''Arr2''               												    \n"
                                                                                   +"5. Imprimir arreglo 1 ''Arr'' y arreglo 2 ''Arr2''								   \n"
                                                                                     +"6. Buscar arreglo 2 ''Arr2'' en la matriz ''Mat''      							  \n"
                                                                                     +"7. Intercambiar elementos de las diagonales de la matriz ''Mat''  \n"
                                                                                     +"8. Salir								 			 				  								 \n"
                                                                                     +"Que opcion deseas ver?               				   								  \n"
                                                                                        ,"MENi"
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
     case "Presentacion":
                ImageIcon iconoU = new ImageIcon("MyIcon.png");
               JOptionPane.showMessageDialog(null, obj.mostrarPresentacion()
                                                   , "PRESENTACIoN"
                                                  , JOptionPane.PLAIN_MESSAGE, iconoU);
         System.out.println("\n");
         System.out.println("_________________________________________________________________");
             break;
 
     //opcion cargar arreglo1
 
     case "Opcion 1":
            try
            {
             System.out.println();
             obj = new arregloMatriz(arr,mat,arr2);
             cadena="";
        do
        {
         tamano=0;
         datos = JOptionPane.showInputDialog(null,"\n\tINGRESE LOS CARaCTERES QUE DESEA CARGAR EN EL ARREGLO 1 \n\t\t  *Recuerde que el maximo son 25*"
                                                                                    ,"Entrada de Datos"
                                                                                    , JOptionPane.QUESTION_MESSAGE);
 
         JOptionPane.showMessageDialog(null,"La palabra es de "+datos.length()+" caracteres \n"
                                                                   ,"ADVERTENCIA"
                                                                   ,JOptionPane.WARNING_MESSAGE);
         cadena += datos;
         tamano=cadena.length();
         JOptionPane.showMessageDialog(null,"Disponibilidad de insercion: "+(25-tamano)
                                                                   ,"ADVERTECIA"
                                                                   ,JOptionPane.WARNING_MESSAGE);
         }	while (tamano <25 );
 
         obj.cargarArreglo(cadena, tamano);
 
         for (i=0; i<tamano; i++)
         {
             System.out.print("["+arr[i]+"]");
         }
         System.out.println("\n");
         System.out.println("_________________________________________________________________");
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
              JOptionPane.showMessageDialog(null,"\nHas excedido el limite, recuerda que son solo 25 elementos"
                                                                              , "ERROR!"
                                                                             , JOptionPane.ERROR_MESSAGE);
            }
            catch (StringIndexOutOfBoundsException e)
            {
               JOptionPane.showMessageDialog(null,"\nNo has insertado ningun caracter"
                                                                               , "ERROR!"
                                                                              , JOptionPane.ERROR_MESSAGE);
           }
         break;
 
     //opcion cargar matriz
        case "Opcion 2":
 
         mat = obj.cargarMatriz();
         JOptionPane.showMessageDialog(null,"\nCarga realizada correctamente"
                                                  , "EXITO!"
                                                 , JOptionPane.INFORMATION_MESSAGE);
          System.out.println("\n\tMatriz cargada");
          System.out.println("\n");
          System.out.println("_________________________________________________________________");
         break;
 
     //opcion imprimir matriz
     case "Opcion 3":
 
         mat=obj.imprimirMatriz();
         for(f=0; f<5; f++)
               {for(c=0; c<5; c++)
                 System.out.print("["+mat[f][c]+"]"+"\t");
         System.out.println("\n");
               }
 
         JOptionPane.showMessageDialog(null,"\nSe ha imprimido la matriz correctamente"
                                                                            , "EXITO!"
                                                                          , JOptionPane.INFORMATION_MESSAGE);
 
           System.out.println("\n");
         System.out.println("_________________________________________________________________");
         break;
 
      //opcion cargar arreglo 2
      case "Opci�n 4":
         try
         {
             do
             {
                 datos=JOptionPane.showInputDialog(null,"\n\tINGRESE LOS CARACTERES CON LOS QUE DESEA CARGAR EL ARREGLO 2 \n"
                                                                                   +"\n\t\t   *Recuerde que el maximo de caracteres son 5*"
                                                                                    ,"Entrada de Datos"
                                                                                    , JOptionPane.QUESTION_MESSAGE);
                 tamano=datos.length();
             } 	while ( tamano < 0 && tamano > 5);
             obj = new arregloMatriz(arr,mat,arr2);
             arr2=obj.cargarSegundo(datos);
 
             JOptionPane.showMessageDialog(null,"\nSe ha cargado el arreglo correctamente"
                                                                                , "EXITO!"
                                                                               , JOptionPane.INFORMATION_MESSAGE);
             System.out.println("\n");
             System.out.println("_________________________________________________________________");
         }
         catch (ArrayIndexOutOfBoundsException e)
            {
                      JOptionPane.showMessageDialog(null,"\nHas excedido el limite, recuerda que son solo 25 elementos"
                                                                                    , "ERROR!"
                                                                                   , JOptionPane.ERROR_MESSAGE);
            }
 
         break;
 
         //opcion imprimir arreglo 1 y 2
         case "Opcion 5":
 
          System.out.println("\nArreglo 1 ''Arr'' ");
                 for (i=0; i<arr.length; i++)
                 {
                      System.out.print("["+arr[i]+"]");
                 }
                  System.out.println("\n");
 
            System.out.println("\nArreglo 2 ''Arr2'' ");
                    for (i=0; i<arr2.length; i++)
                  {
                      System.out.print("["+arr2[i]+"]");
                 }
                  System.out.println("\n");
 
          JOptionPane.showMessageDialog(null,"\nSe ha imprimido los arreglos correctamente"
                                                                             , "EXITO!"
                                                                            , JOptionPane.INFORMATION_MESSAGE);
         System.out.println("\n");
         System.out.println("_________________________________________________________________");
                 break;
 
         //opcion buscar palabra
         case "Opcion 6":
 
         res=obj.buscarPalabra();
         System.out.println(res);
         JOptionPane.showMessageDialog(null, res
                                                                           , "RESULTADO"
                                                                           , JOptionPane.INFORMATION_MESSAGE);
         System.out.println("\n");
         System.out.println("_________________________________________________________________");
                     break;
 
         //opcion intercambiar diagonales
         case "Opcion 7":
 
                     mat=obj.intercambiarDiagonales();
                     for(f=0; f<5; f++)
                     { for(c=0; c<5; c++)
                         {
                         System.out.print("["+mat[f][c]+"]"+"\t");
                         }
 
                     System.out.println("\n");
                     }
         JOptionPane.showMessageDialog(null,"\nSe ha intercambiado las diagonales de la matriz correctamente"
                                                                            , "EXITO!"
                                                                           , JOptionPane.INFORMATION_MESSAGE);
         System.out.println("\n");
         System.out.println("_________________________________________________________________");
                     break;
 
         //opcion salida
         case "Opcion 8":
 
         ImageIcon despedida = new ImageIcon("like.png");
         JOptionPane.showMessageDialog(null,"   HASTA LA PRoXIMA!   "
                                                                         , "ADIoS!"
                                                                           , JOptionPane.INFORMATION_MESSAGE,despedida);
         System.exit(0);
         System.out.println("\n");
         System.out.println("_________________________________________________________________");
               break;
 
         //opcion default
         default:
 
         JOptionPane.showMessageDialog(null,"Deseas salir? Solo podras hacerlo desde la opcion 8"
                                                                         , "CUIDADO!"
                                                                            , JOptionPane.WARNING_MESSAGE);
         System.out.println("\n");
         System.out.println("_________________________________________________________________");
   }
   } while(opc != "Opci�n 8");
 }
 }