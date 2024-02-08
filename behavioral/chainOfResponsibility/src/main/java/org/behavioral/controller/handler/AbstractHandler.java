package org.behavioral.controller.handler;


import lombok.Getter;
import lombok.Setter;
import org.behavioral.model.request.IRequest;

@Getter
@Setter

public abstract class AbstractHandler {
    private AbstractHandler successor;

    public static AbstractHandler link(AbstractHandler first, AbstractHandler... chain) {
        AbstractHandler head = first;

        for(AbstractHandler nextInChain : chain) {
            head.setSuccessor(nextInChain);
            head = nextInChain;
        }

        return first;
    }

    abstract Boolean canHandle(IRequest request);

    public abstract void handleRequest(IRequest request);
}
