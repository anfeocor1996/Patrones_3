package strategy;

import observer.Emergency;

public class MedicalEmergencyStrategy implements EmergencyResponseStrategy {
    @Override
    public void executeResponse(Emergency emergency) {
        System.out.println("Ejecutando protocolo médico:");
        System.out.println("1. Despachar ambulancias");
        System.out.println("2. Alertar hospitales cercanos");
        System.out.println("3. Establecer corredor de emergencia");
    }
}