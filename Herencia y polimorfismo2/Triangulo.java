import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
   private float base;
   private float altura;
    
    public Triangulo(float b, float a, int x, int y)
   {
        super(x, y);
        base = b;
        altura = a;
   }
   public void dibuja(Graphics g)
   {
       g.drawLine(x, y, x+a, y+b);
   }
    
    
   /* public void calculaArea()
    {
        area = base * altura / 2;
    }
    public String dimeInfo()
    {
        return "Triangulo " + super.dimeInfo();
    }
    @Override   
    public String toString()
    {
        return "Triangulo con area = " + super.toString();
    }*/

}