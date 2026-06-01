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