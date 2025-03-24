# Sintaxes da Linguagem Java

## Assuntos:
    * Estrutura Inicial
    * Padrão de Nomenclatura
    * Declarando Variáveis e Metodos
    * Identação
    * Organizando Arquivos
    * Java Beans

## Para saber mais:
    * [GIT Book DIO](https:/glysns.gitbook.io/java-basico/)

## Anatomia das Classes
### Uma Classe Bem Estruturada Não Quer Gerra Com Ninguém :)


* A escrita de um código Java é feita através da composição de palavras pré definidas pela lnguagem pelas expressões que ultilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.
É muito comum mesclarmos expressões em inglês com o português para facilitar a escrita de um código. Existem projetos que recomendam que toda a implementação do seu programa seja escrita na lingua inglesa.
~~~java
public class MinhaClasse {
    //Seu Codigo aqui
}
~~~ 
### Padrão de Nomenclatura
Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo:
* ***Arquivo .java***:Todo arquivo .java deve começar com LETRA MAIÚSCULA.
Se a palavra for composta, a segunda palavra deve também ser escrita com a primeira letra maiúscula.
- Exemplo: Calculadora.java || CalculadoraDeJuros.java
* ***Nome de Classe no Arquivo:*** A classe deve possuir o mesmo nome do arquivo .java.
- Exemplo: 
1 // arquivo: CalculadoraDeJuros.java
2 public class CalculadoraDeJuros {

}

## Variáveis
### ***Nome da Variável:*** Toda Variável deve começar com letra minúscula, porem se a palavra for composta, a segunda palavra deve também ser escrita com a primeira letra MAIÚSCULA.
- Exemplo: nomeCliente || nomeDoCliente || numeroConta
O nome dessa prática é chamado de Camel Case.

&#8471; Existe uma regra adcional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor.
- Exemplo: Queremos determinar que uma variável ***BR*** sempre apresentará o valor ***Brasil*** e nunca mudará seu valor, logo determinamos como escrita o código abaixo:


Stringg BR = "Brasil";
double PI = 3.14;
int ESTADOS_BRASILEIROS = 27;
int ANO_2000 = 2000;

~~~java
public class MinhaClasse { 
    public static void main(String[] args) {
        final String BR = "Brasil";
        final double PI = 3.14;
        final int ESTADOS_BRASILEIROS = 27;
    }
}
~~~

### ***Regras das Variáveis:***
- Deve conter apenas letras, _(underline)_, ou $ (cifrão) ou os números de 0 a 9;

- Deve obrigatóriamente iniciar com uma letra (Preferenciamente), _ ou $, jamais com números;
- Deve iniciar com letra minúscula; (Boa Prática)
- Não pode conter espaços em branco;
- Não podemos usar palavras reservadas;
- Onome deve ser unico dentro de um mesmo escopo;
### ***Declarando Variáveis e Métodos:***
Como identificar entre declaração de variáveis e declaração de métodos em nosso programa? Existe uma estrutura comum para ambas as finalidades.
Exemplo:
Declarar uma variável em java, use sempre a seguinte estrutura:
~~~java
Tipo nomeDaVariavel = Atribuição (Opcional em alguns casos);
||Exemplo:
int idade = 10;
double altura = 1.80;
Dog spyke; \\Observe que não atribuimos valor a variável spyke
~~~
### ***Métodos:***
Declaração de métodos em java, use sempre a seguinte estrutura:
~~~java
TipoRetorno nomeObjetivoInfinitivo Parametros
//Exemplo:
int somar(int numeroUm, int numeroDois) {
    return numeroUm + numeroDois;    
   int resultado = somar(10, 20);
   System.out.println(resultado);
   ***Identa
}
~~~
### ***Identação:***
A identação é uma prática que permite melhorar a legibilidade do código.
Basicamente identar é um termo ultilizado para escrever o código do programa de forma que as linhas de código sejam alinhadas, facilitando a visualização e o intendimento do programa.

### ***Java Beans:***
Java Beans é um padrão de desenvolvimento de software que visa facilitar a construção de componentes de software.
Uma das maiores dificuldades na programação é escrever algoritimos legíveis a niveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere, através de uma convenção, formas de escrita universal para nossas classes, atributos, métodos e pacotes.
#### *Variáveis* ####
- Uma variável deve ser clara, sem abreviações ou definições sem sentido.
- Uma variável é sempre no singular, ***Exeto quando se referir a um array ou coleções***.
- Defina um idioma unico para suas variáveis, se for declarar variáveis em inglês, mantenha-se nesse idioma.
#### *Métodos* ####
Os metodos devem ser nomeados como verbos, através de uma mistura de letras minusculas e maiúsculas. Em principio, todas as letras que compõem o nome devem ser mantidas em letras minúsculas, exceto quando se tratar de uma palavra composta.
- Exemplo:
~~~java
somarNumeros() {}
abrirConexao() {}
fecharConexao(){}
concluirProcessamento(){}
~~~

## ***Metodos*** ##
***Todas as ações das aplicações são consideradas métodos.***
- Uma classe é definida por atributos e métodos.
- Atributos são em sua grande maioria variáveis de diferentes tipos e valores.
- Métodos são as ações que a classe pode realizar. Correspondem a funções e sub-rotinas disponíveis na classe.
- Se um metodo não retorna nenhum valor, ele é chamado de método void.
- O metodo possui risco de apresentar exeções, ou seja, erros que podem ocorrer durante a execução do programa.