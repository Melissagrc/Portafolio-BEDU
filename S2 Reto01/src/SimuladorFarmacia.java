import java.util.Scanner;

public class SimuladorFarmacia {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Nombre del medicamento: ");
        String nombreMedicamento = new Scanner(System.in).nextLine();
        System.out.print("Precio unitario:");
        double precioUnitario = new Scanner(System.in).nextDouble();
        System.out.print("Cantidad de piezas");
        int cantidadPiezas = new Scanner(System.in).nextInt();

        double precioTotal = precioUnitario*cantidadPiezas;

        // Descuento si el total supera $500
        boolean aplicaDescuento = precioTotal > 500;

        // Asignación del descuento (15%)
        double descuento = aplicaDescuento ? precioTotal * 0.15 : 0;

        // Cálculo final
        double totalFinal = precioTotal - descuento;

        // Salida formateada
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento " + precioTotal);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

    }
}