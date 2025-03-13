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
