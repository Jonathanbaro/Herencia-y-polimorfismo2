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
   private int base;
   private int altura;
    
    public Triangulo(int b, int a, int x, int y)
   {
        super(x, y);
        base = b;
        altura = a;
   }
   @Override
   public void dibuja(Graphics g)
   {
       g.drawLine(100, 350, (100+base), 350);
       g.drawLine(100+(base/2), (350-altura), 100, 350);
       g.drawLine(100+(base/2),(350-altura), (100+base), 350);
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