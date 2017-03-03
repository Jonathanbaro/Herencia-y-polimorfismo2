import java.util.ArrayList;
public class Planeta
{
    private ArrayList<Pais> paises;
    public Planeta()
    {
        paises = new ArrayList<Pais>();
    }
    public void agregar(Pais p1)
    {
        paises.add(p1);
    }
    public float calcularHaPromedio()
    {
        float aux=0;
        for(Pais pA : paises)
        {
            aux+=pA.rHabitantes();
        }  
        return aux/paises.size();
    }
}
