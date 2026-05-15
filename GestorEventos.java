package sistema.gestor.eventos;

public class GestorEventos {
    public static void main(String[] args) {
        // Crear observadores
        Asistente maria = new Asistente("Maria");
        Asistente luis = new Asistente("Luis");
        
        // Crear gestor y registrar observadores
        GestorEventosManager gestor = new GestorEventosManager();
        gestor.agregarObservador(maria);
        gestor.agregarObservador(luis);
        
        // Crear evento usando Factory
        System.out.println("=== CREANDO EVENTO ===");
        Evento evento = EventoFactory.crearEvento("concierto", "Concierto de música en vivo");
        evento.describirEvento();
        
        // Notificar a observadores
        gestor.notificarObservadores(evento);
    }
}

// Clase interna para manejar observadores
class GestorEventosManager {
    private java.util.List<IObservadorEvento> observadores = new java.util.ArrayList<>();
    
    public void agregarObservador(IObservadorEvento obs) {
        observadores.add(obs);
    }
    
    public void notificarObservadores(Evento evento) {
        for (IObservadorEvento obs : observadores) {
            obs.actualizar(evento);
        }
    }
}
