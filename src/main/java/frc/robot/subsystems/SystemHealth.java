package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SystemHealth {
    
    public SystemHealth() {
    }

    public void logInit() {
        System.out.println("[HELLO ROBOT] Sistema iniciado com sucesso!");
        SmartDashboard.putString("Status Robo", "Inicializado");
    }

    public void logDisabled() {
        System.out.println("[MODO] Robo foi DESABILITADO!");
        SmartDashboard.putString("Status Robo", "Desabilitado");
    }

    public void logTeleop() {
        System.out.println("[MODO] Robo entrou em modo Teleoperado - Pronto para comandos!");
        SmartDashboard.putString("Status Robo", "Teleoperado");
    }
}