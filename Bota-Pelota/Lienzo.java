import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Lienzo extends JPanel //implements KeyListener
{       
    private Pelota pelota;
    
    public Lienzo()
    {
        pelota = new Pelota(100, 100, 40);
        //EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        //Timer tiempo = new Timer(1000, escuchaTiempo);
        //tiempo.start();
        //this.addKeyListener(this);
        // EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
        // this.addKeyListener(escuchaTeclado);
    }
    //public void actual
    
    /*class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Hola pelota");
            //pelota.mueve(); //cambia de pocision
            //this.repaint();
        }
    }*/
    
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
    

}   
