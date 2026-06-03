# Problemas de Ambiente - Semana 02

## Projeto

- Nome: habilidade23-semana02
- Linguagem: Java
- Ambiente: WPILib/VS Code/MockDS
- Data: 01/06/2026

## Objetivo deste arquivo

Registrar problemas encontrados durante a instalação, criação, abertura, build, execução ou documentação do projeto. Cada problema deve conter sintoma, hipótese, teste, correção e evidência.

---

## Problema 1 - Invalid Base Folder no WPILib New Project Creator

### Sintoma

Durante a criação do projeto, apareceu a mensagem "Invalid Base Folder".

### Hipótese

A pasta base onde o projeto seria criado ainda não tinha sido selecionada.

### Teste realizado

Verifiquei que o campo da pasta base estava vazio e que o botão de gerar projeto não deveria ser usado antes de selecionar uma pasta válida.

### Correção aplicada

Selecionar uma pasta válida para o projeto no botão "Select a new project folder".

### Resultado esperado após correção

O erro "Invalid Base Folder" deve desaparecer e o projeto deve poder ser gerado.

### Evidência relacionada

Print da tela do WPILib New Project Creator com o erro ou print posterior com a pasta correta selecionada.

---
## Problema 2: MockDS não reconhecido no projeto Java

### Sintoma
Ao importar a classe MockDS no Robot.java:

{```java
import com.studica.frc.MockDS;}

---
## Problema 3:
Problema: Ausência do software externo MockDS no ambiente doméstico, visto que o manual prevê sua utilização direta na bancada de treino.  

Solução/Contorno: Utilizada a simulação nativa de Driver Station integrada à GUI do WPILib Simulation para alternar os estados do robô (Enable/Disable) e validar com sucesso a geração dos logs de telemetria exigidos.

---

## Problema 4:
Erro de Sintaxe no Registro de Tempo:

Sintoma: Método getTimer() sublinhado em vermelho impedindo o Build.Causa: Confusão de sintaxe com o método nativo da WPILib.

Solução: Substituído pelo método estático correto Timer.getFPGATimestamp() e adicionado o import edu.wpi.first.wpilibj.Timer;.  

## Problema 5:
Ausência do Software MockDS:

Sintoma: Impossibilidade de executar o fluxo externo em ambiente doméstico.  

Causa: O MockDS é uma ferramenta de bancada pré-instalada no laboratório.  

Solução: Utilizado o painel interno de Driver Station do ambiente de simulação nativo (WPILib Simulation GUI) para transicionar os modos de operação e coletar as evidências.

## Problemas pendentes de verificação

| Problema | Status | Observação |
|---|---|---|
| Build do projeto | Pendente | Ainda precisa ser executado e registrado |
| MockDS | Pendente | Ainda precisa ser aberto e registrado |
| Git/commits | Pendente | Ainda precisa fazer commits técnicos |
| README | Em andamento | Criado, mas precisa ser atualizado após build e MockDS |
| Vendor libraries | Pendente | Conferir se há necessidade de adicionar alguma biblioteca |

## Observação final

Até o momento, os problemas registrados são de configuração inicial e organização. Nenhuma falha crítica de build foi confirmada ainda, pois o build ainda precisa ser executado.