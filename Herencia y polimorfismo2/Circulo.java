
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    private float pi;
        
    public Circulo(float r)
    {
        radio = r;
        pi = 3.1416f;
    }
    
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
    }
}
