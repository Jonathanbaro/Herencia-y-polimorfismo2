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
        Pais[] arrPaises;
        arrPaises = new Pais[paises.size()];
        for(int i=0; i<paises.size(); i++)
        {
            arrPaises[i] = paises.get(i);
        }
        arrPaises = paises.toArray(arrPaises);
        return Utileria.calculaPromedio(arrPaises);
    }
}
