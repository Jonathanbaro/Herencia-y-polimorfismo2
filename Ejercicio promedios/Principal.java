public class Principal
{
    public static void main(String [] args)
    {
       Banco b1 = new Banco();
       CuentaBancaria c1 = new CuentaBancaria(100);
       CuentaBancaria c2 = new CuentaBancaria(200);
       CuentaBancaria c3 = new CuentaBancaria(300);
       b1.agregar(c1);
       b1.agregar(c2);
       b1.agregar(c3);
       
       Planeta pla1 = new Planeta();
       Pais p1 = new Pais(25000000);
       Pais p2 = new Pais(32000000);
       Pais p3 = new Pais(94000000);
       pla1.agregar(p1);
       pla1.agregar(p2);
       pla1.agregar(p3);
       
       System.out.println("El promedio de cuentas es: " + b1.calcularSaldoPromedio());
       
       System.out.println("El promedio de Habitanes es: " + pla1.calcularHaPromedio());

    }
}

