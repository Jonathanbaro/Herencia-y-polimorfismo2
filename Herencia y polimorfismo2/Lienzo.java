import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
//import java.applet;



public class Lienzo extends JPanel
{
    private ArrayList<Figura> figuras;
    private Graphics g;
    public Lienzo()
    {
       figuras = new ArrayList<Figura>();
       Circulo ci=new Circulo(50, 400, 400);
       Triangulo t=new Triangulo(50, 50, 200, 200);
       Cuadrado c=new Cuadrado(50, 100, 100);
       figuras.add(ci);
       figuras.add(t);
       figuras.add(c);
    }
    @Override
    public void paintComponent(Graphics g)
    { 
        Graphics2D g2 = (Graphics2D)g; 
        for(Figura f : figuras)
        {
            f.dibuja(g2);
        }
    }
    
}
