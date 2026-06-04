# Diário Técnico Individual - Semana 02

## Identificação

- **Competidor:** Adriano
- **Data:** 04/06/2026
- **Projeto:** habilidade23-semana02
- **Linguagem:** Java
- **Tema:** Ambiente WPILib / VS Code / Fluxo de Enable-Disable e Telemetria
- **Sessão:** Sessão Final - Entrega e Validação de Fluxo

## Objetivo da sessão

Instalar, configurar e validar o ambiente oficial de desenvolvimento com WPILib, VS Code e estrutura oficial do projeto Java. O objetivo principal é implementar e demonstrar o fluxo básico de *enable/disable* funcionando na simulação, comandos iniciais organizados em subsistemas, telemetria mínima via SmartDashboard, logs visíveis no console e o repositório devidamente versionado com commits funcionais.

## O que eu executei

- Baixei, instalei e configurei o ambiente WPILib + VS Code recomendado.
- Criei o projeto Java utilizando o template oficial da WPILib (`TimedRobot`).
- **Arquitetura e POO:** Criei o pacote `subsystems` e externalizei a lógica de telemetria criando a classe `SystemHealth.java`, instanciando-a como objeto (`m_robotHealth`) na classe principal `Robot.java`[cite: 3].
- Implementei o fluxo completo de logs via terminal e SmartDashboard para os estados `robotInit`, `autonomousInit`, `teleopInit` e `disabledInit`[cite: 3].
- Executei com sucesso a ferramenta de simulação nativa da WPILib (`WPILib Simulation GUI`) para transicionar os modos de operação e validar o comportamento do robô.
- Organizei a pasta de evidências e padronizei o nome de todos os prints gerados.
- Realizei o fracionamento das mudanças em múltiplos commits técnicos no Git e fiz o *push* definitivo para o GitHub.

## Comandos ou ações realizadas

- Execução do **WPILib: Build Robot Code** para compilação do projeto.
- Execução do **WPILib: Simulate Robot Code on Desktop** para validação em ambiente doméstico.
- Ajustes de sintaxe no uso da classe estática `Timer.getFPGATimestamp()`[cite: 3].
- Organização dos arquivos markdown de documentação na estrutura padrão:
  - `README.md`
  - `docs/semana-02/checklist_semana_02.md`
  - `docs/semana-02/diario_tecnico_2026-06-01.md` (e atualizações de encerramento)
  - `docs/semana-02/problemas_ambiente.md`
- Comandos Git utilizados para contornar a estrutura de subpastas trancadas e conflitos do remoto:
```bash
  git add habilidade23-semana02/src/main/java/frc/robot/Robot.java
  git commit -m "fix: corrige imports, timestamp do Timer e limpa a classe principal Robot"
  
  git add habilidade23-semana02/src/main/java/frc/robot/subsystems/SystemHealth.java
  git commit -m "feat: cria pacote subsystems e implementa classe modular SystemHealth"
  
  git add docs/ evidencias/
  git commit -m "docs: finaliza checklist de prontidão e organiza arquivos de evidências"
  
  git push origin main --force
  ```

## Estrutura final de evidências (Verificada)

- `evidencias/semana-02/prints/`
  - `Erro criação do projeto.png`
  - `Estrutura codigo dia 1.png`
  - `Instalação WPILib.png`
  - `Simulação (Telemetria).png`
  - `Sucesso (Build).png`
- `evidencias/semana-02/logs/` (Contendo as saídas de texto do terminal de simulação)

## Falhas encontradas e Solucionadas

### Falha 1 - Base Folder inválido na criação do projeto
- **Sintoma:** O gerador de projetos da WPILib exibiu "Invalid Base Folder".
- **Causa:** O campo de destino estava vazio no assistente.
- **Correção:** Selecionada a pasta raiz correta do repositório local.

### Falha 2 - Team Number obrigatório
- **Sintoma:** Campo em vermelho impedindo a geração do template.
- **Causa:** Exigência de um número identificador de equipe para o padrão GradleRIO.
- **Correção:** Preenchido com um número temporário padrão de simulação para liberar o ambiente.

### Falha 3 - Incompatibilidade da Vendor Library Studica (2026) e MockDS
- **Sintoma:** O GradleRIO bloqueou a dependência da Studica devido à falta de uma tag de ano válida compatível com a WPILib 2026.
- **Causa:** Incompatibilidade temporária da biblioteca fornecida para ambiente puramente doméstico.
- **Correção:** Substituição pedagógica pelo simulador nativo `WPILib Simulation GUI`. A ferramenta cumpre 100% da meta ao injetar pacotes de Driver Station virtuais, permitindo testar as transições de *enable/disable* e telemetria em tempo real.

### Falha 4 - Erro de compilação com a classe Timer
- **Sintoma:** Build quebrado no método `getTimer()`.
- **Causa:** Confusão de sintaxe na chamada de medição de tempo de execução.
- **Correção:** Alterado para o método estático nativo correto `Timer.getFPGATimestamp()` e adicionado o respectivo `import edu.wpi.first.wpilibj.Timer;`[cite: 3].

### Falha 5 - Erro de referência "Unresolved Type" no VS Code (Imports/Packages)
- **Sintoma:** Código inteiro sublinhado em vermelho nas declarações da classe `SystemHealth` e no `package frc.robot`.
- **Causa:** O projeto Gradle foi gerado dentro de uma subpasta com letras minúsculas (`habilidade23-semana02`), alterando o caminho esperado pelo compilador e pelo Git.
- **Correção:** Correção da linha 1 do subsistema para `package frc.robot.subsystems;` e inclusão do `import frc.robot.subsystems.SystemHealth;` no topo do arquivo principal `Robot.java`[cite: 3].

## Evidências geradas

- [x] Prints de tela capturados, renomeados e organizados por contexto na pasta de evidências.
- [x] Logs de texto gerados pela simulação salvos localmente.
- [x] Histórico de commits funcionais gerados via terminal.

## O que eu consigo explicar ao treinador

- O fluxo de *enable/disable* altera o estado interno do robô garantindo segurança mecânica em pista; o código implementado responde visualmente a cada uma dessas transições no console e no dashboard.
- O build bem-sucedido valida exclusivamente a sintaxe do Java, a compilação das classes e a resolução de dependências do Gradle, mas não garante o comportamento lógico correto dos motores em pista.
- A classe modular `SystemHealth` aplica os conceitos de Programação Orientada a Objetos para isolar a responsabilidade de telemetria diagnóstica, evitando códigos monolíticos e facilitando rotinas de *fault-finding* durante a competição.

## Métricas Coletadas

- **Tempo de Setup:** 10 minutos.
- **Tempo de Checklist:** 15 minutos.
- **Tempo de Build:** 1 minute.
- **Tempo de Diagnóstico:** 2 horas.
- **Tempo de Recovery:** 25 minutos (incluindo correções de sintaxe de código, imports e caminhos do Git).

## Respostas de Avaliação Técnica
- **O que um build bem-sucedido prova e o que ele ainda não prova?** Prova que a sintaxe do Java está correta e as dependências estão resolvidas; não prova que a lógica do robô funcionará em pista ou que os motores se moverão de forma certa.
- **Qual a responsabilidade do primeiro subsistema criado (SystemHealth)?** Centralizar e gerenciar as mensagens de diagnóstico de integridade e transições de estado do robô sem poluir o arquivo principal.
- **Por que colocar tudo no arquivo principal (Robot.java) prejudica o fault-finding?** Porque gera um código monolítico denso, dificultando a localização rápida de bugs específicos e violando a modularidade da WPILib.

## O que ainda preciso corrigir ou finalizar

- **Nenhuma pendência.** O projeto encontra-se 100% concluído, testado por simulação, com documentações preenchidas e sincronizado com o repositório remoto no GitHub.