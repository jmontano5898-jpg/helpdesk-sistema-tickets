package sistema.gestor.eventos;

public class EventoConcierto extends Evento {
    public EventoConcierto(String nombre) {
        super(nombre);
    }

    @Override
    public void describirEvento() {
        System.out.println("Evento: " + nombre + " programado.");
    }
}