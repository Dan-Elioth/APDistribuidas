package Trabajo.Problema1.problema1.src;

import java.util.ArrayList;
import java.util.List;


class Trabajador {
    private String nombre;
    private int sueldo;
    
    public Trabajador(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getSueldo() {
        return sueldo;
    }
}

public class Main {

    public static void main(String[] args) {
        // Lista de trabajadores con su nombre y sueldo
        List<Trabajador> listaTrabajadores = new ArrayList<>();
        listaTrabajadores.add(new Trabajador("Juan", 4000));
        listaTrabajadores.add(new Trabajador("Maria", 5500));
        listaTrabajadores.add(new Trabajador("Pedro", 6000));
        listaTrabajadores.add(new Trabajador("Luisa", 4800));
        listaTrabajadores.add(new Trabajador("Miguel", 5200));
        listaTrabajadores.add(new Trabajador("Lucia", 5200));
        listaTrabajadores.add(new Trabajador("Pedro", 5200));
        listaTrabajadores.add(new Trabajador("Joel", 5200));
        listaTrabajadores.add(new Trabajador("Luis", 5200));

        
        // imprimir los nombres de los trabajadores con sueldo mayor a 5000

        long tiempoInicio = System.nanoTime();
        listaTrabajadores.stream().parallel()
                        .filter(t -> t.getSueldo() > 5000)
                        .forEach(t -> System.out.println(t.getNombre()));
         long tiempoFin = System.nanoTime();
         System.out.println();
        System.out.print(" tiempo con paralelo "+(tiempoFin-tiempoInicio));


         System.out.println();
         System.out.println("---------------------------------");


          tiempoInicio = System.nanoTime();
          listaTrabajadores.stream()
                         .filter(t -> t.getSueldo() > 5000)
                          .forEach(t -> System.out.println(t.getNombre()));
          tiempoFin = System.nanoTime();
          System.out.println();
         System.out.print(" tiempo sin paralelo "+(tiempoFin-tiempoInicio));
    }



}