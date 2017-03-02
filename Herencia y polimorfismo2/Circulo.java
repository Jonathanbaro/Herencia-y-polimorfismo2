import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private int radio;
        
    public Circulo(int r, int x, int y)
    {
        super(x, y);
        radio = r;
    }
   public void dibuja(Graphics g)
   {
       g.drawOval(100, 210, radio, radio);
    }
    /*
    public void calculaArea()
    {
        area = (radio * radio) * pi;
    }
    public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }
    @Override   
    public String toString()
    {
        return "Circulo con area = " + super.toString();
    }
    @Override   
    public boolean equals(Object obj)
    {
        if(obj instanceof Circulo)
            return this.radio == ((Circulo)obj).radio;
        else
            return false;
    }*/
}
