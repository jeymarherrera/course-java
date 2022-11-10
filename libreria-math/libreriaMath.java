/**Uso de librerias Math
 * @(#)TallerN10.java
 *
 *
 * @Jeymar Herrera/Isaias Castillo
 * @version 1.00 2020/9/10
 */

class calculos
{ double numA; //atributo
	double random() //metodo1
	{ numA =(Math.random()*100);//genera un numero aleatorio con limite hasta 100
      return numA;
	}
	double pow() //metodo2
	{ double respow;
	  respow = Math.pow(numA, 2);//eleva el numero aleatorio a la potencia 2
	  return respow;
	}
	double abs() //metodo3
	{ double resabs;
	  resabs = Math.abs(numA); //calcula el valor absoluto
	  return resabs;
	}
	double sqrt() //metodo4
	{ double resqrt;
	  resqrt = Math.sqrt(numA);//calcula la raiz cuadrada del numero
	  return resqrt;
	}
	double floor() //metodo5
	{ double resfloor;
	  resfloor = Math.floor(numA); //redondea el numero
	  return resfloor;
	}
	double max() //metodo6
	{ double resmax;
	 resmax = Math.max(numA,30);//indica el mayor entre el numero aleatorio y el numero 30
	 return resmax;
	}
	double min() //metodo7
	{double resmin,numx=50.12467;
	 resmin = Math.min(numA,numx);//indica el menor entre el numero aleatorio y el numero 50
	 return resmin;
	}
}


class libreriaMath {

    public static void main(String args[])
    { double a,b,c,d,e,f,g;
      calculos obj = new calculos();
      a =obj.random();
      b =obj.pow();
      c =obj.abs();
      d =obj.sqrt();
      e =obj.floor();
      f =obj.max();
      g =obj.min();

      System.out.println("random = "+a);
      System.out.println("pow = "+b);
      System.out.println("abs = "+c);
      System.out.println("sqrt = "+d);
      System.out.println("floor = "+e);
      System.out.println("max = "+f);
      System.out.println("min = "+g);
    }
}