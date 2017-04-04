
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
    
    public void pasarTamañodePintado(int tamaño) throws TamañoMayorQueHeightOWidthExcetion, CanvasEsNull{
        this.tamaño = tamaño;
        
            if (tamaño > lienzo.getHeight() || tamaño > lienzo.getWidth()){
                throw new TamañoMayorQueHeightOWidthExcetion("El Tamaño No puede ser Mayor que el Largo o el Ancho del Canvas.");
            }
            
            if (lienzo == null){
                throw new CanvasEsNull("Aún no ha asignado ningún Lienzo al objeto Pintor.");
            }
        
    }
    
    private void obtenerPantalladeDibujo(){
        pantallaDeDibujo = (Graphics2D) lienzo.getGraphics();
    }
    
  
}
