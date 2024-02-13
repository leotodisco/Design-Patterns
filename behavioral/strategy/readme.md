# Strategy
Il pattern Strategy consente di definire una famiglia di algoritmi, incapsulare ogni algoritmo e renderli intercambiabili.

## Quando usare uno Strategy
Si può usare uno strategy nelle seguenti condizioni:

- Sono necessarie molteplici varianti di un algoritmo
- una classe definisce molteplici comportamenti che si presentano nella forma di molti conditional statements. Anzichè avere molte condizioni, si preferisce aggregare comportamenti simili nelle proprie classi Strategy;
- più classi tra loro collegate differiscono solo nel comportamento

## Attori e Struttura
Nell'esempio qui proposto si vuole ordinare una collezione di oggetti.
Oggetti possono essere di varia natura, si hanno numeri, Stringhe (qui vogliamo ordinare in base all'ordine alfabetico) ecc...

Gli attori sono:

- **Strategy**: interfaccia comune per tutti gli algoritmi
- **ConcreteStrategy**: colui che implementa l'algoritmo
- **Context**: colui che interagisce con lo strategy. Pensalo come un client.

La struttura generica è la seguente:
![strategy_struttura.png](..%2F..%2F..%2F..%2FDownloads%2Fstrategy_struttura.png)

Mentre un la struttura dell'esempio proposto è la seguente:


## Punti di forza dello Strategy 

- innanzitutto lo strategy si presenta come una buona alternativa alla creazione di sottoclassi che porterebbe a un'esplosione della complessità di alcune metriche come Depth of Inheritance Tree
- Lo strategy è anche una tecnica per il refactoring di codice Legacy poichè può eliminare molteplici conditional statements
- Lo strategy propone molte alternative per la scelta di un algoritmo che sia efficiente in una data situazione