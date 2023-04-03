package APDistribuidas;

// import java.util.ArrayList;
// import java.util.List;



// class Trabajador {
//     private String nombre;
//     private double salario;

//     public Trabajador(String nombre, double salario) {
//         this.nombre = nombre;
//         this.salario = salario;
//     }

//     public String getNombre() {
//         return nombre;
//     }

//     public double getSalario() {
//         return salario;
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         List<Trabajador> trabajadores = new ArrayList<>();
//         trabajadores.add(new Trabajador("Juan", 2500));
//         trabajadores.add(new Trabajador("Maria", 3000));
//         trabajadores.add(new Trabajador("Pedro", 4000));
//         trabajadores.add(new Trabajador("Luisa", 3500));
        
//         double salarioTotal = trabajadores.parallelStream()
//                 .mapToDouble(Trabajador::getSalario)
//                 .sum();
        
//         System.out.println("El salario total de la empresa es: " + salarioTotal);
//     }
// }


// import java.util.ArrayList;
// import java.util.List;

// public class Main {

//     public static void main(String[] args) {
//         // Creamos una lista de trabajadores
//         List<Trabajador> trabajadores = new ArrayList<>();
//         trabajadores.add(new Trabajador(1, "Juan"));
//         trabajadores.add(new Trabajador(2, "María"));
//         trabajadores.add(new Trabajador(3, "Pedro"));
//         trabajadores.add(new Trabajador(4, "Laura"));
//         trabajadores.add(new Trabajador(5, "Carlos"));

//         // Creamos un thread para imprimir el nombre de cada trabajador
//         for (Trabajador trabajador : trabajadores) {
//             Thread t = new Thread(new Runnable() {
//                 @Override
//                 public void run() {
//                     System.out.println(trabajador.getNombre() + " está realizando la tarea.");
//                 }
//             });
//             t.start();
//         }
//     }
// }

// class Trabajador {
//     private int id;
//     private String nombre;

//     public Trabajador(int id, String nombre) {
//         this.id = id;
//         this.nombre = nombre;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getNombre() {
//         return nombre;
//     }
// }


//Ejercicio paralelo


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creamos una lista de trabajadores con su nombre y sueldo
        List<Trabajador> listaTrabajadores = new ArrayList<>();
        listaTrabajadores.add(new Trabajador("Juan", 4000));
        listaTrabajadores.add(new Trabajador("Maria", 5500));
        listaTrabajadores.add(new Trabajador("Pedro", 6000));
        listaTrabajadores.add(new Trabajador("Luisa", 4800));
        listaTrabajadores.add(new Trabajador("Miguel", 5200));
        
        // Utilizamos programación paralela para imprimir los nombres de los trabajadores con sueldo mayor a 5000
        listaTrabajadores.stream()
                        .parallel()
                        .filter(t -> t.getSueldo() > 5000)
                        .forEach(t -> System.out.println(t.getNombre()));
    }
}

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