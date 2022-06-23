package Tarea13;

public class Perro extends Mascota{

    protected int patas;

    public Perro(String nombre, String raza, int edad){
        super(nombre, edad, raza);

    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
