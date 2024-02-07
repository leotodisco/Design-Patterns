# Abstract Factory
Questo Design Pattern permette di creare un insieme di oggetti tra essi correlati o dipendenti senza specificare le classi concrete.

## Quando usare questo pattern
Questo Pattern si usa quando:
- il sistema deve essere indipendente da come i suoi oggetti sono composti, creati o rappresentati;
- il sistema richiede una famiglia di oggetti;

## Attori
- Abstract Factory: interfaccia
- Concrete Factory: colui che crea gli oggetti effettivi
- Abstract Product: interfaccia per gli oggetti che verranno creati e saranno usati dal client
- Concrete Product: oggetti effettivi che sono creati dal factory 
- Client: colui che chiama il giusto factory per creare gli oggetti di cui si compone

## Conseguenze dell'Abstract Factory
- Rende facile cambiare la famiglia di oggetti che viene creata (basta cambiare il Factory concreto);
- Promuove consistenza: quando gli oggetti di una famiglia sono progettati per lavorare insieme, è importante che un'applicazione usi oggetti di una famiglia alla volta
- Rende difficile estendere l'applicazione aggiungendo nuove famiglie poichè potrebbe causare esplosione del numero di classi.

## Struttura dell'esempio presentato
![struttura.png](..%2F..%2F..%2F..%2FDownloads%2Fstruttura.png)