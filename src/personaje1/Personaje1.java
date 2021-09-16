/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje1;
import java.math.*;
/**
 *
 * @author ADMIN
 */
public class Personaje1 {
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida=100;
    
    public Personaje1(String nombre,char sexo,double posicionX,double posicionY, double damage){
        this.nombre=nombre;
        this.sexo=sexo;
        this.posicionX=posicionX;
        this.posicionY=posicionY;
        this.damage=damage;
        
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public double getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    
    public void golpear(Personaje1 p){
        double d=this.calcularDistanciaRespectoPersonaje(p);
        double daño=this.damage;
        
        double dañoCausado=daño/d;
        p.recibirImpacto(dañoCausado);
        
    
    }
    public void recibirImpacto(double d){
        this.setVida(this.getVida()-d);
    }
    public double calcularDistanciaRespectoPersonaje(Personaje1 p){
    double posicionx=this.posicionX-(p.posicionX);
    double posiciony=this.posicionY-(p.posicionY);
    double resultado1=Math.pow(posicionx, 2);
    double resultado2=Math.pow(posiciony, 2);  
    double distancia=Math.sqrt(resultado1+resultado2);
        
    return distancia ;
    }

    /**
     * @param args the command line arguments
     */
    
    
            
        
    }
