package modelo;

public class Luces {
    private boolean encendidas;

    public void encender() {
        this.encendidas = true;
    }

    public void apagar() {
        this.encendidas = false;
    }

    public boolean isEncendidas() {
        return encendidas;
    }
}
