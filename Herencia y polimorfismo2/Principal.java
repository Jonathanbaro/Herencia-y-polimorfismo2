import java.util.ArrayList;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String [] args)
    {

        Triangulo t1 = new Triangulo(3,4);
        //t1.calculaArea();
        //System.out.println("El area del triangulo es: " + t1.accedeArea());
        Cuadrado c1 = new Cuadrado(4);
        //c1.calculaArea();
        //System.out.println("El area del cuadrado es: " + c1.accedeArea());
        Circulo ci1 = new Circulo(9);
        Circulo ci2 = new Circulo(9);
        //ci1.calculaArea();
        //System.out.println("El area del circulo es: " + ci1.accedeArea());
        Figura [] figuras = new Figura[4];
        figuras[0] = t1;
        figuras[1] = c1;
        figuras[2] = ci1;
        figuras[3] = ci2;
  
        if(ci1.equals(ci2))
        {
            System.out.println("Iguales");
        }
        else
        {
            System.out.println("Diferente");
        }
    }
}
