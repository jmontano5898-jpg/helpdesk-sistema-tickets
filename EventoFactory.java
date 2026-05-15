package sistema.gestor.eventos;

public class EventoFactory {
    public static Evento crearEvento(String tipo, String nombre) {
        if (tipo.equalsIgnoreCase("concierto")) {
            return new EventoConcierto(nombre);
        } else if (tipo.equalsIgnoreCase("conferencia")) {
            return new EventoConferencia(nombre);
        }
        return null;
    }
}


