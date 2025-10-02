**Padrão de Projeto: Builder**

Usado para construir objetos complexos passo a passo.



* Contexto: Quando um objeto tem muitos atributos para configurar, incluindo opcionais.



* Problema: Um construtor com uma lista enorme de parâmetros é confuso e difícil de usar (new Objeto(a, b, null, d, e, ...)).



* Solução: Criar uma classe Builder auxiliar que recebe os dados passo a passo e, ao final, chama um método build() para retornar o objeto pronto.





**Padrão de Projeto: Prototype**

Usado para criar novos objetos através da cópia (clonagem) de um objeto já existente.



* Contexto: Quando a criação de um objeto do zero é um processo caro (demorado, consome muitos recursos) e você precisa de vários objetos parecidos.



* Problema: É ineficiente e lento criar múltiplos objetos idênticos ou quase idênticos repetindo todo o processo de construção.



* Solução: Criar um objeto "protótipo" uma única vez. Quando precisar de um novo objeto igual, em vez de criá-lo do zero, você simplesmente clona o protótipo.
