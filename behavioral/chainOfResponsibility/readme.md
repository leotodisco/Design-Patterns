# Chain of Responsibility

Consente di disaccoppiare il mittente di una richiesta dal destinatario dando a più di un oggetto la possibilità di gestire la richiesta.
Si ha, quindi, una catena di destinatari e la richiesta si passa all'intera catena fino a che uno dei destinatari la elabora.

## Quando usare Chain of Responsibility
1. quando colui che deve gestire una richiesta non si conosce a priori
2. quando non vuoi specificare esplicitamente chi deve gestire una richiesta


## Struttura
![chainOfResponsiobility](https://github.com/leotodisco/Design-Patterns/assets/80098232/f93048f6-3cd9-4729-9a68-5bba41a41043)


**N.B.** a volte si potrebbe gestire la catena come una lista anzichè tenere solo un riferimento al prossimo handler, tuttavia questa tecnica renderebbe più complesso gestire precondizioni o postcondizioni.

## Class Diagram del progetto qui riportato:
![MyUMLchainOfResponsibility](https://github.com/leotodisco/Design-Patterns/assets/80098232/8be67a77-0fd1-4ff1-bcd1-7e4d37184d4a)



