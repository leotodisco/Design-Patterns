package org.behavioral.service;


import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@AllArgsConstructor
@Log
public class LoginService {
    public void emailAndPasswordLogin(String email, String passwrd){
        log.info("Email and Password Login");
        log.info("login effettuato correttamente!");
    }

    public void codiceAndPasswordLogin(String codice, String passwrd){
        log.info("Codice and Password Login");
        log.info("login effettuato correttamente!");
    }
}
