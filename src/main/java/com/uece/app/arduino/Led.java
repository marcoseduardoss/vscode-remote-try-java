package com.uece.app.arduino;

public class Led implements Iluminador {

    boolean ligado = false;

    @Override
    public void ligar(){
        this.ligado = true;
    }

    @Override
    public void desligar(){
        this.ligado = false;
    }
    
    @Override
    public void exibir(){
        if(ligado){
            System.out.println("Led aceso!!");
        }else{
            System.out.println("Led apagado!!!");
        }
    }


}