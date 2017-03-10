import java.awt.Graphics;

public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    
    public Pelota(int x, int y, int r)
    {
        posx = x;
        posy = y;
        radio = r;
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    public void mueve(Graphics g)
    {
        g.drawOval(posx+50, posy+50, radio*2, radio*2);
    }
}
