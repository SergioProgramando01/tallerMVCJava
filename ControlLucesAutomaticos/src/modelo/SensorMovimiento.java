package modelo;

import java.util.Random;

public class SensorMovimiento {
    private boolean detectaMovimiento;

    public void detectarMovimiento() {
        Random random = new Random();
        this.detectaMovimiento = random.nextBoolean();
    }

    public boolean isDetectaMovimiento() {
        return detectaMovimiento;
    }
}
