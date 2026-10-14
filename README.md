# Zoo – Herança em Java

Exercício de orientação a objetos em Java: um zoológico com animais modelados por herança.

## Estrutura

```
zoo/
├── Animal.java        # Classe base (nome, cor, ambiente, comprimento, velocidade, patas)
├── Peixe.java         # Estende Animal (0 patas, ambiente "mar", cor "cinzenta" por padrão)
├── Mamifero.java      # Estende Animal (ambiente "terra" por padrão, alimento preferido)
└── TesteAnimais.java  # Programa principal: camelo, tubarão e urso-do-canadá
```

## Classes

- **Animal**: construtor `Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas)`, métodos `altera...` para cada atributo, métodos de consulta (`nome()`, `cor()`, `ambiente()`, `comprimento()`, `velocidade()`, `patas()`) e `dados()`, que imprime os dados do animal.
- **Peixe**: construtor `Peixe(String nome, String caracteristica, int comprimento, float velocidade)`, com `alteraCaracteristica()`, `caracteristica()` e `dados()`.
- **Mamifero**: construtor `Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas)`, com `alteraAlimento()`, `alimento()` e `dados()`.

## Como executar

Requisito: JDK 8 ou superior.

```bash
javac *.java
java TesteAnimais
```

## Exemplo de saída

```
Zoo:
-------------------------------
Animal: Camelo
Comprimento: 150 cm
Patas: 4
...
```
