package core.entrada;
import core.salida.GestorSalida;
import java.util.Scanner;

public class GestorEntrada {
    Scanner scanner = new Scanner(System.in);
    GestorSalida salida = new GestorSalida();
    public GestorEntrada() {
    }

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            salida.mostrarMensajeIntroduceNumeroValido();
            System.out.print(mensaje);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        scanner.nextLine();
        return scanner.nextLine();
    }

    public double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            salida.mostrarMensajeIntroduceNumeroValido();
            System.out.print(mensaje);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}