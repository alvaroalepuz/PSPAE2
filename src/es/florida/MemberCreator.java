package es.florida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class MemberCreator {

    public static void crearCorreos() {
        Random rand = new Random();

        try {
            File file = new File("C:/Users/alvar/OneDrive - Florida Centre de Formació Coop.V/2n/Servicios y procesos/ActividadMonitorCorreo/PSPAE2/Hola.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            while (true) {
                int rand_int1 = rand.nextInt(10000);
                bw.write(rand_int1 + "@gmail.com\n");
                Thread.sleep(3000);
                System.out.println("Hola");
                bw.flush();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        crearCorreos();
    }

}