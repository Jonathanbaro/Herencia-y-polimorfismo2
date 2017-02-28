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
        Ventana vent = new Ventana(800, 600);
        vent.setVisible(true);
        
        Triangulo t1 = new Triangulo(3,4);
        Cuadrado c1 = new Cuadrado(4);
        Circulo ci1 = new Circulo(9);
    }
}
