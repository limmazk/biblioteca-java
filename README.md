# 📚 Sistema de Biblioteca - Gestão de Empréstimos

Este projeto em **Java** foi desenvolvido para aprofundar os conhecimentos em **Passagem de Referência**, **Encapsulamento** e **Lógica de Estados**. O sistema simula o processo de empréstimo de livros, validando a disponibilidade do exemplar e interagindo com os dados de utilizadores.

##  Objetivos do Projeto

O foco principal foi entender como objetos de classes diferentes (`Livro` e `Usuario`) podem interagir de forma inteligente:

* **Encapsulamento Total:** Todos os atributos (`autor`, `titulo`, `disponivel`, `nome`, `id`) estão protegidos como `private`, sendo acedidos apenas via métodos `Getters` e `Setters`.
* **Gestão de Estado:** O sistema valida se um livro pode ou não ser emprestado através de uma variável booleana, impedindo duplicidade de empréstimos.
* **Interação entre Objetos:** Prática de métodos que recebem referências de outros objetos para processar informações.

## 📖 Como Funciona?

1.  **Classe `Usuario`:** Armazena os dados de quem frequenta a biblioteca.
2.  **Classe `Livro`:** Contém os detalhes do livro e o método `emprestimo()`.
3.  **Fluxo de Empréstimo:**
    - O sistema verifica o atributo `disponivel`.
    - Se `true`, o empréstimo é autorizado e o status do livro é alterado.
    - Se `false`, o sistema emite um alerta informando que o livro já se encontra com outro leitor.

## 📂 Estrutura de Ficheiros

- `Main.java`: Cria os objetos, define os valores iniciais e executa a simulação.
- `Livro.java`: Classe que gere as regras dos livros e ações de empréstimo.
- `Usuario.java`: Classe que representa o cliente da biblioteca.

---
Projeto desenvolvido durante a minha jornada de aprendizagem em Java. Sente-te à vontade para dar feedback ou sugestões! ☕
