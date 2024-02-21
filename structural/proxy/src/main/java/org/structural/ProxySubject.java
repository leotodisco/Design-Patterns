package org.structural;

public class ProxySubject implements Subject {
    static RealSubject subject;

    @Override
    public void operazione() {
        if(subject == null)
            subject = new RealSubject(); //cosi facendo rimando la creazione dell'oggetto al momento in cui mi serve davvero

        //potrei fare controli per vedere chi fa la richiesta (protection proxy)
        subject.operazione();

    }
}
