package frc.robot.subsystems;

public class SystemHealth {
  private String ultimoEstado = "";

  public void logInicializacao() {
    System.out.println("[SEMANA 02] robotInit: sistema inicializado");
  }

  public void logEstado(String estado) {
    if (!estado.equals(ultimoEstado)) {
      System.out.println("[SEMANA 02] mode: " + estado);
      ultimoEstado = estado;
    }
  }
}