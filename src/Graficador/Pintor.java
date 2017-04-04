
package Graficador;

import java.awt.Canvas;
import java.awt.Graphics2D;

/**
 * Clase que pintara el gráfico
 * @author Dvd
 */
public class Pintor {
    
    private Canvas lienzo;
    
    private Graphics2D pantallaDeDibujo;
    
    private int tamaño;
    
    //---- Posiciones fundamentales del lienzo.
    private float margenEnX;
    private float margenEnY;
    private float largoEjeX;
    private float largoEjeY;
    
    
    
    
    public void pasarElCanvas(Canvas lienzo){
        this.lienzo = lienzo;
    }

    
    
    private void obtenerPantalladeDibujo(){
        pantallaDeDibujo = (Graphics2D) lienzo.getGraphics();
    }
    
    
    private void ConfigurarLienzo(){
        
        margenEnX = ConversorPuntoALienzo.obtenerMargenX(tamaño);
        margenEnY = ConversorPuntoALienzo.obtenerMargenY(tamaño);
        
        
        
        
    }
    
    
}
