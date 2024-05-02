# Exemplo de Implementação de Orientação a Objetos em Java

Este projeto contém um exemplo simples de implementação de conceitos de Orientação a Objetos em Java. O código foi desenvolvido como um exercício para praticar e demonstrar os pilares da Orientação a Objetos.

## Descrição

O código exemplifica os seguintes conceitos:

### Abstração

Utilização de classes e métodos para modelar objetos do mundo real.

No caso do exercício, é uma aplicação de áudio onde é possível cadastrar e "ouvir" músicas e podcasts, além de dar likes e ver a classificação baseada na quantidade de likes e reproduções.

### Encapsulamento

Ocultação dos detalhes de implementação de uma classe, permitindo apenas o acesso controlado aos seus atributos e métodos. Adicionando o modificador de acesso "private" e criandos os Getters e Setters para que as outras classes possam acessar e/ou modificar as váriaveis privadas.

### Herança

Criação de classes derivadas a partir de uma classe base, compartilhando características comuns. 

Atributos como: 
- "Título"
- "Duração"
- "Total de Reproduções"
- "Likes"
- "Nota"

São exemplos de coisas que foram herdadas da superclasse "Track" para as subclasses "Música" e "Podcast".

### Polimorfismo

Capacidade de objetos de diferentes classes responderem ao mesmo método de maneiras diferentes.

O polimorfismo usado nesse exercício está no método "getRating", que define uma nota baseada na quantidade total de likes ou de reproduções, dependendo da classe do objeto em que é chamada.

Sendo a quantidade de reproduções para objetos do tipo Música e a quantidade de likes para objetos do tipo Podcast.

