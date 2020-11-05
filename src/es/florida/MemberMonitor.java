package es.florida;

import java.io.*;

public class MemberMonitor {
    /*private static void muestraContenido(String archivo) throws FileNotFoundException, IOException, InterruptedException {

        FileReader f = new FileReader("C:/Users/alvar/OneDrive - Florida Centre de Formació Coop.V/2n/Servicios y procesos/ActividadMonitorCorreo/PSPAE2/Hola.txt");
        BufferedReader b = new BufferedReader(f);
        for (int i = 0; i < 50000; i++) {

            for (int j = 0; j < 100; j++) {
                System.out.println(b.readLine());
            }

            Thread.sleep(3000);
        }
        b.close();
    }*/
    public static String getUltimaLinea(String filePath) {
        String ultima = "";

        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile(filePath, "r");
            String readLine = "";
            while ((readLine = raf.readLine()) != null) {
                ultima = readLine;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (Exception e) {
                }
            }
        }
        return ultima;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(getUltimaLinea("C:/Users/alvar/OneDrive - Florida Centre de Formació Coop.V/2n/Servicios y procesos/ActividadMonitorCorreo/PSPAE2/Hola.txt"));
    }
}