package core.modelo;

import altas.Altas;
import core.entrada.GestorEntrada;
import core.salida.GestorSalida;

import java.util.ArrayList;

public class GestorEstudiantes {
    private ArrayList<Estudiante> estudiantes;
    private GestorEntrada entrada;
    private GestorSalida salida;


    public GestorEstudiantes() {
        estudiantes = new ArrayList<>();
        entrada = new GestorEntrada();
        salida = new GestorSalida();
    }
    public void agregarEstudiante() {
        Altas altas = new Altas(entrada, salida, estudiantes);
        altas.agregarEstudiante();
    }
}
