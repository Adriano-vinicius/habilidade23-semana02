package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.SystemHealth;

public class Robot extends TimedRobot {
 private final SystemHealth m_robotHealth = new SystemHealth();
  @Override
  public void robotInit() {
    System.out.println("[HELLO ROBOT] Sistema iniciado com sucesso!");
    SmartDashboard.putString("Status Robo", "Iniciado");
    m_robotHealth.logInit();
  }

  @Override
  public void robotPeriodic() {
    // Roda a cada 20ms, independente do estado do robô
  }

  @Override
  public void autonomousInit() {
    System.out.println("[MODO] Robo entrou em modo Autônomo!");
    SmartDashboard.putString("Modo Atual", "Autônomo");
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    // Roda uma vez quando o robô é HABILITADO em modo Teleoperado (User Control)
    System.out.println("[MODO] Robo entrou em modo Teleoperado - Pronto para comandos!");
    SmartDashboard.putString("Modo Atual", "Teleoperado");
    m_robotHealth.logTeleop();
  }

  @Override
  public void teleopPeriodic() {
    // Roda repetidamente enquanto o robô estiver habilitado em Teleop
    SmartDashboard.putNumber("Tempo de Execucao", Timer.getFPGATimestamp());
  }

  @Override
  public void disabledInit() {
    // Roda uma vez quando o robô é DESABILITADO
    System.out.println("[MODO] Robo foi DESABILITADO!");
    SmartDashboard.putString("Modo Atual", "Desabilitado");
    m_robotHealth.logDisabled();
  }

  @Override
  public void disabledPeriodic() {
  }
}