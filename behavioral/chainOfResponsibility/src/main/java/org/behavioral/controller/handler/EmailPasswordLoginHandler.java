package org.behavioral.controller.handler;

import lombok.extern.java.Log;
import org.behavioral.model.request.EmailPasswordLogin;
import org.behavioral.model.request.IRequest;
import org.behavioral.service.LoginService;

@Log
public class EmailPasswordLoginHandler extends AbstractHandler {
    private LoginService service = new LoginService();

    @Override
     public Boolean canHandle(IRequest request) {
        return request instanceof EmailPasswordLogin;
    }

    @Override
    public void handleRequest(IRequest request) {
        if(!canHandle(request)) {
            log.info("la richiesta non puo essere gestita da email password login handler");
            getSuccessor().handleRequest(request);
            return;
        }

        var req = (EmailPasswordLogin) request;
        service.emailAndPasswordLogin(req.getEmail(), req.getPassword());
    }
}
