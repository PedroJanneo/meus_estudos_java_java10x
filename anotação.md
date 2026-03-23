## Interface X Classe abstrata

- Interface → quando queremos definir comportamentos (métodos) que as classes devem implementar.
- Classe abstrata → quando queremos criar uma classe base com atributos e métodos
que outras classes vão herdar.


- classe → só pode herdar 1 classe
- classe → pode implementar várias interfaces

- Método abstrato → obrigatórios em aparecer nas classes filhas.

- Interface → como se fosse contrato, obrigando a implementar metodos onde forem implementadas 


## Classes 


- **SuperClasses** → classe que dá origem a outras (essa classe, vai ser herdada por outras classes);
    -  Uma SuperClasse pode ter várias Subclasses (filhas)
    - Construtor de SuperClasse → usamos a palavra "this"
    - ( Exemplo de construtor no arquivo [Ninja](src\NivelIntermediario\PolimorfismoXAbstracao\Ninja.java) )
    

  
- **SubClasses** → classe que vai herdar de outras classes (essa classe, vai ser herdar de outras classes)
  - Uma SubClasse pode ter só uma superClasse (mãe)
  - Construtor SubClasses → usamos a palavra "Super()"
  - Exemplos de construtor no arquivo [Uchiha](src\NivelIntermediario\PolimorfismoXAbstracao\Uchiha.java) )