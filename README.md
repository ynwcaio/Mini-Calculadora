# Calculadora Simples em Java

Este projeto é uma calculadora básica desenvolvida em Java utilizando a biblioteca Swing para a interface gráfica. O aplicativo permite realizar operações aritméticas simples: soma, subtração, multiplicação e divisão.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para implementar a lógica da calculadora e a interface gráfica.
- **Swing**: Biblioteca gráfica do Java usada para criar a interface gráfica do usuário (GUI). Utiliza `JFrame` como o contêiner principal da janela da aplicação.
- **JFrame**: Componente central da biblioteca Swing utilizado para criar e gerenciar a janela principal da aplicação.
- **AWT (Abstract Window Toolkit)**: Biblioteca complementar usada para manipulação de gráficos e eventos básicos, embora a maior parte do trabalho gráfico seja feito com Swing.

## Estrutura do Projeto

O projeto é dividido em duas classes principais:

### `Calcula_DAO`

A classe `Calcula_DAO` contém a lógica para realizar operações aritméticas e atualizar a interface gráfica com os resultados. Os principais métodos são:

- **`soma()`**: Lê os valores dos campos de texto `valor1_txt` e `valor2_txt`, calcula a soma e exibe o resultado em `r_txt`. Após a operação, os campos de entrada são limpos.
- **`subtracao()`**: Lê os valores dos campos de texto `valor1_txt` e `valor2_txt`, calcula a subtração e exibe o resultado em `r_txt`. Após a operação, os campos de entrada são limpos.
- **`divisao()`**: Lê os valores dos campos de texto `valor1_txt` e `valor2_txt`, calcula a divisão e exibe o resultado em `r_txt`. Após a operação, os campos de entrada são limpos. **Nota:** A divisão por zero não é tratada e pode causar uma exceção.
- **`multiplicacao()`**: Lê os valores dos campos de texto `valor1_txt` e `valor2_txt`, calcula a multiplicação e exibe o resultado em `r_txt`. Após a operação, os campos de entrada são limpos.

#### Dependências

- `valor1_txt`: Campo de texto para o primeiro valor da operação.
- `valor2_txt`: Campo de texto para o segundo valor da operação.
- `r_txt`: Campo de texto onde o resultado da operação é exibido.

### `Main`

A classe `Main` é o ponto de entrada do aplicativo. Ela cria e exibe a interface gráfica ao instanciar a classe `Inicio_GUI` e torná-la visível.

## Instruções de Uso

1. Compile o projeto Java usando uma IDE (como Eclipse ou IntelliJ IDEA) ou via linha de comando com `javac`.
2. Execute a classe `Main` para iniciar o aplicativo e exibir a interface gráfica.
3. Insira valores nos campos de texto e clique nos botões para realizar as operações aritméticas.
