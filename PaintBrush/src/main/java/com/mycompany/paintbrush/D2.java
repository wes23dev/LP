/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sergio.lima
 */
abstract public class D2 extends Ponto {
    public Color corInterna;
    public abstract double area();
    public abstract double perimetro();
    
    @Override  public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawString(Double.toString(area()), 0, 0);
    }
}
