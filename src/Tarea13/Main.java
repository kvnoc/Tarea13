package Tarea13;

public class Main {

    public static void main(String[] args){

        Perro perro = new Perro("Boby", "Dalmata",4);

        System.out.println("Nombre: "+perro.getNombre());
        System.out.println("Raza: "+perro.getRaza());
        System.out.println("Edad: "+perro.getEdad()+" años");
        perro.setPatas(4);
        System.out.println("Patas: "+perro.getPatas());

    }
}
