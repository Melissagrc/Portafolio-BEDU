public class Principal {
    public static void main(String[] args) {

        Pasajero pasajero = new Pasajero("Melissa ", "Pass926751087 ");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("JP17980 ", "Japón ", "06:30 ");

        // Reservar asiento
        boolean reservado = vuelo.reservaAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.mostrarItinerario());

        // Cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.mostrarItinerario());

        // Realizamos una nueva reservacion
        vuelo.reservarAsiento("Melissa", "Pass926751087");
        System.out.println(vuelo.mostrarItinerario());

    }

}
