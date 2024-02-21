# Proxy Design Pattern
Consiste nel creare un surrogato o un placeholder per un oggetto. 
Un proxy controlla l'accesso all'oggetto originale, 
permettendoti di eseguire qualcosa prima o dopo che la richiesta arriva all'oggetto originale

## Quando si usa il Proxy?
Può essere utile usare un proxy quando vuoi evitare di costruire un oggetto che richiede molto tempo, 
e quindi vuoi rimandare
la sua creazione a quando ne hai effettivamente bisogno.
Questo pattern permette la **Lazy Allocation**, ossia crei un oggetto solo quando ne hai 
effettivamente bisogno e una volta creato vuoi riutilizzare l'oggetto.

Puoi usare un proxy quando vuoi fare dei controlli/operazioni prima di soddisfare una richiesta (protection proxy).

Puoi anche usare un proxy insieme a una cache (cache proxy).

Parliamo di Virtual Proxy quando il proxy deve creare un oggeto costoso on demand e ci permette di crearlo una sola volta, in questo modo come se fosse quasi una cache, ci permette di migliorare le prestazioni di esecuzioni future.

## Struttura e attori

- **Subject**: interfaccia dell'oggetto costoso
- **RealSubject**: oggetto costoso da creare
- **SubjectProxy** è il proxy che ha un riferimento all'oggetto concreto e lo crea

![Diagramma senza titolo drawio-2](https://github.com/leotodisco/Design-Patterns/assets/80098232/1c64c5d3-ffb2-4d5e-b4c4-8d382b0dfd3f)


Il proxy promuove anche il basso accoppiamento fra le componenti.


Il core dell'esempio qui mostrato è dato dalla classe Proxy:

```java
public class ProxySubject implements Subject {
    static RealSubject subject;

    @Override
    public void operazione() {
        //costruzione on-demand dell'oggetto
        if(subject == null)
            subject = new RealSubject(); 

        //controlli per vedere chi fa la richiesta (protection proxy)
        subject.operazione();

    }
}
```
