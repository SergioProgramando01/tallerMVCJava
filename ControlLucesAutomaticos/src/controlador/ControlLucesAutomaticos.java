package controlador;

import modelo.Luces;
import modelo.SensorMovimiento;
import modelo.MomentoDelDia;

public class ControlLucesAutomaticos {
    private Luces luces;
    private SensorMovimiento sensorMovimiento;
    private MomentoDelDia momentoDelDia;

    public ControlLucesAutomaticos() {
        this.luces = new Luces();
        this.sensorMovimiento = new SensorMovimiento();
        this.momentoDelDia = new MomentoDelDia();
    }

    public void ejecutarSistema() {
        while (true) {
            momentoDelDia.actualizarMomento();
            sensorMovimiento.detectarMovimiento();

            if (momentoDelDia.isEsNoche() && sensorMovimiento.isDetectaMovimiento()) {
                luces.encender();
                System.out.println("🌙💡 Es de noche y hay movimiento. Luces ENCENDIDAS.");
            } else {
                luces.apagar();
                System.out.println("☀️❌ No hay movimiento o es de día. Luces APAGADAS.");
            }

            try {
                Thread.sleep(10000); // Espera 10 segundos antes de la siguiente lectura
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
