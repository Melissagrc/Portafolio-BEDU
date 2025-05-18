public class Vuelo {
    //Atributos
    final String codigoVuelo;
    static String destino;
    static String horaSalida;
    Pasajero asientoReservado;

    //Metodos
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservaAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    boolean reservarAsiento(String nombre,String pasaporte){
        Pasajero pasajero = new Pasajero(nombre, pasaporte);
        return reservaAsiento(pasajero);
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String mostrarItinerario(){
        String datosVuelo = "Itinerario del vuelo:";
        datosVuelo += "Código: " + codigoVuelo;
        datosVuelo+= "Destino: " + destino;
        datosVuelo+= "Hora de salida: " + horaSalida;

        return datosVuelo;

    }

}
