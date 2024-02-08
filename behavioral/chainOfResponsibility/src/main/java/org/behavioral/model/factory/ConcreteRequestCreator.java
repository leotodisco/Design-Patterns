package org.behavioral.model.factory;

import org.behavioral.model.request.CodFiscalePasswordLogin;
import org.behavioral.model.request.EmailPasswordLogin;
import org.behavioral.model.request.IRequest;

public class ConcreteRequestCreator {

    public static IRequest createRequest(final String password, final String emailOrCode) {
        if(emailOrCode.contains("@")) {
            return new EmailPasswordLogin(emailOrCode, password);
        }

        return new CodFiscalePasswordLogin(emailOrCode, password);
    }
}
