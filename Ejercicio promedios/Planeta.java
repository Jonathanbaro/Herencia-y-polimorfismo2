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


}
