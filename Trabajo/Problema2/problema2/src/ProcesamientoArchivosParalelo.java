package Trabajo.Problema2.problema2.src;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ProcesamientoArchivosParalelo {

   public static void main(String[] args) {
       //Lista de archivos a procesar
       List<File> archivos = new ArrayList<>();
        archivos.add(new File("archivo1.csv"));
        archivos.add(new File("archivo2.xml"));
        archivos.add(new File("archivo3.xlsx"));
        archivos.add(new File("archivo4.xml"));
        archivos.add(new File("archivo5.csv"));

        //Procesamos los archivos en paralelo utilizando la programación paralela de Java

        long tiempoInicio=System.nanoTime();

        archivos.stream().parallel().forEach(archivo -> procesarArchivo(archivo));

        long tiempoFin = System.nanoTime();
        System.out.println();
        System.out.print(" tiempo con paralelo "+((tiempoFin-tiempoInicio)/1_000_000_000));



        System.out.println("");

         tiempoInicio=System.nanoTime();

        archivos.stream().forEach(archivo -> procesarArchivo(archivo));

         tiempoFin = System.nanoTime();
        System.out.println();
        System.out.print(" tiempo sin paralelo "+((tiempoFin-tiempoInicio)/1_000_000_000));
    }

    private static void procesarArchivo(File archivo) {
       //Simulamos el procesamiento del archivo
        try {
             Thread.sleep(5000); // Esperamos 5 segundos para simular el procesamiento
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         System.out.println("El archivo " + archivo.getName() + " ha sido procesado.");
    }
 }
