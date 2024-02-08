package org.behavioral.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class CodFiscalePasswordLogin implements IRequest {
    private String codFiscale;
    private String password;

}
