package juego;

import java.util.Random;
import java.util.Scanner;
public class Juego {
    
    public static Integer array[];
    public static String nombre;
    public static Random rnd=new Random();
    public static Boolean esta=false;
    public static Integer num, aleat, n2;
    
    public static void repartirNumeros (){
        for (int i=0;i<n2;i++){
            do {
                aleatorios(n2);
                    for (int d=0;d<n2;d++){
                        if (array[d]==num){
                            esta=true;
                            break;
                        } else {
                            esta=false;
                        }
                    }
            }   while (esta==true);
            array[i]=num;
        }
        for (int e=0;e<n2;e++){
            System.out.println("En la posición "+e+"Esta el numero "+array[e]);
        }
        
        
    }
    
    public static void verificar (Integer n){
        if(array[n]==num){
            System.out.println("Ganaste");
        } else {
            System.out.println("perdiste");
        }
    }
    
    public static  void aleatorios (Integer a){
        num=rnd.nextInt(a)+1;
    }
    
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Con cuantos numeros quieres jugar");
        n2=sca.nextInt();
        array=new Integer[n2];
        aleatorios(n2);
        repartirNumeros();
        
        System.out.println("En que posición esta el numero "+num);
        verificar(sca.nextInt());
    }
    
} 
