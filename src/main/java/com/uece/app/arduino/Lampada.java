package com.uece.app.arduino;

public class Lampada implements Iluminador{

    boolean ligado = false;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }
    
    public void exibir(){
        if(ligado){
            System.out.println("Led aceso!!");
        }else{
            System.out.println("Led apagado!!!");
        }
    }


}