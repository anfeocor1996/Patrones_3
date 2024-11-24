package strategy;

import observer.Emergency;

public class FireEmergencyStrategy implements EmergencyResponseStrategy {
    @Override
    public void executeResponse(Emergency emergency) {
        System.out.println("Ejecutando protocolo de incendios:");
        System.out.println("1. Despachar unidades de bomberos");
        System.out.println("2. Evacuar área circundante");
        System.out.println("3. Cortar suministro de gas en la zona");
    }
}
