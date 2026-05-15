package sistema.gestor.eventos;

public class Asistente implements IObservadorEvento {
    private String nombre;
    
    public Asistente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(Evento evento) {
        System.out.println("Asistente " + nombre + ": Nuevo evento disponible: " + evento.getNombre());
    }
}