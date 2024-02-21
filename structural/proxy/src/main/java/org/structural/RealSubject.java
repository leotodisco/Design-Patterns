package org.structural;

public class RealSubject implements Subject {


    public RealSubject() {
    }

    @Override
    public void operazione() {
        System.out.println("Operazione complessa...");
    }
}
