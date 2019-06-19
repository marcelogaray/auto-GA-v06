package uitesting.upb.org.learningabstractinterface;

/**
 * @autor Marcelo Garay
 */
public class PersonalRecursoHumano extends Empresa {

    private int horasTrabajadas;

    public PersonalRecursoHumano(String nombreDepartamento) {
        setNombre(nombreDepartamento);
    }

    public void trabajoPorHora(int horasDeTrabajo){
        this.horasTrabajadas = horasDeTrabajo;
    }

    @Override
    int horasTrabajadas() {
        return this.horasTrabajadas;
    }
}
