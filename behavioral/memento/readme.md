# Memento 
Questo Design Pattern consente di estrarre lo stato interno di un oggetto in modo che 
l'oggetto possa essere ripristinato in futuro. Tutto ciò avviene senza violare il principio di incapsulazione
che è alla base della OOP.

## Quando si usa il Memento
Puoi usare il memento quando vuoi supportare undo/error recovery. Per questo motivo può essere usato in combinazione
con un Design Pattern Command e il Memento si occupa solamente di supportare undo.

## Attori e Struttura

- Originator: colui di cui si vuole tenere traccia dello stato e crea il memento;
- Memento: ccoli che si occupa di estrarre lo stato.

![Diagramma senza titolo drawio-4](https://github.com/leotodisco/Design-Patterns/assets/80098232/17bcff12-c567-4539-a6dc-8fb0f4596e5f)


Il core del pattern sta nel fatto che l'originator interagisce con un memento, senza che il memento conosca dettagli implementativi dell'originator.
```java
public class RandomNumber {
    private double value;

    public void setMemento(Memento m) {
        System.out.println("sto facendo undo...");
        this.value = m.getState();
    }

    public Memento createMemento() {
        System.out.println("creo un memento...");
        return new Memento(value);
    }
}
```

Inoltre puoi tenere traccia degli stati quando vuoi supporare undo usando una lista/Stack di Memento nel codice client.

```java
 public static void main(String[] args) {
        var states = new Stack<Memento>();

        RandomNumber number = new RandomNumber();

        System.out.println("num = " + number);

        states.push(number.createMemento());

        number.changeValue();
        System.out.println("num aggiornato = " + number);

        number.setMemento(states.pop()); //undo
        System.out.println("undo num = " + number);

    }
```
