public class Persona{
    private String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public void leer(){
        System.out.println("Me llamo "+nombre);
    }
}