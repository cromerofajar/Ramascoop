/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramascoop;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class ClaseA {
    public ClaseA(){}
    
    public void suma(){
        Scanner ler= new Scanner(System.in);
        float sumar1, sumar2, resultado;
            System.out.println("Introduzca numero1 a sumar");
            sumar1=ler.nextFloat();
            System.out.println("Introduzca numero2 a sumar");
            sumar2=ler.nextFloat();
            resultado=sumar1+sumar2;
            System.out.println("El resultado de la suma es= "+resultado);
    }
    public void sumarIlimitado(){
        Scanner ler=new Scanner (System.in);
        float sumar,Rsumar=0;
            do {
                System.out.println("Introduzca cantidad a sumar, con 0 o menor cancela el bucle");
                sumar=ler.nextFloat();
                Rsumar=sumar+Rsumar;
                
            } while(sumar>0);
            System.out.println("Resultado= "+Rsumar);
    }
}
