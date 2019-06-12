package uitesting.upb.org.learningabstractinterface;

/**
 * @autor Marcelo Garay
 */
public abstract class Empresa {
    private String nombre;

    abstract int horasTrabajadas();

    public String getNombre() {
        return "UPB member -".concat(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
