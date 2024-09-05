# Projeto Calculadora Java

Este projeto é uma calculadora simples desenvolvida em Java, utilizando uma interface gráfica baseada em `JFrame` e `Swing` para operações aritméticas básicas como soma, subtração, multiplicação e divisão.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada para implementar a lógica e a interface gráfica do aplicativo.
- **Swing**: Biblioteca de componentes gráficos do Java utilizada para criar a interface gráfica do usuário (GUI). `JFrame` é usado como o contêiner principal da janela da aplicação.
- **JFrame**: Componente de janela principal do Swing, utilizado para exibir a interface gráfica do usuário.
- **Java AWT**: Usado para manipulação de cores e outros elementos gráficos básicos.
- **Maven** ou **Gradle**: (Opcional) Gerenciadores de dependências e construção de projetos, se utilizados para gerenciamento e construção do projeto.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

### `Calcula_DAO`

A classe `Calcula_DAO` contém a lógica para realizar operações matemáticas e atualizar a interface gráfica com os resultados. É responsável por:

- **Soma:** Adiciona dois valores e exibe o resultado.
- **Subtração:** Subtrai um valor do outro e exibe o resultado.
- **Divisão:** Divide um valor pelo outro e exibe o resultado. (Nota: A divisão por zero não é tratada neste código, o que pode causar uma exceção.)
- **Multiplicação:** Multiplica dois valores e exibe o resultado.

#### Métodos

- **`soma()`**: Lê os valores dos campos `valor1_txt` e `valor2_txt`, calcula a soma e exibe o resultado em `r_txt`. Limpa os campos de entrada após a operação.
- **`subtracao()`**: Lê os valores dos campos `valor1_txt` e `valor2_txt`, calcula a subtração e exibe o resultado em `r_txt`. Limpa os campos de entrada após a operação.
- **`divisao()`**: Lê os valores dos campos `valor1_txt` e `valor2_txt`, calcula a divisão e exibe o resultado em `r_txt`. Limpa os campos de entrada após a operação.
- **`multiplicacao()`**: Lê os valores dos campos `valor1_txt` e `valor2_txt`, calcula a multiplicação e exibe o resultado em `r_txt`. Limpa os campos de entrada após a operação.

#### Dependências

A classe `Calcula_DAO` interage com os seguintes componentes da interface gráfica:

- `valor1_txt`: Campo de texto para o primeiro valor.
- `valor2_txt`: Campo de texto para o segundo valor.
- `r_txt`: Campo de texto para exibir o resultado.

### `Main`

A classe `Main` é o ponto de entrada do aplicativo e é responsável por criar e exibir a interface gráfica. Ela instância a classe `Inicio_GUI` e torna a interface visível.

## Instruções de Uso

1. Compile o projeto Java usando uma IDE (como Eclipse ou IntelliJ IDEA) ou via linha de comando com `javac`.
2. Execute a classe `Main` para iniciar o aplicativo.
3. A interface gráfica será exibida. Insira os valores nos campos de texto e clique nos botões para realizar as operações aritméticas.
