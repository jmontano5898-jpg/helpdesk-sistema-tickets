package sistema.gestor.eventos;

public class EventoConferencia extends Evento {
    public EventoConferencia(String nombre) {
        super(nombre);
    }
    
    @Override
    public void describirEvento() {
        System.out.println("Evento: " + nombre + " programado.");
    }
}