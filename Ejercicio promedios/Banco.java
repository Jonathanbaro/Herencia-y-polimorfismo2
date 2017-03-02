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
        float aux=0;
        float saldo=0;
        for(CuentaBancaria cA : cuentas)
        {
            //aux+=cA.
        }  
        return saldo;
    }
}
