# Builder
Questo design pattern separa la costruzione di oggetti complessi dalla loro rappresentazione

## Quando usare un builder
Usa questo pattern quando vuoi creare oggetti complessi, in questo modo eviti anche il noto antipattern "telescoping constructor".
Puoi usare questo pattern quando il processo di costruzione deve permettere differenti rappresentazioni per un oggetto.

## Componenti
- Builder: interfaccia col metodo build() (in questo caso getResult)
- ConcreteBuilder: colui che implementa il processo di costruzione
- Prodotto: colui che viene creato, in questo esempio si tratta di una macchina.
- Director: colui che conosce le "ricette" e quindi richiama i builder per costruire le cose a suo piacimento, in sintesi è un client

## Struttura
![builderUML](https://github.com/leotodisco/Design-Patterns/assets/80098232/19dfd2cc-b3de-4871-8bff-724d18181d3d)
