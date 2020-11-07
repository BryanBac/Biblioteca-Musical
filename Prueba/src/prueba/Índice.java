/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author HP15DA0023LA
 */
public class Índice {
    private short CantidadPuntero;
    private int tamañoDef=0;
    private String definicion;
    private int puntero;

    public short getCantidadPuntero() {
        return CantidadPuntero;
    }
    public void setCantidadPuntero(short CantidadPuntero) {
        this.CantidadPuntero = CantidadPuntero;
    }
    public int getTamañoDef() {
        return tamañoDef;
    }

    public void setTamañoDef(int tamaño) {
        this.tamañoDef = tamaño;
    }
    
    public int getPuntero() {
        return puntero;
    }

    public void setPuntero(int puntero) {
        this.puntero = puntero;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }
    
}
