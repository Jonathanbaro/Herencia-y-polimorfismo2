import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cuadrado extends Figura
{
    private int lado;
    
    public Cuadrado(int l, int x, int y)
    {
        super(x, y);
        lado = l;
    }
    @Override
    public void dibuja(Graphics g)
    {
        g.drawRect(100, 100, lado, lado);
    }
    /*public void calculaArea()
    {
        area = lado * lado;
    }
    public String dimeInfo()
    {
        return "Cuadrado " + super.dimeInfo();
    }
    @Override   
    public String toString()
    {
        return "Cuadrado con area = " + super.toString();
    }*/
}
