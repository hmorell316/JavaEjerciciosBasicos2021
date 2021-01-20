/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author hmore
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuantas bellotas haya
        if(finDeSemana){
            return true;
        }
        //si llega aqui es que no es fin de semana
        if(numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        
        return false;
    }
    
   
    public int multa(int velocidad, boolean birthday){
        //si es tu cumpleaños, le resta 5 a la velocidad
        if (birthday){
            velocidad = velocidad - 5;
        }
        //si va a menos de 60
        if (velocidad<= 60){
            return 0;
        }
        //si va entre 61 y 80
        if(velocidad > 60 && velocidad <= 80){
            return 1; //multa pequeña
        }
        //en cualquier otro valor que tuviera velocidad devolvemos la multa grande
        return 2;
    }
    
    public boolean muyVanidoso(int numero){
        if (numero % 11 < 2){//si la division da como resto cero
            return true;
            
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto de la clase en la que estamos (ejercicioBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        
        System.out.println("Ejercicio Ardillas");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        System.out.println("Ejercicio multa");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        
        System.out.println("Ejercicio Vanidoso");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        
        
    }
    
}
