# Problemas de Ambiente - Semana 02

## Projeto

- Nome: habilidade23-semana02
- Linguagem: Java
- Ambiente: WPILib/VS Code/MockDS
- Data de Fechamento: 05/06/2026

## Objetivo deste arquivo

Registrar problemas encontrados durante a instalação, criação, abertura, build, execução ou documentação do projeto. Cada problema deve conter sintoma, hipótese, teste, correção e evidência para garantir a rastreabilidade técnica.

---

## Problema 1 - Invalid Base Folder no WPILib New Project Creator

### Sintoma
Durante a criação do projeto através do VS Code (WPILib), apareceu o alerta impeditivo "Invalid Base Folder".

### Hipótese
O diretório raiz onde o projeto seria gerado não havia sido selecionado ou o campo foi limpo por engano.

### Teste realizado
Verificação visual do campo de caminho do diretório no assistente da WPILib, confirmando que o espaço estava em branco.

### Correção aplicada
Utilização do botão "Select a new project folder" para definir explicitamente um diretório válido no sistema de arquivos local.

### Resultado esperado após correção
O erro desapareceu e o botão de geração de projeto foi liberado para uso.

### Evidência relacionada
* `evidencias/semana-02/erro_folder_fix.png` (ou registro correspondente no diário de bordo)

---

## Problema 2 - Tentativa Incorreta de Importação de Classe do MockDS

### Sintoma
Erro de compilação acusando que o pacote `com.studica.frc.MockDS` ou similar não existia ao tentar importá-lo diretamente no arquivo `Robot.java`.

### Hipótese
Houve uma interpretação equivocada de que o simulador MockDS funcionava como uma biblioteca interna de código (Java API) e não como uma aplicação executável externa.

### Teste realizado
Análise do manual técnico do MockDS e da estrutura de dependências do `build.gradle`.

### Correção aplicada
Remoção do import inválido do código Java. O controle e comunicação com o simulador são feitos de forma externa via protocolos de rede locais padrão da Driver Station, sem necessidade de código de importação na classe principal.

### Resultado esperado após correção
Eliminação do erro de compilação de pacote inexistente durante o build.

### Evidência relacionada
* Histórico de alteração do arquivo `Robot.java` limpo de imports externos redundantes.

---

## Problema 3 - Ausência do Software Externo MockDS em Ambiente Doméstico

### Sintoma
Impossibilidade de executar o fluxo de testes simulados utilizando a ferramenta física/executável MockDS fora do laboratório/bancada oficial de treino.

### Hipótese
O executável do MockDS é uma ferramenta de uso local ou restrita à infraestrutura da bancada oficial.

### Teste realizado
Tentativa de localização e execução do utilitário fora da rede de treino.

### Solução/Contorno Aplicada
Utilizou-se de forma alternativa o painel nativo de Driver Station integrado na interface gráfica de simulação da WPILib (WPILib Simulation GUI). Isso permitiu alternar os modos de operação (Enable/Disable) de maneira lógica e validar a geração correta dos logs de telemetria.

### Resultado esperado após correção
Os estados do robô puderam ser simulados com sucesso, gerando as mensagens de log necessárias mesmo sem o software externo.

### Evidência relacionada
* Logs capturados no console simulado registrando as transições de modo do robô.

---

## Problema 4 - Erro de Sintaxe no Registro de Tempo (Timer)

### Sintoma
O método `getTimer()` ficou sublinhado em vermelho no editor de código, gerando falha impeditiva durante a execução do comando de Build.

### Hipótese
Confusão de sintaxe com os métodos nativos disponibilizados pela biblioteca padrão da WPILib.

### Teste realizado
Consulta à documentação oficial da API da WPILib para localização da classe responsável pela marcação de tempo do processador (FPGA).

### Correção aplicada
Substituição da chamada incorreta pelo método estático `Timer.getFPGATimestamp()` e adição manual do cabeçalho de importação `import edu.wpi.first.wpilibj.Timer;`.

### Resultado esperado após correção
Código compilando sem erros de sintaxe relacionados à contagem de tempo.

### Evidência relacionada
* Build bem-sucedido exibido no terminal integrado do VS Code.

---

## Problemas Verificados e Consolidados

| Problema / Entregável | Status | Observação |
|---|---|---|
| **Build do Projeto** | **Resolvido** | Executado via terminal com sucesso (sintaxe e dependências íntegras). |
| **MockDS / Simulação** | **Resolvido** | Validado através do painel nativo da GUI de simulação como contorno doméstico. |
| **Git / Commits** | **Resolvido** | Histórico consolidado utilizando prefixos técnicos padronizados (`feat:`, `docs:`, etc.). |
| **README** | **Resolvido** | Documentado com as métricas de tempo de build coletadas ao final da semana. |
| **Vendor Libraries** | **Verificado** | Confirmado que nenhuma biblioteca de fabricante terceirizada era necessária para esta etapa inicial. |

## Observação final

Todos os problemas iniciais de configuração de ambiente e sintaxe lógica foram mitigados com sucesso. O projeto encerra a Semana 02 em estado **100% íntegro**, com todas as evidências de transição de estado coletadas e documentadas na pasta oficial.