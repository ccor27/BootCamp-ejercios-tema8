public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(18);
        persona.setNombre("albeiro");
        persona.setTelefono(123456789);
        System.out.println("el nombre es: "+persona.getNombre());
        System.out.println("la edad es: "+persona.getEdad());
        System.out.println("el telefono es: "+persona.getTelefono());
    }


}
