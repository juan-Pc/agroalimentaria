
package agroalimentaria;
import java.io.*;
import java.util.Scanner;


public class producto {
    private int num_lote;
    private String pais_o;
    private String fecha_ven;
    private String fecha_em;
    
    public producto(){};    

    public producto(int num_lote, String pais_o, String fecha_ven, String fecha_em) {
        this.num_lote = num_lote;
        this.pais_o = pais_o;
        this.fecha_ven = fecha_ven;
        this.fecha_em = fecha_em;
    }

    public int getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(int num_lote) {
        this.num_lote = num_lote;
    }

    public String getPais_o() {
        return pais_o;
    }

    public void setPais_o(String pais_o) {
        this.pais_o = pais_o;
    }

    public String getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(String fecha_ven) {
        this.fecha_ven = fecha_ven;
    }

    public String getFecha_em() {
        return fecha_em;
    }

    public void setFecha_em(String fecha_em) {
        this.fecha_em = fecha_em;
    }

    @Override
    public String toString() {
        return "producto{" + "num_lote=" + num_lote + ", pais_o=" + pais_o + ", fecha_ven=" + fecha_ven + ", fecha_em=" + fecha_em + '}';
    }
    
    
}
