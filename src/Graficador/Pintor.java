
package Graficador;

import java.awt.Canvas;
import java.awt.Graphics2D;

/**
 * Clase que pintara el gráfico
 * @author Dvd
 */
public class Pintor {
    
    private Canvas lienzo;
    
    Graphics2D pantallaDeDibujo;
    
    int tamaño;
    
    
    public void pasarElCanvas(Canvas lienzo){
        this.lienzo = lienzo;
    }
    
    public void pasarTamañodePintado(int tamaño){
        this.tamaño = tamaño;
        
            if (tamaño > lienzo.getHeight() || tamaño > lienzo.getWidth()){
                
            }
        
    }
    
    private void obtenerPantalladeDibujo(){
        pantallaDeDibujo = (Graphics2D) lienzo.getGraphics();
    }
    
    
}