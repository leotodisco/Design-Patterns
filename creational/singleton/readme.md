# Singleton
Questo pattern assicura che una classe abbia una sola istanza.
Ci sono due implementazioni: una Thread Safe e una non Thread Safe.
Quando hai multithreading potrebbero essere create due istanze poichè mentre un thread chiama la getInstance() l'oggetto potrebbe non essere stato ancora del tutto creato dal secondo thread.
Ciò si risolve con i blocchi sincronizzati.

## Struttura
Questo pattern si compone di una sola classe.
La chiave è avere un costruttore privato e un'istanza come campo della classe singeton:

```java
public class CarSingleton {
    private String nome;
    private Integer horsePower;

    private static CarSingleton instance;

    private CarSingleton(String nome, Integer horsePower) {
        this.nome = nome;
        this.horsePower = horsePower;
    }

    public static CarSingleton getInstance(String nome, Integer horsePower) {
        if (instance == null) {
            instance = new CarSingleton(nome, horsePower);
        }

        return instance;
    }
}
```

Nella versione ThreadSafe la classe resta invariata, tranne il metodo getInstance() che prevede un meccanismo di sincronizzazione.
Esempio:

```java
public class ThreadSafeSingleton {
    private String nome;

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(String nome) {
        this.nome = nome;
    }

    public static ThreadSafeSingleton getInstance(String nome) {
        if(instance != null) {
            return instance;
        }

        synchronized (ThreadSafeSingleton.class) {
            if(instance == null) {
                instance = new ThreadSafeSingleton(nome);
            }
            return instance;
        }
    }
}
```