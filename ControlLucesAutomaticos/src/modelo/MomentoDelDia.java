package modelo;

import java.util.Random;

public class MomentoDelDia {
    private boolean esNoche;

    public void actualizarMomento() {
        Random random = new Random();
        this.esNoche = random.nextBoolean();
    }

    public boolean isEsNoche() {
        return esNoche;
    }
}
