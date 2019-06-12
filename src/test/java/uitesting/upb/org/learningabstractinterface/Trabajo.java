package uitesting.upb.org.learningabstractinterface;

/**
 * @autor Marcelo Garay
 */
public class Trabajo {
    public static void main(String[] args) {
        Empresa recruiterPersonal = new PersonalRecursoHumano("Reclutadore de Personal");
        System.out.println(recruiterPersonal.getNombre());

        PersonalRecursoHumano finanzas = new PersonalRecursoHumano("Finanzas");
        System.out.println(finanzas.getNombre());
        finanzas.trabajoPorHora(160);
        System.out.println("finanzas.horastrabajadas = " + finanzas.horasTrabajadas());
    }

}
