import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 8000.00;
        int opc;

        do {
            System.out.println("\n");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            System.out.print("Elige una opción: ");
            opc = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opc) {
                case 1:
                    System.out.print("Tu saldo es: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite el monto a despositar: ");
                    double monto = sc.nextDouble();
                    saldo += monto;
                    break;
                case 3:
                    System.out.print("Digite el monto a retirar: ");
                    double montoRetirar = sc.nextDouble();
                    if (montoRetirar <= saldo) {
                        saldo -= montoRetirar;
                    }else{
                        System.out.println("No cuentas con el saldo suficiente");
                    }
                    break;
                case 4:
                    System.out.print("Gracias por visitarnos");
                    break;
            };

        }while (opc!=4);
    }
}