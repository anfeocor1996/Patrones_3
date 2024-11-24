package state;

public class EvaluationState implements EmergencyState {
    @Override
    public void evaluate(EmergencyContext context) {
        System.out.println("La emergencia tipo " + context.getEmergency().getType() + 
                         " ya está en evaluación");
    }
    
    @Override
    public void respond(EmergencyContext context) {
        System.out.println("Iniciando respuesta a emergencia con severidad " + 
                         context.getEmergency().getSeverity());
    }
    
    @Override
    public void resolve(EmergencyContext context) {
        System.out.println("Resolviendo emergencia en " + context.getEmergency().getLocation());
    }
    
    @Override
    public String getStateName() {
        return "En Evaluación";
    }
}