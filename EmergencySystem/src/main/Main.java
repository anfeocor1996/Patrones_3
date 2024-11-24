package main;

import observer.*;
import strategy.*;
import state.*;

public class Main {
    public static void main(String[] args) {
        // Crear sistema de monitoreo
        EmergencyMonitoringSystem monitoringSystem = new EmergencyMonitoringSystem();
        
        // Registrar observadores
        monitoringSystem.attach(new FireDepartment());
        monitoringSystem.attach(new PoliceStation());
        
        // Crear emergencia
        Emergency fireEmergency = new Emergency("FIRE", "Calle Principal 123", 4);
        
        // Notificar emergencia
        System.out.println("=== Demostración del Patrón Observer ===");
        monitoringSystem.notifyEmergency(fireEmergency);
        
        // Demostrar estrategia
        System.out.println("\n=== Demostración del Patrón Strategy ===");
        EmergencyResponseSystem responseSystem = new EmergencyResponseSystem();
        responseSystem.setStrategy(new FireEmergencyStrategy());
        responseSystem.handleEmergency(fireEmergency);
        
        // Demostrar estados
        System.out.println("\n=== Demostración del Patrón State ===");
        EmergencyContext context = new EmergencyContext(fireEmergency);
        System.out.println("Estado actual: " + context.getCurrentState());
        context.evaluate();
        System.out.println("Estado actual: " + context.getCurrentState());
        context.respond();
        System.out.println("Estado actual: " + context.getCurrentState());
    }
}