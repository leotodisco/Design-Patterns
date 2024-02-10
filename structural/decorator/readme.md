# Decorator 
Questo Pattern consente di aggiungere responsabilità ad un oggetto in modo dinamico.
Si può usare come alternativa all'ereditarietà.

## Quando si applica
Usa questo pattern quando vuoi:
- aggiungere funzionalità a un oggetto dinamicamente
- quando non è possibile creare una sottoclasse, o semplicemente quando creare una nuova sottoclasse aumenterebbe troppo la complessità

## Attori e Struttura
L'esempio qui proposto consiste di un componente che si occupa di leggere e scrivere testo su file txt.
Tuttavia, vogliamo espanderlo e vogliamo creare un Writer che scriva testo crittografato in base64, ma non vogliamo creare una sittoclasse, tantomeno vogliamo aggiungere metodi alla classe FileDataSource.
Decidiamo di creare un Decorator.

Gli attori che vediamo in questo esempio sono:
- **IDataSource**: interfaccia del nostro writer semplice
- **FileDataSource**: una prima implementazione basilare del writer che scrive del semplice testo e legge da file.
- **DataSourceDecorator**: classe astratta per il decorator (NB: puoi anche non creare classi astratte, tuttavia, un giorno qualcuno potrebbe decidere di creare altri decorator e avere una base comune può essere di aiuto)
- **EncryptionDecorator**: il decoratore concreto, si occupa di aggiungere del comportamento e richiama i metodi del writer basilare.
- 
Possiamo dire che il core del decoratore è:

```java
public class EncryptionDecorator extends DataSourceDecorator {
    @Override
    public String readData() {
        return super.fileDataSource.readData();
    }

    @Override
    public void writeData(String data) {
        super.fileDataSource.writeData(encryptData(data));
    }

    private String encryptData(String data) {
        /** Qui aggiungi il tuo comportamento aggiuntivo */
    }
}
```

![decorator-2.png](..%2F..%2F..%2F..%2FDownloads%2Fdecorator-2.png)
