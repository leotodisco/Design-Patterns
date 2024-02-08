package org.behavioral.controller;

import lombok.extern.java.Log;
import org.behavioral.model.factory.ConcreteRequestCreator;
import org.behavioral.controller.handler.AbstractHandler;
import org.behavioral.controller.handler.CodFiscalePasswordLoginHandler;
import org.behavioral.controller.handler.EmailPasswordLoginHandler;

@Log
public class LoginController {
    private AbstractHandler handler;

    public LoginController() {
        this.handler = handler.link(new CodFiscalePasswordLoginHandler(), new EmailPasswordLoginHandler());
    }

    public void login(String password, String emailOrCode) {
        var request = ConcreteRequestCreator.createRequest(password, emailOrCode);
        handler.handleRequest(request);
    }
}
