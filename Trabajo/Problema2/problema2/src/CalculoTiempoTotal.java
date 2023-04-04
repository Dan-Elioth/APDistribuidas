package Trabajo.Problema2.problema2.src;

import java.util.ArrayList;
import java.util.List;





class Trabajador {
    private String nombre;
    private String tarea;
    private int duracion;

    public Trabajador(String nombre, String tarea, int duracion) {
        this.nombre = nombre;
        this.tarea = tarea;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
}

public class CalculoTiempoTotal {

    public static void main(String[] args) {
        // Crear la lista de trabajadores con sus tareas y duraciones
        List<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(new Trabajador("Juan", "Tarea1", 5));
        trabajadores.add(new Trabajador("Ana", "Tarea2", 3));
        trabajadores.add(new Trabajador("Pedro", "Tarea3", 2));
        trabajadores.add(new Trabajador("María", "Tarea4", 4));
        trabajadores.add(new Trabajador("Carlos", "Tarea5", 1));

        // Calcular el tiempo total que llevará completar todas las tareas si los trabajadores trabajan en paralelo
        int[] tiempoTotal = {0};
        trabajadores.parallelStream().forEach(t -> tiempoTotal[0] += t.getDuracion());

        // Imprimir el tiempo total
        System.out.println("El tiempo total que llevará completar todas las tareas si los trabajadores trabajan en paralelo es: " + tiempoTotal[0]);
    }
}

