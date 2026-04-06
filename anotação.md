## Interface X Classe abstrata

- Interface → quando queremos definir comportamentos (métodos) que as classes devem implementar.
- Classe abstrata → quando queremos criar uma classe base com atributos e métodos
que outras classes vão herdar.


- classe → só pode herdar 1 classe
- classe → pode implementar várias interfaces

- Método abstrato → obrigatórios em aparecer nas classes filhas.

- Interface → como se fosse contrato, obrigando a implementar metodos onde forem implementadas 

- Interface → seus atributos serão fixas (final), não irão mudar.

## Classes 


- **SuperClasses** → classe que dá origem a outras (essa classe, vai ser herdada por outras classes);
    -  Uma SuperClasse pode ter várias Subclasses (filhas)
    - Construtor de SuperClasse → usamos a palavra "this"
    - ( Exemplo de construtor no arquivo [Ninja](src\NivelIntermediario\PolimorfismoXAbstracao\Ninja.java) )
    

  
- **SubClasses** → classe que vai herdar de outras classes (essa classe, vai ser herdar de outras classes)
  - Uma SubClasse pode ter só uma superClasse (mãe)
  - Construtor SubClasses → usamos a palavra "Super()"
  - Exemplos de construtor no arquivo [Uchiha](src\NivelIntermediario\PolimorfismoXAbstracao\Uchiha.java) )


- Override (sobrescrita) é quando a classe filha reescreve um método da classe pai,
mantendo a mesma assinatura (nome + parâmetros), mas alterando o comportamento (corpo).
[Exemplo](src\NivelIntermediario\OverloadSobrecarga\Uchiha.java)

## Herança Múltipla

- Uma classe pode HERDAR (extends) somente uma CLASSE, mas pode IMPLEMENTAR (implements) várias interfaces.
- Pra implementar mais de uma interface, basta usar , (virgula). [exemplo](src/NivelIntermediario/HerancaMultipla/Hatake.java)

## SobreCarga Construtores (Overload)

- Quando escrevemos mais de uma vez, o construtor (sendo, adicionando um novo atributo, no qual foi implementado tempos depois)
- [Exemplo prático 1](src/NivelIntermediario/OverloadSobrecarga/Ninja.java)
- [Exemplo prático 2](src/NivelIntermediario/OverloadSobrecarga/Uchiha.java)

## Sobrecarga Metodos (Overload)

- Quando escrevemos um metodo com o mesmo nome (na mesma classe), mas mudamos um parâmetro (tipo, quantidade ou ordem).
- [Exemplo prático](src/NivelIntermediario/OverloadSobrecarga/Ninja.java)

## Override

- Usamos or convenção (boas práticas no java).
- Compilação, prevenir que haja erros de digitação de uma classe para outra (se o metodo se chama 'teste' e eu vou fazer uma sobrescrita em outra classe, se por acaso eu escrever 'testes' ou 'Teste' vai dar erro)
- [Exemplo de Override](src/NivelIntermediario/OverloadSobrecarga/Uchiha.java)

## toString

- Ao invés de mostrar a referência de memória, faz virar um texto.
- [Exemplo com toString](src/NivelIntermediario/ReferenciaMemoria/Uchiha.java)
- [Exemplo sem toString](src/NivelIntermediario/ReferenciaMemoria/Uzumaki.java)
- [Exemplo no main com e sem toString](src/NivelIntermediario/ReferenciaMemoria/Main.java)

## Classe final X Abstrata

Diferença:

- Na classe final, ela não pode ser herdada (extends) por nenhuma outra classe, mas pode ser instanciada.
  [Exemplo Classe Final](src/NivelIntermediario/FinalMethodsEClasse/Ambu.java)

- Na classe Abstrata, ela pode ser herdada (extends) por outra classe, mas não pode ser instanciada.
  [Exemplo Classe Abstrata](src/NivelIntermediario/FinalMethodsEClasse/Ninja.java)

Na [main](src/NivelIntermediario/FinalMethodsEClasse/main.java) conseguimos ver que a classe Ninja não pode ser instanciada.

# Enum

"Classe" poderosa, usada mais para valores fixos
Usado com coerencia nos [desafio 4](src/NivelIntermediario/Desafios/Desafio4/Habilidade.java) e no [RankMissao](src/NivelIntermediario/Enums/RankMissao.java)