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
public class Enemigo extends Personaje1{
    private int evolucionesAplicadas=0;
    private int resistencia=1;

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    
    
    public void evolucionar(){
    if(this.getVida()<=30&&evolucionesAplicadas==0){
        this.setDamage(this.getDamage()+20);
        this.setEvolucionesAplicadas(this.getEvolucionesAplicadas()+1);
    }
    if(this.getVida()<=10&&evolucionesAplicadas==1){
        this.setResistencia(this.getResistencia()+1);
        this.setEvolucionesAplicadas(this.getEvolucionesAplicadas()+1);
    }
    }
    @Override
    public void recibirImpacto(double d){
        this.setVida(this.getVida()-(d/this.getResistencia()));
        
    }
    
}
