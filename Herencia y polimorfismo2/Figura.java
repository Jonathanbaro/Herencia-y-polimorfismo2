import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract  class Figura
{
    protected float area;
    private int posx;
    private int posy;
    
    public Figura(int x, int y)
    {
        area = 0;
        posx = x;
        posy = y;
    }
    
    public float accedeArea()
    {
        return area;
    }
    void calculaArea()
    {
        System.out.println("UPPs!!" );  
    }
    public String dimeInfo()
    {
        return "" + area;
    }
    @Override   
    public String toString()
    {
        return " " + area;
    }
    @Override   
    public boolean equals(Object obj)
    {
        return this.area == ((Figura)obj).area;
    }
    public abstract void dibuja(Graphics g);
}
