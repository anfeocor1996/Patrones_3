package observer;

public class PoliceStation implements EmergencyObserver {
    @Override
    public void update(Emergency emergency) {
        System.out.println("Policía notificada de emergencia en " + emergency.getLocation() +
                         " - Tipo: " + emergency.getType());
    }
}