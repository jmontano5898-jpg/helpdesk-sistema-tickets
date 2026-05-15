package sistema.gestor.eventos;

public abstract class Evento {
    protected String nombre;
    
    public Evento(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public abstract void describirEvento();
}
