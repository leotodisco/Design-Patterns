package org.behavioral.model.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmailPasswordLogin implements IRequest {
    private String email;
    private String password;
}
