# habilidade23-semana02

Projeto da Semana 02 do treinamento WorldSkills Skill 23 - Autonomous Mobile Robotics.

## Tema da semana

Ambiente WPILib/VS Code/MockDS.

## Fase

P0 - Ambiente oficial e lógica aplicada.

## Linguagem

Java.

## Objetivo

Validar o ambiente oficial de desenvolvimento com WPILib, VS Code, GradleRIO, MockDS, estrutura oficial de projeto Java, documentação técnica e evidências.

Nesta semana, o foco não é fazer o robô completar uma missão. O foco é provar que o ambiente está funcional, que o projeto compila, que a simulação de estados pode ser utilizada e que o processo está documentado com evidências claras de correção de falhas.

## Ferramentas utilizadas

- WPILib (2026)
- WPILib VS Code
- Java (JDK encapsulado)
- GradleRIO
- WPILib Simulation GUI / MockDS
- Git e GitHub

## Vendor libraries
- Verificação realizada no VS Code/WPILib.
- Nenhuma vendor library adicional ativa no projeto final devido a incompatibilidades de tag de ano (2026) com os arquivos legados da Studica/VMX em modo puramente doméstico.
- O mapeamento foi contornado utilizando a ferramenta de simulação nativa da WPILib para validação do fluxo lógico.

## Como Executar
- **Requisitos:** VS Code, WPILib Extension e JDK instalado via instalador oficial WPILib 2026.  
- **Como Abrir:** Abrir a pasta raiz `HABILIDADE23-SEMANA02` diretamente no VS Code.  
- **Como Compilar:** Pressionar `Ctrl + Shift + P` ou clicar no ícone da WPILib e selecionar `WPILib: Build Robot Code`.  
- **Como Testar:** Executar `WPILib: Simulate Robot Code on Desktop`, selecionar a extensão de simulação `halsim_gui` e utilizar a janela de estados (*Robot State*) para habilitar/desabilitar o robô nos modos Autônomo e Teleoperado.

## Estrutura do projeto

```text
habilidade23-semana02/
README.md
docs/
  semana-02/
    checklist_semana_02.md
    diario_tecnico_2026-06-01.md
    problemas_ambiente.md
evidencias/
  semana-02/
    prints/
    logs/
    videos/
    fotos/
src/
build.gradle
settings.gradle
gradlew
gradlew.bat
```

---

## 🔧 Evidências de Correção e Configuração

Durante a consolidação do ambiente e compilação do fluxo de estados, foram diagnosticados e corrigidos os seguintes pontos críticos na estrutura do projeto:

1. **Correção de Escopo de Pacotes (Packages/Imports):** Ajustada a árvore de diretórios e declarações das classes após o mapeamento identificar que o projeto Gradle estava encapsulado em subpasta, garantindo o build limpo do pacote `frc.robot.subsystems`.
2. **Correção de Sintaxe de Tempo (`Timer`):** Resolução de erro de compilação na chamada de telemetria de tempo no laço periódico, substituindo métodos antigos pela chamada estática oficial `Timer.getFPGATimestamp()`.

---

## 📜 Histórico Coerente de Commits (Marcos do Projeto)

O projeto seguiu uma linha do tempo incremental rigorosa de desenvolvimento, registrada no repositório remoto através dos seguintes commits principais:

* **Fase 1: Setup e Infraestrutura Base**
  - `docs: adiciona documentacao inicial da semana 02`
  - `chore: registra organizacao inicial do projeto`
  - `docs: registra instalacao do WPILib`
  - `docs: adiciona evidencias`

* **Fase 2: Homologação e Resolução de Falhas de Ambiente**
  - `test: registra build inicial do projeto WPILib`
  - `fix: registra problema de ambiente identificado`
  - `fix: remove vendor Studica incompatível e adiciona logs de estado`
  - `docs: registra falha do MockDS e evidencias do dia 2`

* **Fase 3: Implementação Lógica e Arquitetura POO**
  - `fix: corrige imports, timestamp do Timer e limpa a classe principal Robot`
  - `feat: cria pacote subsystems e implementa classe modular SystemHealth`

* **Fase 4: Validação de Logs e Encerramento**
  - `docs: finaliza checklist de prontidão e organiza arquivos de evidências`
  - `docs: finaliza diário técnico com as falhas solucionadas e métricas da entrega`
  - `chore: adiciona log de texto da simulação validando transições de estado`