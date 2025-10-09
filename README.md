<div align="center">

# 🏦 Banco do Brazil com Z

</div>

Um sistema de simulação bancária em Java, desenvolvido com base em conceitos de Programação Orientada a Objetos (POO), utilizando classes, herança, polimorfismo e encapsulamento.
O projeto permite gerenciar contas bancárias, realizar operações financeiras e simular um pequeno sistema de banco no console.

---

<div align="center">

## 🚀 Funcionalidades

</div>

- ✅ Criar nova conta (Corrente ou Poupança)
- ✅ Listar todas as contas cadastradas
- ✅ Buscar conta pelo número
- ✅ Atualizar dados de uma conta existente
- ✅ Excluir conta
- ✅ Realizar saque e depósito
- ✅ Fazer transferência entre contas
- ✅ Buscar contas pelo nome do titular

---

<div align="center">

## 🧠 Conceitos utilizados

</div>

- Programação Orientada a Objetos (POO)
- Classes e Objetos
- Herança
- Polimorfismo
- Encapsulamento
- Tratamento de exceções (try/catch)
- Estruturas de decisão e repetição
- Coleções (ArrayList)
- Pacotes e organização de código

---

<div align="center">

## 🏗️ Estrutura do projeto

</div>

```text
conta_bancaria/
├── controller/
│   └── ContaController.java     # Lógica de controle e operações bancárias
├── model/
│   ├── Conta.java               # Classe abstrata base
│   ├── ContaCorrente.java       # Herda de Conta
│   └── ContaPoupanca.java       # Herda de Conta
├── util/
│   └── Cores.java               # Códigos ANSI para colorir o terminal
└── Menu.java                    # Classe principal (interface via terminal)
```

---

<div align="center">

## 💻 Tecnologias utilizadas

</div>

1. Java 17+
2. Eclipse IDE / VS Code (opcional)
3. Terminal/Console para execução

---

<div align="center">
  
## ⚙️ Como executar o projeto

</div>

1. Clone o repositório:
```text
git clone https://github.com/seuusuario/banco-do-brazil-com-z.git
```

2. Abra o projeto em sua IDE Java (Eclipse, IntelliJ ou VS Code).
- Compile e execute o arquivo Menu.java.
- Use o menu interativo no terminal para testar as funções do sistema.

---

<div align="center">

## 🧩 Exemplo de uso

```text
*****************************************************
                BANCO DO BRAZIL COM Z
*****************************************************
1 - Criar Conta
2 - Listar todas as Contas
3 - Buscar Conta por Número
4 - Atualizar Dados da Conta
5 - Apagar Conta
6 - Sacar
7 - Depositar
8 - Transferir valores entre Contas
9 - Procurar pelo Titular da Conta
0 - Sair
*****************************************************
Entre com a opção desejada: 
```

</div>

---

<div align="center">
  
## 👩‍💻 Desenvolvido por

- Nicolly Jesus
- https://www.linkedin.com/in/nicolly-jesus/
- Data: 2025

</div>
