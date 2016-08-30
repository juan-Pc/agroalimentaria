


package agroalimentaria;
import java.util.Scanner;

public class Agroalimentaria extends producto {


    public static void main(String[] args) {
        String c=" ";
        int a;
        congelado prod = new congelado();
        Scanner sc = new Scanner(System.in);
        System.out.println("digite la fecha de enmbase");
        c=sc.next();        
        prod.setFecha_em(c);
        System.out.println("digite la fecha de ven");
        c=sc.next();  
        prod.setFecha_ven(c);
        System.out.println("digite la pais de origen");
        c=sc.next(); 
        prod.setPais_o(c);
        System.out.println("digite el lote");
        a=sc.nextInt(); 
        System.out.println("digite la temperatura ");
        a=sc.nextInt(); 
        prod.setTemp(a);
        System.out.println("toda la informacion "+prod.toString());
    }
    
}
