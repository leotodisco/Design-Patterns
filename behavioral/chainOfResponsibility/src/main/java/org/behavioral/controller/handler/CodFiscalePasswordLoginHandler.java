package org.behavioral.controller.handler;

import lombok.extern.java.Log;
import org.behavioral.model.request.CodFiscalePasswordLogin;
import org.behavioral.model.request.IRequest;
import org.behavioral.service.LoginService;

@Log
public class CodFiscalePasswordLoginHandler extends AbstractHandler {
    private LoginService service = new LoginService();

    @Override
    public Boolean canHandle(IRequest request) {
        return request instanceof CodFiscalePasswordLogin;
    }

    @Override
    public void handleRequest(IRequest request) {
        if(!canHandle(request)) {
            log.info("richiesta non puo essere gestita da cod fiscale login handler");
            super.getSuccessor().handleRequest(request);
            return;
        }

        var req = (CodFiscalePasswordLogin) request;
        service.codiceAndPasswordLogin(req.getCodFiscale(), req.getPassword());
    }
}


