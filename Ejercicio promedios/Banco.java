import java.util.ArrayList;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco 
{
    private ArrayList<CuentaBancaria> cuentas;
    public Banco()
    {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    public void agregar(CuentaBancaria c1)
    {
        cuentas.add(c1);
    }
    public float calcularSaldoPromedio()
    {
        CuentaBancaria[] arrCuentas;
        arrCuentas = new CuentaBancaria[cuentas.size()];
        for(int i=0; i<cuentas.size(); i++)
        {
            arrCuentas[i] = cuentas.get(i);
        }
        arrCuentas = cuentas.toArray(arrCuentas);
        return Utileria.calculaPromedio(arrCuentas);
    }
    
}
