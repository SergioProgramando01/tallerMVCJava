package modelo;

public class Multiplicacion { // Nombre de la clase cambiado a "Multiplicacion"
    
    private int numero1;
    private int numero2;

    public Multiplicacion() {
    }

    public Multiplicacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    } 

    public int multiplicar() {
        return numero1 * numero2;
    }    
}
