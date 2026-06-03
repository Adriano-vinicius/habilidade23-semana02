# Diário Técnico Individual - Semana 02

## Identificação

- Competidor: Adriano
- Data: 01/06/2026
- Projeto: habilidade23-semana02
- Linguagem: Java
- Tema: Ambiente WPILib/VS Code/MockDS
- Sessão: Sessão 1 - Ambiente

## Objetivo da sessão

Instalar e conferir o ambiente oficial de desenvolvimento com WPILib, VS Code, vendor libraries, MockDS e estrutura oficial do projeto Java. O objetivo principal do dia é deixar o projeto base compilando e registrar evidências do ambiente funcionando.

## O que eu executei até agora

- Baixei/instalei o VS Code.
- Criei o repositório com o nome habilidade23-semana02.
- Instalei/conferi o WPILib.
- Criei o projeto WPILib em Java com o nome habilidade23-semana02.
- Iniciei a organização da documentação da Semana 02.
- Criei a estrutura de pastas para documentação e evidências.

## Comandos ou ações realizadas

- Abri o instalador do WPILib.
- Escolhi a instalação com VS Code recomendado pelo WPILib.
- Abri o WPILib VS Code.
- Acessei o criador de novo projeto WPILib.
- Criei um projeto Java.
- Organizei os arquivos de documentação:
  - README.md
  - docs/semana-02/checklist_semana_02.md
  - docs/semana-02/diario_tecnico_2026-06-01.md
  - docs/semana-02/problemas_ambiente.md

## Estrutura criada para evidências

- evidencias/semana-02/prints
- evidencias/semana-02/logs
- evidencias/semana-02/videos
- evidencias/semana-02/fotos

## Verificações pendentes

- Confirmar se o projeto está aberto na pasta raiz correta.
- Confirmar se os arquivos build.gradle e settings.gradle aparecem na raiz.
- Executar o build do projeto.
- Salvar print ou log do build.
- Abrir o MockDS.
- Salvar print do MockDS.
- Fazer commit técnico das etapas.
- Atualizar o README com o resultado real do build e do MockDS.

## Falhas encontradas

### Falha 1 - Base Folder inválido na criação do projeto

- Sintoma: A tela do WPILib New Project Creator mostrou a mensagem "Invalid Base Folder".
- Hipótese: A pasta base onde o projeto seria criado ainda não tinha sido selecionada.
- Teste: Verifiquei que o campo da pasta base estava vazio.
- Correção: Selecionar uma pasta válida para criar ou armazenar o projeto.
- Reteste: Conferir se o aviso desaparece antes de gerar o projeto.

### Falha 2 - Team Number obrigatório

- Sintoma: O campo Team Number apareceu em vermelho.
- Hipótese: O projeto WPILib exige um número de equipe para gerar o projeto.
- Teste: Verifiquei que o campo estava vazio.
- Correção: Inserir o número informado pelo treinador ou usar um valor temporário até receber o número oficial.
- Reteste: Confirmar se o projeto é gerado corretamente.

### Falha 3 
O MockDS oficial da Studica foi pesquisado e testado, mas a vendor library disponível para VMX/Studica está incompatível com o projeto WPILib/GradleRIO 2026 atual. O GradleRIO bloqueou a dependência porque o arquivo Studica não possui ano válido para 2026. Por isso, o projeto foi mantido compilando com logs de enable/disable usando a DriverStation/WPILib, e a pendência do MockDS ficou registrada para validação com uma vendor library Studica 2026 compatível.

## Evidências geradas ou planejadas

- Print do projeto aberto no VS Code.
- Print dos arquivos Gradle visíveis na raiz.
- Print ou log do build bem-sucedido.
- Print do MockDS aberto.
- Checklist preenchido.
- README atualizado.
- Commits técnicos no Git.

## Commits planejados

- docs: adiciona documentacao inicial da semana 02
- chore: organiza pastas de evidencias da semana 02
- test: registra build inicial do projeto WPILib
- test: registra verificacao inicial do MockDS

## O que eu consigo explicar ao treinador

- O projeto da Semana 02 é um projeto Java com WPILib.
- O objetivo do Dia 1 é validar o ambiente, não fazer o robô executar uma missão.
- A pasta raiz correta deve mostrar arquivos como build.gradle, settings.gradle, gradlew, gradlew.bat e src.
- O build serve para provar que o projeto está compilando.
- O MockDS será usado para testar o fluxo de enable/disable.
- As evidências precisam ter contexto, data e relação com o que foi testado.

## Métricas Coletadas:  

- Tempo de Setup: 10 minutos.  
- Tempo de Checklist: 15 minutos.  
- Tempo de Build: 1 minuto.  
- Tempo de Diagnóstico: 2 horas.  
- Tempo de Recovery: 10 minutos.

## Respostas de Avaliação Técnica (Itens obrigatórios do manual):  
- O que um build bem-sucedido prova e o que ele ainda não prova? Prova que a sintaxe do Java está correta e as dependências estão resolvidas; não prova que a lógica do robô funcionará em pista ou que os motores se moverão de forma certa.  
- Qual a responsabilidade do primeiro subsistema criado (SystemHealth)? Centralizar e gerenciar as mensagens de diagnóstico de integridade e transições de estado do robô sem poluir o arquivo principal.  
- Por que colocar tudo no arquivo principal (Robot.java) prejudica o fault-finding? Porque gera um código monolítico denso, dificultando a localização rápida de bugs específicos e violando a modularidade da WPILib.

## O que ainda preciso corrigir ou finalizar

- Executar o build.
- Registrar evidência do build.
- Abrir o MockDS.
- Registrar evidência do MockDS.
- Fazer commits técnicos.
- Enviar o projeto para o GitHub.