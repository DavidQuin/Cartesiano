
package Graficador;

import java.awt.Canvas;
import java.awt.Graphics2D;

import java.awt.Color;

/**
 * Clase que pintara el gráfico
 * @author Dvd
 */
public class Pintor {
    
    private Canvas lienzo;
    
    private Graphics2D pantallaDeDibujo;
    
    private PuntosEnLaGrafica puntos;
    
    public Pintor(){
        puntos = new PuntosEnLaGrafica();
    }
    
    
    
    public void pasarElCanvas(Canvas lienzo){
        this.lienzo = lienzo;
        ConfigurarLienzo();
        obtenerPantalladeDibujo();
        dibujarEjes();
    }

    
    
    private void obtenerPantalladeDibujo(){
        pantallaDeDibujo = (Graphics2D) lienzo.getGraphics();
    }
    
    
    private void ConfigurarLienzo(){
        puntos.LargoYAncho(lienzo.getHeight(), lienzo.getWidth());
    }
    
    
    private void colorPincel(Color color){
        pantallaDeDibujo.setColor(color);
    }
    
    private int FloatAInt(float valorFloat){
        return Float.floatToIntBits(valorFloat);
    }
    
    
    private void dibujarEjes(){
        
        colorPincel(Color.BLACK);
        
        
        
        
    }
    
    
}
