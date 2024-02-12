# Command
Questo design pattern consente di transformare una richiesta in un oggetto.
Le richieste in forma di oggetto vengono passate ai metodi che le elaborano.
Il command promuove disaccoppiamento fra chi crea una richiesta e chi la elabora; inoltre rende semplice
aggiungere nuove funzionalità in futuro.

## Quando si usa il Command
Usa il command quando vuoi:

- Parametrizzare richieste 
- mettere in coda richieste
- supportare "undo" perchè questo pattern ti consente di salvare uno stato quando elabori una richiesta. In questo modo puoi sempre tornare indietro.
- Il command pattern consente anche di modellare le transazioni

## Struttura
Gli attori del sistema sono:
- Command: interfaccia che si occupa di dichiarare le operazioni da eseguire
- ConcreteCommand: implementa l'interfaccia Command, incapsula il ricevente come una variabile di instanza
- Receiver: colui che sa come si svolge una richiesta
- Client: colui che si occupa di creare un Command e di associargli un Receiver
- Invoker: colui che richiede di eseguire una richiesta

![struttura_command.png](..%2F..%2F..%2F..%2FDownloads%2Fstruttura_command.png)

Nell'esempio qui proposto vogliamo semplicemente gestire apertura, salvataggio e scrittura su un semplice file txt.

