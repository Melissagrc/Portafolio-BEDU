import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.println("Ingrese su nombre");
        p1.nombre = input.nextLine();

        System.out.println("Ingrese su edad");
        p1.edad = input.nextInt();

        input.nextLine();

        System.out.println("Ingrese el número de expediente");
        p1.ID_exp = input.nextLine();

        input.close();

        p1.mostrarInformacion();
    }
}
