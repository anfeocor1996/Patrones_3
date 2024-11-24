package observer;

public class FireDepartment implements EmergencyObserver {
    @Override
    public void update(Emergency emergency) {
        if (emergency.getType().equals("FIRE")) {
            System.out.println("Bomberos despachados a " + emergency.getLocation() +
                             " - Severidad: " + emergency.getSeverity());
        }
    }
}
