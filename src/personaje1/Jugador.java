/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje1;

/**
 *
 * @author ADMIN
 */
public class Jugador extends Personaje1 {
    private int numeroBotiquines=0;

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
    
    
    
    public void moverDerecha(double d){
    this.setPosicionX(this.getPosicionX()+d);
    }
    public void moverIzquierda(double d){
    this.setPosicionX(this.getPosicionX()-d);
    }
    public void moverArriba(double d){
    this.setPosicionY(this.getPosicionY()+d);
    }
    public void moverAbajo(double d){
    this.setPosicionY(this.getPosicionY()-d);
    }
    public void recogerBotiquin(){
    this.setNumeroBotiquines(this.getNumeroBotiquines()+1);
    }
    public void usarBotiquin(){
       this.setNumeroBotiquines( this.getNumeroBotiquines()-1);
       if(numeroBotiquines>0&&this.getVida()<=100){
       this.setVida(this.getVida()+5);
       }
       
    }
   

    public void golpear(Enemigo p){
        super.golpear(p);
        p.evolucionar();
       
    }
    

        
    }



