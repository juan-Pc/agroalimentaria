/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agroalimentaria;


public class congelado extends producto {
    int temp;
    public congelado(){}
    public congelado(int num_lote,String fecha_ven,String fecha_em,String pais_o,int temp){
        super();
        this.temp=temp;
        
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "congelado{" + "temp=" + temp + super.toString()+'}';
    }
            
    
}
