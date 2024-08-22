package Controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import ventavehiculo1.Vehiculo;

public class ArchivoVehiculo {

    private String FILENAME = "vehiculo.txt";

    public ArchivoVehiculo(String filename) {
        this.FILENAME = filename;
    }

    public void guardarVehiculo(ArrayList<Vehiculo> listaVehiculo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Vehiculo vehiculo : listaVehiculo) {
                writer.println(vehiculo.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarVehiculos(ArrayList<Vehiculo> listaVehiculo) {
        listaVehiculo.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listaVehiculo.add(new Vehiculo(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + FILENAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
